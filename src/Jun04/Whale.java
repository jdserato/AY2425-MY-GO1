package Jun04;

public class Whale extends Mammal implements Swimmer {
    public Whale(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("whoooo");
    }

    public void swim() {
        System.out.println("Whale is swimming");
    }

}
