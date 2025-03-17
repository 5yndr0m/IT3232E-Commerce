import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int mid = (num / 2) + 1;

        for (int i = 1; i <= num; i++) {
            if (i < mid) {
                System.out.print((mid - i) + " ");
            }

            if (i == mid) {
                System.out.print(i + " ");
            }

            if (i > mid) {
                int out = (((num - i) + mid) + 1);
                System.out.print(out + " ");
            }
        }
        
        sc.close();
    }
}
