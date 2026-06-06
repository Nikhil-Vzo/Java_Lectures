import java.util.Scanner;
class Mihki
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year ");
        int n = input.nextInt();
        if(n %4==0 && n%100!=0 || n%400==0)
        {
            System.out.println("The year is leap");
        }
        else
        {
            System.out.println("The year is not leap");
        }
    }
}