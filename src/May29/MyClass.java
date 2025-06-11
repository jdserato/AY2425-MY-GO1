package May29;

import Jun04.Cat;
import May30.Student;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Cathy");
        System.out.println(cat.getAge());

        Penguin p = new Penguin("Peng");
        p.flapSmallWings();
    }

}
