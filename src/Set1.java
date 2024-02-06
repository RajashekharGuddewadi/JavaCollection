import java.util.HashSet;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("Raj");
        name.add("Kartik");
        name.add("Keshav");
        name.add("Raj");
        System.out.println(name);

        HashSet<Integer> num = new HashSet<>();
        num.add(2);
        num.add(1);
        num.add(4);
        num.add(5);
        num.add(3);
        System.out.println(num);

        TreeSet<String> names = new TreeSet<>();
        names.add("Raj");
        names.add("Kartik");
        names.add("Keshav");
        names.add("Raj");
        System.out.println(names);

    }
}
