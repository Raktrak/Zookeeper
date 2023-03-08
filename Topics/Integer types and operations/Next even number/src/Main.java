import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int u = r % 2;
        System.out.println(r + 2 - u);
        // put your code here
    }
}