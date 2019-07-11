package employees;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private String name;

    private int dateOfBirth;

    // Alt + Insert

    public Employee(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(Employee o) {
        return o.getName().compareTo(this.getName());
    }
}
