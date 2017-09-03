package util;

import java.util.ArrayList;
import java.util.Random;

import model.Card;
import model.Player;

public class PlayerUtil {
	private int cardValue;
	ArrayList<Card> player1Deck = new ArrayList<>();

	public ArrayList<Card> getPlayer1() {
		return player1Deck;
	}

	public void setPlayer1(ArrayList<Card> player1) {
		player1Deck = player1;
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	public void addCardToPlayer(ArrayList<Card> deck, Player player) {
		Random ran = new Random();

		int n = ran.nextInt(deck.size());

		player.addCard(deck.get(n));

		deck.remove(n);

	}
}
