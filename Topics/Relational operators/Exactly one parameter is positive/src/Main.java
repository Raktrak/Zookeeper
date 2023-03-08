import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextInt() > 0;
        boolean b = scanner.nextInt() > 0;
        boolean c = scanner.nextInt() > 0;
        boolean oneAndOnly = a ^ b ^ c;      // correlation
        boolean tooPositive = a && b && c;   // checks if all positive
        System.out.println(oneAndOnly ^ tooPositive);

    }
}