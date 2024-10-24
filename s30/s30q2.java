import javax.swing.*;
class Division {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Division");
        JTextField num1 = new JTextField(), num2 = new JTextField(), result = new JTextField();
        JButton divide = new JButton("Divide");
        frame.setLayout(new java.awt.GridLayout(4, 2));
        frame.add(new JLabel("Number 1:"));
        frame.add(num1);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2);
        frame.add(new JLabel("Result:"));
        frame.add(result);
        frame.add(divide);
        result.setEditable(false);
        divide.addActionListener(e -> {
            try {
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                result.setText(String.valueOf(n1 / n2));
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Input");
            }
        });
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
