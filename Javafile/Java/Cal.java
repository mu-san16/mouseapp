public class Cal {
    public static int add(int num1, int num2){
        return(num1 + num2);
    }
    public static int pull(int num1, int num2){
        return(num1 - num2);
    }
    public static int multiply(int num1, int num2){
        return(num1 * num2);
    }
    public static int divide(int num1, int num2){
        if(num2 == 0){
            System.out.println("Error");
            return 0;
        }
        else{
            return(num1 / num2);
        }
    }
}
