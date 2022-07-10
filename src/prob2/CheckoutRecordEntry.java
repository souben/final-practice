package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem item;
	private ItemType type;

	public CheckoutRecordEntry(LendingItem item, LocalDate checkoutDate, LocalDate dueDate, ItemType type) {
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.item = item;
		this.type = type;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public ItemType getItemType() {
		return type;
	}

	public LendingItem getLendingItem() {
		return item;
	}

}
