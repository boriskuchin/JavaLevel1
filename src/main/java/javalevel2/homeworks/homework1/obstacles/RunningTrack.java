package javalevel2.homeworks.homework1.obstacles;

import javalevel2.homeworks.homework1.interfaces.Obstacle;

public class RunningTrack implements Obstacle {

    private double length;

    public RunningTrack(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
