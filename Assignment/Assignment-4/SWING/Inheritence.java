package swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
class InheritanceDesign extends JFrame{
    public static InheritanceDesign frame = new InheritanceDesign();
    public static JLabel num1 = new JLabel();
    public static JTextField num1Text = new JTextField();
    public static JLabel num2 = new JLabel();
    public static JTextField num2Text = new JTextField();
    public static JLabel result = new JLabel();
    public static JTextField resultText = new JTextField();
    public static JButton addition = new JButton("Addition");
    public static JButton subtract = new JButton("Subtract");
    public static JButton multiply = new JButton("Multiply");
    public static JButton divide = new JButton("Divide");
    public static void main(String[] args) {
        num1.setText("Number 1:");
        num1.setBounds(10,50,80,25);
        num1Text.setBounds(100,50,165,25);
        frame.add(num1);
        frame.add(num1Text);
        num2.setText("Number 2:");
        num2.setBounds(10,100,80,25);
        num2Text.setBounds(100,100,165,25);
        frame.add(num2);
        frame.add(num2Text);
        result.setText("Result:");
        result.setBounds(10,150,80,25);
        resultText.setBounds(100,150,165,25);
        frame.add(result);
        frame.add(resultText);
        addition.setBorder(null);
        addition.setBounds(10,200,50,45);
        frame.add(addition);
        subtract.setBorder(null);
        subtract.setBounds(80,200,50,45);
        frame.add(subtract);
        multiply.setBorder(null);
        multiply.setBounds(150,200,50,45);
        frame.add(multiply);
        divide.setBorder(null);
        divide.setBounds(220,200,50,45);
        frame.add(divide);
        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}