/*if we list all the natural numbers below 10 that are multiple of 3 or 5, we get 3,5,6 and 9. The sum of these multiples is 23.
find the sum of all the multiples of 3 or 5 below 1000. */
package project_euler;

public class problem1 {
	public static void main(String[] args)
	{
		int i;
		double s=0;
		for(i=0;i<1000;i++)
		{
			if(i%3==0||i%5==0)
				s=s+i;
		}
		System.out.println(s);
	}
}
/*output
233168.0
*/
