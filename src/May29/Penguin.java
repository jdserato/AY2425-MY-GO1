package May29;

import Jun04.Animal;
import Jun04.Bird;
import Jun04.Fish;
import Jun04.Swimmer;

public class Penguin extends Bird implements Swimmer {
    public Penguin(String name) {
        //super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("*random penguin sound");
    }

    void flapSmallWings() {
        System.out.println(name + " is flappings its tiny wings");
    }

    @Override
    public void swim() {
        System.out.println("Swimming with its wings");
    }
}
