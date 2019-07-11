package reduce;

import java.util.List;

public class CounterMethods {

    public Stats countNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(
                new Stats(),
                Stats::increment, // accumulator
                Stats::add
                );
    }
}
