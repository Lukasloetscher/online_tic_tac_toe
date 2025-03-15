package GameStateAndLogic;

public class Gamestate {
	private static final int VALUE_PLAYER_1 = 0;
	private static final int VALUE_PLAYER_2 = 1;
	private static final int NO_WINNER_YET = -1;
	private static final int END_IN_TIE = -1;
	private int active_player;
	private int winner;
	private int[][] board;

	// constructor initialises the board and active player.
	public Gamestate() {
		board = new int[3][3];
		winner = NO_WINNER_YET;
		active_player = VALUE_PLAYER_1;
	}

	// returns which players turn it currently is. The throws exception is "only"
	// here to learn something about those. Normally
	// i do not think that this one would be needed (or even that it should be
	// checked.)
	public int get_active_player() throws Exception {
		if (active_player > 1 || active_player < 0) {
			throw new Exception("Gamestate is out of bound");
		}
		return active_player;
	}

	public void make_move(int player, Coordinates_for_TicTacToe field_to_cross)  throws Exception {
		cross_field(field_to_cross);
		check_gamestate(field_to_cross);
		end_turn();
		
		
	}
	
	private void cross_field(Coordinates_for_TicTacToe field_to_cross) {
		board[field_to_cross.x][field_to_cross.y] = active_player;
	}
	private void end_turn() {
		switch_active_player();
	}
	private void switch_active_player() {
		active_player = active_player == VALUE_PLAYER_1 ? VALUE_PLAYER_2 : VALUE_PLAYER_1;
	}
	
	private void check_gamestate(Coordinates_for_TicTacToe field_to_cross) {
		
	}

}
