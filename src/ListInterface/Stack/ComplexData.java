package ListInterface.Stack;

import java.util.Stack;

class Student{
    String name;
    int id;
    String mob_No;

    Student(String n, int i ,String m){
        name = n;
        id = i;
        mob_No = m;
    }

    public String toString(){
        return name+" : "+ id+" : "+mob_No;
    }

}

public class ComplexData {
    public static void main(String[] args) {

        Stack<Student> s = new Stack<>();
        s.push(new Student("Raj",1,"585856985225"));
        s.push(new Student("Kartik",2,"15852698569"));
        System.out.println(s);

        for (Student S : s){
            System.out.println(S);
        }
    }

}
