package employees;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeRepositoryTest {

    List<Employee> employees =
            List.of(new Employee("John Doe", 1970),
                    new Employee("Jane Doe", 1980));

    EmployeeRepository employeeRepository = new EmployeeRepository();

    @Test
    void testFindByName() {
        var employee = employeeRepository.findFirstByName(employees,
                "John Doe");

        assertEquals("John Doe", employee.get().getName());
        assertEquals(1970, employee.get().getDateOfBirth());
    }

    @Test
    void testFindByYearOfBirth() {
        var employee = employeeRepository.findFirstByYearOfBirth(employees,
                1980);

        assertEquals("Jane Doe2", employee.get().getName(),
                () -> "The name is not Jane Doe2");
    }

    @Test
    void testNotFound() {
//        var ex = assertThrows(IllegalArgumentException.class,
//                () -> employeeRepository.findFirstByName(employees, "John"));
//        assertTrue(ex.getMessage().startsWith("Can not find"));

        var employee = employeeRepository.findFirstByName(employees, "John");
        assertTrue(employee.isEmpty());
    }

    @Test
    void testListTrimmedNames() {
        employees =
                List.of(new Employee("   John Doe    ", 1970),
                        new Employee("Jane Doe", 1980));

        assertEquals(List.of("John Doe", "Jane Doe"), employeeRepository.getTrimmedNames(employees));
    }

    @Test
    void test_getDoesOrderByYearOfBirth() {
        employees =
                List.of(new Employee("John Doe", 1980),
                        new Employee("Jane Doe", 1970),
                        new Employee("Jane Smith", 1980));

        var result = employeeRepository.getDoesOrderByYearOfBirth(employees);

//        assertEquals("Jane Doe", result.get(0).getName());
//        assertEquals(1980, result.get(1).getDateOfBirth());

        assertEquals(List.of("Jane Doe", "John Doe"),
                result.stream().map(Employee::getName).collect(Collectors.toList()));
    }
}
