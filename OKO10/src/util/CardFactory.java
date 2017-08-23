package util;

import model.Card;
import model.Color;
import model.Value;



public class CardFactory {
	
	private static CardFactory instance;
	
	//zabezpecenie aby len jedna faktory mohla byt vytvorena
	private static CardFactory getInstance(){
		if(instance == null){
			return new CardFactory();
		}
		return instance;
	}
	//metoda ktora vytvori kartu na mieru
	public  Card createCard(Color color,Value value){
		return new Card(color, value);
	}
	
	 //metoda ktora vytvori konkretnu kartu
	public  Card createCloverAces(){
		return new Card(Color.CLOVERS,Value.ACE);
	}
}

