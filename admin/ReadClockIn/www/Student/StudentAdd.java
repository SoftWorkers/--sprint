/*
 * Created by JFormDesigner on Fri May 21 23:15:07 CST 2021
 */

package ReadClockIn.www.Student;

import javax.swing.table.*;
import ReadClockIn.www.Administrator.Administrator;
import ReadClockIn.www.Administrator.AdministratorAddDao;
import ReadClockIn.www.Others.DBconnection;
import ReadClockIn.www.Others.StringUtil;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;
import java.lang.String;
import java.lang.Integer;

/**
 * @author Brainrain
 */
public class StudentAdd extends JFrame {

    private DBconnection dbconnection = new DBconnection ();
    private StudentAddDao studentAddDao = new StudentAddDao ();

    //主函数
    public static void main(String[] args) {
        StudentAdd studentAdd = new StudentAdd ();
        studentAdd.setVisible(true);
    }

    public StudentAdd() {

        //改变系统默认字体
        Font font = new Font("Dialog", Font.PLAIN, 12);
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()){
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, font);
            }
        }

        initComponents();
    }

    //重置表单
    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.resetValue ();
    }

    private void resetValue(){
        this.StudentAddNameTxt.setText("");
        this.StudentAddSnoTxt.setText("");
        this.StudentAddMajorTxt.setText("");
        this.StudentAddAccontTxt.setText("");
        this.StudentAddPasswdTxt.setText("");
        this.StudentAddGradeTxt.setText("");
        this.StudentAddCountTxt.setText("");
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        String newSno = this.StudentAddSnoTxt.getText ();
        String newName = this.StudentAddNameTxt.getText ();
        String newMajor = this.StudentAddMajorTxt.getText ();
        String newGrade = this.StudentAddGradeTxt.getText ();
        String newAccount = this.StudentAddAccontTxt.getText ();
        String newPasswd = this.StudentAddPasswdTxt.getText ();
        String  newCount = this.StudentAddCountTxt.getText ();

        if (StringUtil.isEmpty ( newSno )) {
            JOptionPane.showMessageDialog ( null,"学号不能为空！" );
            return;
        }
        if (StringUtil.isEmpty ( newName )) {
            JOptionPane.showMessageDialog ( null,"姓名不能为空！" );
            return;
        }
        if (StringUtil.isEmpty ( newMajor )) {
            JOptionPane.showMessageDialog ( null,"专业不能为空！" );
            return;
        }
        if (StringUtil.isEmpty ( newGrade )) {
            JOptionPane.showMessageDialog ( null,"年级不能为空！" );
            return;
        }
        if (StringUtil.isEmpty ( newAccount )) {
            JOptionPane.showMessageDialog ( null,"账号不能为空！" );
            return;
        }
        if (StringUtil.isEmpty ( newPasswd )) {
            JOptionPane.showMessageDialog ( null,"密码不能为空！" );
            return;
        }
        if (StringUtil.isEmpty ( newCount )) {
            JOptionPane.showMessageDialog ( null,"打卡次数不能为空！（若无次数请输入0）" );
            return;
        }

        Student student = new Student ( newSno, newName, newMajor, newGrade, newAccount, newPasswd, newCount );
        Connection con = null;
        try {
            con = dbconnection.getConnection ();
            int n = StudentAddDao.add(con, student);
            if(n == 1) {
                JOptionPane.showMessageDialog ( null,"学生信息添加成功！" );
                resetValue();
            } else {
                JOptionPane.showMessageDialog ( null , "学生信息添加失败！" );
            }
        } catch (Exception et) {
            et.printStackTrace();
            JOptionPane.showMessageDialog ( null , "学生信息添加失败！" );
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
        label6 = new JLabel();
        label7 = new JLabel();
        StudentAddSnoTxt = new JTextField();
        StudentAddMajorTxt = new JTextField();
        StudentAddGradeTxt = new JTextField();
        StudentAddAccontTxt = new JTextField();
        StudentAddPasswdTxt = new JTextField();
        StudentAddCountTxt = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        StudentAddNameTxt = new JTextField();
        label8 = new JLabel();

        //======== this ========
        setBackground(new Color(204, 204, 204));
        setTitle("\u6dfb\u52a0\u5b66\u751f\u4fe1\u606f");
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u5b66\u53f7\uff1a");
            panel1.add(label1);
            label1.setBounds(95, 125, 40, 25);

            //---- label2 ----
            label2.setText("\u59d3\u540d\uff1a");
            panel1.add(label2);
            label2.setBounds(95, 65, 40, 20);

            //---- label3 ----
            label3.setText("\u4e13\u4e1a\uff1a");
            panel1.add(label3);
            label3.setBounds(95, 185, 40, 30);

            //---- label4 ----
            label4.setText("\u5e74\u7ea7\uff1a");
            panel1.add(label4);
            label4.setBounds(95, 245, 40, 30);

            //---- label5 ----
            label5.setText("\u8d26\u53f7\uff1a");
            panel1.add(label5);
            label5.setBounds(300, 65, 55, 20);

            //---- label6 ----
            label6.setText("\u5bc6\u7801\uff1a");
            panel1.add(label6);
            label6.setBounds(300, 145, 55, 25);

            //---- label7 ----
            label7.setText("\u6253\u5361\u6b21\u6570\uff1a");
            panel1.add(label7);
            label7.setBounds(295, 225, 60, 25);
            panel1.add(StudentAddSnoTxt);
            StudentAddSnoTxt.setBounds(145, 120, 120, 35);
            panel1.add(StudentAddMajorTxt);
            StudentAddMajorTxt.setBounds(145, 180, 120, 35);
            panel1.add(StudentAddGradeTxt);
            StudentAddGradeTxt.setBounds(145, 240, 120, 35);
            panel1.add(StudentAddAccontTxt);
            StudentAddAccontTxt.setBounds(350, 60, 120, 35);
            panel1.add(StudentAddPasswdTxt);
            StudentAddPasswdTxt.setBounds(350, 140, 120, 35);
            panel1.add(StudentAddCountTxt);
            StudentAddCountTxt.setBounds(350, 220, 120, 35);

            //---- button1 ----
            button1.setText("\u6dfb\u52a0");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(180, 330, 70, 30);

            //---- button2 ----
            button2.setText("\u91cd\u7f6e");
            button2.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
		});
            panel1.add(button2);
            button2.setBounds(325, 330, 70, 30);
            panel1.add(StudentAddNameTxt);
            StudentAddNameTxt.setBounds(145, 60, 120, 35);

            //---- label8 ----
            label8.setIcon(new ImageIcon(getClass().getResource("/ReadClockIn/picture/blackground.jpg")));
            panel1.add(label8);
            label8.setBounds(0, 0, 600, 480);

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

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );
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
    private JLabel label6;
    private JLabel label7;
    private JTextField StudentAddSnoTxt;
    private JTextField StudentAddMajorTxt;
    private JTextField StudentAddGradeTxt;
    private JTextField StudentAddAccontTxt;
    private JTextField StudentAddPasswdTxt;
    private JTextField StudentAddCountTxt;
    private JButton button1;
    private JButton button2;
    private JTextField StudentAddNameTxt;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
