import java.util.Scanner;

public class conditional {

    public static void main(String args[]){
        // System.out.print("Enter your age: ");
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // Switch Statement

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;
        
            default:
                System.out.println("You have pressed invalid button.");
        }




        // Else-if Statement

        // int num = sc.nextInt();

        // if(num == 0){
        //     System.out.println("It is not even nor odd number");
        // }
        // else if(num % 2 == 0){
        //     System.out.println("It is a even number");
        // }
        // else{
        //     System.out.println("It is odd number");
        // }

        // If Else Statement

        // int age = sc.nextInt();
        
        // if(age > 19){
        //     System.out.println("You can vote!!");
        // }
        // else{
        //     System.out.println("You cannot vote...");
        // }
    }
    
}
