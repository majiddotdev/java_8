import java.util.Arrays;
import java.util.List;

public class Print_Average_Of_All_Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1 , 2 , 3 , 4  , 5 , 6 , 10);
        Double avg = list.stream().mapToInt(e ->e).average().getAsDouble();
        System.out.println("The Avereage of the number is "+ avg);

    }
}
