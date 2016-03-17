package me.cikai.properties;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {

    public static void main(String[] args) {

        try {
            readPropFileByGetResourceAsStream();
            readPropFileByInPutStream();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 使用getResourceAsStream方法读取properties文件
     */
    public static void readPropFileByGetResourceAsStream() {
        InputStream is = GetProperties.class.getClassLoader().getResourceAsStream("me/cikai/properties/config.properties");
        Properties p = new Properties();
        try {
            p.load(is);
            System.out.println("姓名： " + p.getProperty("name"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 使用InPutStream流读取properties文件
     */
    public static void readPropFileByInPutStream() {
        InputStream is = null;
        try {
            is = new BufferedInputStream(new FileInputStream("src/me/cikai/properties/config.properties"));
            Properties p = new Properties();
            p.load(is);
            System.out.println("邮箱： " + p.getProperty("email"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
