package Jun04;

public class Platypus extends Mammal implements EggLaying{
    public Platypus(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("krrkrkrrr");
    }

    @Override
    public int layEggs() {
        return 1;
    }
}
