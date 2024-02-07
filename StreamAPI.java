import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(4, 2, 1, 5, 7, 8, 12, 22, 10, 13);

        Stream<Integer> stream = myList.stream();

        // Functional interface that specifies filter condition
        Predicate<Integer> predicate = (n) -> n%2 == 0? true : false;

        // Specifies the function to be applied
        Function<Integer, Integer> function = n -> n*2;

        //
        Consumer<Integer> consumer = (n) -> System.out.println(n);

        stream.filter(predicate)
                .map(function)
                .forEach(consumer);


//      myList.forEach(n -> System.out.println(n));
//        stream.forEach(n -> System.out.println(n));

    }
}
