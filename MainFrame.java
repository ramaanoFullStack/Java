import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        // Set up the frame
        super("Main Frame");
        setLookAndFeel();
        setSize(350, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            // ignore error
        }
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
    }
}
