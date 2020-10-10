/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
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
/*output
232792560
*/
