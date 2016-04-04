package main;

import functions.*;
import species.Species;
import java.util.List;

public class Main {
	public static void main(String[] args){
		GlobalVariable globalVariable = new GlobalVariable();
		List<Species> speciesList = null;
		
		
		int numSpecies = 10;
		SimulationEngine.initialize(numSpecies, speciesList);
		SimulationEngine.update(speciesList, globalVariable.speciesRelation);
		
	}
}
