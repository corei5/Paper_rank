package code_test;
/**
 *
 * @author tourist800
 */
public class PageNode {
    
    public String name;
    private double current_score;
    private double new_score;
    
    PageNode(){
        name = "";
        current_score = 0;
        new_score = 0;
    }
    PageNode(String s){
        this.name = s;
    }
    PageNode(double d,double n){
        this.current_score = d;
        this.new_score = n;
    }
    PageNode(String s,double d){
        this.name = s;
        this.current_score = d;
    }
    PageNode(String s,double d,double n){
        this.name = s;
        this.current_score = d;
        this.new_score = n;
    }
    public void setCurrentScore(double score){
        current_score = score;
    }
    public double getCurrentScore(){
        return current_score;
    }
    public void setNewScore(double score){
        new_score = score;
    }
    public double getNewScore(){
        return new_score;
    }
    public void Setname(String s){
        name = s;
    }
    public String Getname(){
        return name;
    }
}
