import java.util.Scanner;
class math_max
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 nos");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d=Math.max(a,Math.max(b,c));
        System.out.println(d);
    }
}





