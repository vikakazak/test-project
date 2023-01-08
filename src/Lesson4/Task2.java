package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String arr[][] = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        arr[i][j] = "W";
                    } else
                        arr[i][j] = "B";
                } else {
                    if (j % 2 != 0) {
                        arr[i][j] = "W";
                    } else
                        arr[i][j] = "B";
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
