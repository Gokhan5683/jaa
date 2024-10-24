import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ConcentricCircles extends JFrame {

    private int x = -1;
    private int y = -1;

    public ConcentricCircles() {
        // Set up the frame
        setTitle("Concentric Circles");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Add a mouse listener to capture clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Get the click location
                x = e.getX();
                y = e.getY();
                // Repaint the frame to draw the circles at the new location
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (x != -1 && y != -1) {
            // Set colors and draw the three concentric circles
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.DARK_GRAY);
            g2d.fillOval(x - 60, y - 60, 120, 120); // outer circle
            g2d.setColor(Color.GRAY);
            g2d.fillOval(x - 40, y - 40, 80, 80);   // middle circle
            g2d.setColor(Color.LIGHT_GRAY);
            g2d.fillOval(x - 20, y - 20, 40, 40);   // inner circle
        }
    }

    public static void main(String[] args) {
        // Create an instance of the frame
        new ConcentricCircles();
    }
}
