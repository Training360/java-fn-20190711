package reduce;

import org.junit.jupiter.api.Test;
import reduce.CounterMethods;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterMethodsTest {

    @Test
    void testCount() {
        var numbers = List.of(0, 1, 4, 5, -1, -2, 4, 6, -1, -5);
        var stats = new CounterMethods().countNumbers(numbers);

        assertEquals(6, stats.getCountOfPositiveOrZeroNumbers());
        assertEquals(4, stats.getCountOfNegativeNumbers());
    }
}
