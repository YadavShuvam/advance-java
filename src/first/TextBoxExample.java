package first;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextBoxExample {

    private char lastKeyPressed;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextBoxExample().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Text Box Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);
        frame.add(textField);

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                     
                        String message = "\"" + lastKeyPressed + " Hi/Hello!";
                        JOptionPane.showMessageDialog(frame, message, "Message", JOptionPane.INFORMATION_MESSAGE);
                    
                } else {
                    lastKeyPressed = e.getKeyChar();
                    String message = "\"" + lastKeyPressed + "\" is entered";
                    JOptionPane.showMessageDialog(frame, message, "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        frame.setVisible(true);
    }
}
