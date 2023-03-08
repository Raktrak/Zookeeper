import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        int solution = ((data + 1) * data + 2) * data + 3;
        System.out.println(solution);
        // put your code here
    }
}