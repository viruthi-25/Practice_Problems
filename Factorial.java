
package fact;
import java.util.*;

public class Fact {
public int fact(int n)
{
    if(n==1)
    {
        return 0;
        
    }
    else
    {
        return (n*fact(n-1));
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fact f=new Fact();
        int fac=f.fact(n);
        if(fac%10==0)
        {
       int fa=fac/10;
       
      System.out.println(fa%=10);
    }
        else
        {
            System.out.println(fac%10);
        }
    
}
}
