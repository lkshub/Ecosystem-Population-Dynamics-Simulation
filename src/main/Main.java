package main;

import functions.*;
import variable.GlobalVariable;
import variable.Species;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		/* 
		old
		GlobalVariable globalVariable = new GlobalVariable();
		List<Species> speciesList = new ArrayList<Species>();
		int numSpecies = 10;
		SimulationEngine.initialize(numSpecies, speciesList);
		SimulationEngine.update(speciesList, globalVariable.getSpeciesRelation());
		*/
		
		int attributeNumTotal = 20;
		int attributeNumSelect = 5;
		int speciesNum = 7;
		double c = 0.2;
		double b = 1;
		List<List<Double>> S = new ArrayList<>();
		List<List<Double>> alpha = new ArrayList<>();
		List<List<Double>> f = new ArrayList<>();
		List<List<Double>> g = new ArrayList<>();
		List<Integer> N = new ArrayList<>();
		List<Boolean> attr = new ArrayList<>();
		
		SimulationEngine.initialize(attributeNumTotal, attributeNumSelect, speciesNum, c, S, alpha, f, g, N, attr);
		SimulationEngine.update(b,f,g,alpha,N,S);
	}
}
