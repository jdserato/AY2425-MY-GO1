package Jun04;
// subclass of Animal
public class Dog extends Animal{
    int teeth;
    public Dog(String name, int teeth) {
        super(name);
        this.teeth = teeth;
    }

    @Override
    public void makeSound() {
        System.out.println("Aw aw");
    }
}
