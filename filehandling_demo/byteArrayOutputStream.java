/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 * @author Paarkavi Saravanan
 */
public class byteArrayOutputStream {
    public static void main(String args[]) throws IOException{
        try
        {
            //to print the given string by using bytearrayoutputstream 
        ByteArrayOutputStream bs=new ByteArrayOutputStream();
        String str="Thefault in our stars";
        byte b[]=str.getBytes();
        bs.write(b);
        System.out.println(bs);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        
    }
    
}
