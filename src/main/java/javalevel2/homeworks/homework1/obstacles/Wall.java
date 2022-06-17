package javalevel2.homeworks.homework1.obstacles;

import javalevel2.homeworks.homework1.interfaces.Obstacle;
import javalevel2.homeworks.homework1.interfaces.Participant;

public class Wall implements Obstacle {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean isPassed(Participant participant) {
        if (participant.getMaxHeight() >= height) {
            System.out.printf("Учестник %s преодолел стену%n", participant.getName());
            return true;
        } else {
            System.out.printf("Учестник %s не смог преодолеть стену%n", participant.getName());
            return false;
        }

    }
}
