import java.util.ArrayList;

public class ListArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            num.add(i);
        }

        System.out.println(num);

        num.remove(5);
        System.out.println(num);

        for (int i = 0; i <num.size() ; i++) {
            System.out.print(num.get(i)+" ");

        }
    }
}
