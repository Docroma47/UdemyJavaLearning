package mypackage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(11);

        System.out.println(set.size());

        set.remove(11);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

//        set.clear();
        System.out.println(set.size());

        System.out.println();
        System.out.println(set.contains(10));
        System.out.println(set.contains(11));

        System.out.println();
        for (int i: set) System.out.println(i);
    }

}
