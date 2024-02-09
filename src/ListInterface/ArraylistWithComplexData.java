package ListInterface;
import java.util.ArrayList;
class Student{
    String name;
    int id;
    String city;

    Student(String n, int i,String c){
        name = n;
        id = i;
        city = c;
    }

    public String toString(){
        return name + " : "+id+" : "+city;
    }
}
class ArraylistWithComplexData{
// int a ;
//
// ArraylistWithComplexData(int a1){
//     a=a1;
// }
//    @Override
//    public String toString() {
//        return a+ " ";
//    }

    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();


        Student student1 = new Student("Raj",100,"Solapur");
        Student student2 = new Student("Kartik",200,"Pune");

        String result=student1.toString();
        System.out.println(result);
        //ArraylistWithComplexData s = new ArraylistWithComplexData(10);
        //System.out.println(s);

        student.add(student1);
        student.add(student2);

        System.out.println(student);
        for(Student s : student){
            System.out.println(s);
        }
    }
}

