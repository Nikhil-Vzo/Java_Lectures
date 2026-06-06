import java.util.*;
public class garding_18
{
    public static void main(String[] args) {
        Scanner nikhil=new Scanner(System.in);
        System.out.println("Enter your percentage");
        double p=nikhil.nextDouble();
        if(p>100) {
            System.out.println("sahi bata");
        }
        else if(p>95) {
            System.out.println("A+");
        }
        else if(p>90) {
            System.out.println("A");
        }
        else if(p>85) {
            System.out.println("B+");
        }
        else if(p>80) {
            System.out.println("B");
        }
        else if(p>75) {
            System.out.println("C+");
        }
        else if(p>70) {
            System.out.println("C");
        }
        else if(p>65) {
            System.out.println("D+");
        }
        else if(p>60) {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
}
