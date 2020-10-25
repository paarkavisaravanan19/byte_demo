/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;


/**
 *
 * @author Paarkavi Saravanan
 */
public class byteArrayIput_Output_stream {
   public static void main (String args[]){
       String str="oops class";
       byte b[]=str.getBytes();
       try
       {
       ByteArrayInputStream bs=new ByteArrayInputStream (b);
       int read;
       FileInputStream f1=new FileInputStream("2.txt");
       while((read=bs.read())!=-1)
       {
           System.out.print((char)read);
           
       }
       System.out.println();
       // some other ways to read the content without using while loop
       bs.reset();
       byte b1[]=new byte[15];
       bs.read(b1);
   //  bs.read(b1,0,6);//(byte array,offset[from which it shld start,length )
   //  System.out.print(read);
      for(byte b2:b1)
       {
           System.out.print((char)b2);
       }
       
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   
   }
}
    

