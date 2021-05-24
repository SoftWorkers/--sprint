/*
 * Created by JFormDesigner on Wed May 12 16:04:57 CST 2021
 */

package Eighth.main;

import Eighth.User.User;
import Eighth.clock.Clock;
import Eighth.pwd.pwd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import com.jgoodies.forms.factories.*;
//import com.jgoodies.forms.layout.*;

/**
 * @author Brainrain
 */
public class Main extends JFrame {
    public static void main(String[] args) {
        Main frame=new Main();
        frame.setVisible(true);
    }
    public Main() {
        initComponents();
    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new Clock().setVisible(true);
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new User().setVisible(true);
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new pwd().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        panel3 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton();
        panel4 = new JPanel();
        label5 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/\u56fe\u72471.png")));
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(155, 30), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText("\u4e66\u4e2d\u81ea\u6709\u9ec4\u91d1\u5c4b\uff0c\u4e66\u4e2d\u81ea\u6709\u989c\u5982\u7389");
            label2.setForeground(Color.white);
            label2.setBackground(Color.white);
            panel1.add(label2);
            label2.setBounds(100, 85, label2.getPreferredSize().width, 68);

            //======== panel3 ========
            {
                panel3.setBackground(Color.white);
                panel3.setLayout(null);

                //---- button2 ----
                button2.setText("\u6211\u7684\u8d26\u53f7");
                button2.addActionListener(e -> button2ActionPerformed(e));
                panel3.add(button2);
                button2.setBounds(new Rectangle(new Point(35, 175), button2.getPreferredSize()));

                //---- button3 ----
                button3.setText("\u6392\u884c\u699c");
                button3.addActionListener(e -> button3ActionPerformed(e));
                panel3.add(button3);
                button3.setBounds(new Rectangle(new Point(35, 55), button3.getPreferredSize()));

                //---- label3 ----
                label3.setText("\u7406\u60f3\u7684\u751f\u6d3b\u53ea\u80fd\u9760\u81ea\u5df1\u53bb\u4e89\u53d6~");
                label3.setForeground(Color.gray);
                panel3.add(label3);
                label3.setBounds(new Rectangle(new Point(40, 100), label3.getPreferredSize()));

                //---- label4 ----
                label4.setText("\u65e0\u6cd5\u9884\u89c1\u81ea\u5df1\u7684\u672a\u6765\uff0c\u6216\u8bb8\u662f\u4e00\u4ef6\u597d\u4e8b");
                label4.setForeground(Color.gray);
                panel3.add(label4);
                label4.setBounds(new Rectangle(new Point(35, 220), label4.getPreferredSize()));

                //======== panel5 ========
                {
                    panel5.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel5.getComponentCount(); i++) {
                            Rectangle bounds = panel5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel5.setMinimumSize(preferredSize);
                        panel5.setPreferredSize(preferredSize);
                    }
                }
                panel3.add(panel5);
                panel5.setBounds(25, 35, 230, 105);

                //======== panel6 ========
                {
                    panel6.setLayout(null);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel6.getComponentCount(); i++) {
                            Rectangle bounds = panel6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel6.setMinimumSize(preferredSize);
                        panel6.setPreferredSize(preferredSize);
                    }
                }
                panel3.add(panel6);
                panel6.setBounds(25, 155, 230, 105);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel3);
            panel3.setBounds(45, 185, 275, 310);

            //======== panel2 ========
            {
                panel2.setAutoscrolls(true);
                panel2.setBackground(new Color(51, 51, 51));
                panel2.setLayout(null);

                //---- button1 ----
                button1.setText("\u6253\u5361");
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel2.add(button1);
                button1.setBounds(145, 140, 85, 35);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel2);
            panel2.setBounds(0, 0, 360, 200);

            //======== panel4 ========
            {
                panel4.setLayout(null);

                //---- label5 ----
                label5.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/gongneng.jpg")));
                panel4.add(label5);
                label5.setBounds(0, 0, 360, 315);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel4.getComponentCount(); i++) {
                        Rectangle bounds = panel4.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel4.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel4.setMinimumSize(preferredSize);
                    panel4.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel4);
            panel4.setBounds(0, 200, 360, 315);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 0, 360, 515);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel3;
    private JButton button2;
    private JButton button3;
    private JLabel label3;
    private JLabel label4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel2;
    private JButton button1;
    private JPanel panel4;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
