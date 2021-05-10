import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JListDemo {
    String Cities[] = {
            "New York", "Chicago", "Houston", "Denver", "Los Angeles", "Seattle",
            "London", "Paris", "New Delhi", "Hong Kong", "Tokyo", "Sydney"
    };

    public JListDemo() {
        JFrame jfrm = new JFrame("JListDemo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200, 200);

        JList<String> jlst = new JList<>(Cities);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // add the list to a scroll pane
        JScrollPane jscrlp = new JScrollPane(jlst);

        jscrlp.setPreferredSize(new Dimension(120, 90));

        JLabel jlab = new JLabel("Choose a City");
        jlst.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                int idx = jlst.getSelectedIndex();

                if (idx != -1) {
                    jlab.setText("Current selection: " + Cities[idx]);
                } else {
                    jlab.setText("Choose a City");
                }
            }
        });

        jfrm.add(jscrlp);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JListDemo();
            }
        });
    }
}
