package collectionsFromNaveenAutomationLabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizationOfArrayList {

	public static void main(String[] args) {
		//collections.Syncronization---it is a method
		List<String> nameslist1 = Collections.synchronizedList(new ArrayList<String>());
		
		nameslist1.add("java");
		nameslist1.add("oracle");
		nameslist1.add("database");
		
		System.out.println(nameslist1);
		//add or remove the elements we dont need the explicit syncronised
		// to fetch or traverse the values from the list--we have to use expliciy synchronised
		synchronized(nameslist1)
		{
		Iterator<String>it	=nameslist1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//2.copyOnWriteArrayList---it is a class..its already synchronized and ThreadSafety
		
		CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<String>();
		empList.add("meganath");
		empList.add("renuka");
		empList.add("devanshi");
		//add or remove the elements we dont need the explicit syncronised
		// to fetch or traverse the values from the list--we have to use expliciy synchronised
		
		Iterator<String>it1 = empList.iterator();
		while(it1.hasNext())
		{
			
			
			System.out.println(it1.next());
		}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
