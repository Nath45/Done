package access_specifiers;

public class Sample21
{
	
   //3. example of protected access specifier
		
		protected int num;
		
		protected Sample21()
		{
			num = 10;
		}	
		
		protected void m1()
		{
			System.out.println(num);
		}
		
		public static void main(String[] args)
	{
		Sample21 s21=new Sample21();
		s21.m1();
		System.out.println(s21.num);
		
			
		}

}
	
