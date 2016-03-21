package me.cikai.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IODemo {

    public static final String FILEPATH = "src/me/cikai/io/text.txt";
    public static File file = new File(FILEPATH);

    public static void readFile() {

        FileReader reader = null;
        char[] text = new char[1024];
        String str = "";
        int n;

        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while ((n = reader.read(text)) != -1) {
                str += new String(text, 0, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(str);

    }

    public static void writeFile() {

        try
        {
            File aFile = new File("src/me/cikai/io/text.txt");
            FileOutputStream out = new FileOutputStream(aFile);
            byte[] b = new byte[1024];
            String str = "This is a test file";
            b = str.getBytes(); // 进行String到byte[]的转化
            out.write(b); // 写入文本内容
        } catch (IOException e)
        {
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {
        writeFile();
        readFile();
    }
}
