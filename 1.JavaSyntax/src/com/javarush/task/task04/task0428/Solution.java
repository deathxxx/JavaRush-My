package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int counter = 0;
        if (number1 > 0) {
            counter++;
        }
        if (number2 > 0) {
            counter++;
        }
        if (number3 > 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
