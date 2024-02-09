package ListInterface.Stack;

import java.util.Collections;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(100);
        num.push(200);
        num.push(85);
        num.push(300);
        num.push(150);

        System.out.println(num);
        System.out.println(num.peek());
        System.out.println("remove "+num.pop());
        System.out.println(num);
        System.out.println(num.peek());
        Collections.sort(num);
        System.out.println(num.capacity());
        System.out.println(num.size());
        System.out.println(num);

        num.sort((l1,l2)->(l1>l2)?-1:(l1<l2)?1:0);
        System.out.println(num);

    }
}
