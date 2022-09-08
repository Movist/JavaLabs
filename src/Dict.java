import java.util.HashMap;

public class Dict {
    public String dict(String symbol) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("а", "a");
        hm.put("б", "b");
        hm.put("в", "v");
        hm.put("г", "g");
        hm.put("д", "d");
        hm.put("е", "e");
        hm.put("ё", "e");
        hm.put("ж", "zh");
        hm.put("з", "z");
        hm.put("и", "i");
        hm.put("й", "i");
        hm.put("к", "k");
        hm.put("л", "l");
        hm.put("м", "m");
        hm.put("н", "n");
        hm.put("о", "o");
        hm.put("п", "p");
        hm.put("р", "r");
        hm.put("с", "s");
        hm.put("т", "t");
        hm.put("у", "u");
        hm.put("ф", "f");
        hm.put("х", "h");
        hm.put("ц", "c");
        hm.put("ч", "ch");
        hm.put("ш", "sh");
        hm.put("щ", "sh");
        hm.put("ъ", "");
        hm.put("ы", "i");
        hm.put("ь", "");
        hm.put("э", "e");
        hm.put("ю", "yu");
        hm.put("я", "ya");

        return hm.getOrDefault(symbol, symbol);
    }
}