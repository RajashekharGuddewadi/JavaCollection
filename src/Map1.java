import java.util.HashMap;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {

        HashMap<Integer,String>  Students = new HashMap<>();
        Students.put(1,"Raj");
        Students.put(66,"Parag");
        Students.put(5,"Sagar");
        Students.put(555,"Keshav");
        Students.put(3,"Kartik");
        Students.put(4,"Pradeep");

        System.out.println(Students);

        TreeMap<Integer,String> Student = new TreeMap<>();
        Student.put(1,"Raj");
        Student.put(66,"Parag");
        Student.put(5,"Sagar");
        Student.put(555,"Keshav");
        Student.put(3,"Kartik");
        Student.put(4,"Pradeep");

        System.out.println(Student);
    }
}
