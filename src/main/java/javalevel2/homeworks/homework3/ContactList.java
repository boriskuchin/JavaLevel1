package javalevel2.homeworks.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContactList {

    private Map<String, ArrayList<String>> map = new HashMap<>();


    public static void main(String[] args) {

    }

    public void get(String surname) {
        if (map.containsKey(surname)) {
            System.out.printf("Для контакта %s найдены слудующие телефоны: %s %n%n", surname, map.get(surname));
        } else {
            System.out.printf("Данные контакта %s не найдены %n%n", surname);
        }
    }

    public void add(String surname, String telNumber) {
        if (!map.containsKey(surname)) {
            map.put(surname, new ArrayList<>());
            map.get(surname).add(telNumber);
        } else {
            map.get(surname).add(telNumber);
        }
    }

    public void getAllContacts() {
        System.out.println("Все записи в телефонной книге: ");
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.printf("%s -> %s %n", entry.getKey(), entry.getValue());
        }
    }



}
