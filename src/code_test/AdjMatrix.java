
package code_test;

import java.util.*;

/**
 *
 * @author tourist800
 */


public class AdjMatrix {
    
    double refefance_score;
    ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();
    
    public int number_of_ref_from_AdjMatrix(){
        Random_number nd = new Random_number();
        int number_of_ref = Math.abs(nd.normal_distribution(5,30));
        
        //System.out.println("number_of_ref " + number_of_ref);
        
        while (number_of_ref > 31 || number_of_ref < 5) {
                number_of_ref = Math.abs(nd.normal_distribution(15,5));
            }
        //System.out.println("number_of_ref " + number_of_ref);
        return number_of_ref;
    }
    
    public double refefance_score_from_adjMatrix(){
        Node node = new Node();
        for(int i=0;i<number_of_ref_from_AdjMatrix();i++){
            Random_number rn = new Random_number();
            refefance_score = rn.random(0, 1);
            refefance_score = Math.round(refefance_score * 100);
            refefance_score = refefance_score/100;
        }
        return refefance_score;
    }
    
    public int node_number_from_adjMatrix(){
        Random_number nd1 = new Random_number();
            
            int node_number = -1;
            while (node_number < 0 || node_number > 1000) {
                node_number = Math.abs(nd1.normal_distribution(500,250));
            }
        return node_number; 
    }
    
    
    
      
   
}
