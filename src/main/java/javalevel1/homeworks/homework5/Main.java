package javalevel1.homeworks.homework5;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee(
                "Oleg",
                "Programmist",
                "oleg@mail.ru",
                "+7-915-777-77-77",
                150000,
                35);

        employees[1] = new Employee(
                "Maxim",
                "Manager",
                "maxim@mail.ru",
                "+7-915-555-55-55",
                250000,
                40);

        employees[2] = new Employee(
                "Anna",
                "Analyst",
                "anna@mail.ru",
                "+7-915-555-55-66",
                170000,
                32);

        employees[3] = new Employee(
                "Boris",
                "Director",
                "boris@mail.ru",
                "+7-915-555-55-77",
                280000,
                43);

        employees[4]  = new Employee(
                "Dmitry",
                "QA",
                "dmitry@mail.ru",
                "+7-915-555-11-55",
                150000,
                47);

        for (Employee emp : employees) {
            if (emp.getAge() > 40) {
                emp.printInfo();
            }
        }
    }
}
