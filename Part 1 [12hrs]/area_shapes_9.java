import java.util.*;
class area
{
    public static void main(String []args)
    {
        Scanner nikhil=new Scanner(System.in);
        System.out.println("enter side");
        double side=nikhil.nextDouble();
        System.out.println("the area of a square is="+(side*side));
        System.out.println("enter length");
        int length=nikhil.nextInt();
        System.out.println("enter breadth");
        double breadth=nikhil.nextDouble();
        System.out.println("the area of a rectangle is="+(length*breadth));
        System.out.println("enter base");
        double base=nikhil.nextInt();
        System.out.println("enter height");
        double height=nikhil.nextDouble();
        System.out.println("the area of the triangle is="+(0.5*base*height));
        nikhil.close();  // Closed the Scanner
    }
        }