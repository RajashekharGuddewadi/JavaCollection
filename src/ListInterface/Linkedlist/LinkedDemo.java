package ListInterface.Linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits);
        fruits.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println(fruits);

        String str = fruits.get(2);
        System.out.println(str);

        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String fruit:fruits){
            System.out.println(fruit);
        }


    }
}
