
import java.util.Scanner;
public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        if (num1 == num2) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}

