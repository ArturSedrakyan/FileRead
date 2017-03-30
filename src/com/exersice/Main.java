package com.exersice;

import com.exersice.client.Client;
import com.exersice.dataReader.CSVReader;

import java.io.*;

/**
 * Created by ADMIN on 26.03.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
       Client client = new Client();
       client.start();

      /*  File file = new File("C:/Users/ADMIN/Desktop/File/vvv.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String Line = bufferedReader.readLine();
        String[] Le = Line.split(",");
        for(String element: Le){
            System.out.println(element);
        }

         String a = "Barev,dzez,e,a,r";
        String[] q = a.split(",");
        System.out.println(q.length);
   for(String c: a.split(",") ){
        System.out.println(c);
    }*/
    }
}
