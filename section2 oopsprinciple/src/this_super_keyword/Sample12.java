package this_super_keyword;

public class Sample12 extends Sample11 
{
	
		//int a=30;   //global variable from super class
		
		int a=20;     //global variable from current class
		
		public void m1()
		{
			int a=10;     //local variable
			System.out.println(a);    		 //10
			System.out.println(this.a);      //20 use to access global variable from same/current class
			System.out.println(super.a);     //30 use to access global variable from super class
		}
		
		
		public static void main(String[] args) 
		{		
			Sample12 s12=new Sample12();
			s12.m1();		
		}
		

	}

