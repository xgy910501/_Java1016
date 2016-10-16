package com.xue.io.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Created by Administrator on 2016/10/16.
 */
public class DownLoadTest {

    private static final String DownLoadUrl="http://jandan.net/";
    public static void main(String[] args) {
        try {
            URL url = new URL(DownLoadUrl);
            try (
                    InputStream inputStream = url.openStream();
                    OutputStream outputStream = new FileOutputStream("c:/path.html")) {
                    int i;
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
