import java.util.Scanner;

class Device {
    int index;
    int id;
    int type;
    int price;
    int stock;

    Device (int index ,int id ,int type , int price ,int stock){
        this.index = index;
        this.id = id;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }


}

class Computer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Device[] devices = new Device[n];

        for (int i = 0;i < n ;i++ ) {
            devices[i] = new Device(i ,scan.nextInt() ,scan.nextInt() ,scan.nextInt() ,scan.nextInt());
        }

        int order = scan.nextInt();

        for (int i = 0;i < order ;i++ ) {
            int[] dev = new int[3];

            for (int j = 0;j < 3 ;j++ ) {
                dev[j] = scan.nextInt();

                for (int k = 0;k < devices.length ;k++ ) {
                    if (dev[j] == devices[k].id) {
                        dev[j] = devices[k].index;
                        break;
                    }
                }
            }

            if (devices[dev[0]].type == devices[dev[1]].type || devices[dev[0]].type == devices[dev[2]].type || devices[dev[1]].type == devices[dev[2]].type) {
                System.out.println("invalid order");
                continue;
            }

            int sum = 0;
            boolean check = false;
            for (int j = 0;j < 3 ;j++ ) {
                sum += devices[dev[j]].price;
                if (devices[dev[j]].stock == 0) {
                    System.out.println("out of stock");
                    check = true;
                    break;
                }
            }

            if (!check) {
                System.out.println(sum);
                for (int j = 0;j < 3 ;j++ ) {
                    devices[dev[j]].stock--;
                }
            }
        }
    }
}
