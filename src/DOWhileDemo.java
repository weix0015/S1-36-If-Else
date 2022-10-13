import java.util.Scanner;

public class DOWhileDemo {
    public static void main(String[] args) {
        int number = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Type a number: ");
          number = in.nextInt();
        } while (number != 0);
    }
}
