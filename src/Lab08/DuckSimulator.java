package Lab08;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingEchoDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
//        Lab08.Quackable mallardDuck = new Lab08.QuackEcho(new Lab08.QuackCounter(new Lab08.MallardDuck()));
//        Lab08.Quackable redheadDuck = new Lab08.QuackEcho(new Lab08.QuackCounter(new Lab08.RedheadDuck()));
//        Lab08.Quackable rubberDuck = new Lab08.QuackCounter(new Lab08.QuackEcho(new Lab08.RubberDuck()));
//        Lab08.Quackable duckCall = new Lab08.QuackCounter(new Lab08.QuackEcho(new Lab08.DuckCall()));
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable gooseDuck = new QuackCounter(new QuackEcho(new GooseAdapter(new Goose())));
        Quackable pegeonDuck = new QuackCounter(new QuackEcho(new PegeonAdapter(new Pegeon())));

        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Lab08.Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallard Lab08.Flock Simulation");
        simulate(flockOfMallards);

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(duckCall);
        simulate(gooseDuck);
        simulate(pegeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
