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



    public static void  startConsole(String[] args) {
        String input = args[0]+" "+args[1]+" "+args[2];


        instruction=input.split(" [+*e-] ");
        if(instruction!= null){

            oper1=instruction[0];
            oper2=instruction[1];

            switch (input.charAt(oper1.length() + 1)) {
                case '+':
                    Addition opera= new Addition();
                    opera.Operator1(oper1);
                    opera.Operator1(oper2);
                    break;
                case '-':
                    Subtraction opers= new Subtraction();
                    opers.Operator1(oper1);
                    opers.Operator1(oper2);
                    break;
                case '*':
                    Multiplication operm= new Multiplication();
                    operm.Operator1(oper1);
                    operm.Operator1(oper2);
                    break;
                case 'e':
                    break;
                default:
            }

        }










    }
}
