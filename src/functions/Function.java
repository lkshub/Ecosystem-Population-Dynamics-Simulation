package functions;
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
	
	
}
