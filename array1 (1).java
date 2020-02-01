import java.util.*;
class array1
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int i,j,counter,sum=0;
		System.out.println("enter n: ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter values: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for (i = 2; i <= n; i++)         
     		  { 	
      		    counter=0; 	  
        		  for(j=i; j>=1; j--)
	  		{
          		   if(i%j==0)
	  		   {
 			counter = counter + 1;
	  		   }
	  		}
	  	if (counter ==2)
		  {
			sum=sum+a[i];
	 	 }	
		}
	System.out.println("sum="+sum);
}
}