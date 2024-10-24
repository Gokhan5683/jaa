import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StringManipulationApp {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("String Manipulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        // Create text boxes
        JTextField textBox1 = new JTextField();
        textBox1.setBounds(30, 20, 200, 25);
        frame.add(textBox1);

        JTextField textBox2 = new JTextField();
        textBox2.setBounds(30, 50, 200, 25);
        frame.add(textBox2);

        JTextField resultBox = new JTextField();
        resultBox.setBounds(30, 110, 200, 25);
        resultBox.setEditable(false);
        frame.add(resultBox);

        // Create buttons
        JButton concatButton = new JButton("Concatenate");
        concatButton.setBounds(30, 80, 100, 25);
        frame.add(concatButton);

        JButton reverseButton = new JButton("Reverse");
        reverseButton.setBounds(140, 80, 100, 25);
        frame.add(reverseButton);

        // Action listener for concatenation
        concatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textBox1.getText();
                String text2 = textBox2.getText();
                resultBox.setText(text1 + text2);
            }
        });

        // Action listener for reversing the concatenated string
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String resultText = resultBox.getText();
                String reversedText = new StringBuilder(resultText).reverse().toString();
                resultBox.setText(reversedText);
            }
        });

        // Set the frame visibility
        frame.setVisible(true);
    }
}

//javac s17q2.java
//java StringManipulationApp


