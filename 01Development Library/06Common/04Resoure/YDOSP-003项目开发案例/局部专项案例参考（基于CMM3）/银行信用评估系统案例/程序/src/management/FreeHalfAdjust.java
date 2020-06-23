package management;

import java.awt.*;
import javax.swing.*;
import com.borland.dx.sql.dataset.*;
import java.sql.*;
import com.borland.dx.sql.dataset.*;
import java.awt.event.*;


/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class FreeHalfAdjust extends JPanel {
  JTextField jTextField1 = new JTextField();
  JButton jButton1 = new JButton();
  Database database1 = new Database();
  JTextField jTextField2 = new JTextField();
  JLabel jLabel8 = new JLabel();
  JTextField jTextField3 = new JTextField();
  JLabel jLabel16 = new JLabel();
  JTextField jTextField5 = new JTextField();
  JLabel jLabel17 = new JLabel();
  JLabel jLabel18 = new JLabel();
  JLabel jLabel19 = new JLabel();
  JTextField jTextField4 = new JTextField();
  JLabel jLabel110 = new JLabel();
  JLabel jLabel111 = new JLabel();


  PreparedStatement pstmt;
  PreparedStatement pstmt1;
  PreparedStatement pstmt2;
  PreparedStatement pstmt3;

  Connection con;
  String query;
  String query1;
  String query2;
  String query3;
  ResultSet rs;
  ResultSet rs1;
  ResultSet rs2;
  ResultSet rs3;
  String str;
  String str1;
  String str2;
  String str3;
  String str4;
  String str5;
  String str6;
  String str7;
  String str8;
  String str9;
  float a1,a2,b;
  int a3,b1;


  public FreeHalfAdjust() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    this.setLayout(gridBagLayout1);
    jTextField1.setText("");
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 15));
    jButton1.setText("调整");
    jButton1.addActionListener(new FreeHalfAdjust_jButton1_actionAdapter(this));
    jTextField2.setText("");
    jLabel8.setText("用户号：");
    jLabel8.setFont(new java.awt.Font("Dialog", 1, 15));
    jTextField3.setText("");
    jLabel16.setText("输入信用卡号：");
    jLabel16.setFont(new java.awt.Font("Dialog", 1, 16));
    jTextField5.setText("");
    jLabel17.setText("用户等级：");
    jLabel17.setFont(new java.awt.Font("Dialog", 1, 15));
    jLabel18.setText("免担保半年调整");
    jLabel18.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel18.setDebugGraphicsOptions(0);
    jLabel18.setFont(new java.awt.Font("华文行楷", 1, 30));
    jLabel19.setText("调整结果显示：");
    jLabel19.setRequestFocusEnabled(true);
    jLabel19.setFont(new java.awt.Font("Dialog", 1, 15));
    jTextField4.setText("");
    jLabel110.setText("透支额度：");
    jLabel110.setFont(new java.awt.Font("Dialog", 1, 15));
    jLabel111.setText("信用卡性质：");
    jLabel111.setFont(new java.awt.Font("Dialog", 1, 15));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 18));
    jLabel1.setText("担保人显示");
    jLabel2.setText("被担保人显示");
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 18));
    jTextField6.setEnabled(false);
    jTextField6.setText("");
    jTextField7.setEnabled(false);
    jTextField7.setText("");
    jTextField8.setEnabled(false);
    jTextField8.setText("");
    jTextField9.setEnabled(false);
    jTextField9.setText("");
    this.setBackground(new Color(217, 230, 236));
    this.add(jLabel18,  new GridBagConstraints(1, 0, 5, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 15, 126), 56, 21));
    this.add(jLabel16,  new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(49, 17, 0, 0), 5, -2));
    this.add(jTextField5,  new GridBagConstraints(2, 6, 2, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(14, 9, 22, 0), 139, 0));
    this.add(jTextField4,  new GridBagConstraints(2, 5, 2, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(18, 9, 0, 0), 137, -2));
    this.add(jTextField3,  new GridBagConstraints(2, 4, 2, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(15, 8, 0, 0), 138, 1));
    this.add(jTextField2,  new GridBagConstraints(2, 3, 2, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(27, 9, 0, 0), 137, -1));
    this.add(jLabel1,  new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(18, 0, 0, 76), 12, -8));
    this.add(jTextField1,  new GridBagConstraints(3, 0, 2, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(49, 0, 0, 0), 174, -2));
    this.add(jTextField7,  new GridBagConstraints(4, 4, 2, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(15, 28, 0, 41), 142, 1));
    this.add(jTextField6,  new GridBagConstraints(4, 3, 2, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(28, 27, 0, 41), 143, -1));
    this.add(jTextField8,  new GridBagConstraints(4, 5, 2, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(17, 28, 0, 41), 142, -1));
    this.add(jTextField9,  new GridBagConstraints(4, 6, 2, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(14, 29, 22, 41), 141, 0));
    this.add(jLabel2,     new GridBagConstraints(5, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(18, 24, 0, 73), 47, -8));
    this.add(jLabel111,  new GridBagConstraints(0, 4, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(22, 17, 0, 0), 2, -2));
    this.add(jLabel8,  new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(30, 17, 0, 0), 0, 0));
    this.add(jLabel17,  new GridBagConstraints(0, 5, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(16, 17, 0, 14), 3, 2));
    this.add(jLabel110,  new GridBagConstraints(0, 6, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(14, 17, 22, 8), 8, 1));
    this.add(jLabel19,  new GridBagConstraints(3, 1, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(13, 6, 0, 15), 12, -3));
    this.add(jButton1,  new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(42, 31, 0, 64), 1, -3));

    Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
    String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES";
    String username= "sa";
    String password= "";
    con = DriverManager.getConnection(url,username,password);
    jTextField2.setEnabled(false);
    jTextField3.setEnabled(false);
    jTextField4.setEnabled(false);
    jTextField5.setEnabled(false);
    jTextField6.setEnabled(false);
    jTextField7.setEnabled(false);
    jTextField8.setEnabled(false);
    jTextField9.setEnabled(false);

  }
 public int UseRecordadjust(float a1,float a2,int a3,float a4,String b)
 {//a1表示存款余额，a2表示使用金额，a3表示使用次数，a4表示月累计透支额，b表示使用状态
   PreparedStatement pstmt4;
   ResultSet rs4;
     String query4[]=new String[5];
     String strb[] = new String[5];
     String str0=null;
     int sum=0;
   try{

      //月均存款余额
       if (a1 >=3000)  {query4[0] = "select Yjcky3 from UseInstance"; strb[0] = "Yjcky3";}
       else if ( (a1 < 3000) && (a1 >= 1500)) {query4[0] = "select Yjcky3_15 from UseInstance"; strb[0] = "Yjcky3_15"; }
       else if ( (a1 < 1500) && (a1 >= 500)) {query4[0] = "select Yjcky15_5 from UseInstance"; strb[0] = "Yjcky15_5";}
       else if ( (a1 < 500) && (a1 >= 100)) {query4[0] = "select Yjcky5_1 from UseInstance";strb[0] = "Yjcky5_1";}
       else {query4[0] = "select Yjcky1 from UseInstance";strb[0] = "Yjcky1";}
        pstmt4 = con.prepareStatement(query4[0]);
        rs4=pstmt4.executeQuery();
        if(rs4.next()){
          str0 = rs4.getString(strb[0]); //调整分
        }
        sum = Integer.parseInt(str0);

       //月均累计透支额
       if (a4 >= 5000) {query4[1] = "select Yjljtz5 from UseInstance";strb[1] = "Yjljtz5";}
       else if ( (a4 < 5000) && (a4 >= 2000)) {query4[1] = "select Yjljtz2_5 from UseInstance";strb[1] = "Yjljtz2_5";}
       else if ( (a4 < 2000) && (a4 >= 1000)) {query4[1] = "select Yjljtz1_2 from UseInstance";strb[1] = "Yjljtz1_2";}
       else if ( (a4 < 1000) && (a4 >= 100)) {query4[1] = "select Yjljtz1_1 from UseInstance";strb[1] = "Yjljtz1_1";}
       else  {query4[1] = "select Yjljtz1 from UseInstance";strb[1] = "Yjljtz1";}
       pstmt4 = con.prepareStatement(query4[1]);
       rs4=pstmt4.executeQuery();
       if(rs4.next()){
        str0 = rs4.getString(strb[1]); //调整分
       }
       sum += Integer.parseInt(str0);

       //月均消费额
       if (a2 >= 10000) {query4[3] = "select Yjxf1 from UseInstance";strb[3] = "Yjxf1";}
       else if ( (a2 < 10000) && (a2 >= 5000)) {query4[3] = "select Yjxf5_1 from UseInstance";strb[3] = "Yjxf5_1";}
       else if ( (a2 < 5000) && (a2 >= 500)) {query4[3] = "select Yjxf5_5 from UseInstance";strb[3] = "Yjxf5_5";}
       else if ( (a3 < 500) && (a3 > 0)) {query4[3] = "select Yjxf5 from UseInstance";strb[3] = "Yjxf5";}
       else  {query4[3] = "select Yjxf0 from UseInstance";strb[3] = "Yjxf0";}
       pstmt4 = con.prepareStatement(query4[3]);
       rs4=pstmt4.executeQuery();
       if(rs4.next()){
        str0 = rs4.getString(strb[3]); //调整分
       }
       sum += Integer.parseInt(str0);
      // jTextField5.setText(Integer.toString(sum));

   if(b!="透支"){   //月均消费次数
       if (a3 > 10) {query4[2] = "select Yjxfcs10 from UseInstance";strb[2] = "Yjxfcs10";}
       else if ( (a3 <= 9) && (a3 >= 6)) {query4[2] = "select Yjxfcs6_9 from UseInstance";strb[2] = "Yjxfcs6_9";}
       else if ( (a3 <= 5) && (a3 >= 3)) {query4[2] = "select Yjxfcs3_5 from UseInstance";strb[2] = "Yjxfcs3_5";}
       else if ( (a3 <= 2) && (a3 > 0)) {query4[2] = "select Yjxfcs2 from UseInstance";strb[2] = "Yjxfcs2";}
       else  {query4[2] = "select Yjxfcs0 from UseInstance"; strb[2] = "Yjxfcs0";}
       pstmt4 = con.prepareStatement(query4[2]);
       rs4=pstmt4.executeQuery();
       if(rs4.next()){
        str0 = rs4.getString(strb[2]); //调整分
       }
       sum += Integer.parseInt(str0);
     }
    else   //已还款透支次数
     {
       if (a3 > 10) {query4[4] = "select Yhktzcs10 from UseInstance";strb[4] = "Yhktzcs10";}
       else if ( (a3 <= 9) && (a3 >= 6)) {query4[4] = "select Yhktzcs6_9 from UseInstance";strb[4] = "Yhktzcs6_9";}
       else if ( (a3 <= 5) && (a3 >= 3)) {query4[4] = "select Yhktzcs3_5 from UseInstance";strb[4] = "Yhktzcs3_5";}
       else if ( (a3 <= 2) && (a3 > 0)) {query4[4] = "select Yhktzcs2 from UseInstance";strb[4] = "Yhktzcs2";}
       else  {query4[4] = "select Yhktzcs0 from UseInstance";strb[4] = "Yhktzcs0";}
       pstmt4 = con.prepareStatement(query4[4]);
       rs4=pstmt4.executeQuery();
       if(rs4.next()){
        str0 = rs4.getString(strb[4]); //调整分
       }
       sum += Integer.parseInt(str0);
    }
   }
   catch(Exception ef)
        { System.out.print("系统错误，请重新运行。");
         }
   return sum;
 }

