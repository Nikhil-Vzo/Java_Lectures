import java.util.*;
class factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int no = sc.nextInt();
            int res =1 ;
            int i;
            for (i=1 ;i<=no; i++ )
            {
                res *=i;
            }
            System.out.println("Factorial of "+no+" is "+res);
    }
}