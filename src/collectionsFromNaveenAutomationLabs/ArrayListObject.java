package collectionsFromNaveenAutomationLabs;

import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args) {
	
		
		//this is called static array..we cannot store the values beyond 4..bcoz the size is fixed..
		//we cant store the values with minus...
//		int i[] =new int[4];
//		
//		i[0]=100;
//		i[1]=200;
//		i[-1]=20;//it will not store minus values...it will give array index out of bound exception
//		i[2]=100;
//		i[3]=200;
//		
//		System.out.println(i[2]);
	//To overcome this we should use Dynamic Array...
		//default generics
		//dynamic array
		ArrayList<Object> ar=new ArrayList<Object>();
		
		ar.add(100);//0
		ar.add("devanshi");//1
		ar.add(100.3);//2
		ar.add('A');//3
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println("LI ="+ 0);
		
		System.out.println("HI ="+ (ar.size()-1));
		ar.add(300);
		ar.add("renu");
		System.out.println(ar.size());
		
		
		
	}

}
