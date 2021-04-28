# 1. The Origins of Swing
# 2. Swing Is Built on the AWT
# 3. Two Key Swing Features
## 3.1. Swing Components Are Lightweight
## 3.2. Swing Supports a Pluggable Look and Feel
# 4. The MVC Connection
# 5. Components and Containers
## 5.1. Components
## 5.2. Containers
## 5.3. The Top-Level Container Panes
# 6. The Swing Packages
# 7. A Simple Swing Application
###### SwingDemo.java _[source code](./SwingDemo.java)_
```java
import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        JFrame jfrm = new JFrame("A Simple Swing Application");
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel(" Swing means powerful GUIs.");
        jfrm.add(jlab);
        jfrm.setVisible(true); // display the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
```
![](../images/138.png)

