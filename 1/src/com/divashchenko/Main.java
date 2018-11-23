package com.divashchenko;

public class Main {

    public static class Coordinate {
        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        Coordinate a = new Coordinate(1, 3);
        Coordinate b = new Coordinate(2, -5);
        Coordinate c = new Coordinate(-8, 4);

        System.out.println("Square is: " + Triangle.square(a, b, c));
    }
}
