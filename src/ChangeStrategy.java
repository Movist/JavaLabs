public class ChangeStrategy {
    public void change(int strategy, String text) {
        Changeable firstStrategy = new FirstStrategy();
        switch (strategy) {
            case 1 -> {
                firstStrategy = new FirstStrategy();
                firstStrategy.changeStrategy(text);
            }
            case 2 -> {
                firstStrategy = new SecondStrategy();

            }
            case 3 -> {
                ThirdStrategy thirdStrategy = new ThirdStrategy();
                thirdStrategy.changeStrategy(text);
            }
            case 4 -> {
                FourStrategy fourStrategy = new FourStrategy();
                fourStrategy.changeStrategy(text);
            }
            case 5 -> {
                FiveStrategy fiveStrategy = new FiveStrategy();
                fiveStrategy.changeStrategy(text);
            }
            default -> {
                System.out.println("Выберите из списка");
            }
        }

    }
}
