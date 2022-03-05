public class Test02 {
    public static void main(String[] args) {
        // int x = 5;
        // int y = 10;
        // // int xy = 5 + 10;
        // // String ans = "x+yは" + xy;
        // String ans = "x+yは" + (x + y); //丸括弧で囲むことで優先順位を引き上げることができる
        // System.out.println(ans);

        System.out.println("ようこそ占いの館へ");
	    System.out.println("あなたの名前を入力してください");
	    String name = new java.util.Scanner (System.in).nextLine();
	    System.out.println("あなたの年齢を入力してください");
	    String ageString = new java.util.Scanner (System.in).nextLine();
	    int age = Integer.parseInt(ageString); //文字列を数値に変換する命令
	    int fortune = new java.util.Random().nextInt(3);
	    fortune++;
	    System.out.println("占い結果が出ました！");
	    System.out.println( age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
	    switch (fortune) {
	       case 1:
                System.out.println("大吉");
                break;
           case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            case 4:
                System.out.println("凶");
	    }
	}
}
