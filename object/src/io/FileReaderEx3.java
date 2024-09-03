package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderEx3 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("c:\\source\\javasource\\object\\src\\io\\FileEx.java",
                Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("c:\\temp\\source_FileEx.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {

            String str = null;

            int i = 1;
            while ((str = br.readLine()) != null) {
                bw.write(i + "\t" + str);
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
