import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first == second || first == third || second == third) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}