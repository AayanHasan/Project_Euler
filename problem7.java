package project_euler;

public class problem7 {
	

	public static void main(String[] args) 
	{
         int i, n=1, c=0, prime=0;
	     while(prime!=10001)
	     {
	    	 for(i=3;i<=Math.sqrt(n);i+=2)
	    	 {
	    		 if(n%i==0)
	    		 {
	    			 c++;
	    			 break;
	    		 }
	    	 }
	    	 if(c==0)
	    		 prime++;
	    		 if(prime==10001)
	    		 {
	    			 System.out.println(n);
	    		 }
	    			 c=0;
	    			 n+=2;
	     }
	}
}
