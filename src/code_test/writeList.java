package code_test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author tourist800
 */
public class writeList {
    
    public void write_in_txt_file(int x) {
        try{    
           FileWriter fw=new FileWriter("file.txt");    
           fw.write("number_of_ref: " + x);    
           fw.close();    
          }
        catch(Exception e){System.out.println(e);}    
          //System.out.println("Success...");    
         
    }
}
