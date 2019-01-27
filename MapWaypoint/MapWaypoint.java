import java.util.Scanner;
class MapWaypoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int order = scan.nextInt();

        int[][] map = new int[row+1][col+1];

        for (int i = 1;i <= row ;i++ ) {
            for (int j = 1;j <= col ;j++ ) {
                map[i][j] = 0;
            }
        }
        int count = 1;

        for (int i = 0;i < order ;i++ ) {
            int rowOrder = scan.nextInt();
            int colOrder = scan.nextInt();

            map[rowOrder][colOrder] = count++;
        }

        for (int i = 1;i <= row ;i++ ) {
            for (int j = 1;j <= col ;j++ ) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
