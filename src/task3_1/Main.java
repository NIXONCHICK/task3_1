package task3_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CountMap<Integer> countMap = new CountMapImpl<>();
        countMap.add(10);
        countMap.add(10);
        countMap.add(5);
        countMap.add(6);
        countMap.add(5);
        countMap.add(10);

        System.out.println("Count of 10: " + countMap.getCount(10));
        System.out.println("Count of 5: " + countMap.getCount(5));
        System.out.println("Count of 6: " + countMap.getCount(6));
        System.out.println("Count of 1 (not added): " + countMap.getCount(1));

        System.out.println("Removed count of 5: " + countMap.remove(5));
        System.out.println("Count of 5 after removal: " + countMap.getCount(5));
        System.out.println("Unique elements count: " + countMap.size());

        CountMap<Integer> anotherMap = new CountMapImpl<>();
        anotherMap.add(10);
        anotherMap.add(20);

        countMap.addAll(anotherMap);

        System.out.println("Count of 10 after addAll: " + countMap.getCount(10));
        System.out.println("Count of 20: " + countMap.getCount(20));

        Map<Integer, Integer> resultMap = countMap.toMap();
        System.out.println("Resulting map: " + resultMap);

        Map<Integer, Integer> destinationMap = new HashMap<>();
        countMap.toMap(destinationMap);
        System.out.println("Destination map: " + destinationMap);
    }
}
