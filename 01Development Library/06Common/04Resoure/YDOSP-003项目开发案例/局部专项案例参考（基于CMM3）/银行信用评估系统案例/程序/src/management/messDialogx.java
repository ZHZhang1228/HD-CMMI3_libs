package management;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class messDialogx extends JDialog {
  JPanel panel1 = new JPanel();
  JLabel jLabel1 = new JLabel();
  JButton jButton1 = new JButton();

  public messDialogx(Frame frame, String title, boolean modal) {
    super(frame, title, modal);
    try {
      jbInit();
      pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public messDialogx() {
    this(null, "", false);
  }

  private void jbInit() throws Exception {
    panel1.setLayout(null);
    jLabel1.setFont(new java.awt.Font("华文行楷", 0, 18));
    jLabel1.setText("用户不存在");
    jLabel1.setBounds(new Rectangle(14, 5, 105, 33));
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setBounds(new Rectangle(27, 52, 60, 23));
    jButton1.setText("确定");
    jButton1.addActionListener(new messDialogx_jButton1_actionAdapter(this));
    this.setResizable(false);
    panel1.setBackground(new Color(217, 230, 236));
    getContentPane().add(panel1);
    panel1.add(jLabel1, null);
    panel1.add(jButton1, null);
  }

  void jButton1_actionPerformed(ActionEvent e) {
    this.dispose();
  }
}

class messDialogx_jButton1_actionAdapter implements java.awt.event.ActionListener {
  messDialogx adaptee;

  messDialogx_jButton1_actionAdapter(messDialogx adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}
