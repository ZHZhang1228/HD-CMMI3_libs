package management;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import java.sql.*;
import com.borland.dx.dataset.*;
import com.borland.dx.sql.dataset.*;
import com.borland.dbswing.*;


/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class Notice extends JPanel {
  PreparedStatement pstmt2;
String query2;
Connection con;
ResultSet rs;

  String CreditcardId;
  JLabel jLabel1 = new JLabel();
  JTextArea jTextArea1 = new JTextArea();

  public Notice() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  public Notice(String strx1) {
      CreditcardId = strx1;
      try {
        jbInit();
      }
      catch (Exception e) {
        e.printStackTrace();
      }
    }

  void jbInit() throws Exception {
    jLabel1.setFont(new java.awt.Font("Dialog", 0, 14));
    jLabel1.setText("系统通知");
    jLabel1.setBounds(new Rectangle(13, 17, 292, 31));
    this.setLayout(null);
    jTextArea1.setBackground(new Color(217, 230, 236));
    jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14));
    jTextArea1.setDebugGraphicsOptions(0);
    jTextArea1.setSelectedTextColor(UIManager.getColor("activeCaptionBorder"));
    try {
      String url =
          "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES";
      String username = "sa";
      String password = "";
      con = DriverManager.getConnection(url, username, password);
      query2 =
          "SELECT * FROM Notice where CreditcardId=?";
      pstmt2 = con.prepareStatement(query2);
      pstmt2.setString(1, CreditcardId);
      rs = pstmt2.executeQuery();
      int i=1;
      while(rs.next()) {
        jTextArea1.append("\n通知"+i+++":\n");
        jTextArea1.append(rs.getString("Content") + "\n\n");
      }
    }
    catch (Exception ep) {
  System.out.print("系统错误，请重新运行。");
}


    jTextArea1.setRows(0);
    jTextArea1.setBounds(new Rectangle(38, 82, 318, 184));
    this.setBackground(new Color(217, 230, 236));
    this.add(jLabel1, null);
    this.add(jTextArea1, null);
  }
}
