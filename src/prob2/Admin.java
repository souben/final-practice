package prob2;

import java.util.*;

public class Admin {
	// Returns phone numbers (in sorted order) of the Library Members who have ever
	// checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		// implement
		for (LibraryMember m : members) {
			CheckoutRecord checkout = m.getCheckoutRecord();
			List<CheckoutRecordEntry> checkoutEntry = checkout.getCheckoutEntryList();
			for (CheckoutRecordEntry c : checkoutEntry) {
				if (item.equals(c.getLendingItem()))
					phoneNums.add(m.getPhone());
			}
		}
		Collections.sort(phoneNums);
		return phoneNums;
	}
}
