import java.util.*;
class ConditionalStatementExample
{
    public static void main(String[] args)
    {
        Scanner nikhil=new Scanner(System.in);
        System.out.println("enter you percentage");
        double percentage=nikhil.nextDouble();
        if(percentage>=95)
        {
            System.out.println("A+");
        }
        else if(percentage>=90)
        {
            System.out.println("A");
        }
        else if(percentage>=85)
    {
        System.out.println("B+");
    }
        else
    {
        System.out.println("C");
    }

    }
}