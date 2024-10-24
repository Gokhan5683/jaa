import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class STConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temp Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JTextField inputField = new JTextField(10);
        JLabel resultLabel = new JLabel("Result: ");
        JButton toFahrenheit = new JButton("To °F");
        JButton toCelsius = new JButton("To °C");

        toFahrenheit.addActionListener(e -> convertTemperature(inputField.getText(), true, resultLabel));
        toCelsius.addActionListener(e -> convertTemperature(inputField.getText(), false, resultLabel));

        JPanel panel = new JPanel();
        panel.add(inputField);
        panel.add(toFahrenheit);
        panel.add(toCelsius);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void convertTemperature(String input, boolean isToFahrenheit, JLabel resultLabel) {
        try {
            double temp = Double.parseDouble(input);
            double converted = isToFahrenheit ? (temp * 9/5) + 32 : (temp - 32) * 5/9;
            String unit = isToFahrenheit ? "°F" : "°C";
            resultLabel.setText("Result: " + String.format("%.1f", converted) + " " + unit);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Enter a number.");
        }
    }
}
