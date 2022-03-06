public class Test05 {
    public static void main(String[] args) {
        // introduceOneself ();
        // email("登録完了のお知らせ","knaknda@gmail.com","ああああ");
        double Triangle = calcTriangleArea(10.0, 5.0);
        System.out.println(Triangle);
        double circle = calcCircleArea(5.0);
        System.out.println(circle);
    }

    public static void introduceOneself () {
        String name = "よっちゃん";
        int age = 19;
        double height = 170.4;
        char junishi = '兎';
        System.out.println(name + age + height + height + junishi);
    }

    public static void email(String title, String address, String text) {
        System.out.println( address + "に、以下のメールを送信しました。");
        System.out.println( "件名:" +  title);
        System.out.println( "本文:" + text);
    }

    public static double calcTriangleArea(double bottom, double height) {
        double resultTriangle = bottom * height / 2;
        return resultTriangle;
    }

    public static double calcCircleArea(double radius) {
        double resultCircleArea = Math.pow(radius,2) * 3.14;
        return resultCircleArea;
    }
}
