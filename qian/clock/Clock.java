/*
 * Created by JFormDesigner on Wed May 12 17:38:02 CST 2021
 */

package Eighth.clock;

import Eighth.User.User;
import Eighth.login.DBconnection;
import Eighth.login.main;
import Eighth.main.Main;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class Clock extends JFrame {
    public Clock() {
        initComponents();

    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        main x=new main();
        String num=x.getUserName();
        clockadd cd=new clockadd();
        Student student = new Student();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String current =df.format(new Date());
        if(cd.colockDate(num)==1){
            JOptionPane.showMessageDialog(null, "今日已打卡成功，请勿重复打卡");
        }else {
            cd.update(num);
            JOptionPane.showMessageDialog(null, "打卡成功");
            student=cd.FuzzySetstud(num);
            cd.clockInsert(num,student);

        }
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new Main().setVisible(true);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();
        label2 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- button1 ----
            button1.setText("\u63d0\u4ea4\u4eca\u65e5\u6253\u5361");
            button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 8f));
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(85, 400, 210, 50);

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/ditu.jpg")));
            panel1.add(label1);
            label1.setBounds(30, 100, 310, 290);

            //---- button2 ----
            button2.setText("\u8fd4\u56de");
            button2.addActionListener(e -> button2ActionPerformed(e));
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(20, 15), button2.getPreferredSize()));

            //---- label2 ----
            label2.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/gongneng.jpg")));
            panel1.add(label2);
            label2.setBounds(0, 0, 395, 540);

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
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
