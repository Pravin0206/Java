import java.util.Scanner;

public class JavaInputs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Take String as Input
        String s = sc.nextLine();
        System.out.println("You entered" + " " + s); 

        // Take Int as Input
        int i = sc.nextInt();
        System.err.println("You entered" + " " + i);

        // Take Word as Input
        String p = sc.next();
        System.out.println("You entered" + " " + p);
    }
}
