import javax.swing.*;
import java.awt.event.*;

public class cal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JLabel result = new JLabel("Result:");

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        num1.setBounds(50, 30, 100, 30);
        num2.setBounds(200, 30, 100, 30);
        result.setBounds(50, 80, 200, 30);

        add.setBounds(50, 130, 50, 30);
        sub.setBounds(110, 130, 50, 30);
        mul.setBounds(170, 130, 50, 30);
        div.setBounds(230, 130, 50, 30);

        ActionListener calc = e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                double res = 0;

                if (e.getSource() == add) res = a + b;
                else if (e.getSource() == sub) res = a - b;
                else if (e.getSource() == mul) res = a * b;
                else if (e.getSource() == div) res = b != 0 ? a / b : 0;

                result.setText("Result: " + res);
            } catch (Exception ex) {
                result.setText("Invalid input!");
            }
        };

        add.addActionListener(calc);
        sub.addActionListener(calc);
        mul.addActionListener(calc);
        div.addActionListener(calc);

        frame.add(num1); frame.add(num2); frame.add(result);
        frame.add(add); frame.add(sub); frame.add(mul); frame.add(div);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
