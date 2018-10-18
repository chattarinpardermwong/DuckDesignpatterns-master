package Lab009.VendingMachine;

public class Final implements CoinStation {
    VendingMachine vendingMachine;

    public Final(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.err.println("Error");
    }

    @Override
    public void chooseDestination(String station) {
        System.err.println("Error");
    }

    @Override
    public void getTicket() {
        System.out.println("You Got Ticket");
        vendingMachine.setCurrentCoinStation(vendingMachine.getReady());
    }
}
