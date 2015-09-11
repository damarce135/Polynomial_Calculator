package ac.cr.tec;

import org.omg.PortableServer.POAManagerPackage.AdapterInactive;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;


public class MainScreen {
    public static final String REGEX_NUMBER = "(-\\d+|\\d+)\\ (-\\d+|\\d+)\\ (-\\d+|\\d+)(\\ \\|\\ (-\\d+|\\d+)\\ (-\\d+|\\d+)\\ (-\\d+|\\d+))*";
    private JButton a0Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton blankButton;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton pipeButton;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton plusButton;
    private JButton minusButton;
    private JButton multiplicationButton;
    private JButton evaluatesButton;
    private JButton equalButton;
    private JButton negativeButton;
    private JButton clearcancelButton;
    private JButton DclearButton;
    private JTextField screenField;
    private JPanel mainPanel;
    private boolean flag=true;
    private boolean multflag= false;
    private boolean addflag=false;
    private boolean subflag=false;
    private boolean evalflag=false;
    private boolean Dcancelflag=false;
    private boolean Cclearflag=false;


    public String[] entry1;
    public String[] entry2;
    String tokens;
    String screen=screenField.getText();



    public static void start() { //This method start the GUI
        JFrame frame = new JFrame("Polynomial Calculator");
        frame.setContentPane(new MainScreen().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public MainScreen() {

        a0Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a0Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + a9Button.getText());
            }
        });
        pipeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + pipeButton.getText());
            }
        });
        negativeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + negativeButton.getText());
            }
        });
        blankButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String state = screenField.getText();
                screenField.setText(state + "\n");

            }
        });
        DclearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screenField.setText("");


            }
        });

        clearcancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                addflag = false;
                subflag = false;
                multflag = false;
                evalflag = false;
                screenField.setText("");
            }
        });

        plusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screen=screenField.getText();
                addflag=true;
                if(flag){
                    tokens = screen;
                    if(tokens.matches(REGEX_NUMBER)){
                        Addition oper= new Addition();
                        entry1 = oper.Operator1(tokens);
                        screenField.setText("");
                    }
                    else{
                        screenField.setText("Error, input not valid");
                        System.out.println("Error, input not valid");
                    }

                }

            }
        });
        minusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screen=screenField.getText();
                subflag=true;
                if(flag){
                    tokens = screen;
                    if(tokens.matches(REGEX_NUMBER)){
                        Subtraction oper= new Subtraction();
                        entry1 = oper.Operator1(tokens);
                        screenField.setText("");
                    }
                    else{
                        screenField.setText("Error, input not valid");
                        System.out.println("Error, input not valid");
                    }

                }

            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screen=screenField.getText();
                multflag=true;
                if(flag){
                    tokens = screen;
                    if(tokens.matches(REGEX_NUMBER)){
                        Multiplication oper= new Multiplication();
                        entry1 = oper.Operator1(tokens);
                        screenField.setText("");
                    }
                    else{
                        screenField.setText("Error, input not valid");
                        System.out.println("Error, input not valid");
                    }

                }

            }
        });

        evaluatesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screen = screenField.getText();
                evalflag = true;
                if(flag){
                    tokens = screen;
                    if(tokens.matches(REGEX_NUMBER)){
                        Evaluation oper= new Evaluation();
                        entry1 = oper.Operator1(tokens);
                        screenField.setText("");
                    }
                    else{
                        screenField.setText("Error, input not valid");
                        System.out.println("Error, input not valid");
                    }

                }

            }
        });



        equalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screen = screenField.getText();
                Multiplication oper = new Multiplication();
                Addition add = new Addition();
                Subtraction sub = new Subtraction();
                Evaluation eval = new Evaluation();
                if (multflag) {
                    tokens = screen;
                    entry2 = oper.Operator2(tokens);
                    String ans = (oper.resultMult(entry1, entry2)).replace(" | 0 0 0", " ");
                    screenField.setText("The result is: " + ans);

                }
                if (addflag){
                    tokens=screen;
                    entry2 = add.Operator2(tokens);
                    String answer = add.resultAdd(entry1, entry2);
                    screenField.setText("The result is: "+answer);

                }
                if (subflag){
                    tokens=screen;
                    entry2 = sub.Operator2(tokens);
                    String answer = sub.resultSub(entry1, entry2);
                    screenField.setText("The result is: "+answer);

                }
                if (evalflag){
                    tokens=screen;
                    entry2 = eval.Operator2(tokens);
                    String answer = eval.resultEval(entry1, entry2);
                    screenField.setText("The result is: "+answer);

                }
                else{
                    screenField.setText("Error, operation not selected");
                }


            }
        });



    }

}
