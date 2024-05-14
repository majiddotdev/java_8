import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class interview_question_using_filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 , 2 ,3 ,4  , 14 , 16 , 1987 , 9988 , 5 ,6 ,7 ,8 ,9);
        list.stream().filter(e -> e %2 == 0).sorted().forEach(e -> System.out.print(e + " "));
        System.out.println();
        list.stream().filter(e -> e %2 == 0).sorted(Comparator.reverseOrder()).forEach(e-> System.out.print(e + " "));
    }
}
