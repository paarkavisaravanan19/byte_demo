/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Paarkavi Saravanan
 */
public class objectinput_outputstream {
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException{
        DataInputStream dis=new DataInputStream(System.in);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("First.txt"));
        System.out.println("no.of friuts");
        int n=Integer.parseInt(dis.readLine());
        fruit f[]=new fruit[n];
        String name;
        double price;
        for(int i=0;i<n;i++)
        {
            System.out.println("fruit name");
            name=dis.readLine();
            System.out.println("fruit price");
            price=Double.parseDouble(dis.readLine());
            f[i]=new fruit(name,price);
            obj.writeObject(f[i]);
            
        }
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("First.txt"));
        while(n>0)
        {
            System.out.println(obj1.readObject());
            n--;
        }
        obj.close();
    }
    
}
class fruit implements Serializable
{
String name;
double price;
fruit(String n,double p)
{
    name=n;
    price =p;
}
public String toString()
{
    return "Fruit Name :"+name+"price "+price;
}
}
