package management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import java.sql.*;
import com.borland.dx.dataset.*;
import com.borland.dx.sql.dataset.*;
import com.borland.dbswing.*;
import javax.swing.border.*;



/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class sendNotice extends JPanel {
  PreparedStatement pstmt2;
String query2;
Connection con;
ResultSet rrs;

  JLabel jLabel1 = new JLabel();
  JTextField jTextField1 = new JTextField();
  JTextArea jTextArea1 = new JTextArea();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  TitledBorder titledBorder1;
  TitledBorder titledBorder2;
  JLabel jLabel2 = new JLabel();

  public sendNotice() {
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
    jLabel1.setBackground(new Color(151, 164, 203));
    jLabel1.setFont(new java.awt.Font("Dialog", 0, 14));
    jLabel1.setPreferredSize(new Dimension(0, 0));
    jLabel1.setRequestFocusEnabled(true);
    jLabel1.setText("信用卡号：");
    this.setLayout(null);
    this.setBackground(new Color(217, 230, 236));
    this.setForeground(Color.black);
    jTextField1.setFont(new java.awt.Font("Dialog", 0, 14));
    jTextField1.setText("");
    jTextField1.setBounds(new Rectangle(224, 47, 71, 34));
    jTextArea1.setBorder(BorderFactory.createLoweredBevelBorder());
    jTextArea1.setSelectionStart(0);
    jTextArea1.setText("");
    jTextArea1.setBounds(new Rectangle(37, 133, 317, 124));
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setBounds(new Rectangle(103, 281, 85, 28));
    jButton1.setFont(new java.awt.Font("Dialog", 0, 14));
    jButton1.setText("发送");
    jButton1.addActionListener(new sendNotice_jButton1_actionAdapter(this));
    jButton2.setBackground(new Color(151, 164, 203));
    jButton2.setBounds(new Rectangle(240, 281, 77, 29));
    jButton2.setFont(new java.awt.Font("Dialog", 0, 14));
    jButton2.setText("取消");
    jButton2.addActionListener(new sendNotice_jButton2_actionAdapter(this));
    try {
    String url =
        "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES";
    String username = "sa";
    String password = "";
    con = DriverManager.getConnection(url, username, password);
  }
  catch (Exception ep) {
System.out.print("系统错误，请重新运行。2");
    ep.printStackTrace() ;
}

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 18));
    jLabel2.setText("信用卡号：");
    jLabel2.setBounds(new Rectangle(68, 51, 121, 26));
    this.add(jLabel1, null);
    this.add(jTextField1, null);
    this.add(jTextArea1, null);
    this.add(jButton1, null);
    this.add(jButton2, null);
    this.add(jLabel2, null);
  }

  void jButton1_actionPerformed(ActionEvent e) {
    try{
      query2 =
          "insert into Notice(CreditcardId,Content) values('"+jTextField1.getText()+"','"+jTextArea1.getText()+"')";

      pstmt2 = con.prepareStatement(query2);
      rrs = pstmt2.executeQuery();
    }
    catch (Exception eep) {
      jTextField1.setText("");
    jTextArea1.setText("");

    }
  }

  void jButton2_actionPerformed(ActionEvent e) {
    jTextField1.setText("");
    jTextArea1.setText("");
  }
}

class sendNotice_jButton1_actionAdapter implements java.awt.event.ActionListener {
  sendNotice adaptee;

  sendNotice_jButton1_actionAdapter(sendNotice adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class sendNotice_jButton2_actionAdapter implements java.awt.event.ActionListener {
  sendNotice adaptee;

  sendNotice_jButton2_actionAdapter(sendNotice adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}
