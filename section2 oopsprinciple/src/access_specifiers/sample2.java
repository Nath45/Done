package access_specifiers;

public class sample2     // private  access specifiers
{
    

	public static void main(String[] args) 
	{
		Sample1 s1= new Sample1();
		s1.m1();
		System.out.println(s1.num);
		
	}
}  //    we cannot access private access specifier into another class 
