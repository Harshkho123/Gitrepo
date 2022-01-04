package jmv;

import java.util.Scanner;

public class Demo 
{

	static int m1(int x,int y,int z)
	{
		int u=0;
		if(x>100 && x<999 && y>100 && y<999 && z>100 && z<999)
		{
		int k=x%10;
		int l=y%10;
		int m=z%10;
	
		 u=Math.min(Math.min(Math.min(k,l),Math.min(l,m)),Math.min(m,k));
		 }
	return u;
	}
	
	static int m2(int x,int y,int z)
	{
		int u=0;
		if(x>100 && x<999 && y>100 &&y<999 && z>100 && z<999)
		{
		int k=(x/10)%10;
		int l=(y/10)%10;
		int m=(z/10)%10;
		u=Math.min(Math.min(Math.min(k,l),Math.min(l,m)),Math.min(m,k));
		}
		return u;
	}
	
	static int m3(int x,int y,int z)
	{
		int u=0;
		if(x>100 && x<999 && y>100 &&y<999 && z>100 && z<999)
		{
		int k=(x/100)%10;
		int l=(y/100)%10;
		int m=(z/100)%10;
		u=Math.min(Math.min(Math.min(k,l),Math.min(l,m)),Math.min(m,k));
		}
		return u;
	}
	
	

	public static void main(String[] args)
	{
	
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		
		int j=m1(x, y, z);
		int i=m2(x, y, z);
		int a=m3(x, y, z);
		
		int k=x%10;
		int l=y%10;
		int m=z%10;
	
		int p=Math.max(Math.max(Math.max(k,l),Math.max(l,m)),Math.max(m,k));
		int n=(x/10)%10;
		int o=(y/10)%10;
		int q=(z/10)%10;
		
		int v=Math.max(Math.max(Math.max(n,o),Math.max(o,q)),Math.max(q,n));
		
		int d=(x/100)%10;
		int e=(y%100)%10;
		int f=(z/100)%10;
		
		int u=Math.max(Math.max(Math.max(d,e),Math.max(e,f)),Math.max(d,f));
		
		int w=Math.max(Math.max(Math.max(p,v),Math.max(v,u)),Math.max(p,u));
		
	
		System.out.print(w+""+a+""+i+""+j);
	}
}
