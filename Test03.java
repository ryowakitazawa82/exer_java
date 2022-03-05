public class Test03 {
    public static void main(String[] args) {
    //     weight == 60;
	//     (age1 + age2) * 2 > 60;
	//     age % 2 == 1;
	//    name.equals("湊")；// 間違いやすい例 String name = "湊";

    // int isHungry = 1;
    // String food = "マカロン";
    // System.out.println("こんにちは");
    // switch (isHungry) {
    //     case 0:
    //         System.out.println("お腹いっぱいです");
    //         break;
    //     case 1:
    //         System.out.println("腹ペコです");
    //         System.out.println( food + "をいただきます");
    // }
    // System.out.println( "ご馳走様でした");


    // boolean tenki = false;
    // if (tenki == true) {
    //     System.out.println( "洗濯をしに行きます");
    //     System.out.println( "散歩に行きます");
    // } else {
    //     System.out.println( "DVDを見ます");
    //     System.out.println( "寝ます");
    // }

        // System.out.println( "１:検索 2:登録 3:削除 4:変更");
        // int selected = new java.util.Scanner (System.in).nextInt();
        // switch(selected) {
        //     case 1:
        //         System.out.println( "検索します");
        //         break;
        //     case 2:
        //         System.out.println( "登録します");
        //         break;
        //     case 3:
        //         System.out.println( "削除します");
        //         break;
        //     case 4:
        //         System.out.println( "変更します");
        //         break;
        // }

        System.out.println("【数当てゲーム】");
	    int ans = new java.util.Random().nextInt(9);
	    for (int i = 1; i < 5; i++) {
	        System.out.println("0~9の数字を入力してください");
	        int num = new java.util.Scanner (System.in).nextInt();
	        if (num == ans) {
	            System.out.println("当たり！");
	            break;
	        } else {
	            System.out.println("違います");
	        }
	    }
	    System.out.println("ゲームを終了します");
    }
}
