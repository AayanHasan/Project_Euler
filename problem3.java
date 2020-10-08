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
