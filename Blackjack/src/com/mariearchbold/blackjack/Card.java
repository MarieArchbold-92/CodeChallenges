package com.mariearchbold.blackjack;

import java.util.ArrayList;

public class Card {
	int value;
	public enum suitEnum {HEARTS, DIAMONDS, CLUBS, SPADES}
	String suit;
	String rank;

	ArrayList<Card> deck = new ArrayList<>();
	
	public Card(int value, suitEnum suit){
		switch(suit){
		case HEARTS:
			this.suit = "Hearts";
			break;
			
		case DIAMONDS:
			this.suit = "Diamonds";
			break;
			
		case CLUBS:
			this.suit = "Clubs";
			break;
			
		case SPADES:
			this.suit = "Spades";
			break;
		}
	
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("[Suit=");
		builder.append(suit);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}
	

}