import javax.swing.*;
import java.awt.*;

public class ScrollText extends JFrame implements Runnable {

    JLabel label;
    String text = "Welcome to Java Programming   ";
    Thread t;

    public ScrollText() {
        label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 20));

        add(label);

        setSize(500, 150);
        setTitle("Scrolling Text");
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Start thread
        t = new Thread(this);
        t.start();
    }

    // Thread logic
    public void run() {
        try {
            while (true) {
                // Move first character to end
                text = text.substring(1) + text.charAt(0);

                label.setText(text);

                Thread.sleep(200); // control speed
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new ScrollText();
    }
}