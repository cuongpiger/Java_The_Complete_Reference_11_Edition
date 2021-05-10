import javax.swing.*;
import java.awt.*;

public class JScrollPaneDemo {
    public JScrollPaneDemo() {
        JFrame jfrm = new JFrame("JScrollPaneDemo");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400, 400);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20, 20));

        int b = 0;
        for (int i = 0; i < 20; ++i) {
            for (int j = 0; j < 20; ++j) {
                jp.add(new JButton("Button " + b++));
            }
        }

        JScrollPane jsp = new JScrollPane(jp);
        jfrm.add(jsp, BorderLayout.CENTER);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JScrollPaneDemo();
            }
        });
    }
}
