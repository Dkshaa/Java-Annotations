import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface CourseInfo {
    String topic();
    int lesson();
}

@CourseInfo(topic = "Java Annotations", lesson = 1)
public class CustomAnnotationExample {
    public static void main(String[] args) {
        CourseInfo info = CustomAnnotationExample.class.getAnnotation(CourseInfo.class);

        System.out.println("Topic: " + info.topic());
        System.out.println("Lesson: " + info.lesson());
    }
}
