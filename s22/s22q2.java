aimport javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SMEvent extends JFrame {
    private String eventName = "";

    public SMEvent() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Use MouseAdapter for handling mouse events
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) { eventName = "Mouse Clicked"; repaint(); }
            public void mousePressed(MouseEvent e) { eventName = "Mouse Pressed"; repaint(); }
            public void mouseReleased(MouseEvent e) { eventName = "Mouse Released"; repaint(); }
            public void mouseEntered(MouseEvent e) { eventName = "Mouse Entered"; repaint(); }
            public void mouseExited(MouseEvent e) { eventName = "Mouse Exited"; repaint(); }
        });

        // Custom painting
        add(new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (!eventName.isEmpty()) {
                    g.setColor(Color.RED);
                    g.setFont(new Font("Arial", Font.BOLD, 20));
                    FontMetrics fm = g.getFontMetrics();
                    int x = (getWidth() - fm.stringWidth(eventName)) / 2;
                    int y = (getHeight() + fm.getHeight()) / 2;
                    g.drawString(eventName, x, y);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SMEvent demo = new SMEvent();
            demo.setVisible(true);
        });
    }
}
