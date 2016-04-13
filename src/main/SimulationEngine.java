package main;

import java.util.List;

import functions.*;
import variable.Species;

//import species;

public class SimulationEngine {
	
	/**
	 * This function is used for the initializing the system at first.
	 * Input:K,n,L,c
	 * Output:alpha,S,f
	 */
	//Yuzhi
	public static void initialize(int K,int n,int L,double c, List<List<Double>> alpha, List<List<Double>> S, List<List<Double>> f, List<List<Boolean>> attr, List<Integer> N){

	}
	
	/**
	 * This function is used for updating the population of species for each time step.
	 */
	//Qiang
	public static void update(double b,List<Species> f, List<List<Integer>> speciesRelation){
		
		
		

	}
	/**
	 * Input:f,b,alpha,N,S
	 * Output:f,g
	 * @param f
	 * @param b
	 * @param g
	 * @param alpha
	 * @param N
	 * @param S
	 * @return
	 */
	private static double updateParameters( List<List<Double>> f,double b, List<List<Double>> g, List<List<Double>> alpha,List<Integer> N, List<List<Double>> S){
		double error=0;
		
		
		return error;
		
	}
	/**
	 * Input:N,deltaT,g
	 * Output:N
	 * @param N
	 * @param deltaT
	 * @param g
	 */
	private static void updatePopulation(List<Integer> N, double deltaT, List<List<Double>> g){
		
	}
	/**
	 * This function is used for update the environment such as whether new species comes in 
	 * and whether the species relationship changes.
	 */
	//Tong
	private static void generateNewSpecies( List<List<Double>> S, List<List<Double>> alpha, List<List<Double>> f, List<Integer> N,List<List<Boolean>> attr){
		
	}
	
}
