/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
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
