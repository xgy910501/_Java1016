package com.xue.io.test;


import java.io.*;

/**
 * Created by Administrator on 2016/10/16.
 */
public class KongZhiBianMaTest {

    public static void main(String[] args) {
        try(
                Reader reader = new InputStreamReader(new FileInputStream("c:/br.txt"),"UTF-8");
                Writer writer = new OutputStreamWriter(new FileOutputStream("c:/bow.txt"),"UTF-8")
                ){
            int i;
            while ((i = reader.read()) != -1){
                writer.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
