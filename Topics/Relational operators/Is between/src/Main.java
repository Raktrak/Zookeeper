import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hasToBeBetween = scanner.nextInt();
        int smaller = scanner.nextInt();
        int bigger = scanner.nextInt();
        boolean correct = smaller <= hasToBeBetween && bigger >= hasToBeBetween ||
                smaller >= hasToBeBetween && bigger <= hasToBeBetween;
        System.out.println(correct);
    }
}