package lifeform.stilllife;

import lifeform.AbstractLifeForm;

public class BoatLifeForm extends AbstractLifeForm{
	
	//	1  1  0
	//  1  0  1
	//  0  1  0
	private static boolean[][] shape = {{true,true,false},{true,false,true},{false,true,false}};
	private static String name = "Boat";
	
	public BoatLifeForm(){
		super(shape, name);
	}
	
	
}
