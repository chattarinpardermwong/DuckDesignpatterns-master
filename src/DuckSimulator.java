public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingEchoDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
//        Quackable mallardDuck = new QuackEcho(new QuackCounter(new MallardDuck()));
//        Quackable redheadDuck = new QuackEcho(new QuackCounter(new RedheadDuck()));
//        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
//        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
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

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
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
