import java.util.Scanner;

public class invertHD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        // Upper Part
        for(int i = n; i >= 1; i--) {

            for(int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        // Lower Part
        for(int i = 2; i <= n; i++) {

            for(int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}