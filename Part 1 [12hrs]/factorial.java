import java.util.*;
public class factorial
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the no to find its factorial ");
    int no = sc.nextInt();
    int i;
    int res =1 ;
    for (i=no;i>=1;i--)
    {
       res =res*i;

    }
        System.out.println(res);
    }

}
