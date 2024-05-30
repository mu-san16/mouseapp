public class Main {

    public static void main(String[] args){

        int num1 = GetNum.getNumber();
        int num2 = GetNum.getNumber();

        int add = Cal.add(num1,num2);
        int pull = Cal.pull(num1, num2);
        int multiply = Cal.multiply(num1, num2);
        int divide = Cal.divide(num1, num2);

        System.out.println(add);
        System.out.println(pull);
        System.out.println(multiply);
        System.out.println(divide);

    }
}