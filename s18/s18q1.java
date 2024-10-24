import java.util.*;
import javax.swing.*;
import java.awt.*;

class BorderLayoutExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Border Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create buttons
        JButton btnNorth = new JButton("North");
        JButton btnSouth = new JButton("South");
        JButton btnEast = new JButton("East");
        JButton btnWest = new JButton("West");
        JButton btnCenter = new JButton("Center");

        // Add buttons to the frame in different regions
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnWest, BorderLayout.WEST);
        frame.add(btnCenter, BorderLayout.CENTER);

        // Set the frame visibility
        frame.setVisible(true);
    }
}

//javac s18q1.java
//java BorderLayoutExample

