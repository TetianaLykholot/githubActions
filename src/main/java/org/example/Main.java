package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String filePath =  "/Users/VLYKHTE/IdeaProjects/untitled2/src/main/resources/tetx.txt";
        FileOutputStream outputStream =   new FileOutputStream(filePath);
        outputStream.write(1);
        outputStream.write(2);
        outputStream.close();


        FileInputStream inputStream = new FileInputStream(filePath);
        System.out.println(inputStream.read());
        System.out.println(inputStream.read());
    }

}