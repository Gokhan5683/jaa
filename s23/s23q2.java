import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
class CurrencyConverter {
    // Conversion rates
    private static final double USD_TO_SGD = 1.41;
    private static final double USD_TO_EUR = 0.92;
    private static final double SGD_TO_EUR = 0.65;

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Labels and Text Fields
        JLabel labelSgd = new JLabel("Singapore Dollars");
        labelSgd.setBounds(20, 20, 120, 20);
        frame.add(labelSgd);

        JTextField textSgd = new JTextField();
        textSgd.setBounds(150, 20, 100, 20);
        frame.add(textSgd);

        JLabel labelUsd = new JLabel("US Dollars");
        labelUsd.setBounds(20, 60, 120, 20);
        frame.add(labelUsd);

        JTextField textUsd = new JTextField();
        textUsd.setBounds(150, 60, 100, 20);
        textUsd.setEditable(false);
        frame.add(textUsd);

        JLabel labelEur = new JLabel("Euros");
        labelEur.setBounds(20, 100, 120, 20);
        frame.add(labelEur);

        JTextField textEur = new JTextField();
        textEur.setBounds(150, 100, 100, 20);
        textEur.setEditable(false);
        frame.add(textEur);

        // Button for conversion
        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(100, 140, 100, 30);
        frame.add(convertButton);

        // Action Listener for the Convert button
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the input from the user
                    double sgdAmount = Double.parseDouble(textSgd.getText());

                    // Convert the amount to USD and EUR
                    double usdAmount = sgdAmount / USD_TO_SGD;
                    double eurAmount = sgdAmount * SGD_TO_EUR;

                    // Format to 2 decimal places
                    DecimalFormat df = new DecimalFormat("#.00");

                    // Display the converted values
                    textUsd.setText(df.format(usdAmount));
                    textEur.setText(df.format(eurAmount));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
