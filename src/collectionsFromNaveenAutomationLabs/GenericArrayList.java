package collectionsFromNaveenAutomationLabs;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();//i cant store other values..strictly it will not allow..other values means string,double
		 ar.add(299);
		 ar.add(300);
		 ar.add(200);
		 //ar.add(10.3);//it will give a error this is double value...
		 ar.add(199);
		 System.out.println(ar.size());
		 
		 ArrayList<Double> ar1=new ArrayList<Double>();
         ar1.add(10.35);
         
         ArrayList<String> studentNames=new ArrayList<String>();
         studentNames.add("megu");
         studentNames.add("devanshi");
         
         //list with other collections
         
         ArrayList <Integer> numbers=new ArrayList<Integer>(Arrays.asList(10,20,30,35));
         System.out.println(numbers);
         
         ArrayList<String>names=new ArrayList<String>(Arrays.asList("java","python","php","c++"));
         
         System.out.println(names);
         System.out.println(names.size());
         
         ArrayList<Object> ar2=new ArrayList<Object>(Arrays.asList(10,"java",10.33,20));
         System.out.println(ar2);
	}

}
