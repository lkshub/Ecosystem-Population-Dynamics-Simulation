package functions;

import java.util.HashSet;
import java.util.Random;

public class Function {
	
	/**
	 * This funciton is used to generate a random number following the Gaussian distribution
	 * @return Random Number
	 */
	
	//Kai
	public static double GaussianRNG(double avg,double variance){
		double number = 0;
		Random ran = new Random();
		number = Math.sqrt(variance)*ran.nextGaussian()+avg;
		/*
		 *  Implements the content of the Random Number Generator function here 
		 */
		return number;
	}
	
	//Yuzhi
	public static int[] uniqueRandom(int m, int n) {
		HashSet<Integer> set = new HashSet<>();
		int[] uniqueList = new int[m];
		int ulIndex = 0;
		int ulNum = 0;
		while(ulIndex < m) {
			ulNum = (int) (Math.random()*n);
			if(!set.contains(ulNum)){
				set.add(ulNum);
				uniqueList[ulIndex++] = ulNum;
			}
		}
		return uniqueList;
	}
	
}
