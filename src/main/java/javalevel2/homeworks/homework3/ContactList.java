package javalevel2.homeworks.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContactList {

    private Map<String, ArrayList<String>> map = new HashMap<>();


    public static void main(String[] args) {

    }

    public void get(String surname) {
        System.out.println(surname);
        System.out.println(map.get(surname));
    }

    public void add(String surname, String telNumber) {
        if (!map.containsKey(surname)) {
            map.put(surname, new ArrayList<>());
            map.get(surname).add(telNumber);
        } else {
            map.get(surname).add(telNumber);
        }
    }



}
