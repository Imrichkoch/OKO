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
		

		
		
		
		
			}
		}

	


