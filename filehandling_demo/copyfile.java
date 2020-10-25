/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Paarkavi Saravanan
 */
//copying the content of one file to another file using fileinputstream and fileoutputstream


public class copyfile {
    public static void main(String args[]){
        try
        {
        FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Documents\\NetBeansProjects\\exception_demos\\src\\filehandling_demo\\file_read.java");
        FileOutputStream fos=new FileOutputStream("copyfile.txt");
        int read;
        while((read=fis.read())!=-1)
        {
            fos.write(read);
        }
        fis.close();
        fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    }
    
}
