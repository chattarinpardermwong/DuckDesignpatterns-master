package Lab009.VendingMachine;

public interface CoinStation {
    void insertCoin(int amount);
    void chooseDestination(String station);
    void getTicket();
}
