import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface ReviewStatus {
    String value();
}

@ReviewStatus("ready")
public class RetentionPolicyExample {
    public static void main(String[] args) {
        ReviewStatus status = RetentionPolicyExample.class.getAnnotation(ReviewStatus.class);

        System.out.println("Status: " + status.value());
    }
}
