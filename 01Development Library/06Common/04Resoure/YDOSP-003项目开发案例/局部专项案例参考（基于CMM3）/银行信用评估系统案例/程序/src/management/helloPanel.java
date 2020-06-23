package management;

import java.awt.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class helloPanel extends JPanel {
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel jLabel7 = new JLabel();
  JLabel jLabel9 = new JLabel();
  GridBagLayout gridBagLayout1 = new GridBagLayout();

  public helloPanel() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  void jbInit() throws Exception {
    jLabel1.setFont(new java.awt.Font("Serif", 1, 40));
    jLabel1.setForeground(Color.blue);
    jLabel1.setText("   欢迎光临信用卡评估系统");
    this.setLayout(gridBagLayout1);

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 23));
    jLabel2.setForeground(SystemColor.activeCaption);
    jLabel2.setText("软 件 1 组 信 息 技 术 中 心");
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel4.setForeground(SystemColor.activeCaption);
    jLabel4.setText("版  本 号 : ");
    jLabel3.setEnabled(true);
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 23));
    jLabel3.setForeground(SystemColor.activeCaption);
    jLabel3.setText("软 件 1 组 全 体 组 员");
    jLabel5.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel5.setForeground(SystemColor.activeCaption);
    jLabel5.setText("开发人员: ");
    jLabel7.setFont(new java.awt.Font("Dialog", 1, 23));
    jLabel7.setForeground(SystemColor.activeCaption);
    jLabel7.setText("    1.0");
    jLabel9.setText("版      权:");
    jLabel9.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel9.setForeground(SystemColor.activeCaption);
    this.setBackground(new Color(217, 230, 236));
    this.add(jLabel5,  new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(16, 0, 6, 31), 9, 9));
    this.add(jLabel9,  new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(19, 0, 11, 0), 49, -2));
    this.add(jLabel1,  new GridBagConstraints(0, 0, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(43, 0, 0, 46), 11, 4));
    this.add(jLabel4,   new GridBagConstraints(0, 3, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(17, 0, 31, 253), 5, 2));
    this.add(jLabel7,   new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(15, 29, 31, 60), 177, 6));
    this.add(jLabel2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 19, 0, 72), 25, 26));
    this.add(jLabel3,                           new GridBagConstraints(0, 2, 2, 1, 0.0, 0.0
            ,GridBagConstraints.SOUTH, GridBagConstraints.NONE, new Insets(0, 60, 0, 44), 11, 26));
  }
}
