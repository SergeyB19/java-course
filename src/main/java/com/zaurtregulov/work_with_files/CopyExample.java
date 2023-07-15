package com.zaurtregulov.work_with_files;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Пользователь\\Desktop\\IMG_20220716_112846.jpg"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("IMG_20220716_112846.jpg"));
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
//            String line;
//            while ((line = reader.readLine()) != null) {
//                writer.write(line);
//                writer.write('\n');
//            }
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
