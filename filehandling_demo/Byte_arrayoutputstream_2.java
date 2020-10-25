/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Paarkavi Saravanan
 */

/*ByteArrayOutputStream and FileOutputStream are used here to copy the content on different files using fileoutputStream
by using fileOutputStream ...  */

public class Byte_arrayoutputstream_2 {
    public static void main(String args[]) throws FileNotFoundException, IOException{
       try
       {
            FileOutputStream f=new FileOutputStream("1.txt");
              FileOutputStream f1=new FileOutputStream("2.txt");
                FileOutputStream f2=new FileOutputStream("C:\\Users\\Dell\\Desktop\\3.txt");
                FileOutputStream f3=new FileOutputStream("4.txt");
                
                 FileOutputStream f4=new FileOutputStream("5.txt");
                
                ByteArrayOutputStream ba=new ByteArrayOutputStream ();
                String str1="welcome to object oriented programming or java";
                //the fileinputStream used here to check whther the file is present or not..
                
               // FileInputStream ff=new FileInputStream ("two.txt"); //it returns that the file not found
                byte b[]=str1.getBytes();
                ba.write(b);
                ba.writeTo(f);
                ba.writeTo(f1);
                ba.writeTo(f2);
                ba.writeTo(f3);
                ba.writeTo(f4);
                ba.close();
                f.close();
                f1.close();
                f2.close();
                f3.close();
                f4.close();
       }
       catch(IOException e)
       {
           System.out.println(e);
       }
        
    }
    
}
