package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewInputOutputExercise {

    public static void main(final String[] args) throws IOException {
        final FileReader fileReader = new FileReader("tasks.md");
        final char[] buffer = new char[1024];
        //final FileWriter fileWriter = new FileWriter("new_tasks_copy.md");
        while (fileReader.read(buffer) != -1) {


            System.out.print(buffer);
            }
        System.out.println();
        fileReader.close();
    }
}