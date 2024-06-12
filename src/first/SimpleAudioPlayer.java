package first;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class SimpleAudioPlayer extends JFrame {
    private Clip audioClip;
    private boolean isPlaying = false;

    public SimpleAudioPlayer()
    {
        
        try 
        {
            File audioFile = new File("C:\\Users\\Shuvam\\Downloads\\java2.wav"); 
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex)
        {
            ex.printStackTrace();
        }

        
        JButton playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener()
{
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (!isPlaying) {
                    audioClip.start();
                    isPlaying = true;
                }
            }
        });

        // Create Pause button
        JButton pauseButton = new JButton("Pause");
        pauseButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if (isPlaying) {
                    audioClip.stop();
                    isPlaying = false;
                }
            }
        });

     
        setLayout(new FlowLayout());
        add(playButton);
        add(pauseButton);

       
        setTitle("Simple Audio Player");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run() {
                new SimpleAudioPlayer().setVisible(true);
            }
        });
    }
}
