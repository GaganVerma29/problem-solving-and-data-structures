// Print Odd Numbers Less Than 100
public class Problem002 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
