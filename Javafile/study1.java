public class study1{
    public static void main(String[] args) {
        hello("佐藤");
        hello("花子");

        int x = 10;
        int y = 15;

        int sum = add(x,y);
        System.out.println(sum);

    }

    public static void hello(String name){
        System.out.println("Hello World");
        System.out.println("こんにちは" + name + "さん");  //nameの部分だけ考えればよい
    }

    public static int add(int x, int y){
        
        int sum = x + y;
        return sum;
    }
}