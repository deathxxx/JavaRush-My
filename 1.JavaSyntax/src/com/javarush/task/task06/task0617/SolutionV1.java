package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class SolutionV1 {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static class Idea {
        public String getDescription() {
            return "This is description";
        }
    }
}
