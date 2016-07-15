package lifeform.stilllife;

import lifeform.AbstractLifeForm;

public class LoafLifeForm extends AbstractLifeForm{
	
	//	0  1  1  0
	//  1  0  0  1
	//  0  1  0  1
	//  0  0  1  0
	private static boolean[][] shape = {{false,true,true,false},{true,false,false,true},{false,true,false,true},{false,false,true,false}};
	private static String name = "Loaf";
	
	public LoafLifeForm(){
		super(shape, name);
	}
	
	
}
