package sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class list {

	public static void main(String[] args)
	{
		/*
		List<Integer> list1 =new ArrayList<>();
		System.out.println("Size "+list1.size());
		System.out.println("is list empty or not  :"+list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add(40);
		list1.add(90);
		list1.add(70);
		list1.add(60);
		//list1.add(5,true);
		System.out.println("List : "+list1);
		
		System.out.println("list contain 20 "+list1.contains(20));
		list1.remove(false);
		System.out.println("List :"+list1);
	
		System.out.println("element at 5 position"+list1.get(5));
		
		System.out.println("element at last position remove "+list1.remove(list1.lastIndexOf(10)));
		System.out.println("element at a particular position remove "+list1.remove(list1.indexOf(10)));
		System.out.println("List :"+list1);
		
		list1.clear();
		System.out.println("List :"+list1);
*/
		
		List <String> name = new ArrayList<>();
		name.add("Rishabh");
		name.add("Amar");
		name.add("Parth");
		name.add("Deepak");
		
		System.out.println("List of name"+name);
		
		Collections.reverse(name);
		System.out.println("List of name"+name);
		 Iterator<String> i = name.iterator();
	        while (i.hasNext()) {
	            String nm = i.next();
	            System.out.println(nm);

	            if (nm.equals("Rishabh"))
	                i.remove();
	        }
	        System.out.println("List of names after removal: " + name);

	        ListIterator<String> li = name.listIterator(name.size());
	        while (li.hasPrevious()) {
	            String prevName = li.previous();
	            System.out.println(prevName);
	        }
	        System.out.println("Final list of names: " + name);	
	}
	}

