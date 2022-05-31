package javalevel1.homeworks.homework6;

public class Dog extends Animal {

    private static int countDogs;

    public Dog(String name) {
        super(500, 10, name);
        countDogs++;
    }

    @Override
    public void run(int distance) {
        String runResult = distance <= this.getMaxRunDistance()?
                String.format("Пёсик %s пробежал %d метров", this.getName(), distance):
                String.format("Пёсик %s хотел пробежать %d метров, но не добежал", this.getName(), distance);

        System.out.println(runResult);
    }

    @Override
    public void swim(int distance) {
        String swimResult = distance <= this.getMaxSwimDistance()?
                String.format("Пёсик %s проплыл %d метров", this.getName(), distance):
                String.format("Пёсик %s плыл-плыл и не доплыл, потому что ушталь", this.getName());

        System.out.println(swimResult);
    }

    public static int getCountDogs() {
        return countDogs;
    }
}
