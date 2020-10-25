/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Paarkavi Saravanan
 */
public class file_write {
    public static void main(String args[]){
        File f=new File("first.txt");
        String str="Object oriented programming";  //the previous content is "welcome to oops class".
        byte b[]=str.getBytes();
        try
        {
            FileOutputStream fos=new FileOutputStream(f,true); //here true specify that the new content is appended to the previous content
            
            fos.write(b);
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
