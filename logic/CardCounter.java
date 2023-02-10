package logic;

public class CardCounter {
	
	//fields
	private UnitCard card;
	private int count;
	
	//constructors
	public CardCounter(UnitCard card, int count) {
		this.card = card;
		setCount(count);
	}
	
	//getter
	public UnitCard getCard() {
		return card;
	}
	
	public int getCount() {
		return count;
	}
	
	//setter
	//method
	public void setCount(int count) {
		if (count < 0) {
			this.count = 0;
		} else {
			this.count = count;
		}
	}
	
	public String toString() {
		return  this.getCard() + " x " + this.getCount();
	}

}
