/*
 * Created by JFormDesigner on Wed May 12 19:22:02 CST 2021
 */

package Eighth.User;

import javax.swing.table.*;

import Eighth.clock.Clock;
import Eighth.login.DBconnection;
import Eighth.login.UserDao;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import Eighth.login.main;
import Eighth.main.Main;
import Eighth.rank.rank;

import java.util.List;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class User extends JFrame {
    private DBconnection db=new DBconnection();
    private UIDao userDao=new UIDao();
    public User() {
        initComponents();

    }


    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new rank().setVisible(true);
    }
    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new Main().setVisible(true);
    }

    private void button1ActionPerformed() {
        // TODO add your code here
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        number = new JLabel();
        name = new JLabel();
        major = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label4 = new JLabel();
        label5 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            main x=new main();
            String num=x.getUserName();
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u5b66\u53f7");
            label1.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(80, 230), label1.getPreferredSize()));

            //---- label2 ----
            label2.setText("\u59d3\u540d");
            label2.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(label2);
            label2.setBounds(80, 280, 90, 30);

            //---- label3 ----
            label3.setText("\u4e13\u4e1a");
            label3.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(label3);
            label3.setBounds(80, 335, 55, 30);

            //---- number ----
            number.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(number);
            number.setBounds(150, 220, 90, 40);

            //---- name ----
            name.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(name);
            name.setBounds(150, 275, 90, 40);

            //---- major ----
            major.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(major);
            major.setBounds(150, 330, 170, 40);
            Connection con=null;
            Eighth.login.User user1=new Eighth.login.User();
            try {
                con=db.getConnection();
                List<String> list1=userDao.list(con, user1,num);
                number.setText(list1.get(0));
                name.setText(list1.get(1));
                major.setText(list1.get(2));
            }catch (Exception e){
                e.printStackTrace();
            }
            //---- button1 ----
            button1.setText("\u4fee\u6539\u5bc6\u7801");
            button1.setFont(button1.getFont().deriveFont(button1.getFont().getStyle() | Font.BOLD, button1.getFont().getSize() + 4f));
            button1.addActionListener(e -> {
			button1ActionPerformed(e);
			button1ActionPerformed();
			button1ActionPerformed(e);
			button1ActionPerformed(e);
		});
            panel1.add(button1);
            button1.setBounds(115, 400, 110, 45);

            //---- button2 ----
            button2.setText("\u8fd4\u56de");
            button2.addActionListener(e -> button2ActionPerformed(e));
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(20, 15), button2.getPreferredSize()));

            //---- label4 ----
            label4.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/touxiang.png")));
            panel1.add(label4);
            label4.setBounds(100, 35, 170, 195);

            //---- label5 ----
            label5.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/gongneng.jpg")));
            panel1.add(label5);
            label5.setBounds(0, 0, 390, 550);

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
    private JLabel number;
    private JLabel name;
    private JLabel major;
    private JButton button1;
    private JButton button2;
    private JLabel label4;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
