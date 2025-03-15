package main;

import GameStateAndLogic.*;

public class TicTacToe_main {
	
	public static void main(String[] args) {
		System.out.println("Hallo");
		int active_player = -1;
		Gamestate game = new Gamestate();
		try {
			int a = 0/0;
			active_player = game.get_active_player();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(active_player);
		
	}
}
