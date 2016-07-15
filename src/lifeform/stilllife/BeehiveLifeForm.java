package lifeform.stilllife;

import lifeform.AbstractLifeForm;

public class BeehiveLifeForm extends AbstractLifeForm{

	//	0  1  1  0
	//  1  0  0  1
	//  0  1  1  0
	private static boolean[][] shape = {{false,true,true,false},{true,false,false,true},{false,true,true,false}};
	private static String name = "Beehive";
	
	public BeehiveLifeForm(){
		super(shape, name);
	}
}
