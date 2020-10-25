/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;


/**
 *
 * @author Paarkavi Saravanan
 */
public class bytestreamdemo_jpg_file {
    public static void main(String args[]) throws Exception{
        FileInputStream fio=null;
        FileOutputStream fou=null;
        fio=new FileInputStream ("input.png");
        fou=new FileOutputStream("picture.png");
        int i;
        while((i=fio.read())!=-1)
        {
            fou.write(i);
        }
        fou.close();
    }
    
}
/*FileInputStream ,FileoutputStream
                ===> .txt,.jpg,.png   ===>will process
  FileReader, FileWriter
                ===> .txt  only process
                      .jpg,.png ==>will NOT process
     this is due to
                  ==>inputStreamand outputstream will convert the given text,jpg,png ,mp3,audio to binary data*/



