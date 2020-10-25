/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Paarkavi Saravanan
 */

//FileInputSream ==> to read
//FileOutputStream ==> to write

public class file_read {
    public static void main(String args[]){
        try
        {
            FileInputStream fis=new FileInputStream("first.txt");
            int c;
            /*System.out.println((char) fis.read()); ==>this indicates that it is reading the first chr of the given messageand converts into byte and here it i
            is typecated from char to byte.*/
            
            while((c=fis.read())!=-1)
            {                            /*printing the statement in n number of times we can print it in while 
                                           loop as while((c=fis.read())!=-1)*/
            System.out.print((char) c);
            }
            
           fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
