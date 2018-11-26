package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExercise {
    public static void main(final String[] args) throws IOException {
        final FileReader fileReader = new FileReader("tasks.md");
        final char[] buffer = new char[1027];
        int i;
        while ((i = fileReader.read(buffer)) != -1) {
            // test & fix
            System.out.print(new String(buffer));
        }
        fileReader.close();
    }
}