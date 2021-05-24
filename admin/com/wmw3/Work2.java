/*
 * Created by JFormDesigner on Thu Apr 08 19:39:03 CST 2021
 */

package com.wmw3;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Work2 extends JFrame {
    public static void main(String[] args) {
        Work2 work2 = new Work2();
        work2.setVisible (true);
    }
    public Work2() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        String[] strings = new String[3];
        strings[0]="E:\\JavaWorks\\shitou.png";
        strings[1]="E:\\JavaWorks\\bu.png";
        strings[2]="E:\\JavaWorks\\jiandao.png";
        Random random = new Random ();
        int i = random.nextInt(3);
        label1.setIcon(new ImageIcon(strings[i]));
        int j = random.nextInt(3);
        label2.setIcon(new ImageIcon(strings[j]));

        if(i == 0) {
            if (j == 1) {
                label6.setText ( "<" );
            } else if (j == 2) {
                label6.setText ( ">" );
            }else {
                label6.setText ( "=" );
            }
        }else if(i == 1) {
            if (j == 0) {
                label6.setText ( ">" );
            } else if (j == 2) {
                label6.setText ( "<" );
            }else {
                label6.setText ( "=" );
            }
        }else{
            if (j == 0) {
                label6.setText ( "<" );
            } else if (j == 1) {
                label6.setText ( ">" );
            }else {
                label6.setText ( "=" );
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        button1 = new JButton();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();

        //======== this ========
        setTitle("\u77f3\u5934\u526a\u5200\u5e03");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setIcon(new ImageIcon("E:\\JavaWorks\\wenhao.png"));
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(100, 65), label1.getPreferredSize()));

            //---- label2 ----
            label2.setIcon(new ImageIcon("E:\\JavaWorks\\wenhao.png"));
            panel1.add(label2);
            label2.setBounds(new Rectangle(new Point(355, 65), label2.getPreferredSize()));

            //---- label3 ----
            label3.setIcon(new ImageIcon("E:\\JavaWorks\\jiandao.png"));
            panel1.add(label3);
            label3.setBounds(90, 205, 90, 90);

            //---- label4 ----
            label4.setIcon(new ImageIcon("E:\\JavaWorks\\shitou.png"));
            panel1.add(label4);
            label4.setBounds(225, 205, 90, 90);

            //---- label5 ----
            label5.setIcon(new ImageIcon("E:\\JavaWorks\\bu.png"));
            panel1.add(label5);
            label5.setBounds(360, 205, 90, 90);

            //---- button1 ----
            button1.setText("\u5f00\u59cb");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(225, 335, 95, 25);

            //---- label6 ----
            label6.setText("=");
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getStyle() | Font.BOLD, label6.getFont().getSize() + 22f));
            panel1.add(label6);
            label6.setBounds(new Rectangle(new Point(255, 95), label6.getPreferredSize()));

            //---- label7 ----
            label7.setText("\u5bf9\u65b9");
            label7.setFont(label7.getFont().deriveFont(label7.getFont().getStyle() | Font.BOLD, label7.getFont().getSize() + 1f));
            panel1.add(label7);
            label7.setBounds(new Rectangle(new Point(130, 35), label7.getPreferredSize()));

            //---- label8 ----
            label8.setText("\u6211\u65b9");
            label8.setFont(label8.getFont().deriveFont(label8.getFont().getStyle() | Font.BOLD, label8.getFont().getSize() + 1f));
            panel1.add(label8);
            label8.setBounds(new Rectangle(new Point(385, 35), label8.getPreferredSize()));

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
        panel1.setBounds(0, 0, 555, 445);

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
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JButton button1;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
