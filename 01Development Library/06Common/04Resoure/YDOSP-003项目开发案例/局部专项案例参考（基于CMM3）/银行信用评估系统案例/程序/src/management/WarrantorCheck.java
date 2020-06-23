package management;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
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

class WarrantorCheck extends JPanel {
 // private  boolean success;
 private int flag=-1 ;
 String YHworkerID;

 JLabel jLabel1 = new JLabel();
  JTextField jTextField1 = new JTextField();
  JButton jButton1 = new JButton();
  JLabel jLabel5 = new JLabel();
  JTextField jTextField2 = new JTextField();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JTextField jTextField4 = new JTextField();
  JTextField jTextField3 = new JTextField();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel11 = new JLabel();
  JLabel jLabel12 = new JLabel();
  JLabel jLabel13 = new JLabel();
  JButton jButton2 = new JButton();
  GridBagLayout gridBagLayout1 = new GridBagLayout();

  public WarrantorCheck() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }


  public WarrantorCheck(String  str) {
      YHworkerID =str;
      try {
        jbInit();
      }
      catch(Exception ex) {
        ex.printStackTrace();
      }
    }





  public WarrantorCheck(int flag) {

    this.flag =flag;
  try {
    jbInit();
  }
  catch(Exception ex) {
    ex.printStackTrace();
  }
}


  public  int  getState()
  {
      return flag;
  }

  void jbInit() throws Exception {
    jLabel1.setFont(new java.awt.Font("Dialog", 0, 15));
    jLabel1.setText("担保人身份证号");
    this.setLayout(gridBagLayout1);
    jTextField1.setFont(new java.awt.Font("Dialog", 0, 15));
    jTextField1.setText("");
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setFont(new java.awt.Font("Dialog", 0, 15));
    jButton1.setText("检    查");
    jButton1.addActionListener(new WarrantorCheck_jButton1_actionAdapter(this));
    jLabel5.setFont(new java.awt.Font("Dialog", 0, 15));
    jLabel5.setText("担保人姓名");
    jTextField2.setFont(new java.awt.Font("Dialog", 0, 15));
    jTextField2.setText("");
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 30));
    jLabel2.setText("请先输入担保人信息");
    jLabel3.setFont(new java.awt.Font("Dialog", 0, 15));
    jLabel3.setText("申请人姓名");
    jTextField4.setFont(new java.awt.Font("Dialog", 0, 15));
    jTextField4.setText("");
    jTextField3.setFont(new java.awt.Font("Dialog", 0, 15));
    jTextField3.setText("");
    jLabel4.setFont(new java.awt.Font("Dialog", 0, 15));
    jLabel4.setText("申请人身份证号");
    jLabel11.setBounds(new Rectangle(22, 149, 54, 15));
    jLabel11.setText("户口性质");
    jLabel12.setBounds(new Rectangle(22, 149, 54, 15));
    jLabel12.setText("户口性质");
    jLabel13.setBounds(new Rectangle(22, 149, 54, 15));
    jLabel13.setText("户口性质");
    jButton2.addActionListener(new WarrantorCheck_jButton2_actionAdapter(this));
    jButton2.setText("重    置");
    jButton2.addActionListener(new WarrantorCheck_jButton2_actionAdapter(this));
    jButton2.setBackground(new Color(151, 164, 203));
    jButton2.setFont(new java.awt.Font("Dialog", 0, 15));
    this.setBackground(new Color(217, 230, 236));
    this.add(jLabel5,  new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(26, 29, 0, 54), 14, -6));
    this.add(jLabel1,  new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(21, 29, 0, 27), 11, -6));
    this.add(jTextField1,  new GridBagConstraints(1, 4, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(19, 11, 0, 43), 155, -8));
    this.add(jTextField2,  new GridBagConstraints(1, 3, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(24, 11, 0, 110), 88, -9));
    this.add(jTextField4,  new GridBagConstraints(1, 1, 1, 2, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(24, 13, 35, 110), 86, -9));
    this.add(jTextField3,  new GridBagConstraints(1, 2, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(21, 10, 0, 43), 157, -9));
    this.add(jLabel2,  new GridBagConstraints(0, 0, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(51, 44, 0, 51), 8, -11));
    this.add(jLabel3,  new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(22, 29, 0, 56), 13, -6));
    this.add(jLabel4,  new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(22, 29, 0, 27), 11, -3));
    this.add(jButton1,  new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(15, 91, 20, 0), 1, -5));
    this.add(jButton2,  new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(15, 65, 20, 68), 1, -5));

    //String UID;

  }

  void jButton1_actionPerformed(ActionEvent e) {


    String grade;
    String newGrade="";
    int flag=0;
    CheckDialog CheckDialog1=new CheckDialog();
   // jTextField2.setText("");
    String UID;       //用户号
    String Username;  //被担保人姓名
    String UserPID;   //被担保人身份证号
    String  UPID; //担保人身份证号
    String DBname;//担保人姓名

    //选项不能为空
    if((jTextField3.getText() ).equals("")||(jTextField4.getText() ).equals("")
       ||(jTextField1.getText() ).equals("")||(jTextField2.getText() ).equals(""))
        {   CheckDialog CheckDialogErr=new CheckDialog("担保失败！请正确填写各项资料！");
            CheckDialogErr.setBounds(300,200,300,200);
            CheckDialogErr.show();
          }
    else if((jTextField1.getText() ).equals(jTextField3.getText() ))
    {
          CheckDialog CheckDialogErr=new CheckDialog("不能自身担保！！");
          CheckDialogErr.setBounds(300,200,300,200);
          CheckDialogErr.show();

    }
    else
    {
      try
      {

      Connection con;
      String query;
      String query2;
      ResultSet rs;
      ResultSet rs2;
      PreparedStatement pstmt;
      PreparedStatement pstmt2;
      Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
      String url =
          "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES";

      String username = "sa";
      String password = "";
      con = DriverManager.getConnection(url, username, password);
      query = "select * from Users where UserCard=? ";
      pstmt = con.prepareStatement(query);
      UPID = jTextField1.getText();
      Username=jTextField4.getText();
      UserPID=jTextField3.getText();
      DBname=jTextField2.getText();
      pstmt.setString(1, UPID);
      rs = pstmt.executeQuery();
      if (!rs.next()) {
        //jTextField2.setText("担保失败！ 担保人不存在！");
        //CheckDialog1.setLocation(300,300);
        CheckDialog CheckDialog2=new CheckDialog("担保办卡失败！ 担保人不存在！");
        CheckDialog2.setBounds(300,200,300,200);
        CheckDialog2.show();
        flag=1;
      }
      else {
        UID = rs.getString("UserId");
        query2 = "select * from Creditcard where UserId=? ";
        pstmt2 = con.prepareStatement(query2);
        pstmt2.setString(1, UID);
        rs2 = pstmt2.executeQuery();
        if (!rs2.next()) {
          //jTextField2.setText("担保失败！担保人自身无信用卡！");
        CheckDialog CheckDialog3=new CheckDialog("担保办卡失败！担保人自身无信用卡！");
        CheckDialog3.setBounds(300,200,300,200);
        CheckDialog3.show();

          flag=2;
        }
        else {
           grade = rs2.getString("CreditcardGrade");
         if(grade.equals("A")||grade.equals("B")||grade.equals("C")||grade.equals("D")||grade.equals("E")||grade.equals("F"))
           { // jTextField2.setText("担保成功！ 担保人自身信用等级： " + grade);
             //jSplitPane1.add(WarranteeEvaluate1,JSplitPane.RIGHT);
       //      CheckDialog CheckDialog3=new CheckDialog("担保成功！ 请填写详细用户资料");
       //      CheckDialog3.setBounds(300,200,300,150);
       //      CheckDialog3.show();
             flag = 0;

      if (grade.equals("A"))
          newGrade="B";
      if (grade.equals("B"))
          newGrade="C";
        if (grade.equals("C"))
            newGrade="D";
        if (grade.equals("D"))
            newGrade="E";
        if (grade.equals("E"))
            newGrade="F";
        if (grade.equals("F"))
            newGrade="G";


      //办理帐户，写USERS表
       JbxxDialog JbxxDialog1=new JbxxDialog(jTextField4.getText() ,jTextField3.getText() ,jTextField1.getText() ,newGrade,YHworkerID);
    //  JbxxDialog1=new JbxxDialog(jTextField4.getText(),jTextField3.getText());
      JbxxDialog1.setBounds(200,50,500,400);
      JbxxDialog1.show();





         //  jTextField5.enable()=true;


           }
         else
           {   //jTextField2.setText("担保失败！ 担保人自身信用等级太低： " + grade);
             CheckDialog CheckDialog3=new CheckDialog("担保办卡失败！ 担保人自身信用等级太低： " + grade);
            CheckDialog3.setBounds(300,200,300,150);
            CheckDialog3.show();

               flag=3;
           }
         }
      }
      String reason="";
      switch (flag)
      {
          case 1:
                 reason="担保办卡失败！ 担保人不存在！";
                 break;
          case 2:
                 reason="担保办卡失败！担保人自身无信用卡！";
                 break;
          case 3:
                  reason="担保办卡失败！ 担保人自身信用等级太低";
                  break;

      }
      //System.out.println(flag);
      if(flag!=0)        //担保失败
      {
        java.util.Date today=new java.util.Date();
        //need  mofify the rejecttable!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        SimpleDateFormat sdf;
        sdf =new  SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒 ");
        //String aa="today";
        //if failure occurs,then it should been written into the rejecttable!
        // String SQL = "Insert Into rejecttable(UserName,UserCard,Datet,Rejectexcuse) Values( "+username+","+UserPID+","+System.currentTimeMillis()+","+ reason+")";
       //OK:   String SQL = "Insert Into rejecttable(UserName,UserCard,Datet,Rejectexcuse) Values("+"\'"+Username+"\'"+ ","+"\'"+UserPID+"\'"+","+"\'"+System.currentTimeMillis()+"\'"+","+"\'"+reason+"\'"+")";
      String SQL = "Insert Into rejecttable(UserName,UserCard,RejectDate,Rejectexcuse) Values("+"\'"+Username+"\'"+ ","+"\'"+UserPID+"\'"+","+"\'"+sdf.format(today)+"\'"+","+"\'"+reason+"\'"+")";
       //String SQL="Insert Into rejecttable(UserName,UserCard,RejectDate,Rejectexcuse) Values("+"\'"+username+"\'"+","+"\'"+usercard+"\'"+","+"\'"+str1+"\'"+","+"\'"+str2+"\'"+")";
      //pstmt = con.prepareStatement(SQL);
        Statement stmt=con.createStatement();

//        String Username;  //被担保人姓名
//    String UserPID;   //被担保人身份证号


      //UPID = jTextField1.getText();
        //pstmt.setString(1, UPID);
        //rs = pstmt.executeQuery();
        stmt.executeUpdate(SQL);
        }
        else              // 担保成功，允许办卡，需要写3个表：信用卡表，帐户表，用户表
        {
       //  CalcWarranteeTotal1;
        }

    }
    catch(Exception ee)
       {
 //        CheckDialog CheckDialog3=new CheckDialog("系统错误，请与管理员联系！");
 //        CheckDialog3.setBounds(300,200,300,200);
 //        CheckDialog3.show();
         ee.printStackTrace();
       }

    }


  }

  void jButton2_actionPerformed(ActionEvent e) {
      jTextField1.setText("");
       jTextField4.setFocusable(true);
    //  jTextField2.setText("") ;
      jTextField3.setText("");
      jTextField4.setText("");
      jTextField2.setText("");
  }

}

class WarrantorCheck_jButton1_actionAdapter implements java.awt.event.ActionListener {
  WarrantorCheck adaptee;

  WarrantorCheck_jButton1_actionAdapter(WarrantorCheck adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class WarrantorCheck_jButton2_actionAdapter implements java.awt.event.ActionListener {
  WarrantorCheck adaptee;

  WarrantorCheck_jButton2_actionAdapter(WarrantorCheck adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}
