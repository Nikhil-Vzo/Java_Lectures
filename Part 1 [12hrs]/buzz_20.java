import java.util.*;
class Nikhil_buzz
{
    public static void main(String []args)
    {
        Scanner nikhil=new Scanner(System.in);
                System.out.println("ENter the no");
        int a=nikhil.nextInt();
        int b=a%10;
        if(a %7== 0)
        {
            System.out.println("The no is a buzz no");
        }
        else if(b==7)
        {
            System.out.println("The no is a buzz no");
        }
        else
        {
            System.out.println("The no is not a buzz no");
        }
    }
}