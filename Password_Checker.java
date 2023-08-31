import java.io.*;
import java.util.*;
public class Password_Checker
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int flag=0;
	if(str.length()>=4)
	{
		flag++;
		//System.out.println("Length ok!");
	}
	int j=0;
	for(int i=0;i<str.length();i++)
	{
	if(Character.isDigit(str.charAt(i)))
	{
		j++;
	}
	}
	if(j>=1)
	{
		flag++;
		//System.out.println("Numeric digit ok!");
	}
	int k=0;
	for(int i=0;i<str.length();i++)
	{
		 if(Character.isUpperCase(str.charAt(i)))
		 {
			 k++;
		 }
	}
	if(k>0)
	{
		flag++;
	//	System.out.println("Uppercase ok!");
	}
	if(str.charAt(0)!='0'&&str.charAt(0)!='1'&&str.charAt(0)!='2'&&str.charAt(0)!='3'&&str.charAt(0)!='4'&&str.charAt(0)!='5'&&str.charAt(0)!='6'&&str.charAt(0)!='7'&&str.charAt(0)!='8'&&str.charAt(0)!='9')
	{
		flag++;
		//System.out.println("First digit numeric not- ok!");
		
	}
	if(str.contains("\\") || str.contains(" "))
	{
			flag--;
	}
	else
	{
		flag++;
		//System.out.println("spl char. ok!");
	}
	if(flag==5)
	{
		System.out.println("1");
	}
	else
	{
		System.out.println("0");
	}
}
}
