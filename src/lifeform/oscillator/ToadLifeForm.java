package lifeform.oscillator;

import lifeform.AbstractLifeForm;

public class ToadLifeForm extends AbstractLifeForm{
	
	//	0  0  1  0
	//  1  0  0  1
	//  1  0  0  1
	//  0  1  0  0
	//Period 2 Lifeform
	private static boolean[][] shape = {{false,false,true,false},{true,false,false,true},{true,false,false,true},{false,true,false,false}};
	private static String name = "Toad";
	
	public ToadLifeForm(){
		super(shape, name);
	}
	
	
}
