import java.util.*;
class array5
{
	public static void main(String ar[])
	{
		int i,j=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[100];
		System.out.println("enter a values:  ");
		for(i=0;i<n;i++)
		a[i]=s.nextInt();
		System.out.println("enter b values:  ");
		for(i=0;i<n;i++)
		b[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(i%2==0)
				{
					c[j]=b[i];
					j++;
				}
				else
				{
					c[j]=a[i];
					j++;
				}
			
		}
		for(i=0;i<j;i++)
		{
			System.out.println("values: "+c[i]);	
		}
	}
}