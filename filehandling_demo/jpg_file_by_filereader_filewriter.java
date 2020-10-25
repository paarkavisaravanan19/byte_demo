/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.FileReader;
import java.io.FileWriter;



/**
 *
 * @author Paarkavi Saravanan
 */
public class jpg_file_by_filereader_filewriter {
    public static void main(String args[]) throws Exception {
        FileReader fio=null;
        FileWriter fou=null;
        fio=new FileReader("input.png");
        fou=new FileWriter("ouput.png");
        int i;
        while((i=fio.read())!=-1)
        {
            fou.write(i);
        }
        fou.close();
    }
     


}
//here it shows that ==> output.png cant be processed due to fileReader , fileWriter
      