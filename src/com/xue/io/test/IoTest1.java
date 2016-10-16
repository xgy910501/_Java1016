package com.xue.io.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/10/16.
 */
public class IoTest1 {

    public static void main(String[] args) {
        try {
            int i;
            InputStream inputStream = new FileInputStream("c:/test.txt");
            while((i = inputStream.read())!=-1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
