package employees;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class EmployeeRepository {

    public Optional<Employee> findFirstByName(List<Employee> employees, String name) {
        return findByCondition(employees, e -> e.getName().equals(name));
    }

    public Optional<Employee> findFirstByYearOfBirth(List<Employee> employees, int yearOfBirth) {
        return findByCondition(employees, e -> e.getDateOfBirth() == yearOfBirth);
    }

    private Optional<Employee> findByCondition(List<Employee> employees, Predicate<Employee> condition) {
        for (var employee: employees) {
            if (condition.test(employee)) {
                return Optional.of(employee);
            }
        }
//        throw new IllegalArgumentException("Can not find employee with condition "
//                + condition.toString());
        return Optional.empty();
    }
}
