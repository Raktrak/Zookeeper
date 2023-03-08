import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;

        for (int i = 0; i < n + 1; i++) {
            String abcd = scanner.nextLine();
            if ("A".equals(abcd)) {
                a++;
            } else if (abcd.equals("B")) {
                b++;
            } else if (abcd.equals("C")) {
                c++;
            } else if (abcd.equals("D")) {
                d++;
            }

        }
        System.out.println(d + " " + c + " " + b + " " + a);

    }
}