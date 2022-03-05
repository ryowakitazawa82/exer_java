public class Test04 {
    public static void main(String[] args) {
        // int [] points  = new int [5];
        // double [] weights = new double [5];
        // boolean [] anywers = new boolean [5];
        // String [] names = new String [3];

        // int [] moneyList = {121902, 8302, 55100};
        // for (int i = 0; i < moneyList.length; i++) {
        //     System.out.println(moneyList[i]);
        // }

        // for (int value: moneyList) {
        //     System.out.println(value);
        // }

        int [] numbers = {3, 4, 9};
        System.out.println("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int value : numbers) {
            if (input == value) {
                System.out.println("当たり");
            }
        }
    }
}
