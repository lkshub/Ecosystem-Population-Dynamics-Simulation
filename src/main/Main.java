package main;

import functions.*;
import variable.GlobalVariable;
import variable.Species;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		/** old
		GlobalVariable globalVariable = new GlobalVariable();
		List<Species> speciesList = new ArrayList<Species>();
		int numSpecies = 10;
		SimulationEngine.initialize(numSpecies, speciesList);
		SimulationEngine.update(speciesList, globalVariable.getSpeciesRelation());
		*/
		
		List<List<Double>> S = new ArrayList<>();
		List<List<Double>> alpha = new ArrayList<>();
		List<List<Double>> f = new ArrayList<>();
		List<Integer> N = new ArrayList<>();
		List<Boolean> attr = new ArrayList<>();
		
		SimulationEngine.initialize(20, 5, 7, 0.2, S, alpha, f, N, attr);
	}
}
