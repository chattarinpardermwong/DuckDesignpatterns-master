package Lab009.VendingMachine;

public class VendingMachine {
    private CoinStation pay = new MoneyIn(this);
    private CoinStation ready = new Standby(this);
    private CoinStation end = new Final(this);
    private CoinStation currentCoinStation = ready;

    private int amount = 0;
    private int price = 0;

    public void setCurrentCoinStation(CoinStation currentCoinStation) {
        this.currentCoinStation = currentCoinStation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CoinStation getPay() {
        return pay;
    }

    public CoinStation getReady() {
        return ready;
    }

    public CoinStation getEnd() {
        return end;
    }
}
