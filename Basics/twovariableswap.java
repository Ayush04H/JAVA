import java.util.Scanner;
public class twovariableswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String a = sc.nextLine();

        System.out.println("Enter the Second String");
        String b = sc.nextLine();

        System.out.println("UnSwapped Variables");
        System.out.println("A : " + a);
        System.out.println("B : " + b);


        String temp = b;
        b = a;
        a = temp;

        System.out.println("Swapped Variables");
        System.out.println("A : " + a);
        System.out.println("B : " + b);

    }
}
