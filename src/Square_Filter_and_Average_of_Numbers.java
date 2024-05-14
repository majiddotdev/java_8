import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Square_Filter_and_Average_of_Numbers {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1 , 2 , 3 ,4 , 5 ,6 , 7 , 8);
        Double avg = list.stream().map(e -> e *e).filter(e -> e % 2 == 0).mapToInt(e -> e).average().getAsDouble();
        System.out.println(avg);
    }
}
