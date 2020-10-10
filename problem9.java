/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

package project_euler;

public class problem9 {
	public static void main(String[] args) 
	{
	   int a,b,c=0;
           int s=1000;
           for(a=0;a<s/3;a++)
            {
        	   for(b=a+1;b<s/2;b++)
        	   {
        		   c=s-a-b;
        		   if(a*a+b*b==c*c)
        		   {
        			   System.out.println(a*b*c);
        		   }
        	   }
           }
	}
}
/*output
31875000
*/
