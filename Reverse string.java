import java.io.*;
import java.util.*;
public class NewMain {
public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        LinkedList<String> l=new LinkedList<>();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' '||str.charAt(i)=='!'||str.charAt(i)==':')
            {
                continue;
            }
            else
            {
                l.add(Character.toString(str.charAt(i)));
            }
        }
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                System.out.print(" ");
            }
            else if(str.charAt(i)=='!')
            {
                System.out.print("!");
            }
            else if(str.charAt(i)==':')
            {
                System.out.print(":");
            }
            else
            {
                System.out.print(l.get(j));
                j++;
            }
        }
        //System.out.println(l);
        
    }
    
}
