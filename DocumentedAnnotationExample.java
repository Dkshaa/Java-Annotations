import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface PublicNote {
    String value();
}

@PublicNote("visible in generated documentation")
public class DocumentedAnnotationExample {
    public static void main(String[] args) {
        PublicNote note = DocumentedAnnotationExample.class.getAnnotation(PublicNote.class);

        System.out.println(note.value());
    }
}
