import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        int max = 1;

        do {
            value = scanner.nextInt();
            if (max < value) {
                max = value;
            }
        } while (value != 0);
        System.out.println(max);
    }
}