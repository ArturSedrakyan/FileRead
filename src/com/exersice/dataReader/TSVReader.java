package com.exersice.dataReader;

import com.exersice.client.Client;

/**
 * Created by ADMIN on 26.03.2017.
 */
public class TSVReader extends Client{
    private String fileURL;
    public TSVReader(String fileURL ) {
        this.fileURL = fileURL;
    }
}
