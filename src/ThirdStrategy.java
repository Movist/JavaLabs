public class ThirdStrategy implements Changeable{
    @Override
    public void changeStrategy(String text) {
        System.out.println(text.toUpperCase());
    }
}
