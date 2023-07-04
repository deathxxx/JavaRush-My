package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
                    int t1 = min(a, b);
            int t2 = min(c, d);
        if (a < b && a < c && a < d) {
            return a;
        } else if (b < a && b < c && b < d) {
            return b;
        } else if (c < a && c < b && c < d) {
            return c;
        } else {

            if (t1 < t2) {
                if (d < a && d < b) {
                    return d;
                } else {
                    if (d < a)
                        return b;
                    else
                        return a;
                }
            } else {
                if (d < c)
                    return d;
                else
                    return c;
            }
        }
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int m2;
      if (a < b)
           m2 = a;
      else
           m2 = b;

      return m2;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
