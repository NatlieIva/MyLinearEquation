import java.util.Scanner;

public class MyLinearEquation {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = readInt("a");
        int b = readInt("b");
        double x = (double) -b / a;
        System.out.println("result x = " + x);
    }

    public static int readInt(String name) {
        System.out.println("enter " + name + ":");
        return scanner.nextInt();
    }
}


