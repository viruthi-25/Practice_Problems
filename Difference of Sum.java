import java.io.*;
import java.util.*;
public class DifferenceofSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int []a=new int[m];
		int sum=0,sum1=0;
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			if(a[i]%n==0)
			{
				sum=sum+a[i];
			}
			else
			{
				sum1=sum1+a[i];
			}
		}
	}
}
