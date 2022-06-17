package javalevel2.homeworks.homework1.participants;

import javalevel2.homeworks.homework1.interfaces.Participant;

public class Robot implements Participant {

    private int maxDistance;
    private double maxHeight;
    private String name;

    public Robot(int maxDistance, double maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.name = "Робот";
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}
