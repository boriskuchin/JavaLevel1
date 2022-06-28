package javalevel2.homeworks.homework3;

import java.util.*;

public class WordCounter {
    public static void countWords(String origStr) {


        String stringArray[] = origStr.replaceAll(" - "," ")
                .replaceAll("\\n"," ")
                .replaceAll("[\\t,.;:!-]", "").toLowerCase().split("\\s");

        Set<String> setWords = new HashSet<>();
        List<String> listWords = new ArrayList<>();
        Map<String, Long> map = new HashMap<>();

        Collections.addAll(setWords, stringArray);
        Collections.addAll(listWords, stringArray);

        System.out.println(String.format("Уникальных слов в тексте %s:", setWords.size()));
        System.out.println(setWords);
        System.out.println();
        System.out.println(String.format("Изначальный массив слов из текста %s:", listWords.size()));
        System.out.println(listWords);

        for (String s : setWords) {
            map.put(s, listWords.stream().filter(str -> s.equals(str)).count());
        }
        System.out.println();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(String.format("%s -> встречается %s раз(а)", entry.getKey().toUpperCase(),entry.getValue()));
        }

        long sumWordsCount = map.values().stream().mapToLong(l -> l).sum();

        System.out.println();
        System.out.println(String.format("Проверка. Размер изначального массива - %s, сумма всех значений мапы - %s.",
                listWords.size(),
                sumWordsCount));
    }
}
