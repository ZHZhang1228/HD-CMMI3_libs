package management;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import com.borland.jbcl.layout.*;
import java.util.Calendar;
import com.borland.dbswing.*;
import com.borland.dx.sql.dataset.*;
import java.sql.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class CreditAdjustSetPanel extends JPanel {
  JTabbedPane jTabbedPane1 = new JTabbedPane();
  CardUsePanel panel1=new CardUsePanel();
  BadBehaviorPanel panel3=new BadBehaviorPanel();
    JLabel jLabel1 = new JLabel();
  JTextField jTextField1 = new JTextField();
  JButton jButton1 = new JButton();
  BorderLayout borderLayout1 = new BorderLayout();

  public CreditAdjustSetPanel() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }

  }

  void jbInit() throws Exception {
    this.setLayout(borderLayout1);
    jLabel1.setText("发卡行自主决定");
    jLabel1.setBounds(new Rectangle(26, 38, 163, 16));
    jTextField1.setText("10");
    jTextField1.setBounds(new Rectangle(40, 71, 84, 28));
    jButton1.setBounds(new Rectangle(36, 114, 73, 25));
    jButton1.setText("修改");
    this.setMaximumSize(new Dimension(32767, 32767));
    jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 13));
    this.add(jTabbedPane1, BorderLayout.CENTER);
    jTabbedPane1.add(panel1,  "用卡情况计分标准");
    jTabbedPane1.add(panel3,  "不良记录计分标准");
   }

  void jButton1_actionPerformed(ActionEvent e) {

  }
}
