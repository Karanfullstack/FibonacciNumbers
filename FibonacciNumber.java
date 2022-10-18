import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0 ,b = 1,  c;
        for(int i = 1; i <= num; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}
