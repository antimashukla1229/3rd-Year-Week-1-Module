import java.util.Scanner;

public class sandwhich {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        int num = 3;

        for(int i = n; i >= 1; i--) {

            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
            }

            num++;
            System.out.println();
        }
        sc.close();
    }
}