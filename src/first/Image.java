package first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Image extends JFrame {
    private JButton uploadButton;
    private JLabel imageLabel;
    private JLabel pathLabel;

    public Image() {
        setTitle("Image Uploader");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        uploadButton = new JButton("Upload");
        uploadButton.setPreferredSize(new Dimension(30, 30));
        imageLabel = new JLabel();
        pathLabel = new JLabel("No file selected");

        setLayout(new BorderLayout());

        add(uploadButton, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
        add(pathLabel, BorderLayout.SOUTH);

        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String filePath = selectedFile.getAbsolutePath();
                    pathLabel.setText("Selected File: " + filePath);

                    ImageIcon imageIcon = new ImageIcon(filePath);
                    java.awt.Image image = imageIcon.getImage();
                    java.awt.Image scaledImage = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
                    imageIcon = new ImageIcon(scaledImage);
                    imageLabel.setIcon(imageIcon);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Image().setVisible(true);
            }
        });
    }
}
