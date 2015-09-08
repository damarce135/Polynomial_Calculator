package ac.cr.tec;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

/**
 * Created by fabian on 06/09/15.
 */
public class MainScreen {
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
    private int nine;
    String[] tokens;
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
        DclearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screenField.setText("");
            }
        });
        clearcancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screenField.setText("");
            }
        });

        plusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screen=screenField.getText();
                tokens = screen.split(("|"));
                System.out.println(tokens[0]);
                screenField.setText("");
            }
        });
        minusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screen=screenField.getText();
                tokens = screen.split("\n");
                System.out.println(screen);
                screenField.setText("");
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screen=screenField.getText();
                tokens = screen.split("\n");
                System.out.println(tokens[0]);
                screenField.setText("");
            }
        });
        equalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                screenField.setText("The result is: ");
            }
        });
    }

}
