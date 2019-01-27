import java.util.Scanner;
import java.util.ArrayList;

class MostFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> dataLists = new ArrayList<Integer>();
        ArrayList<Integer> countLists = new ArrayList<Integer>();
        int countHave = 0;
        int countAll = 0;
        int num ;

        while ((num = scan.nextInt()) > 0) {
            if (dataLists.indexOf(num) == -1) {
                dataLists.add(num);
                countLists.add(1);
                countHave++;
            }else {
                int x = countLists.get(dataLists.indexOf(num));
                countLists.set(dataLists.indexOf(num) ,++x);
            }
            countAll++;
        }

        System.out.println(countAll);

        int max = 0;
        for (int data: dataLists ) {
            if (countLists.get(dataLists.indexOf(data)) > max) {
                max = countLists.get(dataLists.indexOf(data));
            }
        }

        for (int data: dataLists ) {
            if (countLists.get(dataLists.indexOf(data)) == max) {
                System.out.print(data + " ");
            }
        }
    }
}
