package javalevel2.homeworks.homework1;

import javalevel2.homeworks.homework1.interfaces.Obstacle;
import javalevel2.homeworks.homework1.interfaces.Participant;
import javalevel2.homeworks.homework1.obstacles.RunningTrack;
import javalevel2.homeworks.homework1.obstacles.Wall;
import javalevel2.homeworks.homework1.participants.Cat;
import javalevel2.homeworks.homework1.participants.Human;
import javalevel2.homeworks.homework1.participants.Robot;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Cat(2000, 2), new Robot(10000, 0.1), new Human(1000, 1.2)};
        Obstacle[] obstacles = {new Wall(1.1), new RunningTrack(1500)};

        for (Participant p : participants) {
            for (Obstacle o : obstacles) {
                if (!p.passObstacle(o)) {
                    break;
                }
            }
            System.out.println();
        }

    }
}

