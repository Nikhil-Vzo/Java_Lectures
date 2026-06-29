import java.util.Scanner;
public class Arr_SumAvg
{
    public static void main(String[] args)
    {
    Scanner sc =  new Scanner (System.in);
    int sum = 0;
        int[] num = new  int[10];
        System.out.println("Enter the  numbers");
        for (int i =0 ; i<num.length; i++)
        {
            num[i] = sc.nextInt();
            sum += num[i];
        }

        double avg =(double) sum/num.length;
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+avg);



    }

}
