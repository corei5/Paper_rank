package code_test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author tourist800
 */
public class Code_test {
    public static void main(String[] args) {
        
        NodeGeneration ng = new NodeGeneration(1000);
        
        System.out.println("Node list size: " + ng.NodeList.size());
        
        for (int i = 0; i <ng.Size(); i++) {
            Node nd = ng.NodeList.get(i);
            nd.PrintReferenceInfo();
        }
        
        WeightedEdge we = new WeightedEdge(ng.NodeList);
        we.display();
        
        //ArrayList<Double> arraylist_double = new ArrayList();
        //ArrayList<Integer> arraylist_int = new ArrayList();
        
        
        
        /*AdjMatrix adjmatrix = new AdjMatrix();
             
        writeList writelist = new writeList();
        
        
        //5 =number of refersnce (5-30) 
        // i = node number (1-1000)
        //1.0 = refefance score (0-1.0)
        
        //for 100 papers
        for(int x=0;x<2;x++){
            Node node = new Node();
            
            //writelist.write_in_txt_file(adjmatrix.number_of_ref_from_AdjMatrix());
            int number_of_ref = adjmatrix.number_of_ref_from_AdjMatrix();
            System.out.println("................. " + number_of_ref);
            
             
            WeightedEdge wei_edg = new WeightedEdge(1000); 
             
            for(int i=0;i<number_of_ref;i++){
                int node_number = adjmatrix.node_number_from_adjMatrix();
                System.out.println("node_number " + node_number);
                double refefance_score = adjmatrix.refefance_score_from_adjMatrix();
                System.out.println("refefance_score " + refefance_score);
                
                wei_edg.setEdge(0,1,refefance_score);
            }    
        
        
            node.SetRL(adjmatrix.node_number_from_adjMatrix(), adjmatrix.refefance_score_from_adjMatrix());*/
            
            //ArrayList<Double> arraylist = node.GetScoreList();
            /**
            for(int i=0;i<arraylist_double.size();i++){
                System.out.println(arraylist_double.get(i));
                System.out.println(arraylist_int.get(i));
            }**/
            
            //List<Data> data_list = new ArrayList<Data>();
            
           
            
            //wei_edg.display();
            
             
            
        //}       
            
    }
            
}
    

