package com.divashchenko;

public class Triangle {
    public static double square(Main.Coordinate a, Main.Coordinate b, Main.Coordinate c) {
        double tmp = (double)(a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY());
        if (tmp < 0) {
            tmp *= -1;
        }
        return tmp * 0.5;
    }
}
