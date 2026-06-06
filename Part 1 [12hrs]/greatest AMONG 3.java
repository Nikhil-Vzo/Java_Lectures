import java.util.*;
class greatest_AMONG_3
{
    public static void main(String []args)
    {
        Scanner nikhil=new Scanner(System.in);
        System.out.println("Enter he 3 nos.");
        int a=nikhil.nextInt();
        int b=nikhil.nextInt();
        int c=nikhil.nextInt();
        if (a>b && a>c) {
            System.out.println("A IS GREATEST");
        }
                else if(b>a && b>c) {
                System.out.println("B IS GREATEST");
            }
                else {
                    System.out.println("C is GREATEST\t "+ c);
            }
            }
            }

