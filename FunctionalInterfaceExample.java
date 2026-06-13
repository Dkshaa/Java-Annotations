@FunctionalInterface
interface MessageFormatter {
    String format(String message);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MessageFormatter formatter = message -> "Message: " + message.trim();

        System.out.println(formatter.format(" annotations are useful "));
    }
}
