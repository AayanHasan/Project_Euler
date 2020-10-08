/*The sum of the squares of the first ten natural numbers is,
		(1^2)+(2^2)+....+(10^2)=385
The square of the sum of the first ten natural numbers is,
		(1+2+....+10)^2=3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
		3025-385=2640
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
package project_euler;

public class problem6 {

	public static void main(String[] args) 
	{
		
		int s1 = 0, s2=0;
                s1=(100*101*201)/6;
                s2=(100*101)/2;
                 System.out.println((s2*s2)-s1);
	}

}
