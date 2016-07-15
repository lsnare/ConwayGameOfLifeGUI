package game;

import javax.swing.JFrame;

import game.board.GameBoard;
import gui.ConwayPanel;
import gui.listener.KeystrokeListener;

public class Game {
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		GameBoard b = new GameBoard(200);
		ConwayPanel cpanel = new ConwayPanel(b);
		frame.add(cpanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		KeystrokeListener k = new KeystrokeListener(b, cpanel);
		frame.addKeyListener(k);
		while(true){
			b.updateBoard();
			cpanel.repaint();
		}
				
	}
}
