import java.util.Scanner;

public class EnterCanh extends Exception {
    public static void Enter() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap c: ");
        int c = scanner.nextInt();
        if (a > b + c || b > a + c || c > b + a) throw new IllegalTriangleException();
    }

}

