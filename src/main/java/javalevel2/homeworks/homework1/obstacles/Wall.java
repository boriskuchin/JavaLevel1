package javalevel2.homeworks.homework1.obstacles;

import javalevel2.homeworks.homework1.interfaces.Obstacle;

public class Wall implements Obstacle {

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
