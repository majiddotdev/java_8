import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInJava {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("majid");
        list.add("saba");
        list.add("hilal");


        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()){
                    return  1;
                }
                else
                    return -1;
            }
        };

        Collections.sort(list , comp);

        System.out.println(list);

    }
}
