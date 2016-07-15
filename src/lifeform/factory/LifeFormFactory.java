package lifeform.factory;

import java.util.HashMap;

import lifeform.AbstractLifeForm;
import lifeform.oscillator.PulsarLifeForm;
import lifeform.spaceship.LightweightSpaceShipLifeForm;
import lifeform.stilllife.BeehiveLifeForm;
import lifeform.stilllife.BlockLifeForm;
import lifeform.stilllife.BoatLifeForm;
import lifeform.stilllife.LoafLifeForm;

public class LifeFormFactory {

	public static HashMap<Character, AbstractLifeForm> getLifeForms(){
		HashMap<Character, AbstractLifeForm> lifeforms = new HashMap<Character, AbstractLifeForm>();
		
		//Key binding of various lifeforms
		lifeforms.put('1', new BeehiveLifeForm());
		lifeforms.put('2', new BlockLifeForm());
		lifeforms.put('3', new BoatLifeForm());
		lifeforms.put('4', new LoafLifeForm());
		lifeforms.put('p', new PulsarLifeForm());
		lifeforms.put('l', new LightweightSpaceShipLifeForm());
		
		return lifeforms;
		
	}
}