public int Badrecordadjust(String strx){
   PreparedStatement pstmt5;
   PreparedStatement pstmt6;
   ResultSet rs5;
   ResultSet rs6;
   String strx0 = null;
   String strx01 = null;
   String queryb=null;
   String queryx[] = new String[3];
   String strbl =null;
   String strbx[] = new String[4];
   String strbx1[] = new String[3];
   int sum1=0;
  try{
        String bljl="select UserId from UserMoral";
        Statement ps;
        ps=con.createStatement();
        rs6=ps.executeQuery(bljl);
        String del=null;
        while(rs6.next()){
         del=rs6.getString("UserId");
         if(del.trim().equals(strx)){

        queryb= "select BadRecdId from UserMoral where UserId=?";
        pstmt5 = con.prepareStatement(queryb);
        pstmt5.setString(1,strx);
        rs5=pstmt5.executeQuery();
        if(rs5.next()){
        strbl=rs5.getString("BadRecdId");   //不良记录号
        jTextField5.setText(strbl);
        }
        queryb= "select UnOverdraft,BadRecord,CriminalRecord,OtherDebt from Badrecord where BadRecdId=?";
        pstmt5 = con.prepareStatement(queryb);
        pstmt5.setString(1,strbl);
        rs5=pstmt5.executeQuery();
        if(rs5.next()){
        strbx[0]=rs5.getString("UnOverdraft");   //有非正常透支
        strbx[1]=rs5.getString("BadRecord");     //在我行贷款有 不良行为
        strbx[2]=rs5.getString("CriminalRecord");  //涉嫌犯罪或正受法律处罚和调查
        strbx[3]=rs5.getString("OtherDebt");  //其它未偿还的债务
      }

      //有非正常透支
      if(strbx[0]!=null) {
        if (strbx[0].trim().equals("逾期透支")) {
          queryx[0] = "select Yqoverdraft from Unlrecord ";
          strbx1[0] = "Yqoverdraft";
        }
        else if (strbx[0].trim().equals("呆滞透支")) {
          queryx[0] = "select Dxoverdraft from Unlrecord";
          strbx1[0] = "Dxoverdraft";
        }
        else if (strbx[0].trim().equals("呆帐透支")) {
          queryx[0] = "select Dzoverdraft from Unlrecord";
          strbx1[0] = "Dzoverdraft";
        }

        pstmt5 = con.prepareStatement(queryx[0]);
        rs5 = pstmt5.executeQuery();
        if (rs5.next()) {
          strx0 = rs5.getString(strbx1[0]); //调整分
          sum1 += Integer.parseInt(strx0);
        }
      }else  sum1 += 0;

      //在我行贷款有 不良行为
     if(strbx[1].trim().equals("有")) {
       sum1 -= 100;
    }else  sum1 -= 0;

      //涉嫌犯罪或正受法律处罚和调查
    if(strbx[2]!=null){
      if(strbx[2].trim().equals("涉嫌犯罪")) {
         queryx[1] = "select Criminal from Unlrecord ";
         strbx1[1]="Criminal";
      }
       else if(strbx[2].trim().equals("法律处罚")) {
         queryx[1] = "select Punish from Unlrecord";
         strbx1[1]="Punish";
       }
       else if(strbx[2].trim().equals("司法调查")) {
         queryx[1] = "select JusticeInq from Unlrecord";
         strbx1[1]="JusticeInq";
       }
       pstmt5 = con.prepareStatement(queryx[1]);
       rs5=pstmt5.executeQuery();
       if(rs5.next()){
         strx0 = rs5.getString(strbx1[1]); //调整分
         jTextField5.setText(strx0);
         sum1+=Integer.parseInt(strx0);
       }
     } else {sum1+=0;}

       //其它未偿还的债务
    if(strbx[3]!=null) {
        if (strbx[3].trim().equals("其他未偿债务5000-10000"))
        {
          queryx[2] = "select Qt5_1 from Unlrecord ";
          strbx1[2] = "Qt5_1";
        }
        else if (strbx[3].trim().equals("其他未偿债务10000-30000")) {
          queryx[2] = "select Qt1_3 from Unlrecord";
          strbx1[2] = "Qt1_3";
        }
        else if (strbx[3].trim().equals("其他未偿债务30000以上")) {
          queryx[2] = "select Qt3 from Unlrecord";
          strbx1[2] = "Qt3";
        }

        pstmt5 = con.prepareStatement(queryx[2]);
        rs5 = pstmt5.executeQuery();
        if (rs5.next()) {
          strx0 = rs5.getString(strbx1[2]); //调整分
          sum1 += Integer.parseInt(strx0);
        }
      }
         }
      else System.out.print("此用户无不良记录");
      }
    }

  catch(Exception ef)
        { //System.out.print("系统错误，请重新运行。");
         }
 return sum1;
}

  void jButton1_actionPerformed(ActionEvent e) {
    String xz=null;
    String qur=null;
    String sel=null;
    int tzed=0;
    String bdbrdj=null;
    String bdbrxz=null;
    int bdbrtze=0;
    String strup=null;
    str=null;
    str1=null;
    str2=null;
    str3=null;
    str4=null;
    str5=null;
    str6=null;
    str7=null;
    str8=null;
    str9=null;
    a1=0;a2=0;b=0;
    a3=0;b1=0;

    try{
         str=jTextField1.getText();
         String select="select CreditcardId from Creditcard";
         Statement ps1;
         ResultSet rs1;
         ps1=con.createStatement();
         String eq=null;
         rs1=ps1.executeQuery(select);
         while(rs1.next()){
         eq=rs1.getString("CreditcardId");
         if(eq.trim().equals(str)){

         query = "select CreditcardGrade,UserId from Creditcard where CreditcardId=?";
         pstmt = con.prepareStatement(query);
         pstmt.setString(1,str);
         rs=pstmt.executeQuery();
         if(rs.next()){
         str9=rs.getString("UserId");  //用户号
         str1=rs.getString("CreditcardGrade");   //信用等级

          }
         query1 = "select AccountDeposit from Account where CreditcardId=?";
         pstmt1 = con.prepareStatement(query1);
         pstmt1.setString(1,str);
         rs1=pstmt1.executeQuery();
         if(rs1.next()){
         str2=rs1.getString("AccountDeposit");  //存款余额
         a1=Float.parseFloat(str2);   //存款余额

          }
         query2 = "select UseNum,UseMoney,UseState from UseRecord where CreditcardId=?";
         pstmt2 = con.prepareStatement(query2);
         pstmt2.setString(1,str);
         rs2=pstmt2.executeQuery();
         if(rs2.next()){
         str3=rs2.getString("UseNum");  //使用次数
         str4=rs2.getString("UseMoney");  //使用金额
         str5=rs2.getString("UseState");   //使用状态
         a2=Float.parseFloat(str4);    //使用金额
         a3=Integer.parseInt(str3);    //使用次数
         if((a1-a2)<0)
         b=a2-a1;  //月累计透支额
         }
         query3 = "select UserName,CpCredit from Users where UserId=?";
         pstmt3= con.prepareStatement(query3);
         pstmt3.setString(1,str9);
         rs3=pstmt3.executeQuery();
         if(rs3.next()){
         str7=rs3.getString("UserName");//用户名
         str8=rs3.getString("CpCredit"); //初评得分
         b1=Integer.parseInt(str8);//初评得分
        }

        else{
            jTextField1.setText("没有匹配项!");

        }
        b1=b1+this.UseRecordadjust(a1,a2,a3,b,str5)+this.Badrecordadjust(str9);
        jTextField1.setText(Integer.toString(b1));
        if((b1<=120)&&(b1>=100)){
          str1="A";
          tzed=50000;
          xz="金卡";
          bdbrdj="B";
          bdbrxz="金卡";
          bdbrtze=40000;
          }
          else if((b1<100)&&(b1>=90)){
          str1="B";
          tzed=40000;
          xz="金卡";
          bdbrdj="C";
          bdbrxz="普卡";
          bdbrtze=30000;

          }
          else if((b1<90)&&(b1>=80)){
          str1="C";
          tzed=30000;
          xz="普卡";
          bdbrdj="D";
          bdbrxz="普卡";
          bdbrtze=20000;

         }
         else if((b1<80)&&(b1>=70)){
         str1="D";
         tzed=20000;
         xz="普卡";
         bdbrdj="E";
         bdbrxz="普卡";
         bdbrtze=10000;

         }
         else if((b1<70)&&(b1>=60)){
         str1="E";
         tzed=10000;
          xz="普卡";
          bdbrdj="F";
         bdbrxz="普卡";
         bdbrtze=5000;

         }
         else if((b1<60)&&(b1>=50)){
         str1="F";
         tzed=5000;
          xz="普卡";
          bdbrdj="G";
          bdbrxz="普卡";
          bdbrtze=2000;

         }
         else if((b1<50)&&(b1>=35)){
         str1="G";
         tzed=2000;
         xz="普卡";
         bdbrdj="H";
         bdbrxz="普卡";
         bdbrtze=0;

         }
         else {
         str1="H";
         tzed=0;
         xz="普卡";
         }
         jTextField2.setText(str9);
         jTextField3.setText(xz);
         jTextField4.setText(str1);
         jTextField5.setText(Integer.toString(tzed));


         qur="update Creditcard set CreditcardGrade="+"\'"+str1+"\'"+" where CreditcardId="+"\'"+str.trim()+"\'";
         Statement ps;
         ps=con.createStatement();
        // System.out.print(qur);
         ps.execute(qur);

        sel="select UserId from Users where DbrUserId=?";
        pstmt1 = con.prepareStatement(sel);
        pstmt1.setString(1,str9);
        rs1=pstmt1.executeQuery();
         if(rs1.next()){
         str2=rs1.getString("UserId");
          }
        if(str2!=null){
         qur="update Creditcard set CreditcardGrade="+"\'"+ bdbrdj+"\'"+" where UserId="+"\'"+str2.trim()+"\'";
         ps=con.createStatement();
         ps.execute(qur);
         jTextField6.setText(str2);
         jTextField7.setText(bdbrxz);
         jTextField8.setText(bdbrdj);
         jTextField9.setText(Integer.toString(bdbrtze));
       }
        else{
          jTextField6.setText("");
          jTextField7.setText("");
          jTextField8.setText("");
          jTextField9.setText("");

          }
        }
      else{
         jTextField1.setText("该信用卡不存在");
         jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jTextField5.setText("");
         jTextField6.setText("");
         jTextField7.setText("");
         jTextField8.setText("");
         jTextField9.setText("");


      }
       }
    }
          catch(Exception ef)
         { System.out.print("系统错误，请重新运行。");
          }

  }
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JTextField jTextField6 = new JTextField();
  JTextField jTextField7 = new JTextField();
  JTextField jTextField8 = new JTextField();
  JTextField jTextField9 = new JTextField();
  GridBagLayout gridBagLayout1 = new GridBagLayout();

}

class FreeHalfAdjust_jButton1_actionAdapter implements java.awt.event.ActionListener {
  FreeHalfAdjust adaptee;

  FreeHalfAdjust_jButton1_actionAdapter(FreeHalfAdjust adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}
