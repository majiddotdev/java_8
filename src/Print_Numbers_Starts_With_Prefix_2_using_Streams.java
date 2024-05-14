import java.util.Arrays;
import java.util.List;

public class Print_Numbers_Starts_With_Prefix_2_using_Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 , 233 , 445 , 33 , 22  , 2222 , 2533  , 422);
        list.stream().map(String::valueOf).filter(e -> e.startsWith("2")).map(e -> Integer.valueOf(e))
                .forEach(e -> System.out.print(e + " "));
    }
}
