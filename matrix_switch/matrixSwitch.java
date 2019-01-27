import java.util.Scanner;

class MatrixSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] data = new int[n][n];

        for (int i = 0;i < n ;i++ ) {
            for (int j = 0;j < n ;j++ ) {
                data[i][j] = scan.nextInt();
            }
        }

        int command = scan.nextInt();
        int tempData ;

        long start = System.currentTimeMillis();
        if (command == 1) {
            for (int i = 0;i < n ;i++ ) {
                for (int j = 0;j < n/2 ;j++ ) {
                    tempData = data[i][j];
                    data[i][j] = data[i][j+n/2];
                    data[i][j+n/2] = tempData;
                }
            }
        }else{
            for (int i = 0;i < n/2 ;i++ ) {
                for (int j = 0;j < n ;j++ ) {
                    tempData = data[i][j];
                    data[i][j] = data[i+n/2][j];
                    data[i+n/2][j] = tempData;
                }
            }
        }

        for (int i = 0;i < n ;i++ ) {
            for (int j = 0;j < n ;j++ ) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}
