public class FourStrategy implements Changeable {
    @Override
    public void changeStrategy(String text) {
        text = text.trim().toLowerCase();
        String[] newStr = text.split("");
        newStr[0] = newStr[0].toUpperCase();
        for (int i = 1; i < newStr.length; i++) {
            if (newStr[i].equals(" ") || newStr[i].equals("?") || newStr[i].equals("!") || newStr[i].equals(".")) {
                if (i + 1 != newStr.length - 1) {
                    newStr[i + 1] = newStr[i + 1].toUpperCase();
                } else newStr[i] = newStr[i].toUpperCase();
            }
        }
        String s = String.join("", newStr);
        System.out.println(s);
    }
}
