package code_test;
/**
 *
 * @author tourist800
 */
public class Data {
    
    private int PaperID;
    private String PaperName;
    private double Score;
    
    Data(){
        PaperID = -1;
        PaperName = "";
        Score = 0;
    }
    Data(int x){
        PaperID = x;
        PaperName = "";
        Score = 0;
    }
    Data(int x,String s){
        PaperID = x;
        PaperName = s;
        Score = 0;
    }
    Data(int x, double d) {
        PaperID = x;
        Score = d;
    }
    Data(int x,String s,double d){
        PaperID = x;
        PaperName = s;
        Score = d;
    }
    Data(int x, double d, String s) {
        PaperID = x;
        Score = d;
        PaperName = s;
    }
    
    public void SetPaperID(int x){
        this.PaperID = x;
    }
    public void SetPaperName(String s){
        this.PaperName = s;
    }
    public void SetScore(double d){
        this.Score = d;
    }
    public void SetPaperList(int x, double score){
        this.PaperID = x;
        this.Score = score;
    }
    public int GetPaperID(){
        return PaperID;
    }
    public String GetPaperName(){
        return PaperName;
    }
    public double GetScore(){
        return Score;
    }
    
    //Get method for SetPaperList
    
}

