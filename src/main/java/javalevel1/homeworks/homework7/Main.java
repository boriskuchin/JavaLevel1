package javalevel1.homeworks.homework7;

import java.util.Random;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Пушок", random.nextInt(10)+10);
        cats[1] = new Cat("Жмурик", random.nextInt(10)+10);
        cats[2] = new Cat("Платон", random.nextInt(10)+10);
        cats[3] = new Cat("Фугас", random.nextInt(10)+10);
        cats[4] = new Cat("Жан-Поль", random.nextInt(10)+10);

        Plate plate = new Plate(random.nextInt(20)+20);

        plate.printInfo();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].printInfo();
        }
        plate.printInfo();
    }
}
