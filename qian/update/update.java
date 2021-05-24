/*
 * Created by JFormDesigner on Tue May 18 21:48:39 CST 2021
 */

package Eighth.update;

import Eighth.login.DBconnection;
import Eighth.login.StringUtil;
import Eighth.login.UserDao;
import Eighth.login.main;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class update extends JFrame {
    public update() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        updateAction(e);
    }
    private void updateAction(ActionEvent e) {
        main x=new main();
        String userName=this.textname.getText();
        String num=this.textnum.getText();
        String major=this.textdept.getText();
        String nwd=this.textnwd.getText();
        String awd=this.textawd.getText();
        if (StringUtil.isEmpty(userName)){
            JOptionPane.showMessageDialog(null, "用户名不能为空");
            return;
        }
        if (StringUtil.isEmpty(num)){
            JOptionPane.showMessageDialog(null, "学号不能为空");
            return;
        }
        if (StringUtil.isEmpty(major)){
            JOptionPane.showMessageDialog(null, "专业不能为空");
            return;
        }
        if (StringUtil.isEmpty(nwd)){
            JOptionPane.showMessageDialog(null, "密码不能为空");
            return;
        }
        if (StringUtil.isEmpty(awd)){
            JOptionPane.showMessageDialog(null, "密码不能为空");
            return;
        }
        if (!nwd.equals(awd)){
            JOptionPane.showMessageDialog(null, "请输入相同的新密码");
            return;
        }
        UpdateDao ud = new UpdateDao();
        List<Integer> list = new ArrayList<>();
        list= ud.SeeStud();
        for(int i =0 ; i< list.size();i++){
            if(list.get(i) == Integer.parseInt(this.textnum.getText())){
                JOptionPane.showMessageDialog(null, "您已注册过了，请勿重复注册");
                return;
            }
        }
        User user=new User(userName,major,num,nwd);
        Connection con=null;
        try {
            con= DBconnection.getConnection();
            User currentUser= UpdateDao.login(con,user);
            if (currentUser!=null){
                dispose();
                new main().setVisible(true);
            }
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }
    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new main().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        name = new JLabel();
        number = new JLabel();
        dept = new JLabel();
        nwd = new JLabel();
        awd = new JLabel();
        textname = new JTextField();
        textnum = new JTextField();
        textdept = new JTextField();
        textnwd = new JTextField();
        textawd = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        label5 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- name ----
            name.setText("\u59d3\u540d");
            name.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(name);
            name.setBounds(119, 130, 45, 30);

            //---- number ----
            number.setText("\u5b66\u53f7");
            number.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(number);
            number.setBounds(120, 180, 50, 30);

            //---- dept ----
            dept.setText("\u4e13\u4e1a");
            dept.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(dept);
            dept.setBounds(120, 237, 50, 30);

            //---- nwd ----
            nwd.setText("\u65b0\u5bc6\u7801");
            nwd.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(nwd);
            nwd.setBounds(102, 295, 60, 30);

            //---- awd ----
            awd.setText("\u786e\u8ba4\u5bc6\u7801");
            awd.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(awd);
            awd.setBounds(85, 345, 90, 35);
            panel1.add(textname);
            textname.setBounds(190, 125, 120, 35);
            panel1.add(textnum);
            textnum.setBounds(190, 180, 120, 35);
            panel1.add(textdept);
            textdept.setBounds(190, 235, 120, 35);
            panel1.add(textnwd);
            textnwd.setBounds(190, 290, 120, 35);
            panel1.add(textawd);
            textawd.setBounds(190, 345, 120, 35);

            //---- button1 ----
            button1.setText("\u786e\u8ba4\u6ce8\u518c");
            button1.setFont(button1.getFont().deriveFont(button1.getFont().getStyle() | Font.BOLD, button1.getFont().getSize() + 4f));
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(140, 415, 120, 45);

            //---- button2 ----
            button2.setText("\u8fd4\u56de");
            button2.addActionListener(e -> button2ActionPerformed(e));
            panel1.add(button2);
            button2.setBounds(new Rectangle(new Point(20, 15), button2.getPreferredSize()));

            //---- label5 ----
            label5.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/fengmian.jpg")));
            panel1.add(label5);
            label5.setBounds(0, 0, 360, 515);

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
    private JLabel name;
    private JLabel number;
    private JLabel dept;
    private JLabel nwd;
    private JLabel awd;
    private JTextField textname;
    private JTextField textnum;
    private JTextField textdept;
    private JTextField textnwd;
    private JTextField textawd;
    private JButton button1;
    private JButton button2;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
