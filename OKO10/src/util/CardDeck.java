package util;

import java.util.ArrayList;

import model.Card;
import model.Color;
import model.Value;

public class CardDeck {
	
	public  ArrayList<Card> createCardDeck(){
		CardFactory factory = new CardFactory();
		ArrayList<Card> cardDeck1 = new  ArrayList<>();
		for(Color n: Color.values()){
			for(Value m : Value.values()){
				
				cardDeck1.add(factory.createCard(n, m));
			}
		}
		
		return cardDeck1;
		
	}
}
