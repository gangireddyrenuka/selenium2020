package collectionsFromNaveenAutomationLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		//1.LinkedHashSet
		
		ArrayList<Integer> num=new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,5,5,6,7,7,8,9,10));
		
        LinkedHashSet<Integer> duplicateNum=new LinkedHashSet<Integer>(num);
        
        ArrayList<Integer>removeDuplicates=new ArrayList<Integer>(duplicateNum);
        
        System.out.println(removeDuplicates);
        
        //2.JDK 8---With Stream
        
        ArrayList<Integer> marks=new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,5,5,6,7,7,8,9,10));
        
       List<Integer>uniqemarks= marks.stream().distinct().collect(Collectors.toList());
       System.out.println(uniqemarks);
      //my examples 
       ArrayList<Integer> marks1=new ArrayList<Integer>();
       marks1.add(100);
       marks1.add(300);
       marks1.add(100);
     List<Integer>newmarks=  marks1.stream().distinct().collect(Collectors.toList());
       
       System.out.println(newmarks);
       
       ArrayList<String> names=new ArrayList<String>();
       
       names.add("meganath");
       names.add("devanshi");
       names.add("renuka");
       names.add("devanshi");
       LinkedHashSet<String> duplicateNum1=new LinkedHashSet<String>(names);
       ArrayList<String> names1=new ArrayList<String>(duplicateNum1);
       System.out.println(names1);
	}

}
