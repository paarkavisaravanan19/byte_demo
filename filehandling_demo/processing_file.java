/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Paarkavi Saravanan
 */
public class processing_file {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileInputStream fi=new FileInputStream("C:\\Users\\Dell\\Documents\\NetBeansProjects\\exception_demos\\src\\filehandling_demo\\proceesing_demo");
        int read,count=0;
        while((read=fi.read())!=-1)
        {
         // if((char)read=='.')    (1st method)
          /*if(read==10)//here 10==>newline  (2nd method)
            count++;*/
         /*to count vowels...
         if((char)read=='a'||(char)read=='e'|| (char)read=='i'|| (char)read=='o'|| (char)read=='u')
         count++;*/
            //to find out no . of words
            if((char)read=='.'||(char)read==' ') 
            {
                count++;
            }
         }
       // System.out.println("no.of lines-->"+count);
        // System.out.println("no.of vowels-->"+count);
         System.out.println("no.of words==>"+count);
        fi.close();
    
    
    }
    
}
