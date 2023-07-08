package com.zaurtregulov.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной. \n" +
                "Непонятного нет для меня под луной. \n" +
                "Мне известно, что мне ничего не известно! \n" +
                "Вот последняя правда открытая мной.\n";
        String s = "privet";

        try( FileWriter writer = new FileWriter("test2.txt",true);) {
//            writer = new FileWriter("C:\\Users\\Пользователь\\Desktop\\test1.txt");
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
//            writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
