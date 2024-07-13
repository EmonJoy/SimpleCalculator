import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame {
    private JTextField textField1;
    private JPanel Mainpanel;
    private JButton ACButton;
    private JButton cButton;
    private JButton button1;
    private JButton button2;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton xButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button6;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button7;
    private JButton a0Button;
    private JButton button4;
    private JButton button5;
    double first;
    double second;
    double result;
    String operation;
    String answer;

    calc(){
        setContentPane(Mainpanel);
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a7Button.getText();
                textField1.setText(number);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a8Button.getText();
                textField1.setText(number);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a9Button.getText();
                textField1.setText(number);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a4Button.getText();
                textField1.setText(number);

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a5Button.getText();
                textField1.setText(number);

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a6Button.getText();
                textField1.setText(number);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a1Button.getText();
                textField1.setText(number);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a2Button.getText();
                textField1.setText(number);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a3Button.getText();
                textField1.setText(number);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = textField1.getText()+a0Button.getText();
                textField1.setText(number);
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // need to code

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "+";
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "-";
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "*";
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "/";
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = "%";
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer;
                second = Double.parseDouble(textField1.getText());
                if(operation=="+"){
                    result = first+second;
                    answer=String.format("%.2f", result);
                    textField1.setText(answer);
                }

               else if(operation=="-"){
                    result = first-second;
                    answer=String.format("%.2f", result);
                    textField1.setText(answer);
                }
                else if(operation=="*"){
                    result = first*second;
                    answer=String.format("%.2f", result);
                    textField1.setText(answer);
                }
                else if(operation=="/"){
                    result = first/second;
                    answer=String.format("%.2f", result);
                    textField1.setText(answer);
                }

                else if(operation=="%"){
                    result = first%second;
                    answer=String.format("%.2f", result);
                    textField1.setText(answer);
                }





            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField1.getText());
                textField1.setText("");
                operation = ".";


            }
        });
    }

    public static void main(String[] args) {
        new calc();
    }
}
