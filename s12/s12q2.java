import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder input;
    private String operator;
    private double firstOperand;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        display = new JTextField();
        display.setEditable(false);
        input = new StringBuilder();
        operator = "";

        add(display);
        addButton("7");
        addButton("8");
        addButton("9");
        addButton("/");

        addButton("4");
        addButton("5");
        addButton("6");
        addButton("*");

        addButton("1");
        addButton("2");
        addButton("3");
        addButton("-");

        addButton("0");
        addButton("C");
        addButton("=");
        addButton("+");

        setVisible(true);
    }

    private void addButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (Character.isDigit(command.charAt(0))) {
            input.append(command);
            display.setText(input.toString());
        } else if (command.equals("C")) {
            input.setLength(0);
            display.setText("");
            firstOperand = 0;
            operator = "";
        } else if (command.equals("=")) {
            double secondOperand = Double.parseDouble(input.toString());
            double result = calculate(firstOperand, secondOperand, operator);
            display.setText(String.valueOf(result));
            input.setLength(0);
            firstOperand = result;
        } else {
            if (input.length() > 0) {
                firstOperand = Double.parseDouble(input.toString());
                input.setLength(0);
            }
            operator = command;
        }
    }

    private double calculate(double first, double second, String operator) {
        switch (operator) {
            case "+": return first + second;
            case "-": return first - second;
            case "*": return first * second;
            case "/": return first / second;
            default: return second;
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
