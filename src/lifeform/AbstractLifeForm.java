package lifeform;

import game.board.GameBoard;
import exception.IllegalPlacementException;

public abstract class AbstractLifeForm {
	
	private boolean[][] shape = {{false}};
	private String name;
	
	public AbstractLifeForm(boolean[][] shape, String name){
		this.shape = shape;
		this.name = name;
	}
	
	public void place(GameBoard g, int rowStart, int colStart) throws IllegalPlacementException{
		
		boolean[][] board = g.getBoard();
		
		if (rowStart + shape.length > board.length || colStart + shape[0].length > board.length){
			throw new IllegalPlacementException(name + " was placed out-of-bounds");
		}
		
		for (int i = 0; i < shape.length; i++){
			for (int j = 0; j < shape[i].length; j++){
				if (board[rowStart + i][colStart + j]){
					throw new IllegalPlacementException(name + " was placed over another shape");
				}
				board[rowStart + i][colStart + j] = shape[i][j];
			}
		}
	}
	
	public void flipHorizontal(){
		int rows = shape.length;
		int cols = shape[0].length;
		boolean[][] swap = new boolean[rows][cols];
		
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				swap[i][j] = shape[i][(cols - 1) - j];
			}
		}
		
		shape = swap;

	}
	
	public void flipVertical(){
		int rows = shape.length;
		int cols = shape[0].length;
		boolean[][] swap = new boolean[rows][cols];
		
		for (int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				swap[i][j] = shape[(rows - 1) - i][j];
			}
		}
		
		shape = swap;
	}
	
	
}
