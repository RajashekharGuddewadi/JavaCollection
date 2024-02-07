import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConvert {
    public static void main(String[] args) {
        String[] names ={"Raj","Kartik","Parag","Parth"};
        System.out.println("Print Array : "+ Arrays.toString(names));
        List<String> lname = new ArrayList<>();
        for(String friends:names){
            lname.add(friends);
        }

        System.out.println("Print ArrayList : "+lname);
    }
}
