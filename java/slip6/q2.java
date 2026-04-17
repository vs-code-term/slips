 
import javax.swing.*; 
import java.awt.*; 
 
public class Thread9TrafficSignalThread extends JFrame  
 { 
 
    // Circle colors for the traffic light 
 private Color redLight = Color.GRAY; 
 private Color yellowLight = Color.GRAY; 
 private Color greenLight = Color.GRAY; 
 
 private int lightState = 0;  // 0 - Red, 1 - Green, 2 - Yellow 
 
 public Thread9TrafficSignalThread()  
 { 
 setTitle("Traffic Signal Using Thread"); 
 setSize(250, 400); 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 setLayout(new BorderLayout()); 
 
        // Panel to hold traffic lights 
     JPanel lightPanel = new JPanel()  
 { 
 @Override 
 protected void paintComponent(Graphics g)  
 { 
 super.paintComponent(g); 
                // Draw red light 
 g.setColor(redLight); 
 g.fillOval(75, 50, 100, 100); 
 
 // Draw yellow light 
 g.setColor(yellowLight); 
 g.fillOval(75, 160, 100, 100); 
 
 // Draw green light 
 g.setColor(greenLight); 
 g.fillOval(75, 270, 100, 100); 
 } 
 }; 
 
 lightPanel.setPreferredSize(new Dimension(250, 400)); 
 add(lightPanel, BorderLayout.CENTER); 
 
        // Start the signal cycle in a separate thread 
 Thread signalThread = new Thread(new SignalCycle()); 
 signalThread.start();  // Start the thread 
 
 setVisible(true); 
 } 
 
    // Runnable class to handle the signal cycle using Thread 
    class SignalCycle implements Runnable { 
        @Override 
        public void run() { 
            while (true) { 
                switch (lightState) { 
                    case 0: // Red light 
                        redLight = Color.RED; 
                        yellowLight = Color.GRAY; 
                        greenLight = Color.GRAY; 
                        lightState = 1; // Switch to green 
                        break; 
                    case 1: // Green light 
                        redLight = Color.GRAY; 
                        yellowLight = Color.GRAY; 
                        greenLight = Color.GREEN; 
                        lightState = 2; // Switch to yellow 
                        break; 
                    case 2: // Yellow light 
                        redLight = Color.GRAY; 
                        yellowLight = Color.YELLOW; 
                        greenLight = Color.GRAY; 
                        lightState = 0; // Switch to red 
                        break; 
                } 
 
                repaint();  // Update the light colors on the screen 
                try { 
                    Thread.sleep(2000);  // Pause for 2 seconds 
                } catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        } 
    } 
 
    public static void main(String[] args) { 
        new Thread9TrafficSignalThread(); 
    } 
 
 
