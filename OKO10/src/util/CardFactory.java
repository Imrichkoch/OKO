package util;

import model.Card;
import model.Color;
import model.Value;

public class CardFactory {

	public CardFactory() {
		// TODO Auto-generated constructor stub
	}

	// metoda ktora vytvori kartu na mieru
	public Card createCard(Color color, Value value) {
		return new Card(color, value);
	}

	// metoda ktora vytvori konkretnu kartu
	public Card createCloverAces() {
		return new Card(Color.CLOVERS, Value.ACE);
	}
}
