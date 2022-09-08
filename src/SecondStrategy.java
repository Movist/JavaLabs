public class SecondStrategy implements Changeable {
    @Override
    public void changeStrategy(String text) {
        System.out.println(text.toLowerCase());
    }
}
