package code_test;

import java.util.Random;

/**
 *
 * @author tourist800
 */

         /**
         * Uniform distribution with Random. I know if i use the Random generator from Java, 
         * generating numbers with nextInt, the numbers will be uniformly distributed.
         */
        
        
        /**
         * Generate pseudo-random int values, with an 
           approximately Gaussian (normal) distribution.
         */
public class Random_number {
    
    Random_number(){
        
    }
    
    public double random( double min, double max ){
        double diff = max - min;
        return min + Math.random( ) * diff;
    }
    
    private Random fRandom = new Random();
    public int normal_distribution(int aMean, int aVariance){
        return (int) (aMean + fRandom.nextGaussian()* aVariance);
    }
    
}
