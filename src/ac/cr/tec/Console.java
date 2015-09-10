package ac.cr.tec;
import java.util.Scanner;
/**
 * Created by fabian on 09/09/15.
 */
public class Console {
    private static String input;
    private static String[] instruction;
    private static String oper1;
    private static String oper2;
    private static char sign;
    public static boolean execute=false;







    public static void  startConsole(String[] args) {
        System.out.println("Entre");
        String input = args[0]+" "+args[1]+" "+args[2];


        instruction=input.split(" [+*e-] ");
        if(instruction!= null){

            oper1=instruction[0];
            oper2=instruction[1];

            switch (input.charAt(oper1.length() + 1)) {
                case '+':
                    Addition oper= new Addition();
                    oper.Operator1(oper1);
                    oper.Operator1(oper2);
                    break;
                case '-':
                    break;
                case '*':
                    break;
                case 'e':
                    break;
                default:
            }

        }










    }
}
