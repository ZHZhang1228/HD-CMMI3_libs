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

public class ExitSystem extends JDialog {
  JPanel panel1 = new JPanel();
  JLabel jLabel1 = new JLabel();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  BorderLayout borderLayout1 = new BorderLayout();

  public ExitSystem(Frame frame, String title, boolean modal) {
    super(frame, title, modal);
    try {
      jbInit();
      pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public ExitSystem() {
    this(null, "", false);
  }

  private void jbInit() throws Exception {
    panel1.setLayout(null);
    jLabel1.setFont(new java.awt.Font("宋体", 1, 35));
    jLabel1.setText("确定要退出系统吗？");
    jLabel1.setBounds(new Rectangle(14, 8, 356, 45));
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setBounds(new Rectangle(62, 72, 83, 30));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 15));
    jButton1.setText("确定");
    jButton1.addActionListener(new ExitSystem_jButton1_actionAdapter(this));
    jButton2.setBackground(new Color(151, 164, 203));
    jButton2.setBounds(new Rectangle(194, 72, 83, 31));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 15));
    jButton2.setText("取消");
    jButton2.addActionListener(new ExitSystem_jButton2_actionAdapter(this));
    this.getContentPane().setLayout(borderLayout1);
    this.getContentPane().setBackground(new Color(217, 230, 236));
    this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    this.setForeground(new Color(217, 230, 236));
    this.setModal(false);
    this.setResizable(false);
    this.setTitle("系统退出");
    borderLayout1.setHgap(200);
    borderLayout1.setVgap(200);
    panel1.setBackground(new Color(217, 230, 236));
    panel1.setAlignmentX((float) 0.5);
    getContentPane().add(panel1, BorderLayout.CENTER);
    panel1.add(jLabel1, null);
    panel1.add(jButton1, null);
    panel1.add(jButton2, null);
  }

  void jButton1_actionPerformed(ActionEvent e) {
    System.exit(0);
  }

  void jButton2_actionPerformed(ActionEvent e) {
  this.dispose();
  }

}

class ExitSystem_jButton1_actionAdapter implements java.awt.event.ActionListener {
  ExitSystem adaptee;

  ExitSystem_jButton1_actionAdapter(ExitSystem adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class ExitSystem_jButton2_actionAdapter implements java.awt.event.ActionListener {
  ExitSystem adaptee;

  ExitSystem_jButton2_actionAdapter(ExitSystem adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}
