import java.util.*;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();

        boolean isPrime = true;

        if (no <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(no); i++) {
                if (no % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}