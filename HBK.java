package jmv;

import java.util.*;

public class Test 
{
	
	static int fib(int x)
	{
		if(x==1||)
		{
			return x;
		}
		else
		{
			return fib(x-1)+fib(x-2);
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);		
	 int n=scan.nextInt();
	 
	 System.out.println(fib(n));
	 
	}
}



//5,9,6 ==56
//(y-32)5/9+


//10<=n<=99