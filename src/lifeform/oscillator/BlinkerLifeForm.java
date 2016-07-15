package lifeform.oscillator;

import lifeform.AbstractLifeForm;

public class BlinkerLifeForm extends AbstractLifeForm{
	
	//	0  1  0
	//  0  1  0
	//  0  1  0
	//Period 2 Lifeform
	private static boolean[][] shape = {{false,true,false},{false,true,false},{false,true,false}};
	private static final String name = "Blinker";
	
	public BlinkerLifeForm(){
		super(shape, name);
	}
	
	
}
