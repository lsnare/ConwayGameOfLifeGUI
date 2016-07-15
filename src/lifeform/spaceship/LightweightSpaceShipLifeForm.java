package lifeform.spaceship;

import lifeform.AbstractLifeForm;

public class LightweightSpaceShipLifeForm extends AbstractLifeForm{

	//	0  1  0  0  1
	//  1  0  0  0  0
	//  1  0  0  0  1
	//  1  1  1  1  0
	private static boolean[][] shape = {{false,true,false,false,true},
									{true,false,false,false,false},
									{true,false,false,false,true},
									{true,true,true,true,false}};
	private static String name = "Spaceship";
	
	public LightweightSpaceShipLifeForm(){
		super(shape, name);
	}
	
}
