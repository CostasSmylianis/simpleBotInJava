import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        if (num < 1) {
            return;
        }
        do {
            System.out.println(i * i);
            i++;
        } while (i * i <= num);
    }
}