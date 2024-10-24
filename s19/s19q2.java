import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SubjectSelector {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("T.Y.B.Sc. (Comp. Sci) Subjects");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        // Create the combo box with subjects
        String[] subjects = {
            "Data Structures",
            "Operating Systems",
            "Database Management Systems",
            "Software Engineering",
            "Computer Networks"
        };
        JComboBox<String> comboBox = new JComboBox<>(subjects);
        comboBox.setBounds(50, 30, 300, 30);
        
        // Create a text field to display selected subject
        JTextField textField = new JTextField();
        textField.setBounds(50, 80, 300, 30);
        textField.setEditable(false);

        // Add an action listener to the combo box
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedSubject = (String) comboBox.getSelectedItem();
                textField.setText(selectedSubject);
            }
        });

        // Add components to the frame
        frame.add(comboBox);
        frame.add(textField);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}

//javac s19q2.java
//java SubjectSelector

