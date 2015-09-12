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
    public static String[] entry1;
    public static String[] entry2;
    public static final String REGEX_NUMBER = "(-\\d+|\\d+)\\ (-\\d+|\\d+)\\ (-\\d+|\\d+)(\\ \\|\\ (-\\d+|\\d+)\\ (-\\d+|\\d+)\\ (-\\d+|\\d+))*\\ (([+*-]\\ (-\\d+|\\d+)\\ (-\\d+|\\d+)\\ (-\\d+|\\d+)(\\ \\|\\ (-\\d+|\\d+)\\ (-\\d+|\\d+)\\ (-\\d+|\\d+))*)|([e]\\ (-\\d+|\\d+)\\ (-\\d+|\\d+)))";


    public static void startConsole(String[] args) {
        String input = args[0] + " " + args[1] + " " + args[2];

        if (input.matches(REGEX_NUMBER)) { // Verifies the entry is valid.
            instruction = input.split(" [+*e-] ");
            if (instruction != null) {

                oper1 = instruction[0];
                oper2 = instruction[1];

                switch (input.charAt(oper1.length() + 1)) {
                    case '+': // If the sign is plus calls the addition class and returns the result.
                        Addition opera = new Addition();
                        entry1 = opera.Operator1(oper1);
                        entry2 = opera.Operator1(oper2);
                        String answeradd = opera.resultAdd(entry1, entry2);
                        System.out.println("The result is: " + answeradd);
                        break;
                    case '-':// If the sign is minus calls the subtraction class and returns the result.
                        Subtraction opers = new Subtraction();
                        entry1 = opers.Operator1(oper1);
                        entry2 = opers.Operator1(oper2);
                        String answersub = opers.resultSub(entry1, entry2);
                        System.out.println("The result is: " + answersub);
                        break;
                    case '*':// If the sign is times calls the multiplication class and returns the result.
                        Multiplication operm = new Multiplication();
                        entry1 =operm.Operator1(oper1);
                        entry2= operm.Operator1(oper2);
                        String answermult = (operm.resultMult(entry1, entry2)).replace(" | 0 0 0", " ");
                        System.out.println("The result is: " + answermult);
                        break;
                    case 'e': // If the sign is e calls the evaluation class and returns the result.
                        Evaluation opere = new Evaluation();
                        entry1=opere.Operator1(oper1);
                        entry2=opere.Operator2(oper2);
                        String answere = opere.resultEval(entry1, entry2);
                        System.out.println("The result is: " + answere);
                        break;
                    default:
                }

            }
        } else {
            System.out.println("Error, input not valid"); // Display an error message if the input was not valid.

        }

    }
}

