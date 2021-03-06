package app;

import java.util.Scanner;

import dimensionsexception.DimensionsException;
import model.Const;
import model.Player;
import model.Screen;

public class Start {

	public static void gameInit() {
		String a;
		Scanner bc = new Scanner(System.in);

		int playerWins = 0;

		int computerWins = 0;

		System.out.println("EYE - card game\nPress any letter and Enter");

		a = bc.next();

		while (a != "n") {
			System.out.println("Would you like to play a Card game EYE? y/n");

			a = bc.next();
			switch (a) {

			case "y":
				Player player1 = new Player();
				Player player2 = new Player();

				Screen.drawMenu(player1, player2);

				System.out.println("Press any letter and Enter");
				break;

			default:
				return;
			}

			a = bc.next();
		}

		bc.close();

	}

	public static void main(String[] args) throws DimensionsException {

		if (Const.CARD_SIZE_X < 6 || Const.CARD_SIZE_Y < 6) {

			throw new DimensionsException("Minimum of card size is 6x6 ");

		}
		gameInit();
	}
}
