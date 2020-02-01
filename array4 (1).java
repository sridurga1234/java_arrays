import java.util.*;
class array4
{
	public static void main(String ar[])
	{
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter a values:  ");
		for(i=0;i<n;i++)
		a[i]=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				sum=sum+(a[i]*i);
			}
		}
		System.out.println("sum= "+sum);
	}
}