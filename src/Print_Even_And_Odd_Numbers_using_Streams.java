import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Print_Even_And_Odd_Numbers_using_Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 , 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 , 14 , 16 , 1987 , 9988);
        list.stream().filter(e-> e % 2 == 0).forEach(e -> System.out.print(e + " "));
        System.out.println();
        list.stream().filter(e-> e % 2 != 0).forEach(e -> System.out.print(e + " "));

    }
}
