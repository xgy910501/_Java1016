package com.xue.io.test;

import java.io.*;

/**
 * Created by Administrator on 2016/10/16.
 */
public class ReaderAndWriterTest {

    public static void main(String[] args) {

        /*try(Reader reader = new FileReader("c:/test.txt")){
            int i;
            try(Writer writer = new FileWriter("c:/test_new.txt")){
                while ((i = reader.read())!= -1){
                    writer.write((char)i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try(
                Reader reader = new FileReader("c:/test.txt");
                Writer writer = new FileWriter("c:/test_new.txt",true)//追加形式
        ){
            int i;
            while ((i=reader.read()) != -1) {
                writer.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
