package main;

import functions.*;
import variable.GlobalVariable;
import variable.Species;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		
		GlobalVariable globalVariable = new GlobalVariable();
		List<Species> speciesList = new ArrayList<Species>();
		
		
		int numSpecies = 10;
		SimulationEngine.initialize(numSpecies, speciesList);
		SimulationEngine.update(speciesList, globalVariable.speciesRelation);
		
//		for (Species s : speciesList) {
//			System.out.println(s.getPopulation());
//		}

	}
}
