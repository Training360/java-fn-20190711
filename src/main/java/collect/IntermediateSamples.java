package collect;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateSamples {

    public static void main(String[] args) {
        var c = Stream.iterate("", s -> s + "x")
                .mapToInt(s -> s.length())
                .filter(i -> i % 2 == 0)
                .skip(4)
                .limit(21)
                .peek(System.out::println)
                .count();
        System.out.println(c);

        Stream.of("John Doe", "Jane Doe", "Jack Doe", "John Smith", "Jane Smith")
                .sorted()
                .filter(s -> s.endsWith("Doe"))
                .map(s -> s.toUpperCase())
                .max(Comparator.naturalOrder());

        IntStream.of(2, 3, 5)
                .flatMap(i -> IntStream.generate(() -> i).limit(i))
                .forEach(System.out::println);

        IntStream.of(2, 3, 5)
                .flatMap(i -> IntStream.generate(() -> i).limit(i))
                .mapToObj(i -> i)
                .collect(Collectors.toList());
    }
}
