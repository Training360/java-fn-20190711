package collect;


import java.util.List;

public class CounterMethods {

    public Stats countNumbers(List<Integer> numbers) {
        return numbers.parallelStream().collect(
                Stats::new,
                Stats::increment, // accumulator
                Stats::add
                );
    }
}
