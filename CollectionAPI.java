import java.util.*;
/*
This class dives into Collection API concepts, their methods, and some function Interfaces
Lists - Sets - Tree sets - Maps - Hash Maps
Add(), Get(), Sort(), indexOf(), Put(), hasNext(), next()
Comparator with compare method
 */
public class CollectionAPI {
    public static void main(String [] a) {

        // A list is An ordered collection, where the user has precise control
        // over where in the list each element is inserted
        List<Integer> list = new ArrayList<Integer>();

        // Add is a method that appends the specified element to the * end * of this list
        list.add(81);
        list.add(54);
        list.add(66);
        list.add(82);

        // Sorts the list into ascending order
        Collections.sort(list);

        // Comparator is an interface that allows us to change the logic of sorting.
        // Here we are instantiating an object of Comparator and overriding the * compare * method
        // that return 1 signaling an element switch of -1 signaling not to switch.
        Comparator<Integer> comparator = (i, j) -> i%10 > j%10? 1 : -1;

        // Here we include comparator as a parameter to sort so that we customize the sorting logic
        list.sort(comparator);

        // A list has get and indexOf methods

        /*
         Set is a collection that contains no duplicate elements.
         Set does not have get and indexOf methods.
        */
        Set<Integer> set = new HashSet<Integer>();
        set.add(21);
        set.add(5);
        set.add(6);
        set.add(8);

        // We also have TreeSet that is similar to HashSet but sorted
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(44);
        treeSet.add(32);
        treeSet.add(87);
        treeSet.add(1);

        // Since sets don't have get methods we use an iterator

        // We can also use hasNext() and next() we get a tree set elements
        for (Integer integer : treeSet) System.out.println(integer); // next fetches the next value

        /*
        Map is not a part of collections framework  but is a part of collection api concepts
        Similar to set we don't have duplicates
         */
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Raed", 93);
        studentGrades.put("Dani", 99);

        System.out.println(studentGrades);
        System.out.println(studentGrades.get("Raed"));
        System.out.println(studentGrades.keySet()); // returns all keys

        // Goes through the key set and fetches the value of each key
        for(String key : studentGrades.keySet())
            System.out.println(key + " " + studentGrades.get(key));

    }
}
