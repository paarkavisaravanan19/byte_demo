/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author Paarkavi Saravanan
 */
public class datainputsream_dataoutputstream {
    public static void main(String args[]){
        try
        {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("enter the number");
        int i=Integer.parseInt(dis.readLine());
        System.out.println("entered number:"+i);
        DataOutputStream dos=new DataOutputStream(System.out);
        dos.writeUTF("hello hi");
       // System.out.println(i);
        
        }
        
        catch(IOException e)
        {
            System.out.println(e);
        }
    
        
    }
    
}
