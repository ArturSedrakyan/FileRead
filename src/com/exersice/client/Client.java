package com.exersice.client;

import com.exersice.dataReader.CSVReader;
import com.exersice.dataReader.NLSVReader;
import com.exersice.dataReader.TSVReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ADMIN on 26.03.2017.
 */
public class Client {
    public static Client start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write file's name with type");
        String fileName = scanner.nextLine();
        System.out.println("Write calculator's number < 1 2 3 >");
        int calculatorNumber = scanner.nextInt();
        String fileURL = "C:/Users/ADMIN/Desktop/File";
        String[] ar= fileName.split("\\.");
        switch (ar[1]){
            case "csv":
                return new CSVReader(fileURL+"/"+fileName);
            case "nlsv":
                return new NLSVReader(fileURL+"\\"+fileName);
            case "tsv":
                return new TSVReader(fileURL+"\\"+fileName);

        }


        return null;
    }


}
