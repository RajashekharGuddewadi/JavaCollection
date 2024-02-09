package ListInterface.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        System.out.println(a1);
        System.out.println(a1.size());

        a1.remove(Integer.valueOf(30));
        System.out.println(a1);
        System.out.println(a1.size());

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        for (int v:a1){
            System.out.println(v);
        }

        ArrayList<Integer> copy = new ArrayList<>(a1);
        System.out.println(copy);
    }
}
