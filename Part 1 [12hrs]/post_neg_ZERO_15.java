// wap to check whether a no. is +ve -ve or zero

import java.util.*;
class Nikhil
{
    public static void main(String []args)
    {
        Scanner nikhil=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=nikhil.nextInt();
        //using else if
        if(a == 0)
        {
            System.out.println("the no is ZERO ");
        }
        else if(a>0)
        {
            System.out.println("the no is positive ");
        }
        else
        {
            System.out.println("the no is negative ");
        }
        //using combination of relational and logical in nested if
        if(a != 0 && a>0)
        {
            System.out.println("the no is positive via 2nd method");
        }
        else if(a !=0 && a<0) {
            System.out.println("the no is negative via 2nd method ");
        }
        else {
            System.out.println("the no is zero via 2nd method ");
        }


    }
}