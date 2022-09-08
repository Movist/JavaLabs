import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        changeRegister();
    }

    //задание 1
    private static void truncate(String str) {
        truncate(str, 16);
    }

    private static void truncate(String str, int symbols) {
        str = ending(str, symbols);
        if (str.length() < symbols) {
            System.out.println(str);
        } else {
            str = str.substring(0, symbols);
            str = ending(str, symbols);
            System.out.println(str + "...");
        }

    }

    //проверка окончания для задания 1
    private static String ending(String str, int symbols) {
        boolean flag = true;
        int i = 1;
        while (flag) {
            if (str.endsWith(" ")) {
                str = str.substring(0, symbols - i);
            } else {
                flag = false;
            }
            i++;
        }
        return str;
    }

    //задание 2
    private static void transliteration(String str, String divider) {
        String[] symbols = str.split("");
        replaceSymbols(symbols, divider);
    }

    private static void transliteration(String str) {
        transliteration(str, " ");
    }

    private static void replaceSymbols(String[] symbols, String divider) {
        Dict dict = new Dict();
        String newStr = "";
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].equals(" ")) {
                newStr += divider;
            } else if (symbols[i].toLowerCase().equals(symbols[i])) {
                newStr += dict.dict(symbols[i]);
            } else {
                symbols[i] = symbols[i].toLowerCase();
                newStr += dict.dict(symbols[i]).toUpperCase();
            }
        }
        System.out.println(newStr);
    }

    //задание 3
    private static void changeRegister() {
        Scanner inputText = new Scanner(System.in);
        String text;
        System.out.println("Введите текст");
        text = inputText.nextLine();

        Scanner setStrategy = new Scanner(System.in);
        int strategy;
        System.out.println("Как изменить регистр текста?");
        System.out.println(
                "1.\tКак в предложениях\n" +
                        "2.\tвсе строчные\n" +
                        "3.\tВСЕ ПРОПИСНЫЕ\n" +
                        "4.\tНачинать С Прописных\n" +
                        "5.\tиЗМЕНИТЬ РЕГИСТР\n"
        );

        strategy = setStrategy.nextInt();

        ChangeStrategy changeStrategy = new ChangeStrategy();
        changeStrategy.change(strategy, text);
    }
}