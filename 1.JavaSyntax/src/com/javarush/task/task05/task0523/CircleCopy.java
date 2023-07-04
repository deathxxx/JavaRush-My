package com.javarush.task.task05.task0523;

/* 
Конструктор
*/

public class CircleCopy {
    public Color color;

    public static void main(String[] args) {
        CircleCopy circle = new CircleCopy();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public void Circle() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
