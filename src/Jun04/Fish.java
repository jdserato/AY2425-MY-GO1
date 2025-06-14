package Jun04;

import May30.Student;

public class Fish extends Animal implements Swimmer, EggLaying {

    public Fish(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Fish " + name + ": bloop bloop");
    }

    public void swim() {
        System.out.println(name + " can swim");
    }

    public int layEggs() {
        return 100;
    }

    @Override
    public void produceEggs() {
        System.out.println("Laying " + layEggs() + " si fish");
    }
}
