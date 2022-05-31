package javalevel1.homeworks.homework6;


/*
* 1. Создать классы Собака и Кот с наследованием от класса Животное.
* 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
* 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
* 4. Добавить подсчет созданных котов, собак и животных.
* */
public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Бобик");
        Animal dog2 = new Dog("Тузик");
        Animal dog3 = new Dog("Жорик");
        Animal dog4 = new Dog("Толик");
        Animal dog5 = new Dog("Пупсик");

        Animal cat1 = new Cat("Мурзик");
        Animal cat2 = new Cat("Жмурик");
        Animal cat3 = new Cat("Котик");
        Animal cat4 = new Cat("Жмотик");

        System.out.printf("Количество собак - %d%n",Dog.getCountDogs()) ;
        System.out.printf("Количество котов - %d%n",Cat.getCountCat()) ;
        System.out.printf("Всего животных - %d%n",Animal.getCountAminal()) ;



        System.out.println();
        dog1.run(100);
        dog2.run(400);
        dog3.run(800);
        dog4.swim(9);
        dog5.swim(21);
        System.out.println();
        cat1.run(100);
        cat2.run(200);
        cat3.run(300);
        cat4.swim(100);
    }
}
