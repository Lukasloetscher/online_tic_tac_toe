package GameStateAndLogic;

public class Gamestate {
	private static final int VALUE_PLAYER_1 = 0;
	private static final int VALUE_PLAYER_2 = 1;

	private int active_player;
	private int[][] board;

	// constructor initialises the board and active player.
	public Gamestate() {
		board = new int[3][3];
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

}
