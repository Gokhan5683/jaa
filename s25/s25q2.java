import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SForm {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("User Information Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set a smaller size for simplicity
        
        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15); // Width of 15 columns

        JLabel classLabel = new JLabel("Class:");
        JTextField classField = new JTextField(15); // Width of 15 columns

        JLabel hobbiesLabel = new JLabel("Hobbies:");
        JTextField hobbiesField = new JTextField(15); // Width of 15 columns

        // Create a button to submit the information
        JButton submitButton = new JButton("Submit");

        // Create a text area to display the results
        JTextArea resultArea = new JTextArea(5, 20); // 5 rows, 20 columns
        resultArea.setEditable(false);

        // Add an ActionListener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String userClass = classField.getText();
                String hobbies = hobbiesField.getText();
                resultArea.setText("Name: " + name + "\nClass: " + userClass + "\nHobbies: " + hobbies);
            }
        });

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Simple flow layout
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(classLabel);
        panel.add(classField);
        panel.add(hobbiesLabel);
        panel.add(hobbiesField);
        panel.add(submitButton);
        panel.add(new JScrollPane(resultArea)); // Add scroll pane for result area

        // Add the panel to the frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }
}
