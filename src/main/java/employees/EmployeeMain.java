package employees;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        var employees =
                List.of(new Employee("John Doe", 1970),
                        new Employee("Jane Doe", 1980));

        //Collections.sort(employees, );

        //employees.sort(Comparator.comparing(Employee::getName));
        Collections.sort(employees);
    }
}
