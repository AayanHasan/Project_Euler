package project_euler;

public class problem4 {
	
	public static void main(String[] args) 
	{
	 int i,s,q,j,p=0,max=0;
	 for(i=999;i>100;i--)
	 {
		 for(j=i-1;j>100;j--)
		 {
			 s=i*j;
			 q=s;
			 while(s>0)
			 {
				 p=p*10+(s%10);
				 s/=10;
			 }
			 if(p==q&&q>max)
			 {
				max=q; 
				 
			 }
			 p=0;
		 }
	 }
      System.out.println(max);
	}

}
