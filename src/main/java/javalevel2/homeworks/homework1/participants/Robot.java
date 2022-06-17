package javalevel2.homeworks.homework1.participants;

import javalevel2.homeworks.homework1.interfaces.Obstacle;
import javalevel2.homeworks.homework1.interfaces.Participant;
import javalevel2.homeworks.homework1.obstacles.RunningTrack;
import javalevel2.homeworks.homework1.obstacles.Wall;

public class Robot implements Participant {

    private int maxDistance;
    private double maxHeight;
    private String name;

    public Robot(int maxDistance, double maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.name = "Робот";
    }

    @Override
    public boolean passObstacle(Obstacle obstacle) {
        boolean result = true;
        if (obstacle instanceof Wall) {
            result = jump((Wall) obstacle);
        } else if (obstacle instanceof RunningTrack) {
            result = run((RunningTrack) obstacle);
        }
        return result;
    }
    @Override
    public boolean jump(Wall wall) {
            if (wall.getHeight() > maxHeight) {
                System.out.printf("Участник %s не перепрыгнул стену и сошел с дистанции%n", name);
                return false;
            } else {
                System.out.printf("Участник %s перепрыгнул стену%n", name);
                return true;
            }
    }
    @Override
    public boolean run(RunningTrack runningTrack) {
            if (runningTrack.getLength() > maxDistance) {
                System.out.printf("Участник %s не пробежал дорожку и сошел с дистанции%n", name);
                return false;
            } else {
                System.out.printf("Участник %s пробежал дорожку%n", name);
                return  true;
            }
    }
}
