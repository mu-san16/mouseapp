public class study {
    public static void main(String args[]) {    //Javaプログラムを実行するために必要な形式的なもの
         
         System.out.println("Hello world");    //文字を出力するための方法
         System.out.println("よろしくお願いします");  //同じ部分にまとめてもいいが改行ができないので注意 ("Hello world" + "よろしくお願いします")
         System.out.println(5-12);

         int year;    //変数宣言(型　変数名)　　int:整数 double:少数 String:文字　型はしっかり選んだ方がメモリの消費量を減らせる
         year = 2024;
         System.out.println(year);

         // 算術演算 (+, -, *, /, %)
         int next_year;
         next_year = year * 2;
         System.out.println(next_year);

         // 代入演算子
         int day;
         day = 1;
         day += 1;
         System.out.println(day);

         // 命令実行文　(種類はたくさんある)
         // System.out.println();, System.out.print();
         // int m = Math.max(a, b), int m = Math.min(a, b) aとbで大きい方(小さい方)を比較する
         // String input = new java.util.Scanner(System.in).nextLine();, int input = new java.util.Scanner(System.in).nextLine(); キーボードで1行の文字列の入力を受け付ける
         System.out.println("あなたの名前は？");
         String input = new java.util.Scanner(System.in).nextLine();
         System.out.println("私の名前は" + input + "です");        
    }
}

