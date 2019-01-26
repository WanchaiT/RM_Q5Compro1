import java.util.Scanner;

class arrayUpdown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sumUp = 0;
        int sumDown = 0;

        for (int i = 0;i < n ;i++ ) {
            for (int j = 0;j < n ;j++ ) {
                int num = scan.nextInt();

                if (i < j) {
                    sumUp += num;
                }else if (i > j) {
                    sumDown += num;
                }
            }
        }
        System.out.println(sumUp);
        System.out.println(sumDown);
    }
}
