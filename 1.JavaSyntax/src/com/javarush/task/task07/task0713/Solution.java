package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

        ArrayList<Integer> divBy3 = new ArrayList<>();
        ArrayList<Integer> divBy2 = new ArrayList<>();
        ArrayList<Integer> others = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int number = numbers.get(i);

            if ((number % 3 == 0) || (number % 2 == 0)) {
                if (number % 3 == 0) {
                    divBy3.add(number);
                }
                if (number % 2 == 0) {
                    divBy2.add(number);
                }
            } else {
                others.add(number);
            }
        }

        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
