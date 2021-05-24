/*
 * Created by JFormDesigner on Wed Apr 28 15:46:36 CST 2021
 */

package Eighth.login;

import Eighth.main.Main;
import Eighth.update.update;
import javafx.scene.control.PasswordField;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;
import javax.swing.JPasswordField;

/**
 * @author Brainrain
 */
public class main extends JFrame {
    private DBconnection db=new DBconnection();
    private UserDao userDao=new UserDao();
    static String userName;

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        main.userName = userName;
    }

    public static void main(String[] args) {
        main frame=new main();
        frame.setVisible(true);
        //System.out.println(frame.getUserName());
        //System.out.println(frame.getUserName());
    }
    public main() {
        //默认字体
        Font font=new Font("Dialog", Font.PLAIN, 12);
        java.util.Enumeration keys=UIManager.getDefaults().keys();
        while (keys.hasMoreElements()){
            Object key=keys.nextElement();
            Object value=UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource){
                UIManager.put(key, font);
            }
        }
        initComponents();
    }

    private void button2ActionPerformed(ActionEvent e1) {
        // TODO add your code here
        loginAction(e1);

    }

    private void loginAction(ActionEvent e1) {
        main x=new main();
        userName=this.textField1.getText();
        String passWord=new String(this.passwordField.getPassword());

        if (StringUtil.isEmpty(userName)){
            JOptionPane.showMessageDialog(null, "用户名不能为空");
            return;
        }
        if (StringUtil.isEmpty(passWord)){
            JOptionPane.showMessageDialog(null, "密码不能为空");
            return;
        }
        User user=new User(userName,passWord);
        Connection con=null;
        try {
            con=db.getConnection();
            User currentUser=userDao.login(con, user);
            if (currentUser!=null){
                dispose();
                new Main().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "用户名或者密码错误!");
            }
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new update().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button2 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        label1 = new JLabel();
        button3 = new JButton();
        label5 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label2 ----
            label2.setText("\u60a6\u8bfb\u6253\u5361");
            label2.setFont(new Font("\u5fae\u8edf\u6b63\u9ed1\u9ad4", Font.BOLD, 30));
            panel1.add(label2);
            label2.setBounds(120, 115, 225, 85);
            panel1.add(textField1);
            textField1.setBounds(145, 235, 120, 35);

            //---- button2 ----
            button2.setText("\u767b\u5f55");
            button2.setFont(button2.getFont().deriveFont(button2.getFont().getStyle() | Font.BOLD, button2.getFont().getSize() + 4f));
            button2.addActionListener(e -> button2ActionPerformed(e));
            panel1.add(button2);
            button2.setBounds(195, 385, 80, 35);

            //---- label3 ----
            label3.setText("\u7528\u6237\uff1a");
            label3.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(label3);
            label3.setBounds(90, 235, 75, 30);
            panel1.add(passwordField);
            passwordField.setBounds(145, 300, 120, 35);

            //---- label4 ----
            label4.setText("\u5bc6\u7801\uff1a");
            label4.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
            panel1.add(label4);
            label4.setBounds(90, 300, 85, 35);

            //---- label1 ----
            label1.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/\u56fe\u72471.png")));
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(145, 60), label1.getPreferredSize()));

            //---- button3 ----
            button3.setText("\u6ce8\u518c");
            button3.setFont(button3.getFont().deriveFont(button3.getFont().getStyle() | Font.BOLD, button3.getFont().getSize() + 4f));
            button3.addActionListener(e -> button3ActionPerformed(e));
            panel1.add(button3);
            button3.setBounds(90, 385, 80, 35);

            //---- label5 ----
            label5.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/fengmian.jpg")));
            panel1.add(label5);
            label5.setBounds(0, 0, 390, 525);

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
    private JLabel label2;
    private JTextField textField1;
    private JButton button2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label1;
    private JButton button3;
    private JLabel label5;
    private JPasswordField passwordField = new JPasswordField(10);
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
