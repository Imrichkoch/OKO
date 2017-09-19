package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int valueCard;

	public int getValueCard() {
		return valueCard;
	}

	public void setValueCard(int valueCard) {
		this.valueCard = valueCard;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public void addCard(Card card) {
		this.cards.add(card);
		this.valueCard = +card.getValue().getValue();
	}

}
