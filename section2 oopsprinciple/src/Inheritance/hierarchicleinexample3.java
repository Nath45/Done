package Inheritance;

public class hierarchicleinexample3 
{
	public static void main(String[]args) 
		{
			System.out.println("--Features of Son1--");
			son1 s1=new son1();
			s1.mobile();
			s1.car();
			s1.money();
			s1.home();
			
			System.out.println("--Features of Son2--");
			son2 s2=new son2();
			s2.laptop();
			s2.car();
			s2.money();
			s2.home();
					
			System.out.println("--Features of Son3--");
			son3 s3=new son3();
			s3.bike();
			s3.car();
			s3.money();
			s3.home();
			
			
		}

	}


