import java.util.Scanner;
import java.util.ArrayList;

class CountFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> dataLists = new ArrayList<Integer>();
        ArrayList<Integer> countLists = new ArrayList<Integer>();

        int n = scan.nextInt();
        int countHave = 0;

        for (int i = 0;i < n ;i++ ) {
            int numInput = scan.nextInt();

            if (dataLists.indexOf(numInput) == -1) {
                dataLists.add(numInput);
                countLists.add(1);
                countHave++;
            }else {
                int x = countLists.get(dataLists.indexOf(numInput));
                countLists.set(dataLists.indexOf(numInput) ,++x);
            }
        }

        System.out.println(countHave);

        for (int i = 0;i < countHave ;i++ ) {
            System.out.println(dataLists.get(i) + " " + countLists.get(i));
        }

    }
}
