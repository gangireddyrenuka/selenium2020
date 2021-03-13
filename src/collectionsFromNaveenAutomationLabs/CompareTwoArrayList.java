package collectionsFromNaveenAutomationLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		
		//sort and equals
		//before comparing we should sort it first..
		ArrayList<String>l1=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String>l2=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String>l3=new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));//false
		
		System.out.println(l1.equals(l3));//true
		
		Collections.sort(l3);
		System.out.println(l1.equals(l3));
		
		//2.compare two lists --find out the additional elements...
ArrayList<String>l4=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
ArrayList<String>l5=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
	//remove All	
		//l4.removeAll(l5);
		//System.out.println(l4);
//findout the missing elements
		l5.removeAll(l4);
		System.out.println(l5);//E
		
		//findout the common elements
		ArrayList<String>lang1=new ArrayList<String>(Arrays.asList("JAVA","Python","C#","Oracle","PHp"));
		
		ArrayList<String>lang2=new ArrayList<String>(Arrays.asList("JAVA","C#","Python","PHp","E"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		
	}

}
