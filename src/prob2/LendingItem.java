package prob2;

public class LendingItem {
	private int numCopiesInLib;

	public int getNumCopiesInLib() {
		return numCopiesInLib;
	}

	public void setNumCopiesInLib(int num) {
		numCopiesInLib = num;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj.getClass() != this.getClass()) return false;
		LendingItem item = (LendingItem) obj;
		return item.numCopiesInLib == this.numCopiesInLib ;
	}
}
