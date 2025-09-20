package List.ArrayList;

import java.util.ArrayList; // Importing the ArrayList class from java.util package
import java.util.Collection;

public class MyArrayList {
    public static void main(String[] args) {

        // Creating an ArrayList of Integer type
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Displaying the elements of the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Displaying the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Accessing elements using index
        System.out.println("Element at index 2: " + arrayList.get(2));

        // Displaying the elements of the ArrayList using a loop
        System.out.print("Displaying the elements of the ArrayList using a loop: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        // For-each loop to display elements
        System.out.print("\nDisplaying the elements of the ArrayList using a for-each loop: ");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }


        // contains() method to check if an element exists
        System.out.println(arrayList.contains(30)); // true
        System.out.println(arrayList.contains(100)); // false

        // Removing an element from the ArrayList
        arrayList.remove(2); // Removes the element at index 2
        System.out.println("\nArrayList after removing element at index 2: " + arrayList);

        //add element at specific index
        arrayList.add(2, 25); // Adds 25 at index 2
        System.out.println("\nArrayList after adding 25 at index 2: " + arrayList);

        //set element at specific index
        arrayList.set(2, 35); // Sets the element at index 2 to 35
        System.out.println("\nArrayList after setting 35 at index 2: " + arrayList);


        // Creating an ArrayList with an initial capacity
        ArrayList<Integer> newArrayList = new ArrayList<>(10);
        System.out.println("\nNew ArrayList with initial capacity 10: " + newArrayList);
        System.out.println(newArrayList.getClass().getName()); // prints java.util.ArrayList

        // addfirst() method to add element at the beginning
        arrayList.addFirst(5);
        System.out.println("ArrayList after adding 5 at the beginning: " + arrayList);

        // addlast() method to add element at the end
        arrayList.addLast(60);
        System.out.println("ArrayList after adding 60 at the end: " + arrayList);

        //removeall() method to remove all elements
        arrayList.clear();
        System.out.println("ArrayList after removing all elements: " + arrayList);

        // Creating a Collection and adding elements
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        System.out.println("Collection: " + collection);    
        arrayList.addAll(collection); // Adding all elements from the collection to the ArrayList
        System.out.println("ArrayList after adding all elements from collection: " + arrayList);

        // returns the index of the first occurrence of 2
        System.out.println("Index of 2: " + arrayList.indexOf(2));

        // returns the index of the last occurrence of 2
        arrayList.add(2);
        System.out.println("ArrayList after adding another 2: " + arrayList);
        System.out.println("Index of last occurrence of 2: " + arrayList.lastIndexOf(2));
    }

}
