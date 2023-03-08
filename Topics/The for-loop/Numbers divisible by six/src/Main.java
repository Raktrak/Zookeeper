import java.util.Scanner;

class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= elements - 1; i++) {
            int six = scanner.nextInt();
            if (six % 6 == 0) {
                sum += six;
            }
        }
        System.out.println(sum);
    }
}
