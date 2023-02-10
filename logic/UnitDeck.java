package logic;

import java.util.ArrayList;

public class UnitDeck {
	
	//fields
	private ArrayList<CardCounter> cardsInDeck;
	private String deckName;
	
	//constructors
	public UnitDeck(String deckName) {
		setCardsInDeck(new ArrayList<CardCounter>(0));
		setDeckName(deckName);
	}
	
	//method
	public void addCard(UnitCard newCard, int count) {
		if (count <= 0) return;
		for (CardCounter i: cardsInDeck) {
			if (i.getCard().equals(newCard)) {
				i.setCount(i.getCount() + count);
				return;
			}
		} this.cardsInDeck.add(new CardCounter(newCard, count));
	}
	
	public void removeCard(UnitCard toRemove, int count) {
		if (count <= 0) return;
		for (CardCounter i: cardsInDeck) {
			if (i.getCard().equals(toRemove)) {
				i.setCount(i.getCount() - count);
			if (i.getCount() == 0) {
				this.cardsInDeck.remove(i);
			}
				return;
			}
		} 
	}
	
	public int cardCount() {
		int sumCount = 0;
		for (CardCounter i: cardsInDeck) {
			sumCount += i.getCount();
		} return sumCount;
	}
	
	public boolean existsInDeck(UnitCard card) {
		for (CardCounter i: cardsInDeck) {
			if (i.getCard().equals(card) && i.getCount() >= 1) {
				return true;
			}
		} return false;
	}
	
	public boolean equals(UnitDeck other) {
		return deckName.equals(other.getDeckName());
	}
	
	//getter
	public String getDeckName() {
		return deckName;
	}
		
	public ArrayList<CardCounter> getCardsInDeck() {
		return cardsInDeck;
	}
	
	//setter
	public void setDeckName(String deckName) {
		if (deckName.isBlank()) {
			this.deckName = "Untitled Deck";
		} else {
			this.deckName = deckName;
		}
	}
	
	public void setCardsInDeck(ArrayList<CardCounter> cardsInDeck) {
		this.cardsInDeck = cardsInDeck;
	}

}
