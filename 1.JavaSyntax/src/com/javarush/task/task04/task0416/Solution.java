package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(reader.readLine());
        time = time % 5;
        if (time >= 0 && time < 3) {
            System.out.println("зелёный");
        } else if (time >= 3 && time < 4) {
            System.out.println("жёлтый");
        } else {
            System.out.println("красный");
        }
    }
}