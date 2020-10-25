/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *
 * @author Paarkavi Saravanan
 */
//MAIN FEATURE OF PIPED IS:we can use both pipedinput and output simultaneously(At a same time)....
public class piped_demo {
    public static void main(String args[]) throws IOException{
     PipedInputStream in=new PipedInputStream();
      PipedOutputStream out=new PipedOutputStream();
      in.connect(out);  //any one connection is sufficient
     // out.connect(in);
     String str="java programming";
     byte b[]=str.getBytes();
     for(byte i:b)
     {
      out.write(i);
     System.out.print( (char)in.read());
     }
     in.close();
     out.close();
     
     
      
     
        
    }
    
}
