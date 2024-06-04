//問題3 上記で計算した、四則演算の結果の中で一番大きな数を出力せよ
//問題2　標準入力として受け付けた2数の四則演算をした結果を出力するプログラムを作成してください。
//出力結果はわかりやすいものとしましょう

import java.util.Scanner;

public class resolve{
    public static void main(String args[]){
        //問題1解答
        System.out.println("私の名前は優斗です。");
        int sum;
        sum = 1;
        sum += 1;
        System.out.println("1たす1は" + sum + "です。");

        //問題2解答・問題3解答
        Scanner scanner = new Scanner(System.in);
        System.out.println("数値の入力してください");
        int a = scanner.nextInt();
        System.out.println("数値の入力してください");
        int b = scanner.nextInt();
        int tasu;
        tasu = a + b;
        int hiku;
        hiku = a - b;
        int kakeru;
        kakeru = a * b;
        int waru;
        waru = a / b;
        System.out.println(a + "+" + b + "は" + tasu);
        System.out.println(a + "+" + b + "は" + hiku);
        System.out.println(a + "+" + b + "は" + kakeru);
        System.out.println(a + "+" + b + "は" + waru);

    }
}

