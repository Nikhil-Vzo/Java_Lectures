import java.util.*;
class if_else
{
    public static void main(String []args)
    {
        Scanner nikhil=new Scanner(System.in);
        System.out.println("enter age");
        int a=nikhil.nextInt();
        if(a>=18)
        {
            System.out.println("YOU CAN VOTE");
        }
        else
        {
            System.out.println("YOU CANNOT VOTE");
        }
    }
}