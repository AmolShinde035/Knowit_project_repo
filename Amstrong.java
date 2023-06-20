//Java code to find Armstrong number


public class Amstrong
{
	public static void main(String[] args)
	{
		int n=371,m,o,p=0,r;
		int temp=n;
 		while(n>0)
		{
			m=n%10;
			o=m*m*m;
                  p+=o;
                  n/=10;
			
		}
        if (p == temp)
		System.out.println(temp+" is armstrong:"+p);
	   else 
		System.out.println(temp+" is not armstrong:"+p);
	}
}