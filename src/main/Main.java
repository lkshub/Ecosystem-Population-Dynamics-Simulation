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
		
		int attributeNumTotal = 200;
		int attributeNumSelect = 100;
		int speciesNum = 50;
		double c = 0.8;
		double b = 0.1;
		double deltaT=0.02;
		List<List<Double>> m = new ArrayList<List<Double>>();
		List<List<Double>> S = new ArrayList<>();
		List<List<Double>> alpha = new ArrayList<>();
		List<List<Double>> f = new ArrayList<>();
		List<List<Double>> g = new ArrayList<>();
		List<Integer> N = new ArrayList<>();
		List<List<Integer>> attr = new ArrayList<List<Integer>>();
		
		SimulationEngine.initialize(m, attributeNumTotal, attributeNumSelect, speciesNum, c, S, alpha, f, g, N, attr);
		SimulationEngine.generateNewSpecies(m, attributeNumSelect, c, S, alpha, f, N, attr, g);
		
		boolean unstable = true;
		while(unstable){
			unstable = SimulationEngine.update(deltaT,b,f,g,alpha,N,S);
			//unstable = true;
		}
		/*
		for(int i = 0; i < 1000; i++){
			//System.out.println(i);
			
			//test g
			
			for(int j=0; j<g.size(); j++) {
				for(int k=0; k<g.get(j).size(); k++) {
					System.out.print(Function.printFormat2(g.get(j).get(k)) + " ");
				}
				System.out.println(" ");
			}
			System.out.println("------------------------------------------------------------"
					 + "------------------------------------------------------------");
			
		}
		
		*/
	}
}
