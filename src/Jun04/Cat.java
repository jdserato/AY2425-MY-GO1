package Jun04;
// subclass of Animal
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}
