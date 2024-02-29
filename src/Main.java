import java.net.StandardSocketOptions;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int sumc(int a){
        if(a<0){
            throw new IllegalArgumentException("Invalid, Please input an non-negative integer.");
        }
        if(a==0){
            return 0;
        } else {
            return a + sumc(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println(sumc(number));
    }
}