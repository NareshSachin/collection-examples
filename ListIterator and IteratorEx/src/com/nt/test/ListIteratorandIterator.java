/* Using Iterator, you can traverse List, Set and Queue type of objects. 
 But using ListIterator, you can traverse only List objects.
*/
package com.nt.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ListIteratorandIterator {

	public static void main(String[] args) {
		 List list = new ArrayList();
		 
	        list.add("ONE");
	 
	        list.add("TWO");
	 
	        list.add("THREE");
	 
	        //Traversing list elements using Iterator
	        Iterator iterator1 = list.iterator();
	 
	        while (iterator1.hasNext())
	        {
	            System.out.println(iterator1.next());
	        }
	 
	        Queue queue = new PriorityQueue(list);
	 
	        //Traversing queue elements using Iterator
	        Iterator iterator2 = queue.iterator();
	 
	        while (iterator2.hasNext())
	        {
	            System.out.println(iterator2.next());
	        }
	 
	        Set set = new HashSet(list);
	 
	        //Traversing set elements using Iterator
	        Iterator iterator3 = set.iterator();
	 
	        while (iterator3.hasNext())
	        {
	            System.out.println(iterator3.next());
	        }
	 
	        //Traversing list elements using ListIterator
	        ListIterator listIterator1 = list.listIterator();
	 
	        while (listIterator1.hasNext())
	        {
	            System.out.println(listIterator1.next());
	        }
	 
	        //Traversing queue and set elements using ListIterator is not possible
	 
	        //ListIterator listIterator2 = queue.listIterator();    //Compile time error, there is no such method in Queue
	 
	        //ListIterator listIterator3 = set.listIterator();     //Compile time error, there 

	}

}
