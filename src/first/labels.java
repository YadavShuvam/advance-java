package first;

import java.awt.Color;

import javax.swing.*;

public class labels
 {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("hail hitler");
        
        
        
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(new Color(255,0,0));
        frame.add(label);
        
        frame.setTitle("this is propoganda for hitler");
        
        JPanel container=new JPanel();
		/* setContentPane(container); */
        frame.add(container);
        container.add(label);
        frame.setVisible(true);
    }
}
