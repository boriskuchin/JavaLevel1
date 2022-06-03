package javalevel1.homeworks.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }
    public void eat(Plate plate) {
        if (plate.getFoodAvailable() >= appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String catState = isFull ? "сытый и довольный" : "голодный и злой";
        sb.append("Кот ").append(name).append(" с аппетитом ").append(appetite).append(" " + catState);
        return sb.toString();
    }
    public void printInfo() {
        System.out.println(this);

    }
}

