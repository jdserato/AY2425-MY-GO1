package May30;

public class Main {
    public static void main(String[] args) {
        Student vince = new Student("Vince"),
                jay = new Student("Jay"),
                leah = new Student("Leah", 24, Student.Gender.FEMALE),
                cathy = new Student("Cathy");

        System.out.println(cathy.name.charAt(0));
        createEs();
        vince.birthday();
        System.out.println(vince.name);
        System.out.println(vince.age);
        System.out.println(leah.name);
        System.out.println(leah.age);
        System.out.println(leah.gender);
        System.out.println(jay.name);
        System.out.println(jay.age);
        System.out.println(jay.gender);
        System.out.println("total = " + Student.ctr);
    }

    private static void createEs() {
        Student es = new Student("Es");
    }
}
