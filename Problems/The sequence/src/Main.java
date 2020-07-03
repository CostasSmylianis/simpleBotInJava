import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        int i = 1;
        while (count < num) {
            for (int j = 0; j < i; j++) {
                if (count < num) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            i++;

        }
    }
}