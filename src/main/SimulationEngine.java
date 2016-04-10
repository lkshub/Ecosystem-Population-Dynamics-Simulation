package main;

import java.util.List;

import functions.*;
import variable.Species;

//import species;

public class SimulationEngine {
	
	/**
	 * This function is used for the initializing the system at first.
	 */
	//Yuzhi
	public static void initialize(int numSpecies, List<Species> speciesList){
		for (int i=0; i<numSpecies; i++) {
			Species s = new Species();
			s.setPopulation((int)Function.GaussianRNG(100, 20));
			speciesList.add(s);
		}
	}
	
	/**
	 * This function is used for updating the population of species for each time step.
	 */
	//Qiang
	public static void update(List<Species> speciesList, List<List<Integer>> speciesRelation){
		
		
		
		environmentUpdate(speciesList);
	}
	
	/**
	 * This function is used for update the environment such as whether new species comes in 
	 * and whether the species relationship changes.
	 */
	//Tong
	private static void environmentUpdate(List<Species> speciesList){
		
	}
	
}
