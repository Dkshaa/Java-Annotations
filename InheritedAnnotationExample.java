import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface LessonCategory {
    String value();
}

@LessonCategory("annotations")
class BaseLesson {
}

public class InheritedAnnotationExample extends BaseLesson {
    public static void main(String[] args) {
        LessonCategory category = InheritedAnnotationExample.class.getAnnotation(LessonCategory.class);

        System.out.println("Category: " + category.value());
    }
}
