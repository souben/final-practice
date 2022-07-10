package prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> records;
	

	public CheckoutRecord() {
		records = new ArrayList<CheckoutRecordEntry>();
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return records;
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		records.add(entry);
	}
}
