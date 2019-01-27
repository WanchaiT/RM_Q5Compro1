import java.util.Scanner;

class Pokemon {
    int code;
    String name;
    int[] level = new int[8];

    void setLevel(int i , int val){
        this.level[i] = val;
    }
}

class Pokevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Pokemon[] pokemon = new Pokemon[n];

        for (int i = 0;i < n ;i++ ) {
            pokemon[i] = new Pokemon();
            pokemon[i].code = scan.nextInt();
            pokemon[i].name = scan.next();

            for (int l = 0;l < 8 ;l++ ) {
                pokemon[i].level[l] = scan.nextInt();
            }
        }
        int oldN = n;
        n = scan.nextInt();

        for (int i = 0;i < n ;i++ ) {
            int code = scan.nextInt();
            int level = scan.nextInt();

            for (int j = 0;j < oldN ;j++ ) {
                if (pokemon[j].code == code) {
                    System.out.println(pokemon[j].name + " " + pokemon[j].level[level - 1]);
                }
            }
        }
    }
}
