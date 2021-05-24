/*
 * Created by JFormDesigner on Mon Apr 05 13:27:25 CST 2021
 */

package com.wmw3;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Work1 extends JFrame {
    public static void main(String[] args) {
        Work1 work1 = new Work1();
        work1.setVisible (true);
    }

    public Work1() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        String[] strings=new String[3];
        strings[0]="E:\\JavaWorks\\shitou.png";
        strings[1]="E:\\JavaWorks\\bu.png";
        strings[2]="E:\\JavaWorks\\jiandao.png";
        Random random=new Random ();
        int i=random.nextInt(3);
        label1.setIcon(new ImageIcon(strings[i]));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(242, 241, 241));
            panel1.setLayout(null);

            //---- label1 ----
            label1.setIcon(new ImageIcon("E:\\JavaWorks\\jiandao.png"));
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(145, 40), label1.getPreferredSize()));

            //---- button1 ----
            button1.setText("\u51fa\u62f3");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(160, 170, button1.getPreferredSize().width, 25);

            { // compute preferred size
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
        panel1.setBounds(0, 0, 400, 270);

        { // compute preferred size
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
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
