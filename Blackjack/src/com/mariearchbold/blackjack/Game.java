package com.mariearchbold.blackjack;

import java.io.IOException;
import java.util.Collections;
import com.mariearchbold.blackjack.Card.suitEnum;

public class Game {
	static Player p1 = new Player();
	static Player p2 = new Player();

	static int gamesPushed = 0;
	static int gamesBust = 0;
	static int round = 1;



	//	static Scanner scan = new Scanner(System.in.read());

	public static void main(String[] args) {
		Game game = new Game();
		for (int i = 1; i <= 11; i++) {
			System.out.println("Game: " + round++);
			playGame();
			p1.setName("Player 1 dealt a ");
			p2.setName("Player 2 dealt a ");
			game.gameLoop(p1);
			game.gameLoop(p2);
			//System.out.print(Player.deck + " " + Player.deck.size());
			game.checkScores();

			//	scan.next();

			try {
				System.in.read();
				System.in.skip(1000);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			p1.resetScore();
			p2.resetScore();
		//	p1.resetPlayer1Hand();
			//p2.resetPlayer2Hand();
		}

		System.out.println("\nPlayer 1: " + p1.getGamesWon() + " wins");
		System.out.println("Player 2: " + p2.getGamesWon() + " wins");
		System.out.println("Games bust: " + gamesBust);
		System.out.println("Games pushed: " + gamesPushed);
	}


	private void gameLoop(Player player) {
		player.hand = player.addHand();
		
		while(player.getCurrentScore()<17){
			//	System.out.println(Player.deck.get(0))
			

			player.setCurrentScore(Player.deck.get(0).getValue());
			player.hand.add(Player.deck.get(0));
			Player.deck.remove(0);

			if(player.hand.size() == 2 && player.getCurrentScore() == 21){
				System.out.println("BLACKJACK !!!");
				break;
			}
			
			if(player.getCurrentScore() > 21){
				for(int i = 0; i < player.hand.size(); ++i){
					if(player.hand.get(i).getValue() == 11){
						player.hand.get(i).setValue(0);
						player.setCurrentScore(-10);
					}
				}
			}

		}

		System.out.println(player.hand);
		
		System.out.println(player.getName() + player.getCurrentScore());

		System.out.print("\n");
	}

	public static void playGame(){
		Player.populateDeck(suitEnum.HEARTS);
		Player.populateDeck(suitEnum.DIAMONDS);
		Player.populateDeck(suitEnum.SPADES);
		Player.populateDeck(suitEnum.CLUBS);

		Collections.shuffle(Player.deck);
		Collections.shuffle(Player.deck);
		Collections.shuffle(Player.deck);
		Collections.shuffle(Player.deck);
		Collections.shuffle(Player.deck);
	}

	public void checkScores(){
		
		if(p1.getCurrentScore() >21 && p2.getCurrentScore() >21){
			System.out.println("bust");
			gamesBust++;
		}else if(p1.getCurrentScore() == p2.getCurrentScore()){
			System.out.println("Push");
			p1.setGamesWon();
			p2.setGamesWon();
			gamesPushed++;
		}else if(p1.getCurrentScore() <22 && p2.getCurrentScore()<22){
			if(p1.getCurrentScore() > p2.getCurrentScore()){
				System.out.println("Player 1 wins !!!");
				p1.setGamesWon();
			}else{
				System.out.println("Player 2 wins !!!");
				p2.setGamesWon();
			}
			
		}else if(p1.getCurrentScore() >21 && p2.getCurrentScore()<22) {
			System.out.println("Player 2 wins");
			p2.setGamesWon();
		}else if(p1.getCurrentScore() <22  && p2.getCurrentScore() >21){
			System.out.println("Player 1 wins");
			p1.setGamesWon();
		}
	}
}


