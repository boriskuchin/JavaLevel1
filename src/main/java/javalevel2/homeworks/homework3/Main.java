package javalevel2.homeworks.homework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        countUniqueWords();
    }

    private static void countUniqueWords() {
        String origStr = "" +
                "Для вас, души моей царицы,\n" +
                "Красавицы, для вас одних\n" +
                "Времен минувших небылицы,\n" +
                "В часы досугов золотых,\n" +
                "Под шепот старины болтливой,\n" +
                "Рукою верной я писал;\n" +
                "Примите ж вы мой труд игривый!\n" +
                "Ничьих не требуя похвал,\n" +
                "Счастлив уж я надеждой сладкой,\n" +
                "Что дева с трепетом любви\n" +
                "Посмотрит, может быть украдкой,\n" +
                "На песни грешные мои.\n" +
                "У лукоморья дуб зеленый;\n" +
                "Златая цепь на дубе том:\n" +
                "И днем и ночью кот ученый\n" +
                "Все ходит по цепи кругом;\n" +
                "Идет направо - песнь заводит,\n" +
                "Налево - сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;\n" +
                "Избушка там на курьих ножках\n" +
                "Стоит без окон, без дверей;\n" +
                "Там лес и дол видений полны;\n" +
                "Там о заре прихлынут волны\n" +
                "На брег песчаный и пустой,\n" +
                "И тридцать витязей прекрасных\n" +
                "Чредой из вод выходят ясных,\n" +
                "И с ними дядька их морской;\n" +
                "Там королевич мимоходом\n" +
                "Пленяет грозного царя;\n" +
                "Там в облаках перед народом\n" +
                "Через леса, через моря\n" +
                "Колдун несет богатыря;\n" +
                "В темнице там царевна тужит,\n" +
                "А бурый волк ей верно служит;\n" +
                "Там ступа с Бабою Ягой\n" +
                "Идет, бредет сама собой;\n" +
                "Там царь Кащей над златом чахнет;\n" +
                "Там русской дух... там Русью пахнет!\n" +
                "И там я был, и мед я пил;\n" +
                "У моря видел дуб зеленый;\n" +
                "Под ним сидел, и кот ученый\n" +
                "Свои мне сказки говорил.\n" +
                "Одну я помню: сказку эту\n" +
                "Поведаю теперь я свету...";

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

        System.out.println(String.format("Проверка. Размер изначального массива - %s, сумма всех значений мапы - %s.",
                                            listWords.size(),
                                            sumWordsCount));





    }

}
