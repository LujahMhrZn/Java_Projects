import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuiForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        
        JLabel label = new JLabel("Name");
        label.setBounds(20,20,80,25);
        panel.add(label);

        JTextField nameField = new JTextField();
        nameField.setBounds(100,20,200,25);
        frame.add(nameField);
        frame.add(panel);
    }
}
