public class FiveStrategy implements Changeable {
    @Override
    public void changeStrategy(String text) {
        text = text.trim();
        String[] newStr = text.split("");

        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i].equals(newStr[i].toLowerCase())) {
                newStr[i] = newStr[i].toUpperCase();
            } else newStr[i] = newStr[i].toLowerCase();
        }
        String s = String.join("", newStr);
        System.out.println(s);
    }
}
