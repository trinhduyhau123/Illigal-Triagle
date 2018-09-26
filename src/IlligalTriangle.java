import java.util.Scanner;

public class IlligalTriangle {
    public static void main(String[] args) throws Exception {

        try {
            EnterCanh.Enter();
            System.out.println("Hop le");
        } catch (IllegalTriangleException e) {
            System.err.println("Loi");
        }
    }


}
