import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonDemo {
    public JToggleButtonDemo() {
        JFrame jfrm = new JFrame("JToggleButtonDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200, 100);

        JLabel jlab = new JLabel("Button is off");
        JToggleButton jtbn = new JToggleButton("On/Off");

        // add an item listener for the toggle button
        jtbn.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (jtbn.isSelected()) {
                    jlab.setText("Button is ON.");
                } else {
                    jlab.setText("Button is OFF.");
                }
            }
        });

        // add the toggle button and label to the content pane
        jfrm.add(jtbn);
        jfrm.add(jlab);

        // displat the frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JToggleButtonDemo();
            }
        });
    }
}
