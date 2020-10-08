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
