package code_test;

import java.util.ArrayList;

/**
 *
 * @author tourist800
 */
public class Node {
    
    private int ID;
    public ArrayList<Data>ReferenceList = new ArrayList<>();
    
   Node(){
       ID = -1;
   } 
   Node(int id){
       ID = id;
   }
   public void SetID(int i){
       this.ID = i;
   }
   public int GetID(){
       return ID;
   }
   public ArrayList<Data>GetReferenceList(){
       return ReferenceList;
   }
   
   public void SetRL(){
       Data nd = new Data();
       ReferenceList.add(nd);
   }
   
   public void SetRL(int ref_node_num){
       Data nd = new Data(ref_node_num);
       ReferenceList.add(nd);
   }
   public void SetRL(int ref_node_num,double score){
       Data nd = new Data(ref_node_num, score);
       ReferenceList.add(nd);
   }
   public void SetRL(int ref_node_num, double score, String s){
       Data nd = new Data(ref_node_num, score , s);
       ReferenceList.add(nd);
   }
   public double GetScore(int ref_node_num){
       for(int i=0;i<ReferenceList.size();i++){
           if(ref_node_num  == ReferenceList.get(i).GetPaperID())
               return ReferenceList.get(i).GetScore();
       }
       return -1;
   }
   public ArrayList<Double>GetScoreList(){
       ArrayList<Double>ScoreList = new ArrayList<>();
       for(int i=0;i<ReferenceList.size();i++){
           Double dv = ReferenceList.get(i).GetScore();
           ScoreList.add(dv);
       }
       return ScoreList;
   }
   
   public void PrintReferenceInfo () {
       for(int i = 0; i < ReferenceList.size(); i++) {
           Data dt = ReferenceList.get(i);
           System.out.println("Ref ID: " + dt.GetPaperID() + " " + "Ref Score: " + dt.GetScore());          
       }
   }
   
    
    
}
