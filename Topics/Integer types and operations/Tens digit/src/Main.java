import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tensDigit = (scanner.nextInt() % 100) / 10;
        System.out.println(tensDigit);
        // put your code here
    }
}