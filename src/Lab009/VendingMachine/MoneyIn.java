package Lab009.VendingMachine;

public class MoneyIn implements CoinStation {
    VendingMachine vendingMachine;

    public MoneyIn(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        int curAmount = vendingMachine.getAmount() + amount;
        if (curAmount >= vendingMachine.getPrice()) {
            if (curAmount > vendingMachine.getPrice())
                System.out.println("Change " + (curAmount - vendingMachine.getPrice()));
            System.out.println("Completed :You Got ticket!");
            vendingMachine.setAmount(0);
            vendingMachine.setPrice(0);
            vendingMachine.setCurrentCoinStation(vendingMachine.getEnd());
        } else if (curAmount < vendingMachine.getPrice())
            System.out.println("Please give me a coin " + (vendingMachine.getPrice() - curAmount));
    }

    @Override
    public void chooseDestination(String station) {
        System.err.println("Error");
    }

    @Override
    public void getTicket() {
        System.err.println("Error");
    }
}
