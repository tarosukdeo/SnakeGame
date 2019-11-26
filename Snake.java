import java.awt.EventQueue;
import java.awt.java.awt.event.*;
import javax.swing.JFrame;

public class Snake extends JFrame {

    public Snake() {
        initUI();
    }

    private void initUI(){
        add(new Board());

        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(final String[] args) {
        EventQueue.invokeLater(() -> {
            final JFrame ex = new App();
            ex.setVisible(true);
        });
        
    }
}
