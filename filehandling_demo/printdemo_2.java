/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Paarkavi Saravanan
 */
public class printdemo_2 {
    public static void main(String args[]) throws FileNotFoundException{
        PrintStream ps=new PrintStream(new FileOutputStream ("C:\\Users\\Dell\\Documents\\NetBeansProjects\\exception_demos\\src\\filehandling_demo\\printdemo_file"));
        ps.print(100);
        ps.print("\n");
        ps.print('c');
          ps.print("\n");
        ps.print("oops");
          ps.print("\n");
        ps.close();
        
    }
}
    


