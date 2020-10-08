package project_euler;

public class problem2 {
	public static void main(String[] args) {
		int i=1,j=2,p=0,s=0;
		
		while(i<=4000000)
		{ 
			s=i+j;
			i=j;
			j=s;
	       if(i%2==0)
	    	   p=p+i;
		}
		System.out.println(p);
		
	}

}
