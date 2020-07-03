import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        double result = m;
        int years = 0;
        while (result < k) {
            result = result * (1 + (p / 100.));
            years++;
        }
        System.out.println(years);
    }
}