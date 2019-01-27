import java.util.Scanner;

class ForwardBackwardPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] data = new int[n];

        for (int i = 0;i < n ;i++ ) {
            data[i] = scan.nextInt();
        }
        int command = scan.nextInt();

        int w = 0;
        int p = 1;
        if (command < 0 ) {
            w = n-1;
            p = -1;
        }

        for (int i = 0 + w;i >= 0 && i < n;i += p ) {
            System.out.print(data[i] + command + " ");
        }
    }
}
