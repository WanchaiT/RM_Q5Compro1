import java.util.*;
public class ChessMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] table = new int[row][col];

        for (int i = 0;i < row ;i++ ) {
            for (int j = 0;j < col ;j++ ) {
                table[i][j] = scan.nextInt();
            }
        }

        int change = scan.nextInt();

        for (int i = 0;i < row ;i++ ) {
            for (int j = 0;j < col ;j++ ) {
                if (j % 2 == (i+1)%2) {
                    System.out.print(table[i][j] + change);
                }else{
                    System.out.print(table[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
