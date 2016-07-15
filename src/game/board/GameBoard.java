package game.board;

import java.util.HashMap;
import java.util.Map;

public class GameBoard {
	private int SIZE = 10;
	private boolean[][] board;

	//An enum representing the various ways that the Game of Life can be played
	private enum RuleSet {
		STANDARD("Standard"){
			boolean willContinue(int neighbors) {
				return neighbors == 2 || neighbors == 3;
			}
			boolean willRepopulate(int neighbors) {
				return neighbors == 3;
			}
		};
		
		String name;
		private static final Map<String, RuleSet> stringToEnum = new HashMap<String, RuleSet>();
		
		static {
			for (RuleSet rs : values()){
				stringToEnum.put(rs.toString(), rs);
			}
		}
		
		RuleSet(String name){
			this.name = name;
		}
		
		abstract boolean willContinue(int neighbors);
		abstract boolean willRepopulate(int neighbors);
		
		@Override
		public String toString(){
			return name;
		}
		
		public static RuleSet fromString(String name){
			return stringToEnum.get(name);
		}
		
	}
	
	private RuleSet rules;
	
	public GameBoard(int size) {
		this.SIZE = size;
		this.board = initBoard();
		this.rules = RuleSet.fromString("Standard");
	}
	
	public void setRules(String name){
		this.rules = RuleSet.fromString(name);
	}
	
	public boolean[][] getBoard(){
		return board;
	}

	public boolean[][] initBoard() {

		boolean[][] board = new boolean[SIZE][SIZE];

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				board[i][j] = false;
			}
		}

		return board;
	}

	public int getNeighborCount(int row, int col) {
		int count = 0;

		count += this.board[row][(col - 1 + SIZE) % SIZE] ? 1 : 0;
		count += this.board[row][(col + 1) % SIZE] ? 1 : 0;
		count += this.board[(row - 1  + SIZE) % SIZE][col] ? 1 : 0;
		count += this.board[(row + 1) % SIZE][col] ? 1 : 0;
		count += this.board[(row - 1 + SIZE) % SIZE][(col - 1 + SIZE) % SIZE] ? 1 : 0;
		count += this.board[(row - 1 + SIZE) % SIZE][(col + 1) % SIZE] ? 1 : 0;
		count += this.board[(row + 1) % SIZE][(col - 1 + SIZE) % SIZE] ? 1 : 0;
		count += this.board[(row + 1) % SIZE][(col + 1) % SIZE] ? 1 : 0;

		return count;
	}

	public void updateBoard() {

		boolean[][] swap = new boolean[SIZE][SIZE];
		
		for (int i = 0; i < this.board.length; i++) {
			for (int j = 0; j < this.board.length; j++) {
				int neighbors = getNeighborCount(i,j);
				//If the space on the board is populated, determine if it will continue. 
				//If the space is not populated, determine if it will repopulate.
				swap[i][j] = (this.board[i][j]) ? rules.willContinue(neighbors) : rules.willRepopulate(neighbors);
			}
		}

		this.board = swap;
		try {
		    Thread.sleep(200);                 
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n");
		buffer.append("\n");
		for (int i = 0; i < this.board.length; i++) {
			for (int j = 0; j < this.board.length; j++) {
				buffer.append(this.board[i][j] ? "#" : ".");
			}
			buffer.append("\n");
		}
		return buffer.toString();

	}

}
