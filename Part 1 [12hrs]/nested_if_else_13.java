import java.util.*;
class nestedIFELSE
{
    public static void main(String[] args)
    {
        Scanner nikhil=new Scanner(System.in);
        System.out.println("enter you age");
        int age=nikhil.nextInt();
        System.out.println("enter you weight");
        double weight=nikhil.nextDouble();
        if(age>=18) {
            if (weight >= 50) {
                System.out.println("you can donate blood");
            } else {
                System.out.println("you cannot donate not blood");
            }
        }
            else
            {
                System.out.println("you cant donate not blood as you are a teen");
        }
        }
    }

