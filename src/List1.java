import java.util.ArrayList;
import java.util.LinkedList;

public class List1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Raj");
        names.add("Kartik");
        names.add("Keshav");
        names.add("Parag");
        names.add("Raj");
        System.out.println(names);

        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);
        System.out.println(num);

    }
}
