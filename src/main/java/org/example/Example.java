package org.example;

import java.io.StringWriter;

public class Example {
    public static void main(String[] args) {
        StringWriter writer =  new StringWriter();
        writer.write("Hallo");
        writer.write(String.valueOf(123));
        String result =  writer.toString();
        System.out.println(result);
    }
}
