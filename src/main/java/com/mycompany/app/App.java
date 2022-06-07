package com.mycompany.app;
import java.util.*;
/**
 * Java Collections interface 
 * With explanations, real world-anologies, and each method's
 * runtime complexities.
 */
public class App 
{
    public static void main( String[] args )
    {   
        System.out.println("Extensive Documentation on Collections Interface by Lopezs20");
        System.out.println("-------------------------------Priority Queue-----------------------------------");
        /**
         * Priority Queue
         * A heap or a self-balancing binary search tree with heap property that satisfies high
         * priority ordering for every insertion/deletion operation. 
         * 
         * Can be used to create the A* search alogrithm, heap sort, disbruting a set of tasks in a 
         * prioritzed order such as instructions/recipe, build cycles, listing a rank of grades or specific
         * hierachy (student->bachelors->masters->professor->doctrine). 
         * 
         * Priority Queue creationg takes O(n) to build for a set of n elements in heap.
         * Insertion (S, Key) takes O(log n) because inserting the key requires re-balancing the heap/binary tree.
         * Polling operations takes O(log n) because after this call you need to restore the
         * the heap invariant (heap property) within the complete binary tree. 
         * Peeking operations takes O(1) because finding the head or parent element within the tree takes a 
         * constant time.
         * Adding or offering operations takes O(log n) because the heap needs to be re-balanced or heapified
         * to not violate the heap property.
         *  Finally, building heap from already existing sequences of elements will take O(n log n).
         */
        Queue<Double> queue = new PriorityQueue<Double>();
        queue.add(3.0); 
        queue.offer(2.5); 
        queue.add(3.7); 
        queue.offer(4.16);
        System.out.println("\nThis is the PriorityQueue with a collection of numbers using add() and offer():\n" + queue);
        System.out.print("\nLet's confirm the head in this heap using peak(): " + queue.peek());
        System.out.println("\nNow lets remove all instances of number 3 using remove().");

        queue.remove(3.0); queue.remove(3.7);

        System.out.println("This is the PriorityQueue without any 3:\n" + queue);

        System.out.println( "\nLets remove the head of the queue using remove(): ");
        queue.remove();
        System.out.println(queue);
        queue.add(3.0); 
        queue.offer(2.5); 
        queue.add(3.7);

        System.out.println("Now let's offer/add back those values: "+queue);
        System.out.println("\nThere is a method called poll() which retrieves and removes the head of this queue."+
            "\nLet's see what that looks like: "+ queue.poll());
        System.out.println("\n"+ queue+"\nNow you know the basics of Priority Queue!\n");
        /**
         * Vector implements list data structure.
         * Growable/dynamic sized array of objects that can be accessed using integer indexes.
         * Optimize storage by maintaining a capacity and increase data chunks by capacityIncrement.
         * An application can increase the capacity of a vector before inserting a large number of components; 
         * this reduces the amount of incremental real location. 
         * 
         * 
         * Adding/setting operations takes O(1) bcs it takes a constant time to insert a new item into
         * a determined index of the dynamic array.
         * 
         * Retrieve/get items are O(1) bcs it takes a constant time to get a item at determined index of the
         * dynamic array.
         * 
         * Removing operations takes O(1) bcs it takes a constant time to retrieve the value from an index and remove
         * the index from the array, shift everything to the left to fill in the space, update the indencies, 
         * and return the value of the removed index.
         * 
         */
        System.out.println("-----------------------------Vectors-------------------------------------");    
        System.out.println("\nNow let's use a Vector and add some values for it");

        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(3);
        vector.addElement(5);
        vector.add(4);
        vector.add(8);

        System.out.println("Here is what the vector looks like: " + vector);
        System.out.println("\n Now let's get the number 3 from this vector using get(index): " +
            vector.get(1));
        System.out.println("\n Now let's get the number 8 from this vector: " +
            vector.get(4));
        System.out.println("\n Removing the number 3 using remove(): ");

        vector.remove(1); 
        System.out.println(vector);

        System.out.println("\nWanna know the size? Let's take a look using size(): " + vector.size() + "\nCapacity(): "
            + vector.capacity());
        System.out.println("\nWe can also make vectors use strings and other data types instead of numbers!");
        System.out.println("Let's create a vector that stores various real life representations \nof things we commonly use: ");

        Vector<String> houseHoldItems = new Vector<String>();
        // we can use add to append items into the vector but also use addElements method to do the same.  
        houseHoldItems.addElement("Computer"); 
        houseHoldItems.addElement("Chair"); 
        houseHoldItems.addElement("Soda"); 
        houseHoldItems.add("Anime");
        System.out.println("\nHere is what I might have at home: "+ "\n"+houseHoldItems);
        System.out.println("\nNow I want to know if the string 'weed' is in the vector. Let's check using contains(): "
           + "\nDoes this vector have the word \"weed\"? ");

        if (houseHoldItems.contains("weed"))
        {
            System.out.println("Blazing it bro!");
        }
        else System.out.println("No such word found..." + "\n"+ vector + "\n" + houseHoldItems);

        System.out.println("\nOne more thing, let us get the first and last element of both vectors made: "
            + "\nFirst and Last of the number vector: " + vector.firstElement() + "\t" + vector.lastElement()
            + "\nFirst and Last of the household vector: "+ houseHoldItems.firstElement() + ", " + houseHoldItems.lastElement());

        System.out.println("We can also set items in a vector using set().\nLet us set a new value to this vector:");
        houseHoldItems.set(2,"beer"); 
        System.out.println(houseHoldItems);
        System.out.println("\nNow you know the basics of Vectors data structures.\n");

        /**
         * Stack data structure extends Vectors.
         * Last in first out 
         * 
         * Most opertations on stack is O(1) including push(), pop(), peek(),and isEmpty().
         * Reasoning is since the order is LIFO or First in Last out (FILO), it takes a constant time
         * with no looping nessecary.
         */
        System.out.println("-----------------------------Stacks-------------------------------------");    
        System.out.println("\nTime for stacks, start with making an empty stack and adding values into it.");

        Stack<Integer> simpleStack = new Stack<Integer>();

        System.out.println("Let's check the stack if it is empty: ");
        if (simpleStack.isEmpty())
        {
            System.out.println("This will only print if stack is empty!");
        }
        else System.out.println("Well I guess the stack is not empty then...");
        System.out.println("\nStacks are like pancakes or plates, LIFO (Last in First Out)");

        simpleStack.push(2);
        simpleStack.push(5);
        simpleStack.push(14);
        simpleStack.push(1205);
        simpleStack.push(6697412);
        simpleStack.push(-15);

        System.out.println("\nHere is what the stack looks with values pushed: " + simpleStack);
        System.out.println("Here is what pop() gives you: "+ simpleStack.pop());
        System.out.println("\nNotice that I can only pop from the last item in the stack and not the first one in.");
        System.out.println("Let's see what is on the top of the stack using peek(): " + simpleStack.peek());
        System.out.println("\nNotice that the top is actually the last item in the vector and not the first item at all.\n" 
            + simpleStack + "\n[5, 4,  3,    2,      1] ---> This is the indexes of each element.");
        System.out.println("\nAlso, stacks usually implements 1-based element positioning, not starting with 0 like most ADTs");
        System.out.println("\nHowever, search() can find any position of any object within the stack, say item \"2\" at position: "
            + simpleStack.search(2));
        System.out.println("You cannot take the values from the bottom or immediately get the first push() object without"
        + "\ngoing through the top of the stack.\n");
        System.out.println("Now you know the basics of stack\n");

        /**
         * LinkedList
         * Access elements sequentially and uses extra space/memory for pointers at each element/node.
         * Can be used for implementing stacks and queues, web browsers for paging URLS, List of songs to listen to
         * or tasks that needs accomplish in an order.
         * 
         * Add : O(1)
         * Remove: O(1)
         * Get/Set: O(n)
         * Contains: O(n)
         * Next item: O(1)
         */
        System.out.println("-----------------------------LinkedList-------------------------------------"); 
        System.out.println("\nLinked lists are dynamic in size, meaning we do not have to specify the size of the list."+
            "\n Here is a linked list of grocery items: ");

        LinkedList<String> lnklist = new LinkedList<String>();
        lnklist.add("Apples");
        lnklist.add("Oranges");
        lnklist.add("Onions");
        lnklist.add("Bananas");
        lnklist.add("GrapeFruits");

        System.out.println(lnklist);
        System.out.println("\nLet's take out the string \"onions\" since we have a list of fruits not veggies: ");

        if (lnklist.remove("Onions")) 
        {
            System.out.println("\nOnions have been deleted according to this if-statement!");
        }
        else System.out.println("Bro what did you do wrong?!");

        System.out.println("\nLet's see the list after the deletion: " + lnklist + 
            "\n We can use contains() method to see if the list has a specific item you want.\nLet's verify the item \"Oranges\": ");

        if (lnklist.contains("Oranges"))
        {
            System.out.println("\nIf-statement says the Oranges are here!");
        }
        else System.out.println("It is not in the linked list...");

        System.out.println(lnklist);

        System.out.println("\nNow let's retrieve \"Apples\" and \"Bananas\" with get(): " + "\n"
           + lnklist.get(0) + "\n" + lnklist.get(2));
        
        System.out.println("\nWe can use getFirst() instead of get() just to find the first element in the list: "
            + lnklist.getFirst() + "\nAlso use getLast() to get the last element: " + lnklist.getLast());

        System.out.println("\nLet's set the linked list but with a new set of items. \nThis will not destroy or create another new linked list");
        System.out.println("\nUsing set() method... ");  

        lnklist.set(0, "Potatoes");
        lnklist.set(1, "Radishes");
        lnklist.set(2, "Carrots");
        lnklist.set(3, "Celery");

        System.out.println("\nThis is what the list now looks like with: "+ "\n"+lnklist);

        // use the Array Library toString() method instead of a loop when printing...
        String[] example = lnklist.toArray(new String[5]);

        System.out.println("\nWe can copy the linked list into an arbitary array of strings with toArray() like so: "
        + "\n" + Arrays.toString(example));
        System.out.println("\nNow lets remove the entire list: ");
        lnklist.clear(); 
        System.out.println(lnklist);
        System.out.println("Now you know the basics of Linked Lists!\n");

        /**
         * ArrayList
         * Resizable-array implementation of the List interface. 
         * Implements all optional list operations, and permits all elements, including null.
         * This class is roughly equivalent to Vector, except that it is unsynchronized.
         * 
         * Add: O(1)
         * Remove: O(n)
         * Get/Set: O(1)
         * Contains: O(n)
         * Iterator/size: O(1)
         */
        System.out.println("-----------------------------ArrayList-------------------------------------");   
        System.out.println("\nLets make an array list with a default capacity of 16: ");

        ArrayList<Integer> arrl = new ArrayList<Integer>();
        for(int i = 0; i < 16; i++){
            arrl.add(i);
        }

        System.out.println(arrl);
        System.out.println("\nWe may retrieve any number at their indexes, say we want 7: " + arrl.get(7));
        System.out.println("We can set any element to another value in the array list dynamically using set().");
        System.out.println("\nSetting \"7\" as \"64\": ");
        arrl.set(7, 64);
        System.out.println(arrl);
        System.out.println("\nWe can remove a certain element at their indexes as well: ");
        System.out.println("Let us remove all odd numbers: "); 
        for (int i = 0; i < arrl.size(); i++){
            if (arrl.get(i) % 2 != 0) {
                arrl.remove(i);
            }
        }
        /**
         * Array Dequeue
         * Resizable-array implementation of the Deque interface. Array deques have no capacity restrictions; 
         * they grow as necessary to support usage. They are not thread-safe.
         * 
         * Offer/add: O(1)
         * Peak: O(1)
         * Poll: O(1)
         * Remove: O(n)
         * Size: O(1)
         */
        System.out.println(arrl);
        System.out.println("\nNow you know the basics of array list!\n");
        System.out.println("-----------------------------Array Dequeue-------------------------------------");
        System.out.println("\nArray Dequeue is similar to a double ended queue. In fact many consider this data structure"+
            "to be a more efficient stack ADT. \nMost ArrayDeque operations" +  
            "\nrun in a gradual reduced constant time except for remove() and similar methods. "+ 
                "\nBulk of the operations run in linear time.");
        
                System.out.println("Here is the array deque that I made: " + "\n");
        ArrayDeque<Integer> arrD = new ArrayDeque<Integer>();
        arrD.add(3);
        arrD.add(6);
        arrD.add(8);
        arrD.add(93);
        arrD.add(3451);
        arrD.add(666);
        arrD.add(999);
        System.out.println(arrD);
        System.out.println("\nLet us add the integer \"101001\" to the front/first of the array deque. ");
        arrD.addFirst(101001); 
        System.out.println(arrD +"\nNow let us add the integer \"6969\" to the last/back of the array deque. ");
        arrD.addLast(6969);
        System.out.println(arrD);
        System.out.println("\nHere is the front of the dequeue using getFirst(): " + arrD.getFirst());
        System.out.println("\nWe can use pop() to remove and get the first 3 elements from the stack represented by the array deque.\n"
        + arrD.pop() + ", " + arrD.pop()+ ", " + arrD.pop());
        System.out.println("\nNotice how the array deque stack differs from the traditional stack structure. First in First Out");
        System.out.println("\nAlso recognize that we can use push() operations like stack. Let's push -300 into the deque: ");
        arrD.push(-300);
        System.out.println("Here is the \"stack\" array deque: " + arrD);
        System.out.println("\nTake note that add() and push() are NOT the same.\nYou may add any element to the front or back"
            + "of the array, but push() will only append items to the front of the array. ");
        System.out.println("\nSimilarily the poll() method retrieves and remove the head of the array deque.\n"+
         "Here is the result of poll(): " + arrD.poll());
        // pollFirst() does literally the same thing and I don't know the differences at all...
        System.out.println(arrD);
        System.out.println("\nAlso array deque allows the peek() method for both first and last elements.\nHere"+
           " is peekFirst(): " + arrD.peekFirst() + "\nHere is peekLast(): "+ arrD.peekLast() );

        System.out.println("\nFinally let's remove the occurence the number \"6969\" for having naughtiness!");
        arrD.remove(6969);
        System.out.println("Array deque without naughty numbers: "+ arrD);
        System.out.println("\nAlso array deque allows you to remove items from the back/last aswell.\nResult of removeLast(): "+
            arrD.removeLast());
        System.out.println(arrD);
        System.out.println("Now you know the basics of array deque!\n");
        /**
         * HashSet
         * Implements HashTable data structure that extends the Set interface.
         * Used for storing/finding unique keys or items; storing passwords, finding items within an inventory,
         * any shopping list/cart. 
         * 
         * Add: O(1)
         * Remove: O(1)
         * Contains: O(1)
         * Next: O(h/n) or height/n-th 
         * Size: O(1)
         */
        System.out.println("-----------------------------HashSet-------------------------------------");
        System.out.println("\nHashSets can use add() methods to append elements into a Set but does not do them in any particular order.");
        System.out.println("\nLet start by adding elements one by one to show how the set orders the elements: ");
        HashSet<Integer> hashSet = new HashSet<Integer>();
        System.out.println("\nHere is the first element adding \"1\": ");
        hashSet.add(1); 
        System.out.println(hashSet);
        hashSet.add(7); 
        System.out.println("\nHere is the second element adding \"7\" ");
        System.out.println(hashSet);
        hashSet.add(991); 
        System.out.println("\nHere is the third element adding \"991\": ");
        System.out.println(hashSet);
        hashSet.add(4412);
        System.out.println("\nHere is the fourth element adding \"4412\": ");
        System.out.println(hashSet);
        hashSet.add(823);
        System.out.println("\nHere is the fifth element adding \"823\": ");
        System.out.println(hashSet);
        hashSet.add(12);
        System.out.println("\nHere is the sixth element adding \"12\": ");
        System.out.println(hashSet);
        hashSet.add(45);
        System.out.println("\nHere is the seventh element adding \"45\": ");
        System.out.println(hashSet);
        hashSet.add(90000);
        System.out.println("\nHere is the eighth element adding \"90000\": ");
        System.out.println(hashSet);
        hashSet.add(-2);
        System.out.println("\nHere is the nineth element adding \"-2\": ");
        System.out.println(hashSet);
        hashSet.add(0);
        System.out.println("\nHere is the tenth element adding \"0\": ");
        System.out.println(hashSet);

        System.out.println("\n"+hashSet + "\nHere is the size of the hashSet using size(): " + hashSet.size());

        System.out.println("\nHashSet is basically a hashmap/hash-table with a \"set\" interface. Meaning we can "+
            "can use a certain method "+"\ncalled iterator() to go over the values of the set.");
        System.out.println("The iterator method returns the iteration of the same elements within the hash set."+
            "\nHowever keep in mind that the iterator does not gaurentee constant time when returning the random order of values or\n"+
                "anything that was present within the hashset.");
        
        Iterator<Integer> iterate_value = hashSet.iterator();
        System.out.println("\nUsing a simple while-loop if the set has a next value, print the next value:  ");
        while(iterate_value.hasNext()){
            System.out.println(iterate_value.next());
        }
        System.out.println("\nNotice the ordering of the elements within the set: " +
            "\n" + hashSet);

        System.out.println("\nRemember what a Set actually is, it isn't like an array or vector where multiple duplicate items"+
                "\ncan co-exist. Rather only one instance of a specified element can exist within the set. "+ 
                    "\nLet's try to add numbers \"0\" and \"1\" to the set: ");
        hashSet.add(0);
        hashSet.add(1);
        System.out.println("hashSet.add(0); \nhashSet.add(1); \n\nDid the hashSet change?" + "\n"+ hashSet + "\nIt did not.");
        System.out.println("\nIterating the hashSet is in linear time because there is no way to get a particular order and");
        System.out.println("the time to access each elements is dependent on the sum of elements and buckets within the hashmap.");
        System.out.println("\nFinally let's remove some elements to show how this is done: ");

        hashSet.remove(-2);
        System.out.println("\nRemoving \"-2\": ");
        System.out.println(hashSet);

        hashSet.remove(90000);
        System.out.println("\nRemoving \"90000\": ");
        System.out.println(hashSet);

        hashSet.remove(823);
        System.out.println("\nRemoving \"823\": ");
        System.out.println(hashSet + "\nRemember that removing or adding is constant time, but traversing is linear time.");
        System.out.println("\nWe can clear the set using clear() method: ");
        hashSet.clear(); 
        System.out.println(hashSet);
        System.out.println("\nNow you know the basics of a hashSet! \n");

        /**
         * Linked Hashset
         * Ordered by insertion, maintains a doubly-linked list running through all of its entries.
         * Performance is slightly lower than hashSet due to maintaining the linked list. 
         * 
         * Add: O(1)
         * Remove: O(1)
         * Contains: O(1)
         * Next item: O(1)
         */
        System.out.println("-----------------------------Linked Hash Set-------------------------------------");
        System.out.println("\nThis ADT is basically with a Hash table and linked list \nimplementation of the Set interface,"+
            " with predictable iteration order.");

        LinkedHashSet<String> doom = new LinkedHashSet<String>();
        System.out.println("This data structure differs from the preivous one (hashSet) in that it maintains \n"+ 
            "a doubly-linked list running through all of the entries/elements\n\nThe linked list actually define the order in which"+
                "each element are inserted \ninto the set by insertion-order.");
        doom.add("imp"); 
        doom.add("zombie"); 
        doom.add("cacodemon"); 
        doom.add("pinky demon");
        System.out.println("Here is linked hash set of monsters: \n"+ doom);
        System.out.println("\nMost of the methods derive from inherited classes such as the hashSet and java's Set class.");
        System.out.println("\nLet our hero, doomguy, slay the demons: ");
        if (doom.contains("hell knight")){
            System.out.println("big trouble...");
        } 
        else {
            doom.add("hell knight");
        }
        doom.add("doomguy");
        LinkedHashSet<String> totalDoom = new LinkedHashSet<String>();
        totalDoom.add("doomguy"); 
        totalDoom.add("cacodemon");
        System.out.println("\n"+doom);
        while (!doom.equals(totalDoom)){
            if (doom.contains("doomguy")){
                    doom.remove("imp");
                    System.out.println("\nDoomguy shredded imp:\n"+doom);
                    doom.remove("zombie");
                    System.out.println("\nDoomguy slaughtered zombie:\n"+doom);
                }
            if (doom.contains("hell knight") && doom.contains("pinky demon")){
                doom.remove("doomguy");
                System.out.println("\nDoomguy died fighting hell knight and pinky demon:\n"+doom);
            }
            if (doom.contains("cacodemon") && !doom.contains("zombie")){
                doom.remove("hell knight");
                System.out.println("\nCacodemon ate hell knight:\n"+doom);
                doom.add("doomguy");
                System.out.println("\nDoomguy respawned:\n"+doom);
            }
            if (doom.contains("cacodemon")){
                doom.add("imp");
                System.out.println("\nCacodemon summoned imp: \n"+doom);
            }
            if (doom.contains("pinky demon") || doom.contains("doomguy")){
                doom.remove("imp");
                System.out.println("\nPinky demon ate imp.\n"+doom);
                doom.remove("pinky demon");
                System.out.println("\nDoomguy removes pinky demon:\n"+doom);
            }
        }
        System.out.println("\nThere is only 1 demon left: \n" + doom + "\nDoomguy rips out cacodemon's eyeball.");
        totalDoom.clear();
        doom.remove("cacodemon");
        System.out.println("Victory: "+ doom + "\n");
        doom.clear();
        /**
         * TreeSet
         * Extends the Set interface and implements SortedSet interface.
         * Self Balancing tree that follows the Red-Black tree implementation.
         * 
         * Useful for storing data in logarthmic time.
         * 
         * Add: O(log n)
         * Remove: O(log n)
         * Contains: O(log n)
         * Next item: O(log n)
         * Size: O(1)
         */
        System.out.println("-----------------------------TreeSet-------------------------------------");
        System.out.println("\nTreeSet is a NavigableSet implemented based on a TreeMap. Elements are stored using \na tree and use their natural ordering."+
            " However, ordering must be consistant with equals() method because TreeSet uses\ncompareTo() to determine element "+
                "comparisons." + "\nThis ADT is considered one of the most important to the SortedSet interface.\nThis interface provides us with a way to"+
                " navigate through this self-balancing tree.");
        TreeSet<Double> tSet = new TreeSet<Double>();
        tSet.add(3.4);  // notice the ordering is from least to greatest from root to leaf.
        tSet.add(5.6);
        tSet.add(2.91);
        tSet.add(1.738);
        tSet.add(8.004);
        tSet.add(10.025);
        tSet.add(99.99);
        tSet.add(3.66);
        System.out.println(tSet);
        System.out.println("\nUsing ceiling() method to get the number above 3.0: " + tSet.ceiling(4.0));
        
        if (tSet.contains(99.99)){
            tSet.remove(99.99);
            tSet.add(100.01);
            System.out.println("\nRemoved \"99.99\" and replaced it with \"100.01\": \n" + tSet);
        }

        System.out.println("\nFirst element in the tree: " + tSet.first());
        System.out.println("\nLast element in the tree: " + tSet.last());
        System.out.println("\nPolling first and last elements: ");
        tSet.pollFirst(); tSet.pollLast();
        System.out.println(tSet);
        System.out.println("\nSize of treeSet: " + tSet.size());
        System.out.println("\nRange from subset of elements starting at \"3.4\" to \"8.004\": " + 
            tSet.subSet(3.4, 8.004));
        
        System.out.println("Now you know the basics of treeSet.");
    }   
}
