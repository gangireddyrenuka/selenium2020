package collectionsFromNaveenAutomationLabs;

import java.util.ArrayList;
import java.util.Iterator;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayListIteration {

	public static void main(String[] args) {
		
	ArrayList<String> ar=new ArrayList<String>();	
		
		ar.add("sfg");
		ar.add("doll");
		ar.add("true");
		ar.add("ssret");
		ar.add("sfgh");
		//typical for loop
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//advanced for loop
		
		for(String s:ar)
		{
			System.out.println(s);
		}
		System.out.println("____________");
		
		//JDK 8 ..stream with Lambda
		
		ar.stream().forEach(ele -> System.out.println(ele));
		System.out.println("____________");
//iterator
		Iterator<String>it=ar.iterator();
		while(it.hasNext())
{
			System.out.println(it.next());
		
	}

	}
	}
