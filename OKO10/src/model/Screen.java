package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import util.CardDeck;
import util.CardUtil;
import util.PlayerUtil;

public class Screen {
	private static int playerWins;

	public int getPlayerWins() {
		return playerWins;
	}

	public void setPlayerWins(int playerWins) {
		this.playerWins = playerWins;
	}

	public int getComputerWins() {
		return computerWins;
	}

	public void setComputerWins(int computerWins) {
		this.computerWins = computerWins;
	}

	private static int computerWins;

	private static Screen instance;

	public static Screen getInstance() {
		if (instance == null) {
			instance = new Screen();
		}
		return instance;
	}

	public static void showGameStatus() {
		System.out.println("\nGame status:");
		System.out.println(" Player wins: " + playerWins);
		System.out.println(" Computer wins: " + computerWins);
	}

	public static void drawMenu(Player player, Player computer) {
		String a;
		Random com = new Random();
		// pocita vyslednu hodnotu toho co ma hrac na ruke
		int cardsValueOfPlayer = 0;
		int cardsValueOfComputer = 0;

		CardUtil cu = new CardUtil();
		PlayerUtil pu = new PlayerUtil();
		ArrayList<Card> cards = new ArrayList<>();
		CardDeck cd = new CardDeck();
		cards = cd.createCardDeck();// nahra nam vsetkych 32 kariet do balicka
		Collections.shuffle(cards); // zamiesa karty
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose option from the menu:\n1.\tStart Game (Press '1') \n2.\tQuit (Press 'q')");

		showGameStatus();

		a = sc.next();

		switch (a) {
		case "1":
			// vlozi jednu kartu do ruky hraca a zaroven odpocita tu konkretnu
			// kartu z balicka
			pu.addCardToPlayer(cards, player);
			pu.addCardToPlayer(cards, computer);

			cu.drawPlayer(player, computer, "you", "computer", true, false);// zobrazi
																			// karty
			// pripocita hodnotu aktualnej karty
			cardsValueOfPlayer = player.getValueCard();
			cardsValueOfComputer = computer.getValueCard();

			System.out.println("Size of deck: " + cards.size() + " \nactual Player cards value: " + cardsValueOfPlayer
					+ "\nactual Computer cards value: " + cardsValueOfComputer);

			System.out.println("Hit(h) or Stand(s)?");
			a = null;

			a = sc.next();
			while (a != "q") {

				switch (a) {
				case "h":
					pu.addCardToPlayer(cards, player);
					if (com.nextInt(3) == 1) {
						pu.addCardToPlayer(cards, computer);// sanca ze si
															// pocitac potiahne
															// kartu je 1/3
						cardsValueOfComputer += computer.getValueCard();

					}
					cu.drawPlayer(player, computer, "you", "computer", true, false);
					// podmienky pre vyhru/prehru + pripocita hodnotu aktualnej
					// karty
					if ((cardsValueOfPlayer += player.getValueCard()) > 21) {
						System.out.println("Game over, you lost, computer win");
						computerWins++;

						showGameStatus();
						return;
					}
					if (cardsValueOfComputer > 21) {
						System.out.println("You win, computer lost");
						playerWins++;

						showGameStatus();
						return;
					}
					System.out.println("Size of deck: " + cards.size() + " \nactual Player cards value: "
							+ cardsValueOfPlayer + "\nactual Computer cards value: " + cardsValueOfComputer);
					System.out.println("Hit(h) or Stand(s)?");

					break;

				case "s":

					cu.drawPlayer(player, computer, "you", "computer", true, false);
					System.out.println("Size of deck: " + cards.size() + " actual card value: " + cardsValueOfPlayer);
					// podmienky pre vyhru/prehru/remizu
					if ((cardsValueOfPlayer > cardsValueOfComputer) && (cardsValueOfPlayer <= 21)) {
						System.out.println("You win, computer lost");
						playerWins++;

						showGameStatus();
						return;
					} else if ((cardsValueOfPlayer < cardsValueOfComputer) && (cardsValueOfComputer <= 21)) {
						System.out.println("Game over, you lost, computer win");
						computerWins++;

						showGameStatus();
						return;
					} else if ((cardsValueOfPlayer == cardsValueOfComputer) && (cardsValueOfPlayer <= 21)
							&& (cardsValueOfComputer <= 21)) {
						System.out.println("DRAW");

						showGameStatus();
						return;
					}
				default:
					System.out.println("Wrong character");
					break;

				}
				System.out.println();
				System.out.println("Size of deck: " + cards.size() + " \nactual Player cards value: "
						+ cardsValueOfPlayer + "\nactual Computer cards value: " + cardsValueOfComputer);
				a = sc.next();

			}
		case "q":

			return;
		default:
			sc.close();
			System.out.println("Wrong character");
			return;

		}

	}

}
