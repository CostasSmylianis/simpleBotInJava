import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num2 == 0) {
            System.out.println("true");
            return;
        }
        boolean ascending1 = num1 <= num2;
        boolean ascending2 = ascending1;
        num1 = num2;
        while (true) {
            num2 = scanner.nextInt();
            if (num2 == 0) {
                break;
            }
            ascending2 = num1 <= num2;
            if (ascending1 != ascending2) {
                System.out.println("false");
                return;
            }
            ascending1 = ascending2;
            num1 = num2;

        }
        System.out.println("true");
    }
}