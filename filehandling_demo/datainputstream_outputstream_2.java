/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Paarkavi Saravanan
 */
public class datainputstream_outputstream_2 {
    public static void main(String args[]){
        try
        {
        DataOutputStream dis=new DataOutputStream(new FileOutputStream("primitivedata.txt"));
        dis.writeInt(2000);
        dis.writeChar('p');
        dis.writeUTF("paarkavi"); //ascii+unicode
        dis.close();
        
        DataInputStream dos=new DataInputStream(new FileInputStream("primitivedata.txt"));
        System.out.println(dos.readInt());
        System.out.println(dos.readChar());
        System.out.println(dos.readUTF());
        dos.close();
        
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    }
    
}
