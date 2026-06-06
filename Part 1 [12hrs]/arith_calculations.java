import java.util.*;
class arith_calculations
{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first num");
            int a = sc.nextInt();
            System.out.println("Enter second num");
            int b = sc.nextInt();
            int add=a+b;
            int sub=a-b;
            int mul=a*b;
            int div=a/b;
            System.out.println("The sum is\t"+add);
            System.out.println("The product is\t"+mul);
            System.out.println("The difference is\t"+sub);
            System.out.println("The quotient is\t"+div);
            sc.close(); //closed scanner
        }
    }
}