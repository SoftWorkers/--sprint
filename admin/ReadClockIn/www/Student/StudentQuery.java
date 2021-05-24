/*
 * Created by JFormDesigner on Fri May 21 23:30:59 CST 2021
 */

package ReadClockIn.www.Student;

import javax.swing.border.*;
import javax.swing.table.*;

import ReadClockIn.www.Others.DBconnection;
import ReadClockIn.www.Others.StringUtil;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Brainrain
 */
public class StudentQuery extends JFrame {

    private DBconnection dbconnection = new DBconnection ();
    private StudentQueryDao studentQueryDao = new StudentQueryDao ();
    private StudentUpdateDao studentUpdateDao = new StudentUpdateDao ();

    //主函数
    public static void main(String[] args) {
        StudentQuery studentQuery = new StudentQuery ();
        studentQuery.setVisible(true);
    }

    public StudentQuery() {

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

    //重置查询表单
    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.resetValue ();
    }

    private void resetValue(){
        this.StduentQuerySnoTxt.setText("");
    }

    //模糊查询
    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        String queryAccount = this.StduentQuerySnoTxt.getText ();
        Student student = new Student ( );
        student.setSno ( queryAccount );
        this.fillTable ( student );
    }

    //初始化表格
    private void fillTable(Student student) {
        DefaultTableModel dtm = (DefaultTableModel) studenttable.getModel();
        dtm.setRowCount ( 0 ); //设置成0行
        Connection con = null;
        try {
            con = dbconnection.getConnection ();
            ResultSet rs = StudentQueryDao.list(con, student);
            while(rs.next()) {
                Vector v = new Vector();
                v.add( rs.getInt ( "id" ) );
                v.add( rs.getString ( "sno" ) );
                v.add( rs.getString ( "name" ) );
                v.add( rs.getString ( "major" ) );
                v.add( rs.getString ( "grade" ) );
                v.add( rs.getString ( "loginAccount" ) );
                v.add( rs.getString ( "passwd" ) );
                v.add( rs.getString ( "count" ) );
                dtm.addRow( v );
            }
        }catch (Exception et) {
            et.printStackTrace();
        }

//        finally {
//            try {
//                dbconnection.closeCon ( con );
//            } catch (Exception et) {
//                et.printStackTrace();
//            }
//        }
    }

    //重置修改表单
    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.resetValue2 ();
    }

    private void resetValue2(){
        this.StudentUpdateNameTxt.setText("");
        this.StudentUpdateSnoTxt.setText("");
        this.StudentUpdateMajorTxt.setText("");
        this.StudentUpdateAccontTxt.setText("");
        this.StudentUpdatePasswdTxt.setText("");
        this.StudentUpdateGradeTxt.setText("");
        this.StudentUpdateCountTxt.setText("");
        this.StudentUpdateIdTxt.setText("");
    }

    //表格行点击事件处理
//    private void studenttableMousePressed(MouseEvent e) {
//        // TODO add your code here
//        int row = studenttable.getSelectedRow();
//        StudentUpdateIdTxt.setText ( (String) studenttable.getValueAt ( row, 0 ) );
//        StudentUpdateSnoTxt.setText ( (String) studenttable.getValueAt ( row, 1 ) );
//        StudentUpdateNameTxt.setText ( (String) studenttable.getValueAt ( row, 2 ) );
//        StudentUpdateMajorTxt.setText ( (String) studenttable.getValueAt ( row, 3 ) );
//        StudentUpdateGradeTxt.setText ( (String) studenttable.getValueAt ( row, 4 ) );
//        StudentUpdateAccontTxt.setText ( (String) studenttable.getValueAt ( row, 5 ) );
//        StudentUpdatePasswdTxt.setText ( (String) studenttable.getValueAt ( row, 6 ) );
//        StudentUpdateCountTxt.setText ( (String) studenttable.getValueAt ( row, 7 ) );
//    }

