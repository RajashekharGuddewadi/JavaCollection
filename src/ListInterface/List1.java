package ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class List1 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
        Collections.sort(num,(a1,a2)->(a1>a2)?-1:(a1<a2)?1:0);
        System.out.println(num);

        LinkedList<Integer> num1 = new LinkedList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(2);
        System.out.println(num1);

    }
}
