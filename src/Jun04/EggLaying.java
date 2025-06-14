package Jun04;

public interface EggLaying {
    int layEggs();
    default void produceEggs() {
        System.out.println("Laying eggs");
    }
}
