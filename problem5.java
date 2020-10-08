package project_euler;

public class problem5 {

	static int gcd(int a,int b)
	{
		if(a==0)
		{
		return b;
	    }
		return gcd(b%a,a);
	}
	
	public static void main(String args[])
	{
	int result=1;
	for(int i=1;i<20;i++)
	{
		result=(result*i)/gcd(result,i);
	}
	System.out.println(result);
	}

}
