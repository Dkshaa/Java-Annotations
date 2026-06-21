import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface RunnableStep {
    String value();
}

public class TargetAnnotationExample {
    @RunnableStep("print greeting")
    static void printGreeting() {
        System.out.println("Hello from a targeted annotation example.");
    }

    public static void main(String[] args) {
        printGreeting();
    }
}
