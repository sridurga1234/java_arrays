import java.util.*;
class array2
{
	public static void main(String ar[])
	{
		int i,k=0,c=0,j;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int h[]=new int[100];
		System.out.println("enter a values:  ");
		for(i=0;i<n;i++)
		a[i]=s.nextInt();
		System.out.println("enter b values:  ");
		for(i=0;i<n;i++)
		b[i]=s.nextInt();
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			if(a[i]==b[j]){
			c=c+2;
			h[k]=a[i];
			k++;}
		System.out.println(c);
		for(i=0;i<k;i++)
		System.out.println(h[i]+","+h[i]);
	}
}