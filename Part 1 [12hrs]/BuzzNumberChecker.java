import java.util.*;
class BuzzNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a no");
        int a = input.nextInt();
        {
            System.out.println(a % 7 == 0 || a % 10 == 7 ? "buzz" : "not buz");
        }
    }
}
