/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.File;

/**
 *
 * @author Paarkavi Saravanan
 */
public class properties_of_file {
    public static void main(String args[]){
        File f=new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\exception_demos\\src\\filehandling_demo\\copyfile.java");
        /*System.out.println("name==>"+f.getName());
        System.out.println("file path==>"+f.getPath());
        System.out.println("file parent==>"+f.getParent());     //to get the type of the file perform string handling concept to extract the file name(extension)
        System.out.println("existence==>"+f.exists());*/
        /*DIRECTORY
         File f=new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\exception_demos\\src\\filehandling_demo");
          System.out.println("directory==>"+f.isDirectory());  //directory==>folder
          String name[]=f.list();// get all the file under this directory folder
            System.out.println("no.of files===>"+name.length);
          for(String fname:name)
          {
              System.out.println(fname);
          }*/
     //   f.setExecutable(false);
         System.out.println(f.length());
         System.out.println(f.canExecute());  //cannot change to ==>false X
        // f.setReadable(false);//cannot change to ==>false X
         System.out.println(f.canRead());
        // f.setWritable(true); //this write can change depends upon our setable option
           System.out.println(f.canWrite());  /*in windows os canExecutable,canRead==>defaultly it is true
                                                   it can be changed only in linux*/
        
        
        
    }
    
}
