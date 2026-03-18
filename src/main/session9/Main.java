package main.session9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(5);
        System.out.println("ARR:"+arr.size());

        HashSet<Integer> hashSets = new HashSet<>();
        hashSets.add(5);
        hashSets.add(4);
        hashSets.add(5);
        System.out.println("Hashset:"+hashSets.size());

        PriorityQueue<Integer> priority = new PriorityQueue<>();
        priority.add(5);
        priority.add(3);
        priority.add(9);
        priority.add(6);
        System.out.println("Priority:"+priority.size());
        while (priority.size() > 0){
            System.out.println(priority.poll());
        }
        System.out.println("Priority:"+priority.size());
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("A",15);
        hashMap.put("B",8);
        System.out.println(hashMap.get("A"));

        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(0,"Nam");
        hashMap1.put(1,"Huy");
        System.out.println(hashMap1.get(0));
    }
}
