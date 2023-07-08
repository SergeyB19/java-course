package com.zaurtregulov.work_with_files.programmer2;

import com.zaurtregulov.work_with_files.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationExample2 {
    public static void main(String[] args) {
        Employee bestemployee;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))

        ) {
            bestemployee = (Employee)inputStream.readObject();
            System.out.println(bestemployee);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
