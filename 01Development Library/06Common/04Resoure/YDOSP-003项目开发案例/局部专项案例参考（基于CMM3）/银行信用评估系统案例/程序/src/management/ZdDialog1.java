package management;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import com.borland.dbswing.*;
import java.sql.*;
import com.borland.dx.sql.dataset.*;
import com.borland.dx.dataset.*;
import java.util.*;
import java.text.SimpleDateFormat;



/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class ZdDialog1 extends JDialog {
  JPanel panel1 = new JPanel();
  JLabel jLabel1 = new JLabel();
  JTextField jTextField1 = new JTextField();
  JButton jButton1 = new JButton();
  Database database1 = new Database();
  QueryDataSet queryDataSet1 = new QueryDataSet();
  QueryResolver queryResolver1 = new QueryResolver();
  JdbNavToolBar jdbNavToolBar1 = new JdbNavToolBar();
  JdbStatusLabel jdbStatusLabel1 = new JdbStatusLabel();
  TableScrollPane tableScrollPane1 = new TableScrollPane();
  JdbTable jdbTable1 = new JdbTable();
  JButton jButton2 = new JButton();
  ResultSet rs;
  JLabel jLabel2 = new JLabel();
  JTextField jTextField2 = new JTextField();
  Connection con;
      PreparedStatement qstmt;
      float a;
  Column column1 = new Column();
  Column column2 = new Column();
  Column column3 = new Column();
  Column column4 = new Column();
  Column column5 = new Column();
  Column column6 = new Column();
  public ZdDialog1(Frame frame, String title, boolean modal,float i) {
    super(frame, title, modal);
    a=i;
    try {
      jbInit();
      pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }


  public ZdDialog1(int i) {
    this(null, "", false,i);
  }

      private void jbInit() throws Exception {
    panel1.setLayout(null);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 15));
    jLabel1.setOpaque(false);
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setText("信用等级");
    jLabel1.setBounds(new Rectangle(60, 82, 76, 25));
    jTextField1.setBackground(Color.white);
    jTextField1.setEditable(false);
    jTextField1.setText("");
    jTextField1.setBounds(new Rectangle(183, 73, 158, 32));
    panel1.setBackground(new Color(217, 230, 236));
    panel1.setEnabled(false);
    panel1.setAlignmentY((float) 0.5);
    panel1.setBorder(null);
    panel1.setDebugGraphicsOptions(0);
    panel1.setMaximumSize(new Dimension(32767, 32767));
    panel1.setOpaque(true);
    panel1.setVerifyInputWhenFocusTarget(false);
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setBounds(new Rectangle(258, 336, 105, 32));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 20));
    jButton1.setText("退   出");
    jButton1.addActionListener(new ZdDialog1_jButton1_actionAdapter(this));
    database1.setConnection(new com.borland.dx.sql.dataset.ConnectionDescriptor("jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES", "sa", "", false, "com.microsoft.jdbc.sqlserver.SQLServerDriver"));
    database1.setTransactionIsolation(java.sql.Connection.TRANSACTION_READ_COMMITTED);
    queryDataSet1.setEnableDelete(true);
   // queryDataSet1.setQuery(new com.borland.dx.sql.dataset.QueryDescriptor(database1, "SELECT ZDthing.ZdId,ZDthing.UserId,ZDthing.Zdname,ZDthing.Zdprice,ZDthing.Zddate,ZDthing.Zdstate " +
  //    "FROM CCES.dbo.ZDthing", null, true, Load.ALL));
    queryResolver1.setDatabase(database1);
    queryResolver1.setUpdateMode(com.borland.dx.dataset.UpdateMode.KEY_COLUMNS);
    queryResolver1.setResolverQueryTimeout(0);
    jdbNavToolBar1.setBackground(new Color(217, 230, 236));
    jdbNavToolBar1.setDebugGraphicsOptions(0);
    jdbNavToolBar1.setDataSet(queryDataSet1);
    jdbNavToolBar1.setBounds(new Rectangle(61, 122, 337, 39));
    jdbStatusLabel1.setText("jdbStatusLabel1");
    jdbStatusLabel1.setDataSet(queryDataSet1);
    jdbStatusLabel1.setBounds(new Rectangle(363, 118, 87, 26));
    tableScrollPane1.getViewport().setBackground(new Color(217, 230, 236));
    tableScrollPane1.setBounds(new Rectangle(16, 185, 475, 136));
    jdbTable1.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    jdbTable1.setDataSet(queryDataSet1);
    jButton2.setBackground(new Color(151, 164, 203));
    jButton2.setBounds(new Rectangle(81, 335, 98, 32));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 15));
    jButton2.setText("确  定");
    jButton2.addActionListener(new ZdDialog1_jButton2_actionAdapter(this));
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 15));
    jLabel2.setPreferredSize(new Dimension(33, 16));
    jLabel2.setText("用户号");
    jLabel2.setBounds(new Rectangle(75, 40, 66, 28));
    jTextField2.setText("");
    jTextField2.setBounds(new Rectangle(185, 34, 156, 26));
    column1.setCaption("物品号");
    column1.setColumnName("ZdId");
    column1.setDataType(com.borland.dx.dataset.Variant.LONG);
    column1.setRowId(true);
    column1.setSchemaName("dbo");
    column1.setTableName("ZDthing");
    column1.setServerColumnName("ZdId");
    column1.setSqlType(-5);
    column2.setCaption("用户号");
    column2.setColumnName("UserId");
    column2.setDataType(com.borland.dx.dataset.Variant.LONG);
    column2.setSchemaName("dbo");
    column2.setTableName("ZDthing");
    column2.setServerColumnName("UserId");
    column2.setSqlType(-5);
    column3.setCaption("物品名称");
    column3.setColumnName("Zdname");
    column3.setDataType(com.borland.dx.dataset.Variant.STRING);
    column3.setPrecision(40);
    column3.setSchemaName("dbo");
    column3.setTableName("ZDthing");
    column3.setServerColumnName("Zdname");
    column3.setSqlType(12);
    column4.setCaption("加工和");
    column4.setColumnName("Zdprice");
    column4.setCaption("价格");
    column4.setColumnName("Zdprice");
    column4.setDataType(com.borland.dx.dataset.Variant.INT);
    column4.setSchemaName("dbo");
    column4.setTableName("ZDthing");
    column4.setServerColumnName("Zdprice");
    column4.setSqlType(4);
    column5.setCaption("Zddate");
    column5.setCaption("日期");
    column5.setColumnName("Zddate");
    column5.setDataType(com.borland.dx.dataset.Variant.STRING);
    column5.setPrecision(40);
    column5.setSchemaName("dbo");
    column5.setTableName("ZDthing");
    column5.setServerColumnName("Zddate");
    column5.setSqlType(12);
    column6.setCaption("物品状态");
    column6.setColumnName("Zdstate");
    column6.setDataType(com.borland.dx.dataset.Variant.STRING);
    column6.setPrecision(6);
    column6.setSchemaName("dbo");
    column6.setTableName("ZDthing");
    column6.setServerColumnName("Zdstate");
    column6.setSqlType(1);
    getContentPane().add(panel1);
    panel1.add(jdbStatusLabel1, null);
    panel1.add(jButton1, null);
    panel1.add(jButton2, null);
    panel1.add(tableScrollPane1, null);
    tableScrollPane1.getViewport().add(jdbTable1, null);
    panel1.add(jdbNavToolBar1, null);
    panel1.add(jTextField1, null);
    panel1.add(jLabel1, null);
    panel1.add(jTextField2, null);
    panel1.add(jLabel2, null);
    jTextField1.setText("");
    queryDataSet1.setColumns(new Column[] {column1, column2, column3, column4, column5, column6});
    String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES";
   String username= "sa";
   String password= "";
   con = DriverManager.getConnection(url,username,password);

  }



  void jButton1_actionPerformed(ActionEvent e) {
  this.dispose();

  }

  void jButton2_actionPerformed(ActionEvent e) {

    {
      if(a==0)
         {
         jTextField1.setText("H");
         }
       else if(0<a&&a<2000)
      {
      jTextField1.setText("G");
      }
      else if(2000<=a && a<5000){
        jTextField1.setText("F");
      }

      else if(5000<=a&&a<10000){
        jTextField1.setText("E");
      }
      else if(10000<=a&&a<20000){
               jTextField1.setText("D");
             }
     else if(20000<=a&&a<30000){
     jTextField1.setText("C");
                    }
     else if(30000<=a&&a<40000){
     jTextField1.setText("B");
                           }
   else if(40000<=a){
   jTextField1.setText("A");
   }


    try{
      String str3="000";
            String insert1 = "Insert Into Creditcard(UserId,CreditcardGrade,CreditcardCode) Values("+"\'"+jTextField2.getText()+"\'"+","+"\'"+jTextField1.getText()+"\'"+","+"\'"+str3+"\'"+")";
            Statement stmt1;
            stmt1 = con.createStatement();
            stmt1.executeUpdate(insert1);
      String str1 = jTextField2.getText();
       String query = "select * from ZDthing where UserId=?";
        qstmt = con.prepareStatement(query);
       qstmt.setString(1, str1);
        rs = qstmt.executeQuery();
        if (rs.next()) {
          queryDataSet1.close();
         String str = rs.getString("UserId");
          str = "select * from ZDthing where UserId=" + "\'" + str + "\'";
          queryDataSet1.setQuery(new com.borland.dx.sql.dataset.QueryDescriptor(
          database1, str, null, true, Load.ALL));
          queryDataSet1.refresh();
          jdbTable1.setDataSet(queryDataSet1);
          jdbTable1.repaint();
        }
        else {

          jTextField2.setText("用户不存在!");
          queryDataSet1.close();
          queryDataSet1.refresh();
          jdbTable1.setDataSet(null);
          jdbTable1.repaint();
        }



        }

         catch(Exception ef)
         { System.out.print("系统错误，请重新运行。");
         }
      }

  }


}

class ZdDialog1_jButton1_actionAdapter implements java.awt.event.ActionListener {
  ZdDialog1 adaptee;

  ZdDialog1_jButton1_actionAdapter(ZdDialog1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class ZdDialog1_jButton2_actionAdapter implements java.awt.event.ActionListener {
  ZdDialog1 adaptee;

  ZdDialog1_jButton2_actionAdapter(ZdDialog1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}
