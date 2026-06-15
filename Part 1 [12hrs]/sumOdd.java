//import java.util.*;
//public class sumOdd {
//    public static void main(String[] args)
//{
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter a no");
//    int no = sc.nextInt();
//    int sum = 0;
//    int i;
//    for(i=0; i<=no; i++)
//        if(i%2 != 0)
//        {
//            sum = sum + i;
//        }
//    System.out.println(sum);
//}
//}
//
//

import java.util.Scanner;
public class sumOdd
{
    public static int getNum()
{

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    return sc.nextInt();
}

public static void add(int no)

{
    int sum = 0;
    int i = 0;
for ( i=1;i<=no;i++)
    if(i % 2!= 0)
    {

       sum += i;

    }
System.out.println(sum);
}

    public static void main(String[] args) {
        add(getNum());

    }

}