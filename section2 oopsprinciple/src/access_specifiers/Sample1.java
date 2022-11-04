package access_specifiers;

public class Sample1 
{
	
//1. example of private access specifiers
		
		private int num;
		
		
		private Sample1()
		{
			num = 10;
		}
		
		
		private void m1() 
		{
			System.out.println(num);
		}
		
		
		public static void main(String[] args) 
		{
			Sample1 s1=new Sample1();
			s1.m1();
			System.out.println(s1.num);
		}
		

	}
