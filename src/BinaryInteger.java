import java.util.Scanner;

public class BinaryInteger {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число в бинарном формате: ");
            String x = scan.nextLine();
            System.out.println("Введенное число в десятичном формате: " + Integer.parseInt(x, 2));
        }
    }