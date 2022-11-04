package access_specifiers;

public class Sample3 
{
	
	
		//2. example of default access specifiers
		
		int num;   //default
		
		Sample3()    //default
		{
			num=10;
		}
		
		
	    void name()      //default
		{
			System.out.println(num);
		}
	    
	    
	    public static void main(String[] args)
	    {
			Sample3 s3=new Sample3();
			s3.name();
			System.out.println(s3.num);    	
	    	
		}

	}
	