//    private void studenttableMouseClicked(MouseEvent e) {
//        // TODO add your code here
//    }

    //修改
    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        String newname = StudentUpdateNameTxt.getText();
        String newsno = StudentUpdateSnoTxt.getText();
        String newmajor = StudentUpdateMajorTxt.getText();
        String newaccount = StudentUpdateAccontTxt.getText();
        String newpasswd = StudentUpdatePasswdTxt.getText();
        String newgrade = StudentUpdateGradeTxt.getText();
        String newcount = StudentUpdateCountTxt.getText();
        String newid = StudentUpdateIdTxt.getText();
        if (StringUtil.isEmpty ( newid )) {
            JOptionPane.showMessageDialog ( null,"请输入要修改的记录" );
            return;
        }
        Student student = new Student ( Integer.parseInt ( newid ) ,newsno, newname, newmajor, newgrade, newaccount, newpasswd, newcount );
        Connection con = null;
        try {
            con = dbconnection.getConnection ();
            int n = StudentUpdateDao.update(con, student);
            if(n == 1) {
                JOptionPane.showMessageDialog ( null,"学生信息修改成功！" );
                resetValue();
            } else {
                JOptionPane.showMessageDialog ( null , "学生信息修改失败！" );
            }
        } catch (Exception et) {
            et.printStackTrace();
            JOptionPane.showMessageDialog ( null , "学生信息修改失败！" );
        }

    }

    private void studenttableMousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void studenttableMouseClicked(MouseEvent e) {
        // TODO add your code here
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        StduentQuerySnoTxt = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        scrollPane1 = new JScrollPane();
        studenttable = new JTable();
        panel2 = new JPanel();
        label9 = new JLabel();
        StudentUpdateNameTxt = new JTextField();
        StudentUpdateSnoTxt = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        StudentUpdateMajorTxt = new JTextField();
        StudentUpdateGradeTxt = new JTextField();
        label4 = new JLabel();
        StudentUpdateCountTxt = new JTextField();
        label7 = new JLabel();
        StudentUpdatePasswdTxt = new JTextField();
        label6 = new JLabel();
        label5 = new JLabel();
        StudentUpdateAccontTxt = new JTextField();
        button3 = new JButton();
        button4 = new JButton();
        label8 = new JLabel();
        StudentUpdateIdTxt = new JTextField();
        label10 = new JLabel();

        //======== this ========
        setTitle("\u67e5\u8be2\u5b66\u751f\u4fe1\u606f");
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("\u5b66\u53f7\uff1a");
            panel1.add(label1);
            label1.setBounds(100, 30, 55, 25);
            panel1.add(StduentQuerySnoTxt);
            StduentQuerySnoTxt.setBounds(160, 25, 120, 35);

            //---- button1 ----
            button1.setText("\u67e5\u8be2");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1);
            button1.setBounds(315, 25, 70, 30);

            //---- button2 ----
            button2.setText("\u91cd\u7f6e");
            button2.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
			button2ActionPerformed(e);
			button2ActionPerformed(e);
		});
            panel1.add(button2);
            button2.setBounds(405, 25, 70, 30);

            //======== scrollPane1 ========
            {

                //---- studenttable ----
                studenttable.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                        "\u7f16\u53f7", "\u5b66\u53f7", "\u59d3\u540d", "\u4e13\u4e1a", "\u5e74\u7ea7", "\u8d26\u53f7", "\u5bc6\u7801", "\u6253\u5361\u6b21\u6570"
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false, false, false
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                });
                studenttable.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        studenttableMouseClicked(e);
                    }
                    @Override
                    public void mousePressed(MouseEvent e) {
                        studenttableMousePressed(e);
                        studenttableMousePressed(e);
                        studenttableMousePressed(e);
                    }
                });
                scrollPane1.setViewportView(studenttable);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(15, 65, 720, 185);

            //======== panel2 ========
            {
                panel2.setBorder(new TitledBorder("\u4fee\u6539\u8868\u5355"));
                panel2.setLayout(null);

                //---- label9 ----
                label9.setText("\u59d3\u540d\uff1a");
                panel2.add(label9);
                label9.setBounds(20, 110, 40, 20);
                panel2.add(StudentUpdateNameTxt);
                StudentUpdateNameTxt.setBounds(65, 105, 120, 35);
                panel2.add(StudentUpdateSnoTxt);
                StudentUpdateSnoTxt.setBounds(65, 165, 120, 35);

                //---- label2 ----
                label2.setText("\u5b66\u53f7\uff1a");
                panel2.add(label2);
                label2.setBounds(20, 170, 40, 25);

                //---- label3 ----
                label3.setText("\u4e13\u4e1a\uff1a");
                panel2.add(label3);
                label3.setBounds(225, 50, 40, 25);
                panel2.add(StudentUpdateMajorTxt);
                StudentUpdateMajorTxt.setBounds(270, 45, 120, 35);
                panel2.add(StudentUpdateGradeTxt);
                StudentUpdateGradeTxt.setBounds(270, 105, 120, 35);

                //---- label4 ----
                label4.setText("\u5e74\u7ea7\uff1a");
                panel2.add(label4);
                label4.setBounds(225, 110, 40, 25);
                panel2.add(StudentUpdateCountTxt);
                StudentUpdateCountTxt.setBounds(495, 105, 120, 35);

                //---- label7 ----
                label7.setText("\u6253\u5361\u6b21\u6570\uff1a");
                panel2.add(label7);
                label7.setBounds(435, 110, label7.getPreferredSize().width, 25);
                panel2.add(StudentUpdatePasswdTxt);
                StudentUpdatePasswdTxt.setBounds(495, 45, 120, 35);

                //---- label6 ----
                label6.setText("\u5bc6\u7801\uff1a");
                panel2.add(label6);
                label6.setBounds(440, 55, 55, 20);

                //---- label5 ----
                label5.setText("\u8d26\u53f7\uff1a");
                panel2.add(label5);
                label5.setBounds(225, 170, 55, 20);
                panel2.add(StudentUpdateAccontTxt);
                StudentUpdateAccontTxt.setBounds(270, 160, 120, 35);

                //---- button3 ----
                button3.setText("\u91cd\u7f6e");
                button3.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
			button3ActionPerformed(e);
			button3ActionPerformed(e);
			button3ActionPerformed(e);
			button3ActionPerformed(e);
			button3ActionPerformed(e);
		});
                panel2.add(button3);
                button3.setBounds(560, 170, 70, 30);

                //---- button4 ----
                button4.setText("\u4fee\u6539");
                button4.addActionListener(e -> {
			button1ActionPerformed(e);
			button4ActionPerformed(e);
		});
                panel2.add(button4);
                button4.setBounds(455, 170, 70, 30);

                //---- label8 ----
                label8.setText("\u7f16\u53f7\uff1a");
                panel2.add(label8);
                label8.setBounds(20, 50, 40, 20);
                panel2.add(StudentUpdateIdTxt);
                StudentUpdateIdTxt.setBounds(65, 45, 120, 35);

                { // compute preferred size
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
            panel2.setBounds(15, 265, 720, 240);

            //---- label10 ----
            label10.setIcon(new ImageIcon(getClass().getResource("/ReadClockIn/picture/blackground.jpg")));
            panel1.add(label10);
            label10.setBounds(0, 0, 755, 555);

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
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 756, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JTextField StduentQuerySnoTxt;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTable studenttable;
    private JPanel panel2;
    private JLabel label9;
    private JTextField StudentUpdateNameTxt;
    private JTextField StudentUpdateSnoTxt;
    private JLabel label2;
    private JLabel label3;
    private JTextField StudentUpdateMajorTxt;
    private JTextField StudentUpdateGradeTxt;
    private JLabel label4;
    private JTextField StudentUpdateCountTxt;
    private JLabel label7;
    private JTextField StudentUpdatePasswdTxt;
    private JLabel label6;
    private JLabel label5;
    private JTextField StudentUpdateAccontTxt;
    private JButton button3;
    private JButton button4;
    private JLabel label8;
    private JTextField StudentUpdateIdTxt;
    private JLabel label10;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
