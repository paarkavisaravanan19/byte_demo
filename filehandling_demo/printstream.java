/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.PrintStream;

/**
 *
 * @author Paarkavi Saravanan
 */
public class printstream {
    public static void main(String args[]){
        PrintStream ps=new PrintStream(System.out);
        ps.print(100);
        ps.print('c');
        ps.print("oops");
        ps.close();
        
    }
}
