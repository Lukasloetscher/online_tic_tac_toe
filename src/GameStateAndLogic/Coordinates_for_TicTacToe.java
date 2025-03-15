package GameStateAndLogic;

public class Coordinates_for_TicTacToe extends Coordinates {

	public Coordinates_for_TicTacToe(int x, int y) throws Exception {
		super(x, y);
		if (!check_legal_for_tic_tac_toe()) {
			throw new Exception("Coordinates are out of range for tic tac toe");
		}
	}

	public boolean check_legal_for_tic_tac_toe() {
		if (x > 3 || x < 0 || y > 3 || y < 0) {
			return false;
		} else {
			return true;
		}
	}
}