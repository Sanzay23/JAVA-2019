package awt.AssociationCalculators;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class CalculatorOutsideClass {
    public Frame frame = new Frame("Calculator");
    public Label num1 = new Label();
    public TextField num1Text = new TextField();
    public Label num2 = new Label();
    public TextField num2Text = new TextField();
    public Label result = new Label();
    public TextField resultText = new TextField();
    public Button addition = new Button("ADD");
    public Button subtract = new Button("Subtract");
    public Button multiply = new Button("Multiply");
    public Button divide = new Button("Divide");
    CalculatorOutsideClass()
    {
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
        addition.setBounds(10,200,50,35);
        frame.add(addition);
        subtract.setBounds(80,200,50,35);
        frame.add(subtract);
        multiply.setBounds(150,200,50,35);
        frame.add(multiply);
        divide.setBounds(220,200,50,35);
        frame.add(divide);
        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);
        multiply.addActionListener(new OutsideClass(this));
        divide.addActionListener(new OutsideClass(this));
        addition.addActionListener(new OutsideClass(this));
        subtract.addActionListener(new OutsideClass(this));
        
    }
    
    public static void main(String[] args) {
        new CalculatorOutsideClass();
    }
}
class OutsideClass  implements ActionListener
{
    CalculatorOutsideClass obj;
    public OutsideClass(CalculatorOutsideClass obj)
    {
        this.obj = obj;

    }
    @Override
    public void actionPerformed(ActionEvent event) {
    
        double number1 = Double.parseDouble(obj.num1Text.getText());
        double number2 = Double.parseDouble(obj.num2Text.getText());
        try {
            if(event.getSource()==obj.addition)
            {
            obj.resultText.setText(String.valueOf(number1+number2));
            }
            if(event.getSource()==obj.subtract)
            {
            obj.resultText.setText(String.valueOf(number1-number2));
            }
            if(event.getSource()==obj.multiply)
            {
            obj.resultText.setText(String.valueOf(number1*number2));
            }
            if(event.getSource()==obj.divide)
            {
            obj.resultText.setText(String.valueOf(number1/number2));
            }
            
        }
        catch (Exception e) {
            obj.resultText.setText("Invalid"+" "+e.getMessage());
        }
        
    }
}