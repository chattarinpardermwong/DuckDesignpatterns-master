package Lab09.Tour;

public class Main {
    public static void main(String[] args) {
        SingleTour singleTour = new SingleTour("Egypt yahoo",3000,50,25);
        System.out.println(singleTour.getName());
        System.out.println(singleTour.getPrice());
        System.out.println(singleTour.getAvailableSeats());

        Tour tour = new PackageTour("Special Price",
                new SingleTour("Egypt hello",300,50,25),
                new SingleTour("Egypt hi",550,100,50));
        System.out.println(tour.getName());
        System.out.println(tour.getPrice());
        System.out.println(tour.getAvailableSeats());
    }


}