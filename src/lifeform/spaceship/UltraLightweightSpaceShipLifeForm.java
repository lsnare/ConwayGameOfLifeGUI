package lifeform.spaceship;

import lifeform.AbstractLifeForm;

public class UltraLightweightSpaceShipLifeForm extends AbstractLifeForm{

	//	1  1  1
	//  1  0  0
	//  0  1  0

	private static boolean[][] shape = {{true,true,true},{true,false,false},{false,true,false}};
	private static String name = "Spaceship";
	
	public UltraLightweightSpaceShipLifeForm(){
		super(shape, name);
	}
	
}
