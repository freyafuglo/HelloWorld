import java.util.Scanner;

public class Lines {
    public static void main(String[] args) {
        //System.out.println(59 * 100/60);
        String firstLine = "Hello, ";
        //System.out.println(firstLine);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first name: ");
        String fname = scanner.nextLine();
        System.out.println(firstLine + fname + "!<3");
    }
}