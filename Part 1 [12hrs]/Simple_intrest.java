import  java.util.Scanner;
class Simple_intrest
{
    public static void main(String[] args)
    {
        Scanner nikhil=new Scanner(System.in);
        System.out.println("enter principle");
        double p=nikhil.nextDouble();
        System.out.println("enter rate");
        double rate=nikhil.nextDouble();
        System.out.println("enter time duration");
        int duration=nikhil.nextInt();
        System.out.println("the SIMPLE INTEREST WILL BE\t"+((p*rate*duration)/100));
    }
}