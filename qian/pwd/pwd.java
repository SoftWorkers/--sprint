/*
 * Created by JFormDesigner on Sat May 15 00:01:04 CST 2021
 */

package Eighth.pwd;

import Eighth.User.User;
import Eighth.login.DBconnection;
import Eighth.main.Main;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class pwd extends JFrame {
    private pwdDao pwdDao=new pwdDao();
    public pwd() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new Main().setVisible(true);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        first = new JLabel();
        second = new JLabel();
        third = new JLabel();
        forth = new JLabel();
        fifth = new JLabel();
        sixth = new JLabel();
        seventh = new JLabel();
        button1 = new JButton();
        label16 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u6392\u884c\u699c");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 15f));
            panel1.add(label1);
            label1.setBounds(135, 20, 90, 50);

            //---- label2 ----
            label2.setText("text");
            label2.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/\u91d1\u724c.png")));
            panel1.add(label2);
            label2.setBounds(15, 40, 130, 125);

            //---- label3 ----
            label3.setText("text");
            label3.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/\u94f6\u724c.png")));
            panel1.add(label3);
            label3.setBounds(15, 100, 145, 145);

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/3.png")));
            panel1.add(label4);
            label4.setBounds(35, 170, 115, 120);

            //---- label6 ----
            label6.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/4.png")));
            panel1.add(label6);
            label6.setBounds(35, 215, 130, 140);

            //---- label7 ----
            label7.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/5.png")));
            panel1.add(label7);
            label7.setBounds(new Rectangle(new Point(35, 280), label7.getPreferredSize()));

            //---- label8 ----
            label8.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/6.png")));
            panel1.add(label8);
            label8.setBounds(new Rectangle(new Point(35, 330), label8.getPreferredSize()));

            //---- label9 ----
            label9.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/7.png")));
            panel1.add(label9);
            label9.setBounds(new Rectangle(new Point(35, 380), label9.getPreferredSize()));

            //---- first ----
            first.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(first);
            first.setBounds(165, 85, 120, 40);

            //---- second ----
            second.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(second);
            second.setBounds(165, 155, 120, 40);

            //---- third ----
            third.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(third);
            third.setBounds(165, 210, 120, 40);

            //---- forth ----
            forth.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(forth);
            forth.setBounds(165, 260, 120, 40);

            //---- fifth ----
            fifth.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(fifth);
            fifth.setBounds(165, 315, 120, 40);

            //---- sixth ----
            sixth.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(sixth);
            sixth.setBounds(165, 360, 120, 40);

            //---- seventh ----
            seventh.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(seventh);
            seventh.setBounds(165, 410, 120, 40);
            try {
                List<String> list1= pwdDao.RankingList();
                first.setText(list1.get(0));
                second.setText(list1.get(1));
                third.setText(list1.get(2));
                forth.setText(list1.get(3));
                fifth.setText(list1.get(4));
                sixth.setText(list1.get(5));
                seventh.setText(list1.get(6));
            }catch (Exception e){
                e.printStackTrace();
            }
            //---- button1 ----
            button1.setText("\u8fd4\u56de");
            button1.setIcon(null);
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(new Rectangle(new Point(20, 15), button1.getPreferredSize()));

            //---- label16 ----
            label16.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/gongneng.jpg")));
            panel1.add(label16);
            label16.setBounds(0, 0, 395, 550);

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
    private JLabel label3;
    private JLabel label4;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel first;
    private JLabel second;
    private JLabel third;
    private JLabel forth;
    private JLabel fifth;
    private JLabel sixth;
    private JLabel seventh;
    private JButton button1;
    private JLabel label16;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
