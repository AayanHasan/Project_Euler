/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ? */
package project_euler;

public class problem3 {

	public static void main(String[] args)
	{
		long n=600851475143L,i;
	
		for(i=3;i<n;i++)
		{
			while(n%i==0&&i<n)
			n/=i;
		}
	System.out.println(n);
	}
}
/*output
6857
*/
