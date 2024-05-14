import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Print_Duplicate_Numbers_using_Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 , 2 , 3 , 4 , 6 , 1 , 3 , 6 , 2 , 1);
        Set<Integer> list1 = list.stream().filter(e-> Collections.frequency(list , e) > 1).collect(Collectors.toSet());
        System.out.println(list1);

    }
}
