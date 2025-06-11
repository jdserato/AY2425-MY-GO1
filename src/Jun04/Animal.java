package Jun04;
// base class / parent class / super class
public abstract class Animal {
    public String name;
    private int age;
    String breed;

    public Animal(String name) {
        this.name = name;
        this.age = 5;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
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
}
