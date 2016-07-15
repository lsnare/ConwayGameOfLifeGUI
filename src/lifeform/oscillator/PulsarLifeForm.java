package lifeform.oscillator;

import lifeform.AbstractLifeForm;

public class PulsarLifeForm extends AbstractLifeForm{
	
	//	0  0  1  1  1  0  0  0  1  1  1  0  0
	//  0  0  0  0  0  0  0  0  0  0  0  0  0
	//  1  0  0  0  0  1  0  1  0  0  0  0  1
	//  1  0  0  0  0  1  0  1  0  0  0  0  1
	//  1  0  0  0  0  1  0  1  0  0  0  0  1
	//	0  0  1  1  1  0  0  0  1  1  1  0  0
	//  0  0  0  0  0  0  0  0  0  0  0  0  0
	//	0  0  1  1  1  0  0  0  1  1  1  0  0
	//  1  0  0  0  0  1  0  1  0  0  0  0  1
	//  1  0  0  0  0  1  0  1  0  0  0  0  1
	//  1  0  0  0  0  1  0  1  0  0  0  0  1
	//  0  0  0  0  0  0  0  0  0  0  0  0  0
	//	0  0  1  1  1  0  0  0  1  1  1  0  0

	
	//Period 2 Lifeform
	private static boolean[][] shape = {{false,false,true,true,true,false,false,false,true,true,true,false,false},
									{false,false,false,false,false,false,false,false,false,false,false,false,false},
									{true,false,false,false,false,true,false,true,false,false,false,false,true},
									{true,false,false,false,false,true,false,true,false,false,false,false,true},
									{true,false,false,false,false,true,false,true,false,false,false,false,true},
									{false,false,true,true,true,false,false,false,true,true,true,false,false},
									{false,false,false,false,false,false,false,false,false,false,false,false,false},
									{false,false,true,true,true,false,false,false,true,true,true,false,false},
									{true,false,false,false,false,true,false,true,false,false,false,false,true},
									{true,false,false,false,false,true,false,true,false,false,false,false,true},
									{true,false,false,false,false,true,false,true,false,false,false,false,true},
									{false,false,false,false,false,false,false,false,false,false,false,false,false},
									{false,false,true,true,true,false,false,false,true,true,true,false,false}};
	private static String name = "Pulsar";
	
	public PulsarLifeForm(){
		super(shape, name);
	}
	
	
}
