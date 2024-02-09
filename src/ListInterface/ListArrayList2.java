package ListInterface;

import java.util.*;
public class ListArrayList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Raj");
        list.add("Kartik");
        list.add("Parth");
        list.add("Parag");

        for(String name:list){
            System.out.println(name);
        }
    }
}
