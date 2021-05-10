import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo {
    String[] timepieces = {
            "Hourglass", "Analog", "Digital", "Stopwatch"
    };

    public JComboBoxDemo() {
        JFrame jfrm = new JFrame("JComboBoxDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400, 250);

        JComboBox<String> jcb = new JComboBox<>(timepieces);
        jfrm.add(jcb);

        JLabel jlab = new JLabel(new ImageIcon("./images/hourglass.jpg"));
        jfrm.add(jlab);

        jcb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s = (String) jcb.getSelectedItem();
                jlab.setIcon(new ImageIcon("./images/" + s.toLowerCase() + ".png"));
            }
        });

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JComboBoxDemo();
            }
        });
    }
}
