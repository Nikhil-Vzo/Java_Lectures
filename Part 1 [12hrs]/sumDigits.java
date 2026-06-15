import java.util.*;
public class sumDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter integer");
        int no=sc.nextInt();
        int sum=0;
      while(no != 0)
      {
         sum  += no%10;
        no=no/10;


      }
        System.out.print(sum);
    }

}
