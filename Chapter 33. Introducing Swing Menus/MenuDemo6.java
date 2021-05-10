import java.awt.*;
import java.awt.event.*;
import java.security.Key;
import javax.swing.*;

public class MenuDemo6 implements ActionListener {
    JLabel jlab;
    JMenuBar jmb;
    JToolBar jtb;
    JPopupMenu jpu;

    DebugAction setAct;
    DebugAction clearAct;
    DebugAction resumeAct;

    class DebugAction extends AbstractAction {
        public DebugAction(String name, Icon image, int mnem, int accel, String tTip) {
            super(name, image);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
            putValue(MNEMONIC_KEY, mnem);
            putValue(SHORT_DESCRIPTION, tTip);
        }

        public void actionPerformed(ActionEvent ae) {
            String comStr = ae.getActionCommand();
            jlab.setText(comStr + " selected.");

            if (comStr.equals("Set Breakpoint")) {
                clearAct.setEnabled(true);
                setAct.setEnabled(false);
            } else if (comStr.equals("Clear Breakpoint")) {
                clearAct.setEnabled(false);
                setAct.setEnabled(true);
            }
        }
    }

    void makeFileMenu() {
        JMenu jmFile = new JMenu("File");
        jmFile.setMnemonic(KeyEvent.VK_F);
        JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O);
        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiClose = new JMenuItem("Close", KeyEvent.VK_C);
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiSave = new JMenuItem("Save", KeyEvent.VK_S);
        jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        JMenuItem jmiExit = new JMenuItem("Exit", KeyEvent.VK_E);
        jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);

        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiSave.addActionListener(this);
        jmiExit.addActionListener(this);
    }

    void makeActions() {
        ImageIcon setIcon = new ImageIcon("./images/anchor.png");
        ImageIcon clearIcon = new ImageIcon("./images/android.png");
        ImageIcon resumeIcon = new ImageIcon("./images/animal.png");

        setAct = new DebugAction("Set Breakpoint", setIcon, KeyEvent.VK_S, KeyEvent.VK_B, "Set a break point");
        clearAct = new DebugAction("Clear Breakpoint", clearIcon, KeyEvent.VK_C, KeyEvent.VK_L, "Clear a break point.");
        resumeAct = new DebugAction("Resume Breakpoint", clearIcon, KeyEvent.VK_R, KeyEvent.VK_R, "Resume excution after breakpoint.");

        clearAct.setEnabled(false);
    }

    void makeToolBar() {
        JButton jbtnSet = new JButton(setAct);
        JButton jbtnClear = new JButton(clearAct);
        JButton jbtnResume = new JButton(resumeAct);

        jtb = new JToolBar("Breakpoints");
        jtb.add(jbtnSet);
        jtb.add(jbtnClear);
        jtb.add(jbtnResume);
    }

    void makeOptionsMenu() {
        // create the Options menu
        JMenu jmOptions = new JMenu("Options");

        // create the Colors submenu
        JMenu jmColors = new JMenu("Colors");
        JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");

        jmColors.add(jmiRed);
        jmColors.add(jmiGreen);
        jmColors.add(jmiBlue);
        jmOptions.add(jmColors);

        JMenu jmPriority = new JMenu("Priority");

        JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High", true);
        JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low");

        jmPriority.add(jmiHigh);
        jmPriority.add(jmiLow);
        jmOptions.add(jmPriority);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jmiHigh);
        bg.add(jmiLow);

        JMenu jmDebug = new JMenu("Debug");
        JMenuItem jmiSetBP = new JMenuItem(setAct);
        JMenuItem jmiClearBP = new JMenuItem(clearAct);
        JMenuItem jmiResume = new JMenuItem(resumeAct);

        jmDebug.add(jmiSetBP);
        jmDebug.add(jmiClearBP);
        jmDebug.add(jmiResume);
        jmOptions.add(jmDebug);

        JMenuItem jmiReset = new JMenuItem("Reset");
        jmOptions.addSeparator();
        jmOptions.add(jmiReset);

        jmb.add(jmOptions);

        jmiRed.addActionListener(this);
        jmiGreen.addActionListener(this);
        jmiBlue.addActionListener(this);
        jmiHigh.addActionListener(this);
        jmiLow.addActionListener(this);
        jmiReset.addActionListener(this);
    }

    void makeHelpMenu() {
        JMenu jmHelp = new JMenu("Help");
        ImageIcon icon = new ImageIcon("./images/penguin.png");
        JMenuItem jmiAbout = new JMenuItem("About", icon);
        jmiAbout.setToolTipText("Info about the MenuDemo6 program.");
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        jmiAbout.addActionListener(this);
    }

    void makeEditPUMenu() {
        jpu = new JPopupMenu();

        JMenuItem jmiCut = new JMenuItem("Cut");
        JMenuItem jmiCopy = new JMenuItem("Copy");
        JMenuItem jmiPaste = new JMenuItem("Paste");

        jpu.add(jmiCut);
        jpu.add(jmiCopy);
        jpu.add(jmiPaste);

        jmiCut.addActionListener(this);
        jmiCopy.addActionListener(this);
        jmiPaste.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comStr = ae.getActionCommand();

        if (comStr.equals("Exit")) {
            System.exit(0);
        }

        jlab.setText(comStr + " selected");
    }

    MenuDemo6() {
        JFrame jfrm = new JFrame("Complete Menu Demo 6");
        jfrm.setSize(360, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlab = new JLabel();
        jmb = new JMenuBar();

        makeFileMenu();
        makeActions();
        makeToolBar();
        makeOptionsMenu();
        makeHelpMenu();
        makeEditPUMenu();

        jfrm.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                super.mousePressed(me);

                if (me.isPopupTrigger()) {
                    jpu.show(me.getComponent(), me.getX(), me.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                super.mousePressed(me);

                if (me.isPopupTrigger()) {
                    jpu.show(me.getComponent(), me.getX(), me.getY());
                }
            }
        });

        jfrm.add(jlab, SwingConstants.CENTER);
        jfrm.add(jtb, BorderLayout.NORTH);
        jfrm.setJMenuBar(jmb);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDemo6();
            }
        });
    }
}
