package Jun04;

import java.util.Comparator;

// base class / parent class / super class
public abstract class Animal implements Comparable<Animal>{
    public String name;
    private int age;
    String breed;
    private String breeds[] = {"Calico", "Tuxedo", "Black", "Puspin", "White"};
    public Animal(String name) {
        this.name = name;
        this.age = (int) (Math.random()*100);
        breed = breeds[(int) Math.floor(Math.random()*5)];
    }

    @Override
    public String toString() {
        return name + " (" + age + ") - " + breed ;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }

    public abstract void makeSound();

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(age, o.age); // for primitives
    }
}

class AnimalNameComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.name.compareTo(o2.name); // for classes that implements Comparable
    }
}

class AnimalBreedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int res = o1.breed.compareTo(o2.breed);
        if (res == 0) {
            return -o1.compareTo(o2);
        }
        return -res;
    }
}