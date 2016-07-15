package lifeform.stilllife;

import lifeform.AbstractLifeForm;

public class BlockLifeForm extends AbstractLifeForm{
	
	//	1  1
	//  1  1
	private static boolean[][] shape = {{true,true},{true,true}};
	private static String name = "Block";
	
	public BlockLifeForm(){
		super(shape, name);
	}
	
	
}
