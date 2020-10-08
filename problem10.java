package project_euler;

public class problem10 {
	public static void main(String[] args)
	  {
		  long j,i,f=0,s=2;
		  for(i=3;i<=2000000;i+=2)
		  {
			  for(j=3;j<=Math.sqrt(i);j+=2)
			  {
				  if(i%j==0)
				  f=1;				  
			  }
			  if (f==0) 
				  s+=i;
			  f=0;
		   }
		   System.out.println(s);
	  }

}
