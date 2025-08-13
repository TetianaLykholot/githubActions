package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaRush {
    public static void main(String[] args) {


        Date date = new Date();
        System.out.println(date);
        Date myDate = new Date(96, 0, 8);
        System.out.println(myDate);
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM-dd-YYYY");
        String message = formatter.format(myDate);
        System.out.println(message);

    }
}
