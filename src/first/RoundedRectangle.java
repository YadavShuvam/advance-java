package first;
import javax.swing.*;
import java.awt.*;

public class RoundedRectangle extends JPanel 
{

    
    public void paintComponent(Graphics g) 
    {
        Graphics2D gg = (Graphics2D) g;

       

        gg.setColor(Color.RED);
		
        gg.fillRoundRect(100, 100, 300, 200, 20, 20);


        gg.setColor(Color.BLUE);
        gg.setStroke(new BasicStroke(5));
		
        gg.drawRoundRect(100, 100, 300 , 200, 20, 20);

        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.getContentPane().add(new RoundedRectangle());
        frame.setVisible(true);
    }
}
