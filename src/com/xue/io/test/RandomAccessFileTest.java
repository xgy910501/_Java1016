package com.xue.io.test;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2016/10/16.
 */
public class RandomAccessFileTest {

    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("c:/r.txt","rw")) {
            for (int i = 0; i <11 ; i++) {
                randomAccessFile.writeDouble(i*0.5);
            }
            randomAccessFile.seek(0L);
            System.out.println(randomAccessFile.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
