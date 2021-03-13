package collectionsFromNaveenAutomationLabs;

import java.util.ArrayList;

public class VirtualCapacityArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//internally Vertual capacity of storage list is 10..vc=10;
		//physical capacity now is pc=0;
		ArrayList<Object> ar= new ArrayList<Object>(10);//vc =10;we can store 20 also...
		
		System.out.println(ar.size());//pc=0;vc=0to9 means 10
		
		ar.add(100);//0 pc=1 vc=9
		System.out.println(ar.size());//pc=1;
		 ar.add(299);//1 pc=2,vc=8
		 ar.add(300);//2 pc=3,vc=7
		 ar.add(477);//3 pc=4,vc=6//physical capacity is start increasing then virtual capacity is start dreasing...
		 System.out.println(ar.size());
		 
	}

}
