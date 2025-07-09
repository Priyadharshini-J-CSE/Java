import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] int_arr = new int[5];
        System.out.println("Input for Integer Array: ");
        for (int i = 0; i < 3; i++) {
            int_arr[i] = sc.nextInt();
        }

        float[] float_arr = new float[5];
        System.out.println("Input for Float Array: ");
        for (int i = 0; i < 3; i++) {
            float_arr[i] = sc.nextFloat();
        }

        sc.nextLine(); // Consume leftover newline

        char[] char_arr = new char[5];
        System.out.println("Input for Char Array (enter one char per line): ");
        for (int i = 0; i < 3; i++) {
            char_arr[i] = sc.nextLine().charAt(0);  // Fixed here
        }

        String[] string_arr = new String[5];
        System.out.println("Input for String Array: ");
        for (int i = 0; i < 3; i++) {
            string_arr[i] = sc.nextLine();
        }

        // Display
        System.out.print("Integer array values: ");
        for (int i : int_arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Float array values: ");
        for (float f : float_arr) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.print("Char array values: ");
        for (char c : char_arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("String array values: ");
        for (String s : string_arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
