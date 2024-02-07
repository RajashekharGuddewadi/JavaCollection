import java.util.LinkedList;

public class ListLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<>();

        for (int i = 1; i <=5; i++) {
            L1.add(i);
        }
        System.out.println(L1);

        L1.remove(3);
        System.out.println(L1);

        for (int i = 0; i < L1.size() ; i++) {
            System.out.print(L1.get(i)+" ");
        }


    }
}
