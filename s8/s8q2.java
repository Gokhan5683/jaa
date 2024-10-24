import javax.swing.*;
import java.awt.event.*;

class SMEvent extends JFrame {
    private JTextField textField;

    public SMEvent() {
        // Set up the frame
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Use absolute positioning

        // Create a text field
        textField = new JTextField();
        textField.setBounds(50, 200, 300, 30);
        add(textField);

        // Mouse click event
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                textField.setText("Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Mouse move event
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                textField.setText("Moved to: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        setVisible(true); // Show the frame
    }

    public static void main(String[] args) {
        new SMEvent(); // Create the window
    }
}
