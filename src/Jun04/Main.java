package Jun04;

import May29.Penguin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(8);
        numbers.add(9);
        numbers.add(1);
        numbers.add(5);
        System.out.println("Before: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        Collections.sort(numbers);
        System.out.println("\nAFTER: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        Dog browny = new Dog("Browny", 2);
        Cat neko = new Cat("Neko");
        Animal tweety = new Bird("Tweety");
        Fish nemo = new Fish("Nemo");
        nemo.swim();
        Animal jay = new Penguin("Jay"); // implicit
        jay.setAge(13);
        List<Animal> animals = new ArrayList<>();
        animals.add(nemo);
        animals.add(browny);
        animals.add(jay);
        animals.add(neko);
        animals.add(new Whale("Willy"));
        animals.add(tweety);
        System.out.println("BEFORE:");
        for (Animal a : animals) {
            System.out.println(a);
            if (a instanceof Swimmer) {

            }
        }
        Collections.sort(animals); // this will use Comparable
        System.out.println("AFTER (using Comparable):");
        for (Animal a : animals) {
            System.out.println(a);
        }
        animals.sort(new AnimalNameComparator()); // this will use Comparable
        System.out.println("AFTER (using Comparator-NAME):");
        for (Animal a : animals) {
            System.out.println(a);
        }
        animals.sort(new AnimalBreedComparator()); // this will use Comparable
        System.out.println("AFTER (using Comparator-BREED):");
        for (Animal a : animals) {
            System.out.println(a);
        }

    }

}
