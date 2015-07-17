package com.mariearchbold.blackjack;

import java.util.ArrayList;

import com.mariearchbold.blackjack.Card.suitEnum;

public class Player {
	int gamesWon =0;
	int currentScore =0;
	String name = "";
	public String getName() {
		return name;
		
	}
	
	ArrayList<Card> hand;
	
//	public void setName(String name) {
//		this.name = name;
//	}

	public static ArrayList<Card> deck = new ArrayList<>();


	public int getGamesWon() {
		return gamesWon;
	}
	public void setGamesWon() {
		this.gamesWon++;
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = this.currentScore+ currentScore;
	}
	
	public void resetScore(){
		this.currentScore = 0;
	}

	
	public static void populateDeck(suitEnum suit){
		int suitLimit = (52 / 4);


		for(int i = 2, j = 0; i < (suitLimit + 2); ++i){

			j = i;
			

			if(i == 14){

				Card tempCard = new Card(11, suit);
				deck.add(tempCard);
				continue;
			}
			
			if(i > 9){
				j = 10;
			}

			Card tempCard = new Card(j , suit);

			deck.add(tempCard);
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Card> addHand(){
		ArrayList<Card> hand = new ArrayList<>();
		return hand;
	}
	
}
