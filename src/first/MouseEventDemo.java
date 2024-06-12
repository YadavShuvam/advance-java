package first;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MouseEventDemo extends JFrame {
    private JButton btn;
    private Random random;
    
    public MouseEventDemo() {
        random = new Random();
        setLayout(null);
        setBounds(50, 50, 400, 400);
        setTitle("Mouse Hover Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn = new JButton("Hover Me");
        btn.setBounds(150, 150, 100, 30);

        btn.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                moveButton();
            }
        });

        add(btn);
        setVisible(true);
    }

    private void moveButton() {
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        btn.setLocation(x, y);
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}