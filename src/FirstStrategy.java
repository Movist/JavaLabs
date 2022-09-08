import java.util.Arrays;

public class FirstStrategy implements Changeable {
    @Override
    public void changeStrategy(String text) {
        text = text.trim();
        String[] newStr = text.split("");
        newStr[0] = newStr[0].toUpperCase();
        for (int i = 1; i < newStr.length; i++) {
            if (newStr[i - 1].contains(".") || newStr[i - 1].contains("?") || newStr[i - 1].contains("!")) {
                if (i + 1 != newStr.length - 1 && newStr[i].equals(" ")) {
                    newStr[i + 1] = newStr[i + 1].toUpperCase();
                } else newStr[i] = newStr[i].toUpperCase();
            }

        }
        String s = String.join("", newStr);
        System.out.println(s);

        /*System.out.println(Arrays.toString(newStr));*/
    }
}
