import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        str.add("Hello");
        str.add("Okay");
        str.add("Cat");
        str.add("Dog");
        str.add("Bob");

        Stream<String> stream = str.stream();
        stream.sorted().forEach(System.out::println);

    }
}
