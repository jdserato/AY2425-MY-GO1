package Jun04;

import May29.Penguin;

public class Main {
    public static void main(String[] args) {
        Dog browny = new Dog("Browny", 2);
        System.out.println(browny.name + " age: "+browny.getAge());
        Cat neko = new Cat("Neko");
        System.out.println(neko.name);
        Animal tweety = new Bird();
        System.out.println("Bird's name: " + tweety.name);
        Fish nemo = new Fish("Nemo");
        System.out.println(nemo.name + " age: " + nemo.getAge());
        nemo.swim();
        Animal jay = new Penguin("Jay");
        jay.setAge(13);
        System.out.println(jay.getAge());
        System.out.println(neko);
        Animal[] animals = {browny, neko, tweety, nemo, jay};
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
