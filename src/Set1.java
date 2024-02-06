import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();

        name.add("Raj");
        name.add("Kartik");
        name.add("Keshav");
        name.add("Raj");
        System.out.println(name);
    }
}
