package com.xue.io.test;

import java.io.*;

/**
 * Created by Administrator on 2016/10/16.
 */
public class BufferedIOTest {

    public static void main(String[] args) {

        try(
                BufferedReader reader = new BufferedReader(new FileReader("c:/br.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("c:/bw.txt"))
            ){
            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
