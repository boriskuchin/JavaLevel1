package javalevel1.homeworks.homework6;

public class Cat extends Animal{

    private static int countCat;

    public Cat(String name) {
        super(200, 0, name);
        countCat++;
    }

    @Override
    public void run(int distance) {
        String runResult = distance <= this.getMaxRunDistance()?
                           String.format("Кот %s пробежал %d метров", this.getName(), distance):
                           String.format("Кот %s хотел пробежать %d метров, но не добежал", this.getName(), distance);

        System.out.println(runResult);

    }

    @Override
    public void swim(int distance) {
        swim();
    }

    public void swim() {
        System.out.printf("Кот %s потонул, потому что коты не умеют плавать%n", this.getName());
    }


    public static int getCountCat() {
        return countCat;
    }
}
