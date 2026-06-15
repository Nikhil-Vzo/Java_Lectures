//import java.util.*;
//public class MultiplicationTable
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number for multiplication");
//        int no = sc.nextInt();
//        int i;
//        for ( i = 1; i <= 10; i++) {
//            int multi= no * i;
//            System.out.println(multi);
//        }
//    }
//}

import java.util.
        *;
public class MultiplicationTable
{


    public static int getNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no for multiplication");
        return sc.nextInt();
    }

public static void printTable(int no)
    {
        for(int i =1;i<=10;i++)
            System.out.println(no+"*"+i+"="+(no*i)  );
    }


public static void main(String[] args)
{
    printTable(getNum());
}
}
