package Jun04;
// subclass of Animal
public class Bird extends Animal implements EggLaying{
    public Bird() {
        super("Tweety");
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet tweet");
    }

    @Override
    public int layEggs() {
        return 5;
    }
}
