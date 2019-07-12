package employees;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSample {

    public static void main(String[] args) {
        var employees =
                List.of(new Employee(1L, "John Doe", 1970),
                        new Employee(2L, "Jane Doe", 1980));

        Map<Long, Employee> employeeMap =
                employees.stream().collect(Collectors.toMap(
                        Employee::getId,
                        e -> e
                ));
        System.out.println(employeeMap);
    }
}
