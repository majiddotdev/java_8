import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Print_Sum_Of_All_Numbers {
    public static void main(String[] args){

        System.out.println("IN THE NAME OF ALLAH");

        List<Integer> list = Arrays.asList(1 , 2 , 3 , 4  , 5 , 6);
        Optional<Integer> reduce = list.stream().reduce((a , b)-> a + b);
        System.out.println("the sum of numbers in  the list is " + reduce.get());

    }
}
