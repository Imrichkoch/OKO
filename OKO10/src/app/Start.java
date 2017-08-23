package app;

import java.util.Scanner;

import dimensionsexception.ExceptionDimensions;
import model.Player;
import model.Screen;

public class Start {

	public static void main(String[] args) throws ExceptionDimensions{
		String a;
		Scanner bc = new Scanner(System.in);
		 
		System.out.println("EYE - card game\nPress any key");

		
		a = bc.next();
		
		while(a != "n"){
			System.out.println("Would you like to play a Card game EYE? y/n");
			
			a = bc.next();
		switch(a){
		
		case "y":
			Player player1 = new Player();//
			Player player2 = new Player();
			Screen.drawMenu(player1, player2);
			System.out.println("Press any key");
			break;
			
			
		default:
			return;
			}
		
			a = bc.next();
		}
			
			
	bc.close();	
		
//		CardFactory cardFactory1 = new CardFactory();
//		
//		List<Card> playerCards1 = new ArrayList<>();
//		List<Card> playerCards2 = new ArrayList<>();
//		Card card1;
//		Card card2;
//		Card card3;
//		Card card4;
//		Card card6;
//		
//			card1 = cardFactory1.createCloverAces(); 
//			card2 = new Card(Color.HEARTS,Value.TEN);
//			card3 = new Card(Color.PIKES,Value.JACK);
//			card4 = new Card(Color.CLOVERS,Value.TEN);
//			Card card5 = cardFactory1.createCard(Color.PIKES,Value.TEN);
//			card6 = new Card(Color.PIKES,Value.TEN);
//			
//		
//				playerCards1.add(card1);
//				playerCards1.add(card2);
//				playerCards1.add(card3);
//				playerCards2.add(card4);
//				playerCards2.add(card5);
//				playerCards2.add(card6);
//				player1.setCards(playerCards1);
//				player2.setCards(playerCards2);
//		
//				
//		CardUtil cu = new CardUtil();
//		cu.drawPlayer(player1,player2,"player","computer",true,false);
//			//porovnava velkost konstatnt pre rozmery karty
//			if((Const.CARD_SIZE_X < 6 )||(Const.CARD_SIZE_Y < 6 )){
//				
//				throw new ExceptionDimensions("Wrong card size");
//			}	
//		ArrayList<Card> cards = new ArrayList<>();
//		
//		cards = cd.createCardDeck();
//		System.out.println("Velkost balicka: " + cards.size());

		
//		System.out.println("Vsetky karty: ");
//		for(int i = 0; i < cards.size(); i++){
//			System.out.println(cards.get(i).getColor() + " " + cards.get(i).getValue());
//		}
//		

//		
//		Collections.shuffle(cards);
//		
//		PlayerUtil.addCardToPlayer(cards, player1);
//		System.out.println("Velkost balicka: " + cards.size());
//		
//		
//		System.out.println("Vsetky karty: ");
//		for(int i = 0; i < cards.size(); i++){
//			System.out.println(cards.get(i).getColor() + " " + cards.get(i).getValue());
//		}		
		
		
		
		
		
			}
		}

	


