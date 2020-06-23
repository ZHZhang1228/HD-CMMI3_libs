
package management;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import com.borland.dx.dataset.*;
import com.borland.jbcl.layout.*;
import com.borland.dx.sql.dataset.*;
import java.awt.event.*;
import javax.swing.border.*;


/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class ChangePassword extends JPanel {
  JLabel jLabel1 = new JLabel();
  JPasswordField jPasswordField1 = new JPasswordField();
  JLabel jLabel3 = new JLabel();
  JPasswordField jPasswordField3 = new JPasswordField();
  JLabel jLabel4 = new JLabel();
  JPasswordField jPasswordField4 = new JPasswordField();
  JButton jButton1 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel6 = new JLabel();
    JLabel jLabel7 = new JLabel();
  Database database1 = new Database();
  QueryDataSet queryDataSet1 = new QueryDataSet();
  QueryResolver queryResolver1 = new QueryResolver();

  PreparedStatement pstmt;
  Connection con;
  String query;
  ResultSet rs;
  String str;
  String strx;
  JLabel jLabel8 = new JLabel();
  JLabel jLabel5 = new JLabel();
  TitledBorder titledBorder1;
  TitledBorder titledBorder2;
  GridBagLayout gridBagLayout1 = new GridBagLayout();
  public ChangePassword() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  public ChangePassword(String strx1) {
  strx=strx1;
    try {
    jbInit();
  }
  catch(Exception ex) {
    ex.printStackTrace();
  }
}



  void jbInit() throws Exception {
    titledBorder1 = new TitledBorder("");
    titledBorder2 = new TitledBorder("");
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel1.setForeground(SystemColor.activeCaption);
    jLabel1.setText(" 旧 密 码：");
    this.setLayout(gridBagLayout1);
    this.setBackground(new Color(217, 230, 236));
    this.setDebugGraphicsOptions(0);
    this.setMaximumSize(new Dimension(2147483647, 2147483647));
    this.setOpaque(true);
    this.setToolTipText("");
    jPasswordField1.setText("");
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel3.setForeground(SystemColor.activeCaption);
    jLabel3.setText("新密码：");
    jPasswordField3.setText("");
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel4.setForeground(SystemColor.activeCaption);
    jLabel4.setText("确认新密码：");
    jPasswordField4.setSelectionStart(15);
    jPasswordField4.setText("");
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 18));
    jButton1.setAlignmentY((float) 0.5);
    jButton1.setText("修改");
    jButton1.addActionListener(new ChangePassword_jButton1_actionAdapter(this));
    jButton3.setBackground(new Color(151, 164, 203));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 15));
    jButton3.setText("重置新密码");
    jButton3.addActionListener(new ChangePassword_jButton3_actionAdapter(this));
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel6.setForeground(SystemColor.activeCaption);
    jLabel6.setText("");
    jLabel7.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel7.setForeground(SystemColor.activeCaption);
    jLabel7.setText("操作：");
    jLabel8.setBackground(Color.lightGray);
    jLabel8.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel8.setForeground(Color.red);
    jLabel8.setBorder(titledBorder2);
    jLabel5.setFont(new java.awt.Font("宋体", 1, 35));
    jLabel5.setText("用 户 密 码 管 理");
    this.add(jLabel6,  new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(17, 14, 27, 25), 10, 3));
    this.add(jLabel8,  new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(19, 42, 27, 0), 158, 19));
    this.add(jLabel5,  new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 80, 0, 99), 56, 14));
    this.add(jPasswordField4,  new GridBagConstraints(1, 3, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(17, 41, 0, 8), 157, 1));
    this.add(jLabel4,  new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(16, 14, 0, 0), 12, -5));
    this.add(jPasswordField3,  new GridBagConstraints(1, 2, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(17, 42, 0, 8), 156, 2));
    this.add(jLabel3,  new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(20, 14, 0, 27), 31, -9));
    this.add(jLabel7,  new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(32, 14, 0, 23), 58, -3));
    this.add(jButton3,  new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(16, 25, 0, 14), 18, -4));
    this.add(jButton1,  new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(29, 41, 0, 59), 39, -3));
    this.add(jPasswordField1,  new GridBagConstraints(1, 1, 1, 2, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(36, 43, 38, 8), 155, 2));
    this.add(jLabel1,  new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(31, 7, 0, 20), 23, -5));

    Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
    String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES";
    String username= "sa";
    String password= "";
    con = DriverManager.getConnection(url,username,password);

    jLabel6.setText("修改结果：");

  }

  void jButton1_actionPerformed(ActionEvent e) {
    String str1=null;
    String str3=null;
    String str4=null;

    for(int i=0;i<jPasswordField1.getPassword().length;i++)
      str1+=jPasswordField1.getPassword()[i];
      str1=str1.substring(4);
    for(int i=0;i<jPasswordField3.getPassword().length;i++)
      str3+=jPasswordField3.getPassword()[i];
      str3=str3.substring(4);
    for(int i=0;i<jPasswordField4.getPassword().length;i++)
      str4+=jPasswordField4.getPassword()[i];
      str4=str4.substring(4);
       try{
         query = "select * from Creditcard where CreditcardID=?";
         pstmt = con.prepareStatement(query);
         pstmt.setString(1,strx);
          rs=pstmt.executeQuery();

           if(rs.next()){
              str = rs.getString("CreditcardCode");

              if(str1.equals(str))
               {
                  if(str3.equals(str4))
                  {
                    //更新密码；
                    jLabel8.setText("更新密码成功");
                    query = "update Creditcard set CreditcardCode="+ "\'"+str3+ "\'"+"where CreditcardID=?";
                    pstmt = con.prepareStatement(query);
                    pstmt.setString(1,strx);
                   rs=pstmt.executeQuery();
                  }
                 else
                  { jLabel8.setText("新密码不匹配，请重新输入");
                   jPasswordField3.setText("");
                   jPasswordField4.setText("");
                  }
                }

              else
              {
                  jLabel8.setText("旧密码输入错误，请重新输入");
                   jPasswordField1.setText("");
              }
           }
           else
             jLabel8.setText("没有匹配项!");
       }
       catch(Exception ep)
       {
       }
  }

  void jButton3_actionPerformed(ActionEvent e) {
    jPasswordField3.setText("");
    jPasswordField4.setText("");
  }
}

class ChangePassword_jButton1_actionAdapter implements java.awt.event.ActionListener {
  ChangePassword adaptee;

  ChangePassword_jButton1_actionAdapter(ChangePassword adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class ChangePassword_jButton3_actionAdapter implements java.awt.event.ActionListener {
  ChangePassword adaptee;

  ChangePassword_jButton3_actionAdapter(ChangePassword adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }
}
