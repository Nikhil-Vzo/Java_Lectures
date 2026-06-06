import java.util.*;
public class Multi_table_for_a_given_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication");
        int no = sc.nextInt();
        int i;
        for ( i = 1; i <= 10; i++) {
            int multi= no * i;
            System.out.println(multi);
        }
    }
}
