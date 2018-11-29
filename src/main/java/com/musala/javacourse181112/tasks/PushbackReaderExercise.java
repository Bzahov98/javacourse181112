package com.musala.javacourse181112.tasks;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExercise {

    public static void main(String[] args) {
        //PushBackReaderExerciseIdea_brokenVersion();
        PushBackReaderExerciseIdea_unbrokenVersion();

    }

    private static void PushBackReaderExerciseIdea_brokenVersion() {
        int i;
        int toBeUnread = 3;
        char[] buff = new char[8];
        try (PushbackReader pushbackReader = new PushbackReader(new FileReader("WritingParameters.txt"), toBeUnread + 1)) {
            while ((i = pushbackReader.read(buff)) != -1) {
                System.out.print(buff);
                int j = 0;
                while (Character.isWhitespace(buff[i - 1 - j])) {
                    j++;
                }
                if (buff[i - 1 - j] >= 'a' && buff[i - 1 - j] <= ('a' + 'z') / 2) {
                    for (int k = 0; k < toBeUnread + j; k++) {
                        pushbackReader.unread(buff[i - k - 1]);
                    }
                }

            }
            System.out.println();
        } catch (IOException ignored) {
        }
    }

    private static void PushBackReaderExerciseIdea_unbrokenVersion() {
        int i;
        int toBeUnread = 3;
        char[] buff = new char[8];
        int l=0;
        try (PushbackReader pushbackReader = new PushbackReader(new FileReader("WritingParameters.txt"), toBeUnread + 1)) {
            while ((i = pushbackReader.read(buff)) != -1&&l<=1) {
                System.out.print(buff);
                int j = 0;
                int c=0;
                if((c = pushbackReader.read()) == -1) {
                    l++;
                }
                else {
                    pushbackReader.unread(c);
                }
                while (Character.isWhitespace(buff[i - 1 - j])) {
                    j++;
                }
                if (buff[i - 1 - j] >= 'a' && buff[i - 1 - j] <= ('a' + 'z') / 2) {
                    for (int k = 0; k < toBeUnread + j; k++) {
                        pushbackReader.unread(buff[i - k - 1]);
                    }
                }
            }
            System.out.println();
        } catch (IOException ignored) {
        }
    }
}