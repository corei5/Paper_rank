package code_test;

import java.util.ArrayList;

/**
 *
 * @author tourist800
 */
public class NodeGeneration {
    
    public ArrayList <Node> NodeList = new ArrayList();
    
    NodeGeneration (int num) {
        
        for (int i = 0; i < num; i++) {
            Node node = new Node();
            node.SetID(i);
            //writelist.write_in_txt_file(adjmatrix.number_of_ref_from_AdjMatrix());
            Random_number nd = new Random_number();
            int number_of_ref = Math.abs(nd.normal_distribution(15,5));
            while (number_of_ref > 31 || number_of_ref < 5) {
                number_of_ref = Math.abs(nd.normal_distribution(15,5));
            }
            System.out.println("number_of_ref................. " + number_of_ref);
             
            for(int j=0; j<number_of_ref; j++){       
                //System.out.println("number_of_ref " + number_of_ref);
                Random_number rn = new Random_number();
                double referance_score = rn.random(0, 1);
                referance_score = Math.round(referance_score * 100);
                referance_score = referance_score/100;
            
                Random_number nd1 = new Random_number();
                int node_number = -1;
                while (node_number < 0 || node_number >= 1000) {
                    node_number = Math.abs(nd1.normal_distribution(500,250));
                }
                
                node.SetRL(node_number,referance_score);
            }
            
            NodeList.add(node);
        }    
    }
    
    public int Size () { return NodeList.size(); }
    
}
