import java.util.*;


public class Occurrence
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int[] no = new int[10];
    int counter = 0;
    System.out.println("enter the numbers ");
    for(int i =0 ; i<no.length; i++)
    {
      no[i]=sc.nextInt();
    }
    System.out.println("The entered nos are"+Arrays.toString(no));
    System.out.println("Enter the numbers occurrence to search");
    int target = sc.nextInt();
    for(int j =0 ; j<no.length; j++ )
    {
       if (no[j]==target)
       {
           counter++;
       }
    }
        System.out.println("The no of occurrence of  " + target +" is "+ counter);
    }
}
