import java.util.Scanner;

public class Problem3 {
    public static String generateSeries(int a) {
        if (a <= 0) return "";
        int effective = (a % 2 == 0) ? (a - 1) : a;
        int max = 2 * effective - 1;
        StringBuilder sb = new StringBuilder();
        for (int num = 1; num <= max; num += 2) {
            if (sb.length() > 0) sb.append(", ");
            sb.append(num);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        sc.close();
        String output = generateSeries(a);
        if (output.isEmpty()) {
            System.out.println("No output for input <= 0");
        } else {
            System.out.println(output);
        }
    }
}
