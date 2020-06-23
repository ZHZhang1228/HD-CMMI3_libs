package management;

import java.awt.*;
import javax.swing.*;
import com.borland.dx.dataset.*;
import com.borland.dbswing.*;
import java.io.*;
import java.text.SimpleDateFormat;
//import com.borland.internetbeans.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class UserHelp extends JPanel {
  String strx="";
  String Host="";

  JPanel jPanel1 = new JPanel();
  JPanel jPanel2 = new JPanel();
  JTabbedPane jTabbedPane1 = new JTabbedPane();
  JScrollPane jScrollPane2 = new JScrollPane();
  JdbTextPane jdbTextPane2 = new JdbTextPane();
  JPanel jPanel4 = new JPanel();
  JScrollPane jScrollPane3 = new JScrollPane();
  JdbTextPane jdbTextPane5 = new JdbTextPane();
  CardLayout cardLayout3 = new CardLayout();
  CardLayout cardLayout4 = new CardLayout();
  CardLayout cardLayout5 = new CardLayout();
  JScrollPane jScrollPane1 = new JScrollPane();
  JdbTextPane jdbTextPane1 = new JdbTextPane();
  BorderLayout borderLayout1 = new BorderLayout();

  public UserHelp() {
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public UserHelp(String strx1,String sHost) {
    strx = strx1;
    Host=sHost;
    try {
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }


  void jbInit() throws Exception {
    this.setLayout(borderLayout1);
    jPanel1.setFont(new java.awt.Font("Dialog", 0, 14));
    jPanel1.setDebugGraphicsOptions(0);
    jPanel1.setToolTipText("");
    jPanel1.setLayout(cardLayout5);
    this.setFont(new java.awt.Font("华文行楷", 0, 11));
    this.setToolTipText("");
    jPanel2.setLayout(cardLayout4);

    String sT1="";
   // file fIn;

    jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    jdbTextPane2.setBackground(new Color(217, 230, 236));
    jdbTextPane2.setFont(new java.awt.Font("Dialog", 0, 14));
    jdbTextPane2.setLocale(new java.util.Locale("zh", "CN", ""));
    jdbTextPane2.setMinimumSize(new Dimension(6, 100));
    jdbTextPane2.setPreferredSize(new Dimension(71, 200));
    jdbTextPane2.setToolTipText("");
    jdbTextPane2.setEditable(false);
    jdbTextPane2.setText("\t\t\t银行系统个人信用评估办法\n\t\t\t第二章\t评估对象和内容\n\t第五条\t信用卡的个人信用评估仅限于具备申请资格的信用卡主卡申领人和主卡持卡人，附属卡申请人、持卡人以及不具备申请资格的，不属评估对象。 " +
    "申请资格指《银行信用卡业务管理办法》规定的居住户口在发卡行所在地并在当地工作、或在发卡行所在地工作、具有公安部门出具的居住两年以上证明，具有稳定收入和完全民事行为能力。 " +
    "\n\t第六条\t对在银行、司法部门存在不良记录的，发卡行可根据其情节，采取降低信用等级、直接拒绝申领信用卡申请、停止使用信用卡等措施。各二级分行银行卡部与个人业务处应定期（每月）交换有不良行为记录的客户名" +
    "单，并统一通报到各支行进行风险控制，如果能够确定信用卡客户在他行有贷款或透支行为的，发卡行应对客户在他行的资信情况进行调查。下列情况属于在银行或司法部门有不良记录的行为： " +
    "\n\t\t（一）\t在我行或他行信用卡曾经发生呆滞透支，经发卡行追收归还，在调整或确定其信用等级时，应降低1——2个信用等级。 \n\t\t（二）\t在我行或他行有恶意透支行为的一律不发卡或取消其使用信用卡资格。 " +
    "\n\t\t（三）\t在我行或他行贷款有诈骗行为或至今仍有未归还逾期贷款的一律不发卡。 \n\t\t（四）\t在最近三年内曾经有依靠法院强制执行而偿还我行欠款情况的一律不发卡。 " +
    "\n\t\t（五）\t涉嫌犯罪正在接受调查，或因犯罪正在受到法律处罚的一律不发卡。     \n\t第七条\t对申请人信用等级初评的内容包括其自然情况、职业情况、家庭情况、与银行关系等。 " +
    "\n\t\t（一）\t自然情况指评估对象的年龄、性别、婚姻状况、文化程度、户籍以及住宅性质等个人基本情况。 \n\t\t（二）\t职业情况指评估对象的职业、在现单位工作年限、职务、职称和收入等情况。 " +
    "\n\t\t（三）\t家庭情况指评估对象家庭人均月收入、家庭人均月固定支出等。 \n\t\t（四）\t与银行关系指评估对象是否本行员工、在本行帐户、存款余额、业务往来及其它借款情况等。 " +
    "\n\t第八条\t对持卡人的信用复查内容主要是指持卡人使用信用卡的情况，包括月均存款余额、月均累计透支额、透支还款次数、月均消费笔数、月均交易额等。 " +
    "\n\t第九条\t信用卡信用等级由发卡行内部管理使用，不告知申请人或持卡人，不对外公布。授予持卡人的透支额度，由发卡行书面通知持卡人。持卡人的透支额度若发生变动，发卡行应及时通知持卡人。透支额度是发卡行" +
    "授予信用卡持卡人使用信用卡透支的最高额度。 ");
    jdbTextPane2.setPostOnFocusLost(true);
    jTabbedPane1.setBackground(new Color(217, 230, 236));
    jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 14));
    jTabbedPane1.setMaximumSize(new Dimension(32767, 32767));
    jTabbedPane1.setMinimumSize(new Dimension(49, 68));
    jdbTextPane5.setBackground(new Color(217, 230, 236));
    jdbTextPane5.setFont(new java.awt.Font("Dialog", 0, 14));
    jdbTextPane5.setEditable(false);
    jdbTextPane5.setText("\t\t\t银行系统个人信用评估办法 \n\t\t\t第三章\t用户权利 \n\t第一条\t用户拥有三种申请信用卡的方式。包括免担保申请，保证担保 申请和抵押质押担保申请。 " +
    "\n\t第二条\t用户在有满足条件的担保人愿意担保的情况下可以申请保证担 保办卡。担保人可以随时撤消被担保人的资格，被担保人可以随时申请更换担保 " +
    "人。 \n\t第三条\t抵押质押担保申请办卡的用户，可以随时增加抵押质押物或者 赎出抵押质押物。 \n\t第四条\t任何用户都可以通过此界面进行密码更改和基本资料查询。 " +
    "\n\t第五条\t银行每半年将进行一次全局性调整，请用户注意查询银行的调 整通知。");
    jPanel4.setLayout(cardLayout3);
    jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    jdbTextPane1.setBackground(new Color(217, 230, 236));
    jdbTextPane1.setFont(new java.awt.Font("Dialog", 0, 14));
    jdbTextPane1.setEditable(false);

    jdbTextPane1.setText("\t\t\t银行系统个人信用评估办法\n\t\t\t第一章\t总   则\n\t第一条\t为了加强对信用卡持卡人的信用管理，规范信用卡的信用评估工作，建立合理的个人信用管理体系，防范经营风险，培育良好客户群体，根据《银行银行" +
    "卡业务管理制度》、《银行信用卡业务管理制度》及银行信用卡业务开展的实际情况，特制定本办法。\n\t第二条\t符合免担保条件，在申领信用卡时，应按照本办法对申请人进行个人信用等级评估，并根据评定的信用等级授予相" +
    "对应的透支额度。\n\t第三条\t不符合免担保条件，在申领信用卡时，应提供有效担保。以保证担保方式申领信用卡的，应对担保人进行个人信用等级评估；以抵押或质押担保方式申领信用卡的，不进行信用评估，直接按照有效抵" +
    "押或质押物金额的一定比例授予透支额度。\n\t第四条\t信用卡的个人信用评估坚持客观、科学、公正和定量分析与定性分析相结合的原则。评估所依据的材料和事实必须真实、可靠。 ");
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    jPanel4.setBackground(new Color(217, 230, 236));
    jTabbedPane1.add(jPanel1, "总则");
    jPanel1.add(jScrollPane1, "jScrollPane1");
    jTabbedPane1.add(jPanel2, "评估对象和内容");
    jPanel2.add(jScrollPane2, "jScrollPane2");
    jTabbedPane1.add(jPanel4, "用户权利");
    jPanel4.add(jScrollPane3, "jScrollPane3");
    jScrollPane3.getViewport().add(jdbTextPane5, null);
    jScrollPane2.getViewport().add(jdbTextPane2, null);
    jScrollPane1.getViewport().add(jdbTextPane1, null);
    this.add(jTabbedPane1, BorderLayout.CENTER);
    //jdbTextPane1.setEnableFileLoading(true);




  }
}
