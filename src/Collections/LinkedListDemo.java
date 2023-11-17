package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();
        for(int i=0; i<50000; i++){
            lList.add(i);
        }
//        System.out.println(lList);
        long startTime = System.currentTimeMillis();
        for(int i=0; i<lList.size(); i++){
            lList.get(0);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("By using For Loop: " + (endTime - startTime));



        int x;
        startTime = System.currentTimeMillis();
        for(int i : lList){
           x = i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("By using enhanced for Loop: " + (endTime -startTime));



        startTime = System.currentTimeMillis();
        int y;
        Iterator<Integer> iterator = lList.iterator();
        while (iterator.hasNext()){
            y = iterator.next();
        }
        System.out.println("By using iterator: " + (endTime -startTime));
    }
}
