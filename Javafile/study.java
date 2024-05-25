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

         //制御構造(順次、分岐、繰り返し)
         //分岐　(if)
         int age;

         age = 19;

         if(age >= 21){
            System.out.println("大人");
         }
         else if (18 < age &  age < 20){
            System.out.println("大学生");
         }
         else{
            System.out.println("未成年");
         }
         
         //繰り返し文 (while, for)

         int num = 0;

         while(num < 20){
            System.out.println(num);

            num++;
         }

         for(int i = 0; i<20; i++){
            System.out.println(num);
            num++;
         }

         //変数の限界→変数が多くなると準備が大変となる→そこで使うのが配列
         //配列　同一種類の複数のデータを並び順に格納するデータ構造・配列は0からスタートするので注意
         //例
         // int Jap = 95
         // int math = 85
         // int English = 70
         //この場合は変数が3つ必要となる。これを1つにしたのが配列
         int [] score = new int[3];
         int [] score1 = {95, 85, 70};  //書き方はこの2種類

         score[0] = 95;
         score[1] = 85;
         score[2] = 70;

         System.out.println(score1[1]);

         int sum = 0;
         int average = 0;

         for(int i = 0; i< score.length; i++){
            sum = sum + score[i];
         }

         average = sum / score.length;
         System.out.println(sum);
         System.out.println(average);

         //多次元配列
         int [][] scores = new int[2][5];

         scores[0][0] = 98;
         scores[0][1] = 97;
         scores[0][2] = 96;
         scores[0][3] = 95;
         scores[0][4] = 94;

         scores[1][0] = 93;
         scores[1][1] = 92;
         scores[1][2] = 91;
         scores[1][3] = 90;
         scores[1][4] = 89;

         System.out.println(scores[0][4]);
    }
}

