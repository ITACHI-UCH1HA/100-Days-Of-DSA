package Day_010_Date_2024_12_14.interfaces;

interface Animal {
    int pi = 0;
    void sound(); // Abstract method
    void eat();   // Abstract method

    // Default method
    default void sleep() {
        System.out.println("Sleeping...");
    }

    // Static method
    static void description() {
        System.out.println("Animals have different behaviors.");
    }
}
