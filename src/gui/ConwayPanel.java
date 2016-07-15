package gui;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import game.board.GameBoard;

@SuppressWarnings("serial")
public class ConwayPanel extends JPanel{
	
	private GameBoard b;
	private static final int OFFSET = 5;
	
	public ConwayPanel(GameBoard b){
		super();
		this.b=b;
		this.setBackground(Color.CYAN);
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawBoard(g, b);
	}
	
	private void drawTile(Graphics g, boolean occupied, int x, int y){
		if (occupied){
			g.drawRect(x, y, this.getWidth()/b.getBoard().length, this.getHeight()/b.getBoard().length);
			g.fillRect(x, y, this.getWidth()/b.getBoard().length, this.getHeight()/b.getBoard().length);
		}
	}
	
	private void drawBoard(Graphics g, GameBoard b){
		boolean[][] board = b.getBoard();
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board.length; j++){
				drawTile(g, board[i][j], i * OFFSET, j * OFFSET);
			}
		}
	}

}
