import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter female age: ");
        int f = sc.nextInt();
        if (f >= 1 && f <= 58) {
            System.out.println("Interest: 8.2%");
        } else if (f >= 59 && f <= 100) {
            System.out.println("Interest: 9.2%");
        } else {
            System.out.println("Enter valid number");
        }

        System.out.print("Enter male age: ");
        int m = sc.nextInt();
        if (m >= 1 && m <= 58) {
            System.out.println("Interest: 8.4%");
        } else if (m >= 59 && m <= 100) {
            System.out.println("Interest: 10.5%");
        } else {
            System.out.println("Enter valid number");
        }

        sc.close();
    }
}
