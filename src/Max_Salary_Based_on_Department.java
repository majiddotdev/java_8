import java.util.*;
import java.util.stream.Collectors;

public class Max_Salary_Based_on_Department {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John Doe", "IT", 60000),
                new Employee(2, "Jane Smith", "HR", 75000),
                new Employee(3, "Sam Brown", "IT", 80000),
                new Employee(4, "Lisa White", "HR", 90000),
                new Employee(5, "James Black", "Sales", 70000)
        );

        Map<String, Optional<Employee>> maxSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getName,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        // Print the results
        maxSalaryByDept.forEach((department, employee) ->
                System.out.println("Department: " + department + ", Max Salary: " + employee.get().getSalary())
        );

    }


}
