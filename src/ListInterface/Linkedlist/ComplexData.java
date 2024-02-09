package ListInterface.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

class Employee{
    String emp_Name;
    int id;
    double salary;

    Employee(String n,int i,double s){
        emp_Name = n;
        id = i;
        salary = s;
    }

    public String toString(){
        return emp_Name + " : " + id + " : " + salary;
    }
}

public class ComplexData {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kartik",10,60000);
        Employee emp2 = new Employee("Keshav",20,35000);
        String result = emp1.toString();
        System.out.println(result);

        LinkedList<Employee> e = new LinkedList<>();
        e.add(emp1);
        e.add(emp2);
        e.add(new Employee("Sagar",30,55000));
        System.out.println(e);

        Iterator<Employee> itr = e.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for(Employee employee : e ){
            System.out.println(employee);
        }
    }
}
