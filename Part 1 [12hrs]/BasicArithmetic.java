import java.util.*;
class BasicArithmetic
{
    public static void main(String []args)
    {
        Scanner nikhil=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=nikhil.nextInt();
        System.out.println("enter the second number");
        int b=nikhil.nextInt();
        System.out.println("The sum is "+(a+b));
        System.out.println("The difference is "+(a-b));
        System.out.println("THe multiplication is="+(a*b));
        System.out.println("The divide is "+(a/b));
        System.out.println("The modulus is "+(a%b));
        System.out.println("the negation is"+(~b));
        nikhil.close();  // Closed the Scanner

    }
}