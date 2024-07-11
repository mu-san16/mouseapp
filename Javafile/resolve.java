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
        int a = scanner.nextInt();    //型が整数型なので、整数しか代入できない状況
        System.out.println("数値の入力してください");
        int b = scanner.nextInt();   //型が整数型なので、整数しか代入できない状況
        int tasu;
        tasu = a + b;
        int hiku;
        hiku = a - b;
        int kakeru;
        kakeru = a * b;
        Integer waru = null; // 初期化、割り算の結果を保存するためにIntegerを使用
        if (b != 0) {
            waru = a / b;
        }

        // 最大値を求める　→もう少し簡略化できそう
        int max = tasu; // 初期値として足し算の結果を設定
        if (hiku > max) {
            max = hiku;
        }
        if (kakeru > max) {
            max = kakeru;
        }
        if (waru != null && waru > max) {
            max = waru;
        }

        // 結果の表示
        System.out.println(a + "+" + b + "は" + tasu);
        System.out.println(a + "-" + b + "は" + hiku);
        System.out.println(a + "*" + b + "は" + kakeru);
        if (waru != null) {
            System.out.println(a + "/" + b + "は" + waru);
        } else {
            System.out.println(a + "/" + b + "は割り算できません");
        }
        System.out.println("最大値は" + max + "です");

        //問題4解答
        for (int i = 1; i<10; i++){
            for (int j =1; j<10; j++){
                System.out.println(i + "*" + j + "は" + i * j);
            }
        }
        
        //問題5解答
        
    }
}

//問題5 0から100までの数字の中で、3の倍数または5の倍数であるが15の倍数でない数を出力するプログラムを作成せよ。



