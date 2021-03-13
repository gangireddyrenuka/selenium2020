package collectionsFromNaveenAutomationLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		
ArrayList<String> ar1=new ArrayList<String>();	
		
		ar1.add("testing");
		ar1.add("database");
		ar1.add("oracle");
		ar1.add("sql");


		
ArrayList<String> ar2=new ArrayList<String>();	
		
		ar2.add("java");
		ar2.add("python");
		ar2.add("php");
		
//		ar1.addAll(ar2);
//
//		System.out.println(ar1);
		
//		ar1.addAll(2,ar2);
//		System.out.println(ar1);
	//r1.contains(ar2);
	//ystem.out.println(ar1);
		
//		ar1.clear();//to clear all the elements of ar1
//		System.out.println(ar1);
		
	ArrayList<String> clonelist= (ArrayList<String>)ar1.clone();
	
	System.out.println(clonelist);
//		
		System.out.println(ar1.contains("database"));
		System.out.println(ar1.contains("c++"));
		System.out.println(ar1.indexOf("oracle"));
		
		ArrayList<String> list1=new ArrayList<String>(Arrays.asList("tom","renuka","jerry","lisa","renuka"));
		System.out.println(list1);
		System.out.println(list1.lastIndexOf("renuka"));
		list1.remove(1);
		System.out.println(list1);
		list1.remove("lisa");
		System.out.println(list1);

//		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numbers.removeIf(num ->num%2==0);
//		System.out.println(numbers);
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num ->num%2!=0);
		System.out.println(numbers);
		
		ArrayList<String> nameslist=new ArrayList<String>(Arrays.asList("tom","renuka","jerry","lisa","tom","renuka"));
		nameslist.retainAll(Collections.singletonList("tom"));
		System.out.println(nameslist);
		
		ArrayList<Integer> numbers1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		ArrayList<Integer> sublist=new ArrayList<Integer>(numbers1.subList(2, 8));
		System.out.println(sublist);
		
		ArrayList<String> arraylist=new ArrayList<String>(Arrays.asList("tom","renuka","jerry","lisa","tom","renuka"));
		 Object arr[]=arraylist.toArray();
		 System.out.println(Arrays.toString(arr));
		 
		 for(Object o:arr)
		 {
			 //System.out.println(o);
			 System.out.println((String)o);
		 }
		
	}

}
