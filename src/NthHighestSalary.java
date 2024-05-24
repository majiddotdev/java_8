import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class NthHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John Doe", "IT", 60000),
                new Employee(2, "Jane Smith", "HR", 75000),
                new Employee(3, "Sam Brown", "IT", 80000),
                new Employee(4, "Lisa White", "HR", 90000),
                new Employee(5, "James Black", "Sales", 70000)
        );

       Optional<Double> salary= employees.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();
        System.out.println(salary.get());
    }
}
