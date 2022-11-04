package access_specifiers1;

import access_specifiers.Sample3;

public class sample5_default
{
	
			public static void main(String[] args)
			{
				Sample3 s3=new Sample3();
				s3.name();
				System.out.println(s3.num);
				
			}

	}  // we cannot access default access specifier into diff package.


