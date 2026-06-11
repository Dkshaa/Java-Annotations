public class DeprecatedExample {
    @Deprecated
    static void oldGreeting() {
        System.out.println("Hello from the old method.");
    }

    static void newGreeting() {
        System.out.println("Hello from the new method.");
    }

    public static void main(String[] args) {
        newGreeting();
    }
}
