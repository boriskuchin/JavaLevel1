package javalevel1.homeworks.homework6;

public abstract class Animal {
    private int maxRunDistance;
    private int maxSwimDistance;
    private String name;
    private static int countAminal;
    public Animal(int maxRunDistance, int maxSwimDistance, String name) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.name = name;
        countAminal++;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    public String getName() {
        return name;
    }

    public static int getCountAminal() {
        return countAminal;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
