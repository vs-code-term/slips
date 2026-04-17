import java.awt.*;
import java.awt.event.*;

public class NumberThreadExample extends Frame implements Runnable, ActionListener {

    TextField tf;
    Button btn;
    Thread t;

    public NumberThreadExample() {
        // Create UI
        tf = new TextField(20);
        btn = new Button("Start");

        setLayout(new FlowLayout());
        add(tf);
        add(btn);

        btn.addActionListener(this);

        setSize(300, 150);
        setTitle("Multithreading Example");
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Runnable method
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                tf.setText(String.valueOf(i));
                Thread.sleep(100); // delay for visibility
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Button click event
    public void actionPerformed(ActionEvent e) {
        t = new Thread(this); // create thread using Runnable
        t.start(); // start thread
    }

    public static void main(String[] args) {
        new NumberThreadExample();
    }
}