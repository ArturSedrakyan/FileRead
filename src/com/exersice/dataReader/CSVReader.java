package com.exersice.dataReader;

import com.exersice.client.Client;

import java.io.*;

/**
 * Created by ADMIN on 26.03.2017.
 */
public class CSVReader extends Client {
   private String fileURL;
    String[] array = new String[20];



    public CSVReader(String fileURL) throws IOException {
        this.fileURL = fileURL;
    }

    File file = new File(fileURL);
    BufferedReader bf = new BufferedReader(new FileReader(file));
    String Line = bf.readLine();
    String[] Le = Line.split(",");


}


