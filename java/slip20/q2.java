
import javax.swing.*;
import java.awt.*;

public class BlinkImage extends JFrame implements Runnable {

    JLabel label;
    ImageIcon img;
    Thread t;

    public BlinkImage() {
        img = new ImageIcon("image.jpg");

        label = new JLabel(img);
        add(label);

        setSize(400, 400);
        setTitle("Blinking Image");
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                label.setVisible(false);
                Thread.sleep(500);

                label.setVisible(true); 
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new BlinkImage();
    }
}
