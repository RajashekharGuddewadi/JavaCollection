package ListInterface.Linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListLambdaExpression {
    public static void main(String[] args) {
        List<Integer> num = new LinkedList<>();

        for (int i = 1; i <= 50; i++) {
            if(i%5==0){
                num.add(i);
            }
        }
        System.out.println(num);

        num.sort((I1,I2)->(I1<I2)?1:(I1>I2)?-1:0);
        System.out.println(num);
    }

}
