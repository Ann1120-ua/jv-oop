package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("core.basesyntax.Truck has started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("core.basesyntax.Truck has stopped working.");
    }
}
