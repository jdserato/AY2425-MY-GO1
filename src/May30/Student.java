package May30;

public class Student {
    // FIELDS / INSTANCE VARIABLES
    public String name;
    int age;
    protected Gender gender;
    public static int ctr;

    // METHODS
    // CONSTRUCTOR
    public Student(String name) {
        this.name = name;
        gender = Gender.MALE;
        age = 18;
        ctr++;
    }
    public Student(String name, int age) {
        this.name = name;
        gender = Gender.MALE;
        this.age = age;
        ctr++;
    }
    public Student(String name, Gender g) {
        this.name = name;
        this.gender = g;
        this.age = 18;
        ctr++;
    }
    public Student(String name, int age, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        ctr++;
    }

    protected void birthday() {
        age++;
    }

    public enum Gender {MALE, FEMALE, OTHERS}
}
