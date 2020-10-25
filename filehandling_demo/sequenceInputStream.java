/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author Paarkavi Saravanan
 */
//to print the content of more files as a single output
//more files(2).....
public class sequenceInputStream {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileInputStream f=new FileInputStream("1.txt");
          FileInputStream f1=new FileInputStream("2.txt");
        
        SequenceInputStream sq=new SequenceInputStream (f,f1);
        int read;
        while((read=sq.read())!=-1)
        {
            System.out.print((char)read);
            
        }
        sq.close();
        f.close();
        f1.close();
        
        
    }
    
}
