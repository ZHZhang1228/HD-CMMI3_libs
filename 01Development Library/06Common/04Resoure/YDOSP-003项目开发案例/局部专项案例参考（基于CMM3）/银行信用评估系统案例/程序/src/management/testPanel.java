package management;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class testPanel extends JPanel {
  JTextField jTextField1 = new JTextField();
  JLabel jLabel1 = new JLabel();
  JButton jButton1 = new JButton();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel jLabel6 = new JLabel();
  TitledBorder titledBorder1;
  TitledBorder titledBorder2;
  TitledBorder titledBorder3;
  TitledBorder titledBorder4;
  Connection con;
  JLabel jLabel2 = new JLabel();
  JLabel jLabel7 = new JLabel();
  TitledBorder titledBorder5;
  JButton jButton2 = new JButton();
  JLabel jLabel8 = new JLabel();
  JTextField jTextField2 = new JTextField();
  JLabel jLabel9 = new JLabel();
  JLabel jLabel10 = new JLabel();
  TitledBorder titledBorder6;
  GridBagLayout gridBagLayout1 = new GridBagLayout();

  public testPanel() {
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
    titledBorder3 = new TitledBorder("");
    titledBorder4 = new TitledBorder("");
    titledBorder5 = new TitledBorder("");
    titledBorder6 = new TitledBorder("");
    jTextField1.setText("");
    this.setLayout(gridBagLayout1);
    jLabel1.setFont(new java.awt.Font("宋体", 1, 22));
    jLabel1.setText("请输入自主分(<=20分)：");
    jButton1.setBackground(new Color(151, 164, 203));
    jButton1.setFont(new java.awt.Font("Dialog", 0, 13));
    jButton1.setActionCommand("确定");
    jButton1.setText("确定");
    jButton1.addActionListener(new testPanel_jButton1_actionAdapter(this));
    jLabel3.setFont(new java.awt.Font("宋体", 1, 22));
    jLabel3.setText("该用户的信用等级为：");
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel4.setBorder(titledBorder2);
    jLabel4.setDebugGraphicsOptions(0);
    jLabel4.setText("");
    jLabel5.setFont(new java.awt.Font("宋体", 1, 22));
    jLabel5.setText("该用户的透支额为：");
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel6.setBorder(titledBorder4);
    jLabel6.setText("");

      Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
       String url = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=CCES";
       String username= "sa";
       String password= "";
       con = DriverManager.getConnection(url,username,password);

    jLabel2.setFont(new java.awt.Font("宋体", 1, 22));
    jLabel2.setText("该用户的初评分为：");
    jLabel7.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel7.setBorder(titledBorder5);
    jLabel7.setText("");
    jButton2.setBackground(new Color(151, 164, 203));
    jButton2.setFont(new java.awt.Font("Dialog", 0, 13));
    jButton2.setToolTipText("");
    jButton2.setText("返回");
    jButton2.addActionListener(new testPanel_jButton2_actionAdapter(this));
    jLabel8.setFont(new java.awt.Font("宋体", 1, 22));
    jLabel8.setText("请输入用户号：");
    jLabel9.setFont(new java.awt.Font("Dialog", 1, 22));
    jLabel9.setText("该用户的信用卡卡号：");
    jLabel10.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel10.setBorder(titledBorder6);
    jLabel10.setRequestFocusEnabled(true);
    jLabel10.setText("");
    this.setBackground(new Color(217, 230, 236));
    this.add(jLabel1,  new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(14, 13, 0, 0), 2, 4));
    this.add(jTextField1,  new GridBagConstraints(2, 1, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(19, 14, 0, 8), 137, 1));
    this.add(jTextField2,  new GridBagConstraints(2, 0, 1, 1, 1.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(12, 14, 0, 8), 135, 2));
    this.add(jLabel8,  new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(12, 13, 0, 39), 43, -2));
    this.add(jLabel5,  new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(10, 13, 22, 29), 7, -1));
    this.add(jLabel6,  new GridBagConstraints(1, 6, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(12, 8, 22, 18), 141, 12));
    this.add(jLabel3,  new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(6, 13, 0, 9), 5, 14));
    this.add(jLabel2,  new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(10, 13, 0, 16), 22, 0));
    this.add(jLabel9,  new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(15, 13, 0, 0), 12, -5));
    this.add(jButton1,  new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(14, 126, 0, 59), 12, -4));
    this.add(jButton2,  new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0
            ,GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(14, 0, 0, 105), 12, -4));
    this.add(jLabel7,  new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(12, 8, 0, 17), 142, 13));
    this.add(jLabel10,  new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(18, 8, 0, 18), 141, 12));
    this.add(jLabel4,  new GridBagConstraints(1, 5, 2, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(14, 8, 8, 18), 141, 12));
  }
  public int Badrecordadjust(){
     PreparedStatement pstmt5;
     ResultSet rs5;
     String strx0 = "";
     String queryb;
     String queryx[] = new String[3];
     String strbl = "";
     String strbx1[] = new String[3];
     int sum1=0;
    try{
           //婚姻状况
          queryb= "select * from Users where userid=?";
          pstmt5 = con.prepareStatement(queryb);
         strx0=jTextField2.getText();
         pstmt5.setString(1,strx0);
          rs5=pstmt5.executeQuery();
          if(rs5.next()){
          strbl=rs5.getString("MarriageState");
          }
       if(strbl!=null) {
          if (strbl.equals("未婚")) {
            queryx[0] = "select Nomarry from userlist ";
            strbx1[0] = "Nomarry";
         }
          else if (strbl.equals("已婚有子女")) {
            queryx[0] = "select MarriedBaby from userlist";
            strbx1[0] = "MarriedBaby";
          }
          else if (strbl.equals("已婚无子女")) {
            queryx[0] = "select MarriedNoBaby from userlist";
            strbx1[0] = "MarriedNoBaby";
          }
          else if (strbl.equals("其他")) {
            queryx[0] = "select OtherMarry from userlist";
            strbx1[0] = "OtherMarry";
          }
          pstmt5 = con.prepareStatement(queryx[0]);
          rs5 = pstmt5.executeQuery();
          if (rs5.next()) {
            strx0 = rs5.getString(strbx1[0]); //调整分
           sum1 += Integer.parseInt(strx0);
           jTextField1.setText(sum1+" ");
          }
        }
        else  sum1 += 0;
        // 性别
      queryb= "select * from Users where userid=?";
      pstmt5 = con.prepareStatement(queryb);
     strx0=jTextField2.getText();
     pstmt5.setString(1,strx0);
      rs5=pstmt5.executeQuery();
      if(rs5.next()){
      strbl=rs5.getString("UserSex");
      }
   if(strbl!=null) {
      if (strbl.equals("男")) {
        queryx[0] = "select Male from userlist ";
        strbx1[0] = "Male";
     }
      else if (strbl.equals("女")) {
        queryx[0] = "select Female from userlist";
        strbx1[0] = "Female";
      }
      pstmt5 = con.prepareStatement(queryx[0]);
      rs5 = pstmt5.executeQuery();
      if (rs5.next()) {
        strx0 = rs5.getString(strbx1[0]); //调整分
        sum1 += Integer.parseInt(strx0);
        jTextField1.setText(sum1+" ");
      }
    }
    else  sum1 += 0;
    // 文化程度
        queryb= "select * from Users where userid=?";
        pstmt5 = con.prepareStatement(queryb);
       strx0=jTextField2.getText();
       pstmt5.setString(1,strx0);
        rs5=pstmt5.executeQuery();
        if(rs5.next()){
        strbl=rs5.getString("CultureState");
        }
     if(strbl!=null) {
        if (strbl.equals("研究生以上")) {
          queryx[0] = "select GraduateS from userlist ";
          strbx1[0] = "GraduateS";
       }
        else if (strbl.equals("本科")) {
          queryx[0] = "select UnGraduateS from userlist";
          strbx1[0] = "UnGraduateS";
        }
        else if (strbl.equals("大专")) {
         queryx[0] = "select Junior from userlist";
         strbx1[0] = "Junior";
       }
       else if (strbl.equals("中专、高中")) {
         queryx[0] = "select Intermediate from userlist";
         strbx1[0] = "Intermediate";
         }
      else if (strbl.equals("其他")) {
         queryx[0] = "select OtherKnowledge from userlist";
         strbx1[0] = "OtherKnowledge";
        }
        pstmt5 = con.prepareStatement(queryx[0]);
        rs5 = pstmt5.executeQuery();
        if (rs5.next()) {
          strx0 = rs5.getString(strbx1[0]); //调整分
          sum1 += Integer.parseInt(strx0);
          jTextField1.setText(sum1+" ");
        }
      }
      else  sum1 += 0;
      // 住宅性质
             queryb= "select * from Users where userid=?";
             pstmt5 = con.prepareStatement(queryb);
            strx0=jTextField2.getText();
            pstmt5.setString(1,strx0);
             rs5=pstmt5.executeQuery();
             if(rs5.next()){
             strbl=rs5.getString("HouseState");
             }
          if(strbl!=null) {
             if (strbl.equals("自有住房")) {
               queryx[0] = "select HaveHouse from userlist ";
               strbx1[0] = "HaveHouse";
            }
             else if (strbl.equals("贷款购房")) {
               queryx[0] = "select LoanBuyHouse from userlist";
               strbx1[0] = "LoanBuyHouse";
             }
             else if (strbl.equals("租用公房")) {
              queryx[0] = "select RentHouse from userlist";
              strbx1[0] = "RentHouse";
            }
            else if (strbl.equals("其它")) {
              queryx[0] = "select OtherHouse from userlist";
              strbx1[0] = "OtherHouse";
              }
             pstmt5 = con.prepareStatement(queryx[0]);
             rs5 = pstmt5.executeQuery();
             if (rs5.next()) {
               strx0 = rs5.getString(strbx1[0]); //调整分
               sum1 += Integer.parseInt(strx0);
               jTextField1.setText(sum1+" ");
             }
           }
           else  sum1 += 0;
           //户口性质
               queryb= "select * from Users where userid=?";
               pstmt5 = con.prepareStatement(queryb);
              strx0=jTextField2.getText();
              pstmt5.setString(1,strx0);
               rs5=pstmt5.executeQuery();
               if(rs5.next()){
               strbl=rs5.getString("RegistereState");
               }
            if(strbl!=null) {
               if (strbl.equals("常住户口")) {
                 queryx[0] = "select Cregistered from userlist ";
                 strbx1[0] = "Cregistered";
              }
               else if (strbl.equals("临时户口")) {
                 queryx[0] = "select Lregistere from userlist";
                 strbx1[0] = "Lregistere";
               }
               pstmt5 = con.prepareStatement(queryx[0]);
               rs5 = pstmt5.executeQuery();
               if (rs5.next()) {
                 strx0 = rs5.getString(strbx1[0]); //调整分
                 sum1 += Integer.parseInt(strx0);
                 jTextField1.setText(sum1+" ");
               }
             }
             else  sum1 += 0;
          // 职业类别
             queryb= "select * from view2 where userid=?";
             pstmt5 = con.prepareStatement(queryb);
            strx0=jTextField2.getText();
            pstmt5.setString(1,strx0);
             rs5=pstmt5.executeQuery();
             if(rs5.next()){
             strbl=rs5.getString("ProfessionTypes");
             }
          if(strbl!=null) {
             if (strbl.equals("公务员")) {
               queryx[0] = "select Gwy from ProfessionThing ";
               strbx1[0] = "Gwy";
            }
             else if (strbl.equals("教师、医生")) {
               queryx[0] = "select Jshys from ProfessionThing";
               strbx1[0] = "Jshys";
             }
             else if (strbl.equals("金融、律师")) {
              queryx[0] = "select Jrhls from ProfessionThing";
              strbx1[0] = "Jrhls";
            }
            else if (strbl.equals("军人、记者")) {
              queryx[0] = "select Jrhjz from ProfessionThing";
              strbx1[0] = "Jrhjz";
              }
           else if (strbl.equals("企业主、公司职员")) {
              queryx[0] = "select Qyzhgszy from ProfessionThing";
              strbx1[0] = "Qyzhgszy";
             }
          else if (strbl.equals("其它职业")) {
             queryx[0] = "select Qtzy from ProfessionThing";
             strbx1[0] = "Qtzy";
            }
             pstmt5 = con.prepareStatement(queryx[0]);
             rs5 = pstmt5.executeQuery();
             if (rs5.next()) {
               strx0 = rs5.getString(strbx1[0]); //调整分
               sum1 += Integer.parseInt(strx0);
               jTextField1.setText(sum1+" ");
             }
           }
           else  sum1 += 0;
           //工作年限
               queryb= "select * from view3 where userid=?";
               pstmt5 = con.prepareStatement(queryb);
              strx0=jTextField2.getText();
              pstmt5.setString(1,strx0);
               rs5=pstmt5.executeQuery();
               if(rs5.next()){
               strbl=rs5.getString("WorkingFirm");
               }
            if(strbl!=null) {
               if (strbl.equals("5年以上")) {
                 queryx[0] = "select Gz5n from ProfessionThing ";
                 strbx1[0] = "Gz5n";
              }
               else if (strbl.equals("3-5年")) {
                 queryx[0] = "select Gz3_5n from ProfessionThing";
                 strbx1[0] = "Gz3_5n";
               }
               else if (strbl.equals("1-3年")) {
                queryx[0] = "select Gz1_3n from ProfessionThing";
                strbx1[0] = "Gz1_3n";
              }
              else if (strbl.equals("1年以内")) {
                queryx[0] = "select Gzxy1n from ProfessionThing";
                strbx1[0] = "Gzxy1n";
                }
               pstmt5 = con.prepareStatement(queryx[0]);
               rs5 = pstmt5.executeQuery();
               if (rs5.next()) {
                 strx0 = rs5.getString(strbx1[0]); //调整分
                 sum1 += Integer.parseInt(strx0);
                 jTextField1.setText(sum1+" ");
               }
             }
             else  sum1 += 0;
             //岗位性质
            queryb= "select * from view3 where userid=?";
            pstmt5 = con.prepareStatement(queryb);
           strx0=jTextField2.getText();
           pstmt5.setString(1,strx0);
            rs5=pstmt5.executeQuery();
            if(rs5.next()){
            strbl=rs5.getString("WorkingState");
            }
         if(strbl!=null) {
            if (strbl.equals("厅局级以上")) {
              queryx[0] = "select Tjys from ProfessionThing ";
              strbx1[0] = "Tjys";
           }
            else if (strbl.equals("处级")) {
              queryx[0] = "select Cj from ProfessionThing";
              strbx1[0] = "Cj";
            }
            else if (strbl.equals("科级")) {
             queryx[0] = "select Kj from ProfessionThing";
             strbx1[0] = "Kj";
           }
           else if (strbl.equals("一般机关干部")) {
             queryx[0] = "select Ybgjgb from ProfessionThing";
             strbx1[0] = "Ybgjgb";
             }
          else if (strbl.equals("其他机关员工")) {
           queryx[0] = "select Qtgjgb from ProfessionThing";
           strbx1[0] = "Qtgjgb";
           }
           else if (strbl.equals("正副总经理")) {
            queryx[0] = "select Zfzjl from ProfessionThing";
            strbx1[0] = "Zfzjl";
            }
          else if (strbl.equals("部门经理")) {
              queryx[0] = "select Bmjl from ProfessionThing";
              strbx1[0] = "Bmjl";
            }
         else if (strbl.equals("一般企业干部")) {
               queryx[0] = "select Ybqygb from ProfessionThing";
               strbx1[0] = "Ybqygb";
            }
         else if (strbl.equals("其他企业员工")) {
          queryx[0] = "select Qtqyzy from ProfessionThing";
          strbx1[0] = "Qtqyzy";
      }
            pstmt5 = con.prepareStatement(queryx[0]);
            rs5 = pstmt5.executeQuery();
            if (rs5.next()) {
              strx0 = rs5.getString(strbx1[0]); //调整分
              sum1 += Integer.parseInt(strx0);
              jTextField1.setText(sum1+" ");
            }
          }
          else  sum1 += 0;
          //个人月收入
                queryb= "select * from view3 where userid=?";
                pstmt5 = con.prepareStatement(queryb);
               strx0=jTextField2.getText();
               pstmt5.setString(1,strx0);
                rs5=pstmt5.executeQuery();
                if(rs5.next()){
                strbl=rs5.getString("IndividualIcome");
                }
             if(strbl!=null) {
                if (strbl.equals("10000元以上")) {
                  queryx[0] = "select Ysr10000 from ProfessionThing ";
                  strbx1[0] = "Ysr10000";
               }
                else if (strbl.equals("8000-10000元")) {
                  queryx[0] = "select Ysr8000 from ProfessionThing";
                  strbx1[0] = "Ysr8000";
                }
                else if (strbl.equals("5000-8000元")) {
                 queryx[0] = "select Ysr5000 from ProfessionThing";
                 strbx1[0] = "Ysr5000";
               }
               else if (strbl.equals("4000-5000元")) {
                 queryx[0] = "select Ysr4000 from ProfessionThing";
                 strbx1[0] = "Ysr4000";
                 }
                 else if (strbl.equals("3000-4000元")) {
                queryx[0] = "select Ysr3000 from ProfessionThing";
                strbx1[0] = "Ysr3000";
                }
                else if (strbl.equals("2000-3000元")) {
              queryx[0] = "select Ysr2000 from ProfessionThing";
              strbx1[0] = "Ysr2000";
              }
              else if (strbl.equals("1000-2000元")) {
             queryx[0] = "select Ysr1000 from ProfessionThing";
             strbx1[0] = "Ysr1000";
             }
             else if (strbl.equals("1000元以下")) {
             queryx[0] = "select Ysrxy1000 from ProfessionThing";
              strbx1[0] = "Ysrxy1000";
            }

                pstmt5 = con.prepareStatement(queryx[0]);
                rs5 = pstmt5.executeQuery();
                if (rs5.next()) {
                  strx0 = rs5.getString(strbx1[0]); //调整分
                  sum1 += Integer.parseInt(strx0);
                  jTextField1.setText(sum1+" ");
                }
              }
              else  sum1 += 0;
              //技术职称
                   queryb= "select * from view3 where userid=?";
                   pstmt5 = con.prepareStatement(queryb);
                  strx0=jTextField2.getText();
                  pstmt5.setString(1,strx0);
                   rs5=pstmt5.executeQuery();
                   if(rs5.next()){
                   strbl=rs5.getString("WorkingPost");
                   }
                if(strbl!=null) {
                   if (strbl.equals("高级")) {
                     queryx[0] = "select Gj from ProfessionThing ";
                     strbx1[0] = "Gj";
                  }
                   else if (strbl.equals("中级")) {
                     queryx[0] = "select Zj from ProfessionThing";
                     strbx1[0] = "Zj";
                   }
                   else if (strbl.equals("初级")) {
                    queryx[0] = "select Cjj from ProfessionThing";
                    strbx1[0] = "Cjj";
                  }
                  else if (strbl.equals("无")) {
                    queryx[0] = "select Mei from ProfessionThing";
                    strbx1[0] = "Mei";
                    }
                   pstmt5 = con.prepareStatement(queryx[0]);
                   rs5 = pstmt5.executeQuery();
                   if (rs5.next()) {
                     strx0 = rs5.getString(strbx1[0]); //调整分
                     sum1 += Integer.parseInt(strx0);
                     jTextField1.setText(sum1+" ");
                   }
                 }
                 else  sum1 += 0;
                 //家庭人均月收入
                        queryb= "select * from users where userid=?";
                        pstmt5 = con.prepareStatement(queryb);
                       strx0=jTextField2.getText();
                       pstmt5.setString(1,strx0);
                        rs5=pstmt5.executeQuery();
                        if(rs5.next()){
                        strbl=rs5.getString("AverageIcome");
                        }
                     if(strbl!=null) {
                        if (strbl.equals("5000元以上")) {
                          queryx[0] = "select Rjsr5q from FamilyThing ";
                          strbx1[0] = "Rjsr5q";
                       }
                        else if (strbl.equals("3000-5000元")) {
                          queryx[0] = "select Rjsr3_5q from FamilyThing";
                          strbx1[0] = "Rjsr3_5q";
                        }
                        else if (strbl.equals("2000-3000元")) {
                         queryx[0] = "select Rjsr2_3q from FamilyThing";
                         strbx1[0] = "Rjsr2_3q";
                       }
                       else if (strbl.equals("1000-2000元")) {
                         queryx[0] = "select Rjsr1_2q from FamilyThing";
                         strbx1[0] = "Rjsr1_2q";
                         }
                        else if (strbl.equals("500-1000元")) {
                           queryx[0] = "select Rjsr5b_1q from FamilyThing";
                           strbx1[0] = "Rjsr5b_1q";
                           }
                        else if (strbl.equals("500元以下")) {
                             queryx[0] = "select Rjsr5b from FamilyThing";
                             strbx1[0] = "Rjsr5b";
                             }
                        pstmt5 = con.prepareStatement(queryx[0]);
                        rs5 = pstmt5.executeQuery();
                        if (rs5.next()) {
                          strx0 = rs5.getString(strbx1[0]); //调整分
                          sum1 += Integer.parseInt(strx0);
                          jTextField1.setText(sum1+" ");
                        }
                      }
                      else  sum1 += 0;
                      //家庭人均月固定支出
                                 queryb= "select * from users where userid=?";
                                 pstmt5 = con.prepareStatement(queryb);
                                strx0=jTextField2.getText();
                                pstmt5.setString(1,strx0);
                                 rs5=pstmt5.executeQuery();
                                 if(rs5.next()){
                                 strbl=rs5.getString("AverageExpend");
                                 }
                              if(strbl!=null) {
                                 if (strbl.equals("500元以下")) {
                                   queryx[0] = "select Rjzc5b from FamilyThing ";
                                   strbx1[0] = "Rjzc5b";
                                }
                                 else if (strbl.equals("500-1000元")) {
                                   queryx[0] = "select Rjzc5b_1q from FamilyThing";
                                   strbx1[0] = "Rjzc5b_1q";
                                 }
                                 else if (strbl.equals("1000-3000元")) {
                                  queryx[0] = "select Rjzc1_3q from FamilyThing";
                                  strbx1[0] = "Rjzc1_3q";
                                }
                                else if (strbl.equals("3000元以上")) {
                                  queryx[0] = "select Rjzc3q from FamilyThing";
                                  strbx1[0] = "Rjzc3q";
                                  }
                                 pstmt5 = con.prepareStatement(queryx[0]);
                                 rs5 = pstmt5.executeQuery();
                                 if (rs5.next()) {
                                   strx0 = rs5.getString(strbx1[0]); //调整分
                                   sum1 += Integer.parseInt(strx0);
                                   jTextField1.setText(sum1+" ");
                                 }
                               }
                               else  sum1 += 0;
                               //本行帐户类型
                                          queryb= "select * from view4 where userid=?";
                                          pstmt5 = con.prepareStatement(queryb);
                                         strx0=jTextField2.getText();
                                         pstmt5.setString(1,strx0);
                                          rs5=pstmt5.executeQuery();
                                          if(rs5.next()){
                                          strbl=rs5.getString("AccountType");
                                          }
                                       if(strbl!=null) {
                                          if (strbl.equals("定期以及银行卡")) {
                                            queryx[0] = "select Dqhyhk from UserBank ";
                                            strbx1[0] = "Dqhyhk";
                                         }
                                          else if (strbl.equals("定期")) {
                                            queryx[0] = "select Dq from UserBank";
                                            strbx1[0] = "Dq";
                                          }
                                          else if (strbl.equals("银行卡")) {
                                           queryx[0] = "select Yhk from UserBank";
                                           strbx1[0] = "Yhk";
                                         }
                                         else if (strbl.equals("仅开立活期存折帐户")) {
                                           queryx[0] = "select Jkhqzh from UserBank";
                                           strbx1[0] = "Jkhqzh";
                                           }
                                          else if (strbl.equals("无帐户")) {
                                             queryx[0] = "select Wzh from UserBank";
                                             strbx1[0] = "Wzh";
                                             }
                                          pstmt5 = con.prepareStatement(queryx[0]);
                                          rs5 = pstmt5.executeQuery();
                                          if (rs5.next()) {
                                            strx0 = rs5.getString(strbx1[0]); //调整分
                                            sum1 += Integer.parseInt(strx0);
                                            jTextField1.setText(sum1+" ");
                                          }
                                        }
                                        else  sum1 += 0;

                                        //年龄
                                          queryb= "select * from Users where userid=?";
                                          pstmt5 = con.prepareStatement(queryb);
                                         strx0=jTextField2.getText();
                                         pstmt5.setString(1,strx0);
                                          rs5=pstmt5.executeQuery();
                                          if(rs5.next()){
                                          strbl=rs5.getString("UserAge");
                                          }
                                       if(strbl!=null) {
                                        int a=Integer.parseInt(strbl);
                                         if (18<=a && 22>=a) {
                                            queryx[0] = "select Callan from userlist ";
                                            strbx1[0] = "Callan";
                                         }
                                          else if (23<=a && 34>=a) {
                                            queryx[0] = "select Youth from userlist";
                                            strbx1[0] = "Youth";
                                          }
                                          else if (35<=a && 40>=a) {
                                            queryx[0] = "select Midlife from userlist";
                                            strbx1[0] = "Midlife";
                                          }
                                          else if (41<=a && 60>=a) {
                                            queryx[0] = "select Adiaphorous from userlist";
                                            strbx1[0] = "Adiaphorous";
                                          }
                                          else if (61<=a ) {
                                          queryx[0] = "select Agedness from userlist";
                                          strbx1[0] = "Agedness";
                                        }
                                          pstmt5 = con.prepareStatement(queryx[0]);
                                          rs5 = pstmt5.executeQuery();
                                          if (rs5.next()) {
                                            strx0 = rs5.getString(strbx1[0]); //调整分
                                            sum1 += Integer.parseInt(strx0);
                                              jTextField1.setText(sum1+" ");
                                          }
                                        }
                                        else  sum1 += 0;
                                        //业务往来
                                             queryb= "select * from view5 where userid=?";
                                             pstmt5 = con.prepareStatement(queryb);
                                            strx0=jTextField2.getText();
                                            pstmt5.setString(1,strx0);
                                             rs5=pstmt5.executeQuery();
                                             if(rs5.next()){
                                             strbl=rs5.getString("UseNum");
                                             }
                                          if(strbl!=null) {
                                           int a=Integer.parseInt(strbl);
                                            if (2>a) {
                                               queryx[0] = "select Ywjs from UserBank ";
                                               strbx1[0] = "Ywjs";
                                            }
                                            else if (6>=a && 2<=a) {
                                              queryx[0] = "select Ywyb from UserBank ";
                                              strbx1[0] = "Ywyb";
                                           }
                                             else if (6<a ) {
                                             queryx[0] = "select Ywmq from UserBank";
                                             strbx1[0] = "Ywmq";
                                           }
                                             pstmt5 = con.prepareStatement(queryx[0]);
                                             rs5 = pstmt5.executeQuery();
                                             if (rs5.next()) {
                                               strx0 = rs5.getString(strbx1[0]); //调整分
                                               sum1 += Integer.parseInt(strx0);
                                                 jTextField1.setText(sum1+" ");
                                             }
                                           }
                                           else  sum1 += 0;
                                          //是否本行员工
                                           queryb= "select * from users where userid=?";
                                           pstmt5 = con.prepareStatement(queryb);
                                          strx0=jTextField2.getText();
                                          pstmt5.setString(1,strx0);
                                           rs5=pstmt5.executeQuery();
                                           if(rs5.next()){
                                           strbl=rs5.getString("UserCard");
                                           strbl=strbl.trim();
                                           }
                                        if(strbl!=null) {
                                        queryx[0] = "select * from YHworker where YHworkerCard=?";
                                        strbx1[0] = "YHworkerCard";
                                         pstmt5 = con.prepareStatement(queryx[0]);
                                         pstmt5.setString(1,strbl);
                                           rs5 = pstmt5.executeQuery();
                                           if (rs5.next()) {
                                              sum1 +=2;
                                              }
                                             else {
                                               sum1 +=0;
                                             }
                                             jTextField1.setText(sum1+" ");
                                        }
                                         else  sum1 += 0;
                                         //借款情况
                                             queryb= "select * from view6 where userid=?";
                                             pstmt5 = con.prepareStatement(queryb);
                                            strx0=jTextField2.getText();
                                            pstmt5.setString(1,strx0);
                                             rs5=pstmt5.executeQuery();
                                             if(rs5.next()){
                                             strbl=rs5.getString("UseState");
                                             }
                                          if(strbl!=null) {
                                             if (strbl.equals("有借款已还清")) {
                                               queryx[0] = "select Yjkyh from UserBank ";
                                               strbx1[0] = "Yjkyh";
                                            }
                                             else if (strbl.equals("有逾期记录")) {
                                               queryx[0] = "select Yyqjl from UserBank";
                                               strbx1[0] = "Yyqjl";
                                             }
                                             else if (strbl.equals("从未借款")) {
                                              queryx[0] = "select Cwjk from UserBank";
                                              strbx1[0] = "Cwjk";
                                            }
                                            else if (strbl.equals("有借款还清记录，但尚有未到期借款")) {
                                              queryx[0] = "select Y_ywdqjk from UserBank";
                                              strbx1[0] = "Y_ywdqjk";
                                              }
                                             else if (strbl.equals("无借款还清记录，但尚有未到期借款")) {
                                                queryx[0] = "select W_ywdqjk from UserBank";
                                                strbx1[0] = "W_ywdqjk";
                                                }
                                             pstmt5 = con.prepareStatement(queryx[0]);
                                             rs5 = pstmt5.executeQuery();
                                             if (rs5.next()) {
                                               strx0 = rs5.getString(strbx1[0]); //调整分
                                               sum1 += Integer.parseInt(strx0);
                                               jTextField1.setText(sum1+" ");
                                             }
                                           }
                                           else  sum1 += 0;
                                           //存款余额
                                             queryb= "select * from view7 where userid=?";
                                             pstmt5 = con.prepareStatement(queryb);
                                            strx0=jTextField2.getText();
                                            pstmt5.setString(1,strx0);
                                             rs5=pstmt5.executeQuery();
                                             if(rs5.next()){
                                             strbl=rs5.getString("AccountDeposit");
                                             }
                                          if(strbl!=null) {
                                            int a=Integer.parseInt(strbl);
                                           if (10000>a) {
                                              queryx[0] = "select Ck1w from UserBank ";
                                              strbx1[0] = "Ck1w";
                                           }
                                           else if (30000>=a && 10000<=a) {
                                             queryx[0] = "select Ck1_3w from UserBank ";
                                             strbx1[0] = "Ck1_3w";
                                          }
                                            else if (30000<a ) {
                                            queryx[0] = "select Ck3w from UserBank";
                                            strbx1[0] = "Ck3w";
                                          }

                                             pstmt5 = con.prepareStatement(queryx[0]);
                                             rs5 = pstmt5.executeQuery();
                                             if (rs5.next()) {
                                               strx0 = rs5.getString(strbx1[0]); //调整分
                                               sum1 += Integer.parseInt(strx0);
                                               jTextField1.setText(sum1+" ");
                                             }
                                           }
                                           else  sum1 += 0;
      }

    catch(Exception ef)
          { System.out.print("系统错误，请重新运行。"+ef.getClass().getName());
            ef.printStackTrace();
           }
   return sum1;
  }




  void jButton1_actionPerformed(ActionEvent e) {
    String m=jTextField1.getText();
    String c=m;
    PreparedStatement pstmt;
    ResultSet rs;
    try
    {
      int i = Integer.parseInt(m);
      if (i <= 20 && 0 <= i) {
        i = i + this.Badrecordadjust();
        jLabel7.setText(i + " ");
        if (120 >= i && 100 <= i) {
          jLabel4.setText("A");
          jLabel6.setText("50000元");
        }
        else if (100 > i && 90 <= i) {
          jLabel4.setText("B");
          jLabel6.setText("40000元");
        }
        else if (90 > i && 80 <= i) {
          jLabel4.setText("C");
          jLabel6.setText("30000元");
        }
        else if (80 > i && 70 <= i) {
          jLabel4.setText("D");
          jLabel6.setText("20000元");
        }
        else if (70 > i && 60 <= i) {
          jLabel4.setText("E");
          jLabel6.setText("10000元");
        }
        else if (60 > i && 50 <= i) {
          jLabel4.setText("F");
          jLabel6.setText("5000元");
        }
        else if (50 > i && 35 <= i) {
          jLabel4.setText("G");
          jLabel6.setText("2000元");
        }
        else {
          jLabel4.setText("H");
          jLabel6.setText("0元");
        }

        jTextField1.setText(c);
        c = jTextField2.getText();
        String qur =
            "insert into Creditcard(UserId,CreditcardGrade,CreditcardCode) values('" +
            c + "\'" + "," + "\'" + jLabel4.getText() + "\'" + ",'000')";
        Statement ps;
        ps = con.createStatement();
        ps.execute(qur);

        String qur1 = "update Users set  CpCredit='" + jLabel7.getText() +
            "' where UserId=" + "\'" + c + "\'";
        ps = con.createStatement();
        ps.execute(qur1);


        String sel="select CreditcardId from Creditcard where UserId='"+c+"' and CreditcardGrade='"+jLabel4.getText()+"\'";
        pstmt= con.prepareStatement(sel);
        rs = pstmt.executeQuery();
        if (rs.next()) {
         String  strx0 = rs.getString("CreditcardId"); //调整分
         jLabel10.setText(strx0);
              }

        String ins="insert into Account(CreditcardId,AccountType,AccountDeposit) values('"+jLabel10.getText()+"','银行卡','0')";
        ps = con.createStatement();
        ps.execute(ins);

      }
      else jTextField1.setText("请输入小于20的正整数");
    }

    catch(Exception eff)
     { jTextField1.setText("请输入数字，谢谢合作！");
     }
  }

  void jButton2_actionPerformed(ActionEvent e) {
    eventFrame.jSplitPane1.remove(eventFrame.jSplitPane1.getRightComponent());
    eventFrame.jSplitPane1.add(new helloPanel(),eventFrame.jSplitPane1.RIGHT);
  }
}

class testPanel_jButton1_actionAdapter implements java.awt.event.ActionListener {
  testPanel adaptee;

  testPanel_jButton1_actionAdapter(testPanel adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class testPanel_jButton2_actionAdapter implements java.awt.event.ActionListener {
  testPanel adaptee;

  testPanel_jButton2_actionAdapter(testPanel adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}
