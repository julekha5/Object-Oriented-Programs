package com.bridgelabz.oops.pack;
/*
 * Deck Of Cards Program
 */
import java.util.ArrayList;
import java.util.Arrays;

public class DeckOfCards {
	static final int players = 4;
	static final int cards_assigned = 9;
	String[] decks = new String[52];
	String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
	String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	int[][] pCards = new int[4][13];
	int p = 0;

	int random = (int) (Math.random() * pCards.length);

	/*
	 * / Deck Card Creation
	 */
	public void decksBuild() {
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				decks[k] = suits[i] + " of " + ranks[j];
				k++;
			}
		}
		System.out.println();
	}

	/*
	 *  show the decks created by decksBuild() method
	 */
	public void showDecks() {
		System.out.println("Decks Create:" + Arrays.asList(decks));
	}

	/*
	 * / Shuffle Cards
	 */
	public void shuffleCards() {
		for (int i = 0; i < pCards.length; i++) {
			for (int j = 0; j < pCards[i].length; j++) {
				// pCards[i][j] = decks[k];
				pCards[i][j] = random;
			}
		}
		System.out.println();
	}

	/*
	 * / Print assigned cards for 4 player
	 */
	public void displayPlayerCards() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Player" + i);
			for (int j = 0; j < 9; j++) {
				System.out.println("Assign Card to player:" + decks[p]);
				p++;
			}
		}

	}

	public static void main(String[] args) {
		DeckOfCards deckCard = new DeckOfCards();
		deckCard.decksBuild();
		deckCard.showDecks();
		deckCard.shuffleCards();
		deckCard.displayPlayerCards();

	}
}
