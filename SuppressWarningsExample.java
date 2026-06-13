import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsExample {
    @SuppressWarnings("unchecked")
    static List<String> createNames() {
        List names = new ArrayList();
        names.add("Diksha");
        names.add("Java");
        return names;
    }

    public static void main(String[] args) {
        for (String name : createNames()) {
            System.out.println(name);
        }
    }
}
