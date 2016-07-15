package gui.listener;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import exception.IllegalPlacementException;
import game.board.GameBoard;
import gui.ConwayPanel;
import lifeform.AbstractLifeForm;
import lifeform.factory.LifeFormFactory;

public class KeystrokeListener implements KeyListener {

	private GameBoard g;
	private ConwayPanel cpanel;
	private HashMap<Character, AbstractLifeForm> lifeforms; 
	
	
	public KeystrokeListener(GameBoard g, ConwayPanel cpanel){
		this.g = g;
		this.cpanel = cpanel;
		this.lifeforms = LifeFormFactory.getLifeForms();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		try {
			lifeforms.get(e.getKeyChar()).place(g, cpanel.getMousePosition().x / 5, cpanel.getMousePosition().y / 5);
		} catch (HeadlessException ex) {
			ex.printStackTrace();
		} catch (IllegalPlacementException ex) {
			System.out.println("Cannot place lifeform at this position");
		} catch (NullPointerException ex){
			System.out.println("Invalid keystroke, no lifeforms are mapped to key " + e.getKeyChar());
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
