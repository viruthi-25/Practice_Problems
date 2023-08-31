import java.io.*;
import java.util.*;

public class NewMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        LinkedList<String> l=new LinkedList<>();
        LinkedList<String> l1=new LinkedList<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(')
            {
                l.add(Character.toString(str.charAt(i)));
            }    
            else if(str.charAt(i)=='}'||str.charAt(i)==']'||str.charAt(i)==')')
            {
                if(str.charAt(i)=='}')
                {
                    l1.add("{");
                }
                if(str.charAt(i)==')')
                {
                    l1.add("(");
                }
                if(str.charAt(i)==']')
                {
                    l1.add("[");
                }
                
            }
            else
                continue;
        }
        if(l.size()!=l1.size())
        {
            System.out.println("Unbalanced");
        }
        else
        {
            int j=l1.size()-1;
            int flag=0;
            for(int i=0;i<l.size();i++)
            {
                if(l.get(i).equals(l1.get(j)))
                {
                    flag=1;
                    j--;
                }
            }
            if(flag==1)
            {
                System.out.println("Balanced");
            }
            else
            {
                System.out.println("Unbalanced");
            }
        }
    }
    
}
