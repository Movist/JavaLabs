public class ChangeStrategy {
    public void change(int strategy, String text) {

        Changeable firstStrategy = new FirstStrategy();
        Changeable secondStrategy = new SecondStrategy();
        Changeable thirdStrategy = new ThirdStrategy();
        Changeable fourStrategy = new FourStrategy();
        Changeable fiveStrategy = new FiveStrategy();

        switch (strategy) {
            case 1 -> {
                firstStrategy.changeStrategy(text);
            }
            case 2 -> {
                secondStrategy.changeStrategy(text);

            }
            case 3 -> {
                thirdStrategy.changeStrategy(text);
            }
            case 4 -> {
                fourStrategy.changeStrategy(text);
            }
            case 5 -> {
                fiveStrategy.changeStrategy(text);
            }
            default -> {
                System.out.println("Выберите из списка");
            }
        }

    }
}
