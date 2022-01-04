package jmv;
import java.util.Scanner;

class View 
{
	 static void m1(int n)
	  {
		 int sum=0,r;
		while(n>0)
		{
	        r=n%10;
			n=n/10;
			
			if(r%2==0)
			{
				sum=sum+r;
			}
		}
		System.out.println(sum);
	  }
	  public static void main(String[] args)
	  {
		   Scanner s1=new Scanner(System.in);
			int y=s1.nextInt();
		     m1(y);	
	  }
}

