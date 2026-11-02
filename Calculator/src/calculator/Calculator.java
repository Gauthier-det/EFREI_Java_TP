
package calculator;
import java.util.Scanner;

/**
 *
 * @author gauthyeh
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        int operateur = sc.nextInt();
        
        if(operateur < 1 || operateur > 5){
            System.out.println("t mauvai gro");
            return;
        }
        
        System.out.println("Opérande 1 :");
        int operande1 = sc.nextInt();
        
        System.out.println("Opérande 2 :");
        int operande2 = sc.nextInt();
        
        if ((operateur == 4 || operateur == 5) && operande2 == 0) {
            System.out.println("t nul");
            return;
        }
        
        int result = 0;
        
        switch (operateur) {
            case 1: result = operande1 + operande2;
                break;
            case 2: result = operande1 - operande2;
                break;
            case 3: result = operande1 * operande2;
                break;
            case 4: result = operande1 / operande2;
                break;
            case 5: result = operande1 % operande2;
                break;
        }
        
        System.out.println("t cho : " + result);
        
    }
    
}
