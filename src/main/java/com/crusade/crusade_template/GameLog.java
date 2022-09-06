package com.crusade.crusade_template;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class GameLog {
    //private File log;
    private FileWriter fw;
    private DateTimeFormatter dtf;
    private String filename;

    public GameLog(){
        filename = "GameLog.txt";
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    }

    public void PrintLog(String s){
        LocalDateTime now = LocalDateTime.now();
        try{
            fw = new FileWriter(filename, true);
            fw.write("\n" + dtf.format(now) + " " + s);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
