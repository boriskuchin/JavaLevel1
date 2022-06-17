package javalevel2.homeworks.homework1.obstacles;

import javalevel2.homeworks.homework1.interfaces.Obstacle;
import javalevel2.homeworks.homework1.interfaces.Participant;

public class RunningTrack implements Obstacle {

    private int length;

    public int getLength() {
        return length;
    }

    public RunningTrack(int length) {
        this.length = length;
    }
    @Override
    public boolean isPassed(Participant participant) {
        if (participant.getMaxDistance() >= length) {
            System.out.printf("Учестник %s пробежал дорожку%n", participant.getName());
            return true;
        } else {
            System.out.printf("Учестник %s не смог добежать до конца дорожки%n", participant.getName());
            return false;
        }
    }
}
