package first;
import javax.swing.*;
import java.awt.*;

public class ShapeDemo extends JFrame {
    
    private class MyPanel extends JPanel {
       
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawLine(10, 10, 100, 100);
        }
    }

    private JFrame frm = new JFrame("Graphic Demo");
    Font font = new Font("Times New Roman", Font.PLAIN, 12);
    JPanel pn1 = new MyPanel(); 

    public ShapeDemo() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pn1.setPreferredSize(new Dimension(500, 500)); 
        pn1.setBackground(Color.WHITE); 
        add(pn1);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
    	ShapeDemo s=new ShapeDemo();
        
        
    }
}
