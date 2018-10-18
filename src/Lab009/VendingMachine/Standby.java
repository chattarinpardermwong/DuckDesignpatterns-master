package Lab009.VendingMachine;

import java.util.Map;
import java.util.TreeMap;

public class Standby implements CoinStation {
    VendingMachine vendingMachine;
    Map<String, Integer> destinationPrice = new TreeMap<>();

    public Standby(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        destinationPrice.put("Ace island", 10);
        destinationPrice.put("Beer island", 20);
        destinationPrice.put("Custard island", 30);
        destinationPrice.put("Dokgo island", 40);
        destinationPrice.put("Eillsick island", 60);
    }


    @Override
    public void getTicket() {
        System.err.println("Error");
    }

    @Override
    public void insertCoin(int amount) {
        System.err.println("Error");
    }


    @Override
    public void chooseDestination(String station) {
        if (destinationPrice.containsKey(station)) {
            System.err.println("Invalid station or destination");
            return;
        }
        int price = destinationPrice.get(station);
        System.out.println("Select " + station + "- " + price + " Bath");
        vendingMachine.setCurrentCoinStation(vendingMachine.getPay());
    }
}
