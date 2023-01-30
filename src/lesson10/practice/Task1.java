package lesson10.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<StringBuilder> string = new ArrayList<>(n);
        int max = 0;
        for (int i = 0; i < n; i++){
            string.set(i, new StringBuilder(sc.next()));
            System.out.println(string.get(i) + " " + string.get(i).length());
            if (string.get(i).length() > max){
                max = string.get(i).length();
            }
        }
        int min = string.get(0).length();
        for (int i = 0; i < n; i++){
            if (min > string.get(i).length()){
                min = string.get(i).length();
            }
        }
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
//        System.out.println(Arrays.toString(arr));

    }
}
