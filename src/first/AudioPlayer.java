package first;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MP3Player extends JFrame {
    private AdvancedPlayer player;
    private Thread playerThread;
    private boolean isPlaying = false;
    private String filePath = "path_to_your_audio_file.mp3"; // Specify the path to your audio file

    public MP3Player() {
        // Create Play button
        JButton playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isPlaying) {
                    isPlaying = true;
                    playerThread = new Thread(() -> {
                        try {
                            FileInputStream fis = new FileInputStream(filePath);
                            player = new AdvancedPlayer(fis);
                            player.play();
                        } catch (FileNotFoundException | JavaLayerException ex) {
                            ex.printStackTrace();
                        }
                    });
                    playerThread.start();
                }
            }
        });

        // Create Pause button
        JButton pauseButton = new JButton("Pause");
        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isPlaying) {
                    isPlaying = false;
                    playerThread.interrupt();
                }
            }
        });

        // Set up the frame layout
        setLayout(new FlowLayout());
        add(playButton);
        add(pauseButton);

        // Frame settings
        setTitle("MP3 Player");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MP3Player().setVisible(true);
            }
        });
    }
}

