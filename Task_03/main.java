package Task_03;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.*;

public class main {
    
    public static void main(String [] args) {
        LinkedList list =new LinkedList();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(10);
        
        int sum =0;
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            sum += iterator.next();
            }
    System.out.println("сумма: "+ sum);
    }

}
