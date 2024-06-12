package first;

import javax.swing.*;
import java.awt.*;

class MainFlag extends JPanel {
    private final Color crimson = new Color(206, 17, 38);
    private final Color blue = new Color(0, 56, 168);
    private final int flagWidth = 600; // Width of the flag
    private final int flagHeight = 400; // Height of the flag
    private final int borderWidth = flagHeight * 4 / 27; // Width of the border
    private final int borderHeight = flagHeight / 3; // Height of the border
    private final int sunRadius = flagHeight / 3; // Radius of the sun

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set background color to white
        this.setBackground(Color.WHITE);

        // Draw crimson background
        g2d.setColor(crimson);
        g2d.fillRect(0, 0, flagWidth, flagHeight);

        // Draw blue border
        g2d.setColor(blue);
        g2d.fillRect(0, 0, borderWidth, flagHeight);
        g2d.fillRect(0, 0, flagWidth, borderHeight);
        g2d.fillRect(0, flagHeight - borderHeight, flagWidth, borderHeight);

        // Draw sun
        g2d.setColor(Color.WHITE);
        g2d.fillOval(flagWidth / 2 - sunRadius / 2, flagHeight / 2 - sunRadius / 2, sunRadius, sunRadius);

        // Draw sun rays
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(flagWidth / 2, flagHeight / 2 - sunRadius / 2, flagWidth / 2, 0); // Vertical ray
        g2d.drawLine(flagWidth / 2 - sunRadius / 2, flagHeight / 2, 0, flagHeight / 2); // Horizontal ray
        g2d.drawLine(flagWidth / 2 + sunRadius / 2, flagHeight / 2, flagWidth, flagHeight / 2); // Horizontal ray
        g2d.drawLine(flagWidth / 2, flagHeight / 2 + sunRadius / 2, flagWidth / 2, flagHeight); // Vertical ray
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Nepal Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400); // Set the size of the JFrame
        frame.add(new Flag());
        frame.setVisible(true);
    }
}
