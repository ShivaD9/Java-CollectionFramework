package List.LinkedList; // Corrected package name
import java.util.LinkedList; // Importing LinkedList class

public class LinkedListDemo {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList.getClass().getName());

        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Displaying the elements of the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // getting size of linked list
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Accessing elements using index
        linkedList.get(2);
        System.out.println("Element at index 2: " + linkedList.get(2));

        // addfirst() method to add element at the beginning
        linkedList.addFirst(5);
        System.out.println("LinkedList after adding 5 at the beginning: " + linkedList);

        // addlast() method to add element at the end
        linkedList.addLast(60);
        System.out.println("LinkedList after adding 60 at the end: " + linkedList); 

        //getfirst() method to get first element
        System.out.println("First element: " + linkedList.getFirst());  

        //getlast() method to get last element
        System.out.println("Last element: " + linkedList.getLast());

        // removefirst() method to remove first element
        linkedList.removeFirst();
        System.out.println("LinkedList after removing first element: " + linkedList);

        // removelast() method to remove last element
        linkedList.removeLast();
        System.out.println("LinkedList after removing last element: " + linkedList);

        // contains() method to check if an element exists
        System.out.println(linkedList.contains(30)); // true    
        System.out.println(linkedList.contains(100)); // false

        // indexOf() method to find the index of an element
        System.out.println("Index of element 30: " + linkedList.indexOf(30)); // 2
        System.out.println("Index of element 100: " + linkedList.indexOf(100)); // -1

        //add element at specific index
        linkedList.add(2, 25); // Adds 25 at index 2
        System.out.println("LinkedList after adding 25 at index 2: " + linkedList);

        //set element at specific index
        linkedList.set(2, 35); // Sets the element at index 2 to 35
        System.out.println("LinkedList after setting 35 at index 2: " + linkedList);

        // Removing an element from the LinkedList
        linkedList.remove(2); // Removes the element at index 2 
        System.out.println("LinkedList after removing element at index 2: " + linkedList);

        //removeall() method to remove all elements
        linkedList.clear();
        System.out.println("LinkedList after removing all elements: " + linkedList);    

        // replace() method to replace an element at a specific index
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.set(2, 35); // Sets the element at index 2 to 35
        System.out.println("LinkedList after setting 35 at index 2: " + linkedList);

        // Displaying the elements of the LinkedList using a loop
        System.out.print("Displaying the elements of the LinkedList using a loop: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }

        // For-each loop to display elements
        System.out.print("\nDisplaying the elements of the LinkedList using a for-each loop: ");
        for (int num : linkedList) {
            System.out.print(num + " ");
        }

        
    }
}
