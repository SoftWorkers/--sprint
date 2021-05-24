/*
 * Created by JFormDesigner on Fri May 14 16:23:59 CST 2021
 */

package Eighth.rank;

import Eighth.login.DBconnection;
import Eighth.login.StringUtil;
import Eighth.login.User;
import Eighth.login.main;
import Eighth.main.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class rank extends JFrame {
    private RankDao rankDao=new RankDao();
    public rank() {
        initComponents();
        main x = new main();
        num = x.getUserName();
    }
    private String origin;
    private String pw;
    private String pwc;
    private String num;

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        change(e);
    }
    public void change(ActionEvent e){
        origin = this.textField1.getText();
        pw = this.textField2.getText();
        pwc = this.textField3.getText();
        if (StringUtil.isEmpty(origin)) {
            JOptionPane.showMessageDialog(null, "原密码不能为空");
            return;
        }
        if (StringUtil.isEmpty(pw)) {
            JOptionPane.showMessageDialog(null, "新密码不能为空");
            return;
        }
        if (StringUtil.isEmpty(pwc)) {
            JOptionPane.showMessageDialog(null, "确认密码不能为空");
            return;
        }
        if (!pw.equals(pwc)){
            JOptionPane.showMessageDialog(null, "请输入相同的新密码");
            return;
        }
        User user = new User(origin);
        DBconnection db = new DBconnection();
        Connection con = null;
        try {
            con = db.getConnection();
            String passwd = rankDao.list(con, user, num);
            if (passwd != null) {
                rankchange rc=new rankchange();
                rc.update(num,pw);
                JOptionPane.showMessageDialog(null, "修改成功");
            }else{
                JOptionPane.showMessageDialog(null, "密码错误！请重新输入");
            }
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        dispose();
        new Eighth.User.User().setVisible(true);
    }

        private void initComponents () {

            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
            panel1 = new JPanel();
            textField1 = new JTextField();
            textField2 = new JTextField();
            textField3 = new JTextField();
            label1 = new JLabel();
            label2 = new JLabel();
            label3 = new JLabel();
            button1 = new JButton();
            button2 = new JButton();
            label4 = new JLabel();

            //======== this ========
            setFont(new Font(Font.DIALOG, Font.PLAIN, 14));
            Container contentPane = getContentPane();
            contentPane.setLayout(null);

            //======== panel1 ========
            {
                panel1.setLayout(null);

                //---- textField1 ----
                textField1.setFont(textField1.getFont().deriveFont(textField1.getFont().getSize() + 2f));
                panel1.add(textField1);
                textField1.setBounds(175, 160, 95, textField1.getPreferredSize().height);

                //---- textField2 ----
                textField2.setFont(textField2.getFont().deriveFont(textField2.getFont().getSize() + 2f));
                panel1.add(textField2);
                textField2.setBounds(175, 215, 95, textField2.getPreferredSize().height);

                //---- textField3 ----
                textField3.setFont(textField3.getFont().deriveFont(textField3.getFont().getSize() + 2f));
                panel1.add(textField3);
                textField3.setBounds(175, 270, 95, textField3.getPreferredSize().height);

                //---- label1 ----
                label1.setText("\u539f\u5bc6\u7801");
                label1.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
                panel1.add(label1);
                label1.setBounds(new Rectangle(new Point(80, 165), label1.getPreferredSize()));

                //---- label2 ----
                label2.setText("\u65b0\u5bc6\u7801");
                label2.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
                panel1.add(label2);
                label2.setBounds(new Rectangle(new Point(80, 215), label2.getPreferredSize()));

                //---- label3 ----
                label3.setText("\u5bc6\u7801\u786e\u8ba4");
                label3.setFont(new Font("\u4eff\u5b8b", Font.BOLD, 18));
                panel1.add(label3);
                label3.setBounds(new Rectangle(new Point(70, 275), label3.getPreferredSize()));

                //---- button1 ----
                button1.setText("\u786e\u8ba4\u4fee\u6539");
                button1.setFont(button1.getFont().deriveFont(button1.getFont().getStyle() | Font.BOLD, button1.getFont().getSize() + 6f));
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel1.add(button1);
                button1.setBounds(105, 355, 135, 45);

                //---- button2 ----
                button2.setText("\u8fd4\u56de");
                button2.addActionListener(e -> button2ActionPerformed(e));
                panel1.add(button2);
                button2.setBounds(new Rectangle(new Point(20, 15), button2.getPreferredSize()));

                //---- label4 ----
                label4.setIcon(new ImageIcon(getClass().getResource("/Eighth/photo/gongneng.jpg")));
                panel1.add(label4);
                label4.setBounds(0, -5, 360, 515);

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
            panel1.setBounds(0, 5, 360, 515);

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
        private JTextField textField1;
        private JTextField textField2;
        private JTextField textField3;
        private JLabel label1;
        private JLabel label2;
        private JLabel label3;
        private JButton button1;
        private JButton button2;
        private JLabel label4;
        // JFormDesigner - End of variables declaration  //GEN-END:variables
    }
