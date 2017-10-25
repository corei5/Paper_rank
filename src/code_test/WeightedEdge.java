package code_test;

import java.util.ArrayList;


/**
 *
 * @author tourist800
 */

public class WeightedEdge {
    
    double [][] array;
        
    WeightedEdge(ArrayList <Node> NodeList){
        int size = NodeList.size();
        array = new double[1000][1000];
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                array[i][j]=0;
            }
        }
        
        for(int i=0;i<size;i++){
            Node nd = NodeList.get(i);
            for(int j=0;j<nd.ReferenceList.size();j++){
                Data dt = nd.ReferenceList.get(j);
                setEdge(i, dt.GetPaperID(), dt.GetScore());
            }
        }
        
    }
    
    void setEdge(int x1,int x2, double score){
        System.out.println(x1 + " " + x2);
        array[x1][x2] = score;
        System.out.println("End");
        return;
    }
      
    void display(){
        System.out.println("Display Test");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
