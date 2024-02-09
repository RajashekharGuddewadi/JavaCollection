package ListInterface.Vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add(2,"Bull");

        System.out.println(animals);

        Vector<String> animals1 = new Vector<>();
        animals1.add("Crocodile");

        System.out.println(animals1);

        animals1.addAll(animals);
        System.out.println(animals1);

        String element = animals1.get(0);
        System.out.println(element);

        Iterator<String> itr = animals1.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
    }
}
