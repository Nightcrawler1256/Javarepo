import java.sql.SQLOutput;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME");
        String name = sc.next();
        System.out.println("YOUR NAME IS "+ name);

        System.out.println("enter a number");
        int num = sc.nextInt();

        System.out.println("YOUR ENTERED NUMBER IS " + num);
    }
}
