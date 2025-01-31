package com.pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

import javax.swing.table.*;

public class admin_dashboard extends JFrame implements ActionListener
{
	JPanel jp1,jp2,jp3,j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,p1,p2,p3,p4,p5,pk1,pk2,pk3,pk4;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,le1,le2,le3,le4,le5,lb1,lb2,lb3,lb4,lb5,lk1,lk2,lk3,lk4,lk5,lk6,lk7,lk8,lc1,lc2,lc3,lc4,lc5,lek1,lek2,lek3,lek4,lbk1,lbk2,lbk3,lbk4,lbkk1,lbkk2,lbkk3,lbkk4;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bs1,bs2,bs3,bs4,bs5,bp1,bp2,bst1,bst2,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bkt1,bkt2,bk1,bk2,bk3,bk4,bk5,bk6;
	JRadioButton rb1,rb2,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25,r26,r27,r28,r29,r30,rt1,rt2,rt3,rt4,rt5,rt6,rt7,rt8,rt9,rt10,rt11,rt12,rt13;
	JTextField tf1,tf2,tf3,tf4,tf5,tfk1,tfk2;
	JTable tb1,tb2,tb3,tb4,tb5,tb6,tb7;
	JScrollPane jsp,jsp1,jsp2,jsp3,jsp4,jsp5,jsp6;
	DefaultTableModel dtm,dtm1,dtm2,dtm3,dtm4,dtm5,dtm6;
	int c2=0,c1=0;
	String sid,tamt;
	admin_dashboard(String s,String id)
	{
		sid=id;
		jp1=new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp1.setBackground(new Color(0,153,76));
		jp1.setBounds(0,0,1500,50);
		l1=new JLabel("ADMIN  DASHBOARD");
		l1.setBounds(80,0,350,50);
		l1.setFont(new Font("Times new roman",Font.BOLD,30));
		l1.setForeground(Color.WHITE);
		jp1.add(l1);
		

		jp2=new JPanel();
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp2.setBackground(Color.WHITE);
		jp2.setBounds(180,50,1200,850);
		jp2.setLayout(null);
		
		l2=new JLabel("Hello "+s+"!!");
		l2.setBounds(15,10,400,35);
		//l2.setForeground(new Color(0,0,204));
		l2.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		jp2.add(l2);

		p1=new  JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,191,255));
		p1.setBounds(20,85,210,160);
		ImageIcon ig1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\cpb.png");
		le1=new JLabel(ig1);
		le1.setBounds(90,15,100,100);
		p1.add(le1);
		String qb1="select count(bname) as count from books where type='books';";
		DbOps dk1=new DbOps();
		String cb1=dk1.getCount(qb1);
		lc1=new JLabel(cb1);
		lc1.setBounds(20,60,60,60);
		lc1.setForeground(Color.WHITE);
		lc1.setFont(new Font("Calibri body",Font.PLAIN,60));
		p1.add(lc1);
		lb1=new JLabel("BOOKS");
		lb1.setBounds(20,120,200,20);
		lb1.setForeground(Color.WHITE);
		lb1.setFont(new Font("Calibri body",Font.PLAIN,20));
		p1.add(lb1);
		p2=new  JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,204,0));
		p2.setBounds(250,85,210,160);
		ImageIcon ig2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\cpu.png");
		le2=new JLabel(ig2);
		le2.setBounds(90,15,100,100);
		p2.add(le2);
		String qb2="select count(ename) as count from employee";
		DbOps dk2=new DbOps();
		String cb2=dk2.getCount(qb2);
		lc2=new JLabel(cb2);
		lc2.setBounds(20,60,60,60);
		lc2.setForeground(Color.WHITE);
		lc2.setFont(new Font("Calibri body",Font.PLAIN,60));
		p2.add(lc2);
		lb2=new JLabel("MEMBERS");
		lb2.setBounds(20,120,200,20);
		lb2.setForeground(Color.WHITE);
		lb2.setFont(new Font("Calibri body",Font.PLAIN,20));
		p2.add(lb2);
		p2.add(le2);
		p3=new  JPanel();
		p3.setLayout(null);
		p3.setBackground(new Color(255,165,0));
		p3.setBounds(480,85,210,160);
		ImageIcon ig3=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\cpn.png");
		le3=new JLabel(ig3);
		le3.setBounds(90,15,100,100);
		String qb3="select count(bname) as count from books where type='newspaper';";
		DbOps dk3=new DbOps();
		String cb3=dk3.getCount(qb3);
		lc3=new JLabel(cb3);
		lc3.setBounds(20,60,60,60);
		lc3.setForeground(Color.WHITE);
		lc3.setFont(new Font("Calibri body",Font.PLAIN,60));
		p3.add(lc3);
		lb3=new JLabel("NEWSPAPERS");
		lb3.setBounds(20,120,200,20);
		lb3.setForeground(Color.WHITE);
		lb3.setFont(new Font("Calibri body",Font.PLAIN,20));
		p3.add(lb3);
		p3.add(le3);
		p4=new  JPanel();
		p4.setLayout(null);
		p4.setBackground(new Color(255,51,51));
		p4.setBounds(710,85,210,160);
		ImageIcon ig4=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\cpm.png");
		le4=new JLabel(ig4);
		le4.setBounds(90,15,100,100);
		p4.add(le4);
		String qb4="select count(bname) as count from books where type='Magazine';";
		DbOps dk4=new DbOps();
		String cb4=dk4.getCount(qb4);
		lc4=new JLabel(cb4);
		lc4.setBounds(20,60,60,60);
		lc4.setForeground(Color.WHITE);
		lc4.setFont(new Font("Calibri body",Font.PLAIN,60));
		p4.add(lc4);
		lb4=new JLabel("MAGAZINES");
		lb4.setBounds(20,120,200,20);
		lb4.setForeground(Color.WHITE);
		lb4.setFont(new Font("Calibri body",Font.PLAIN,20));
		p4.add(lb4);
		p5=new  JPanel();
		p5.setLayout(null);
		p5.setBackground(new Color(138,43,226));
		p5.setBounds(940,85,210,160);
		ImageIcon ig5=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\cps.png");
		le5=new JLabel(ig5);
		le5.setBounds(90,15,100,100);
		p5.add(le5);
		p2.add(le2);
		String qb5="select count(stname) as count from student";
		DbOps dk5=new DbOps();
		String cb5=dk5.getCount(qb5);
		lc5=new JLabel(cb5);
		lc5.setBounds(20,60,60,60);
		lc5.setForeground(Color.WHITE);
		lc5.setFont(new Font("Calibri body",Font.PLAIN,60));
		p5.add(lc5);
		lb5=new JLabel("STUDENTS");
		lb5.setBounds(20,120,200,20);
		lb5.setForeground(Color.WHITE);
		lb5.setFont(new Font("Calibri body",Font.PLAIN,20));
		p5.add(lb5);
		p5.add(le5);
		
		pk1=new JPanel();
		pk1.setLayout(null);
		pk1.setBackground(new Color(255,245,230));
		pk1.setBounds(20,285,210,60);
		ImageIcon il1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\isb.png");
		lek1=new JLabel(il1);
		lek1.setBounds(0,0,60,60);
		pk1.add(lek1);
		lbk1=new JLabel("ISSUED");
		lbk1.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,15));
		lbk1.setBounds(65,5,60,20);
		pk1.add(lbk1);
		String qk1="select count(stid) as count from issued where isdate is not null;";
		DbOps d1=new DbOps();
		String ck1=d1.getCount(qk1);
		lbkk1=new JLabel(ck1);
		lbkk1.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,20));
		lbkk1.setBounds(65,30,60,20);
		pk1.add(lbkk1);
		
		pk2=new JPanel();
		pk2.setLayout(null);
		pk2.setBackground(new Color(255,245,230));
		pk2.setBounds(250,285,210,60);
		ImageIcon il2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\thdu1.jpg");
		lek2=new JLabel(il2);
		lek2.setBounds(0,0,60,60);
		pk2.add(lek2);
		lbk2=new JLabel("RETURNED");
		lbk2.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,15));
		lbk2.setBounds(65,5,90,20);
		pk2.add(lbk2);
		String qk2="select count(stid) as count from issued where retdate is not null;";
		DbOps d2=new DbOps();
		String ck2=d2.getCount(qk2);
		lbkk2=new JLabel(ck2);
		lbkk2.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,20));
		lbkk2.setBounds(65,30,90,20);
		pk2.add(lbkk2);
		
		pk3=new JPanel();
		pk3.setLayout(null);
		pk3.setBackground(new Color(255,245,230));
		pk3.setBounds(480,285,210,60);
		ImageIcon il3=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\thdu2.jpg");
		lek3=new JLabel(il3);
		lek3.setBounds(0,0,60,60);
		pk3.add(lek3);
		lbk3=new JLabel("NOT  RETURNED");
		lbk3.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,15));
		lbk3.setBounds(65,5,130,20);
		pk3.add(lbk3);
		String qk3="select count(stid) as count from issued where retdate is null;";
		DbOps d3=new DbOps();
		String ck3=d3.getCount(qk3);
		lbkk3=new JLabel(ck3);
		lbkk3.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,20));
		lbkk3.setBounds(65,30,120,20);
		pk3.add(lbkk3);
		pk4=new JPanel();
		pk4.setLayout(null);
		pk4.setBackground(new Color(255,245,230));
		pk4.setBounds(710,285,210,60);
		ImageIcon il4=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\calcp.jpg");
		lek4=new JLabel(il4);
		lek4.setBounds(0,0,60,60);
		pk4.add(lek4);
		lbk4=new JLabel("DATE  TODAY");
		lbk4.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,15));
		lbk4.setBounds(65,5,100,20);
		pk4.add(lbk4);
		LocalDate date=LocalDate.now();
		//tf5.setText(date.toString());
		lbkk4=new JLabel(date.toString());
		lbkk4.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,20));
		lbkk4.setBounds(65,30,150,20);
		pk4.add(lbkk4);		
		
		jp2.add(p1);
		jp2.add(p2);
		jp2.add(p3);
		jp2.add(p4);
		jp2.add(p5);
		jp2.add(pk1);
		jp2.add(pk2);
		jp2.add(pk3);
		jp2.add(pk4);
		
		
		jp3=new JPanel();
		jp3.setBounds(0,50,180,850);
		jp3.setBackground(new Color(50,205,50));
		jp3.setLayout(null);
		
		b1=new JButton("Dashboard");
		b1.setBounds(2,5,175,40);
		b1.addActionListener(this);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		b1.setBackground(new Color(0,204,0));
		b1.setForeground(Color.WHITE);
		b2=new JButton("Books");
		b2.setBounds(2,50,175,40);  
		b2.addActionListener(this);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		b2.setBackground(new Color(0,204,0));
		b2.setForeground(Color.WHITE);
		b3=new JButton("Students");
		b3.setBounds(2,95,175,40);
		b3.addActionListener(this);
		b3.setFont(new Font("times new roman",Font.PLAIN,16));
		b3.setBackground(new Color(0,204,0));
		b3.setForeground(Color.WHITE);
		b4=new JButton("Members");
		b4.setBounds(2,140,175,40);
		b4.addActionListener(this);
		b4.setFont(new Font("times new roman",Font.PLAIN,16));
		b4.setBackground(new Color(0,204,0));
		b4.setForeground(Color.WHITE);
		b5=new JButton("Magazine");
		b5.setBounds(2,185,175,40);
		b5.addActionListener(this);
		b5.setFont(new Font("times new roman",Font.PLAIN,16));
		b5.setBackground(new Color(0,204,0));
		b5.setForeground(Color.WHITE);
		b6=new JButton("Newspaper");
		b6.setBounds(2,230,175,40);
		b6.addActionListener(this);
		b6.setFont(new Font("times new roman",Font.PLAIN,16));
		b6.setBackground(new Color(0,204,0));
		b6.setForeground(Color.WHITE);
		b7=new JButton("Issued Report");
		b7.setBounds(2,275,175,40);
		b7.addActionListener(this);
		b7.setFont(new Font("times new roman",Font.PLAIN,16));
		b7.setBackground(new Color(0,204,0));
		b7.setForeground(Color.WHITE);
		b8=new JButton("Returned");
		b8.setBounds(2,320,175,40);
		b8.addActionListener(this);
		b8.setFont(new Font("times new roman",Font.PLAIN,16));
		b8.setBackground(new Color(0,204,0));
		b8.setForeground(Color.WHITE);
		b9=new JButton("penalty");
		b9.setBounds(2,320,175,40);
		b9.addActionListener(this);
		b9.setFont(new Font("times new roman",Font.PLAIN,16));
		b9.setBackground(new Color(0,204,0));
		b9.setForeground(Color.WHITE);
		b10=new JButton("LOGOUT");
		b10.setBounds(2,365,175,40);
		b10.addActionListener(this);
		b10.setFont(new Font("times new roman",Font.PLAIN,16));
		b10.setBackground(new Color(0,204,0));
		b10.setForeground(Color.WHITE);
		
		jp3.add(b1);
		jp3.add(b2);
		jp3.add(b3);
		jp3.add(b4);
		jp3.add(b5);
		jp3.add(b6);
		jp3.add(b7);
		jp3.add(b8);
		jp3.add(b9);
		jp3.add(b10);
		
		j1=new JPanel();
		j1.setLayout(null);
		j1.setBackground(Color.WHITE);
		j1.setBounds(180,50,1200,850);
		add(j1);
		l3=new JLabel("Hello "+s+"!!");
		l3.setBounds(15,10,400,35);
		//l3.setForeground(new Color(0,0,204));
		l3.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j1.add(l3);
		
		ImageIcon img=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\adbk2.jpg");
		bt1=new JButton();
		bt1.setIcon(img);
		bt1.setBounds(50,50,80,75);	
		bt1.setBorderPainted(false);
		bt1.addActionListener(this);
		ImageIcon im=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\bkm.jpg");
		bt2=new JButton();
		bt2.setIcon(im);
		bt2.setBounds(150,50,80,78);
		bt2.setBorderPainted(false);
		bt2.addActionListener(this);
		ImageIcon imc=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\ed1.jpg");
		bt3=new JButton();
		bt3.setIcon(imc);
		bt3.setBackground(Color.WHITE);
		bt3.setBounds(250,50,80,75);	
		bt3.setBorderPainted(false);
		bt3.addActionListener(this);
		ImageIcon i1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\lang.png");
		bk1=new JButton();
		bk1.setIcon(i1);
		bk1.setBounds(360,50,75,75);
		bk1.setBorderPainted(false);
		bk1.addActionListener(this);
		lk1=new JLabel("Language");
		lk1.setBounds(375,130,75,15);
		lk1.setForeground(new Color(0,153,153));
		lk1.setFont(new Font("times new roman",Font.PLAIN,14));
		ImageIcon i2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\sub.png");
		bk2=new JButton();
		bk2.setIcon(i2);
		bk2.setBackground(Color.WHITE);
		bk2.setBounds(460,50,80,75);	
		bk2.setBorderPainted(false);
		bk2.addActionListener(this);
		lk2=new JLabel("Subject");
		lk2.setBounds(480,130,75,15);
		lk2.setForeground(new Color(0,153,153));
		lk2.setFont(new Font("times new roman",Font.PLAIN,14));
		bs1=new JButton("Search");
		bs1.addActionListener(this);
		bs1.setBounds(100,145,90,30);
		bs1.setFont(new Font("times new roman",Font.PLAIN,16));
		tf1=new JTextField();
		tf1.setBounds(200,150,180,25);
		tf1.setFont(new Font("times new roman",Font.PLAIN,16));
		
		r1=new JRadioButton("ISBN");
		r1.setBounds(390,150,70,25);
		r1.addActionListener(this);
		r1.setFont(new Font("times new roman",Font.PLAIN,16));
		r1.setBackground(Color.WHITE);
		r2=new JRadioButton("Book Name");
		r2.setBounds(465,150,100,25);
		r2.addActionListener(this);
		r2.setFont(new Font("times new roman",Font.PLAIN,16));
		r2.setBackground(Color.WHITE);
		r3=new JRadioButton("Publication");
		r3.setBounds(575,150,100,25);
		r3.addActionListener(this);
		r3.setFont(new Font("times new roman",Font.PLAIN,16));
		r3.setBackground(Color.WHITE);
		r4=new JRadioButton("Author");
		r4.setBounds(680,150,70,25);
		r4.addActionListener(this);
		r4.setFont(new Font("times new roman",Font.PLAIN,16));
		r4.setBackground(Color.WHITE);
		r5=new JRadioButton("Languge");
		r5.setBounds(760,150,80,25);
		r5.addActionListener(this);
		r5.setFont(new Font("times new roman",Font.PLAIN,16));
		r5.setBackground(Color.WHITE);
		r6=new JRadioButton("Subject");
		r6.setBounds(850,150,80,25);
		r6.addActionListener(this);
		r6.setFont(new Font("times new roman",Font.PLAIN,16));
		r6.setBackground(Color.WHITE);		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		bg.add(r6);

		dtm=new DefaultTableModel();
		tb1=new JTable(dtm);
		JScrollPane jsp=new JScrollPane(tb1);
		jsp.setBounds(90,190,950,400);
		
		String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
		String col[]= {"bid","bname","pub","author","lan","sub"};
		String q="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid;";
		DbOps db=new DbOps();
		db.fillJTable(dtm,col,head,q);
		
		j1.add(jsp);
		j1.add(lk1);
		j1.add(lk2);
		j1.add(bt1);
		j1.add(bt2);
		j1.add(bt3);
		j1.add(bk1);
		j1.add(bk2);
		j1.add(bs1);
		j1.add(tf1);
		j1.add(r1);
		j1.add(r2);
		j1.add(r3);
		j1.add(r4);
		j1.add(r5);
		j1.add(r6);
		
		j2=new JPanel();
		j2.setLayout(null);
		j2.setBackground(Color.WHITE);
		j2.setBounds(180,50,1200,850);
		add(j2);
		l4=new JLabel("Hello "+s+"!!");
		l4.setBounds(15,10,400,35);
		//l4.setForeground(new Color(0,0,204));
		l4.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j2.add(l4);
		ImageIcon img1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\ast-removebg-preview.png");
		bt4=new JButton();
		bt4.setIcon(img1);
		bt4.setBounds(50,45,70,90);	
		bt4.setBorderPainted(false);
		bt4.addActionListener(this);
		ImageIcon img2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\dtst-removebg-preview.png");
		bt5=new JButton();
		bt5.setIcon(img2);
		bt5.setBounds(150,45,80,80);
		bt5.setBorderPainted(false);
		bt5.addActionListener(this);
		ImageIcon img3=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\upst1-removebg-preview.png");
		bt6=new JButton();
		bt6.setIcon(img3);
		bt6.setBackground(Color.WHITE);
		bt6.setBounds(250,45,80,80);	
		bt6.setBorderPainted(false);
		bt6.addActionListener(this);
		ImageIcon i3=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\course.png");
		bk3=new JButton();
		bk3.setIcon(i3);
		bk3.setBackground(Color.WHITE);
		bk3.setBounds(355,40,98,95);	
		bk3.setBorderPainted(false);
		bk3.addActionListener(this);
		lk3=new JLabel("Course");
		lk3.setBounds(382,135,75,15);
		lk3.setForeground(Color.BLACK);
		lk3.setFont(new Font("times new roman",Font.PLAIN,15));
		
		bs2=new JButton("Search");
		bs2.addActionListener(this);
		bs2.setBounds(100,145,90,30);
		bs2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf2=new JTextField();
		tf2.setBounds(200,150,180,25);
		tf2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		r7=new JRadioButton("SID");
		r7.setBounds(390,150,50,25);
		r7.addActionListener(this);
		r7.setFont(new Font("times new roman",Font.PLAIN,16));
		r7.setBackground(Color.WHITE);
		r8=new JRadioButton("Student Name");
		r8.setBounds(455,150,120,25);
		r8.addActionListener(this);
		r8.setFont(new Font("times new roman",Font.PLAIN,16));
		r8.setBackground(Color.WHITE);
		r9=new JRadioButton("Course");
		r9.setBounds(585,150,80,25);
		r9.addActionListener(this);
		r9.setFont(new Font("times new roman",Font.PLAIN,16));
		r9.setBackground(Color.WHITE);
		r10=new JRadioButton("Phone no");
		r10.setBounds(670,150,100,25);
		r10.addActionListener(this);
		r10.setFont(new Font("times new roman",Font.PLAIN,16));
		r10.setBackground(Color.WHITE);
		r11=new JRadioButton("City");
		r11.setBounds(770,150,50,25);
		r11.addActionListener(this);
		r11.setFont(new Font("times new roman",Font.PLAIN,16));
		r11.setBackground(Color.WHITE);
		r12=new JRadioButton("Address");
		r12.setBounds(835,150,80,25);
		r12.addActionListener(this);
		r12.setFont(new Font("times new roman",Font.PLAIN,16));
		r12.setBackground(Color.WHITE);		
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(r7);
		bg1.add(r8);
		bg1.add(r9);
		bg1.add(r10);
		bg1.add(r11);
		bg1.add(r12);

		dtm1=new DefaultTableModel();
		tb2=new JTable(dtm1);
		JScrollPane jsp1=new JScrollPane(tb2);
		jsp1.setBounds(90,190,950,400);
		
		String head1[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
		String col1[]= {"stid","stname","course","mob","city","address"};
		String q1="select stid,stname,course,mob,city,address from student inner join course on course.cid=student.cid;";
		DbOps db1=new DbOps();
		db1.fillJTable(dtm1,col1,head1,q1);
		
		j2.add(jsp1);
		j2.add(bt4);
		j2.add(bt5);
		j2.add(bt6);
		j2.add(bk3);
		j2.add(bs2);
		j2.add(tf2);
		j2.add(lk3);
		j2.add(r7);
		j2.add(r8);
		j2.add(r9);
		j2.add(r10);
		j2.add(r11);
		j2.add(r12);

		
		j3=new JPanel();
		j3.setLayout(null);
		j3.setBackground(Color.WHITE);
		j3.setBounds(180,50,1200,850);
		add(j3);
		l5=new JLabel("Hello "+s+"!!");
		l5.setBounds(15,10,400,35);
		//l5.setForeground(new Color(0,0,204));
		l5.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j3.add(l5);
		
		ImageIcon imc1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\admem-removebg-preview.png");
		bt7=new JButton();
		bt7.setIcon(imc1);
		bt7.setBounds(50,50,80,90);	
		bt7.setBorderPainted(false);
		bt7.addActionListener(this);
		ImageIcon imc2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\delmem-removebg-preview.png");
		bt8=new JButton();
		bt8.setIcon(imc2);
		bt8.setBounds(150,50,80,80);
		bt8.setBorderPainted(false);
		bt8.addActionListener(this);
		ImageIcon imc3=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\upmem-removebg-preview.png");
		bt9=new JButton();
		bt9.setIcon(imc3);
		bt9.setBackground(Color.WHITE);
		bt9.setBounds(250,50,80,80);	
		bt9.setBorderPainted(false);
		bt9.addActionListener(this);
		ImageIcon i4=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\desig.png");
		bk4=new JButton();
		bk4.setIcon(i4);
		bk4.setBackground(Color.WHITE);
		bk4.setBounds(360,40,85,90);	
		bk4.setBorderPainted(false);
		bk4.addActionListener(this);
		lk4=new JLabel("Designation");
		lk4.setBounds(365,130,80,15);
		lk4.setForeground(new Color(0,153,153));
		lk4.setFont(new Font("times new roman",Font.PLAIN,15));
		
		bs3=new JButton("Search");
		bs3.addActionListener(this);
		bs3.setBounds(100,145,90,30);
		bs3.setFont(new Font("times new roman",Font.PLAIN,16));
		tf3=new JTextField();
		tf3.setBounds(200,150,180,25);
		tf3.setFont(new Font("times new roman",Font.PLAIN,16));
		
		r13=new JRadioButton("EID");
		r13.setBounds(390,150,50,25);
		r13.addActionListener(this);
		r13.setFont(new Font("times new roman",Font.PLAIN,16));
		r13.setBackground(Color.WHITE);
		r14=new JRadioButton("Employee Name");
		r14.setBounds(455,150,130,25);
		r14.addActionListener(this);
		r14.setFont(new Font("times new roman",Font.PLAIN,16));
		r14.setBackground(Color.WHITE);
		r15=new JRadioButton("Designation");
		r15.setBounds(595,150,100,25);
		r15.addActionListener(this);
		r15.setFont(new Font("times new roman",Font.PLAIN,16));
		r15.setBackground(Color.WHITE);
		r16=new JRadioButton("Phone no");
		r16.setBounds(700,150,100,25);
		r16.addActionListener(this);
		r16.setFont(new Font("times new roman",Font.PLAIN,16));
		r16.setBackground(Color.WHITE);
		r17=new JRadioButton("City");
		r17.setBounds(800,150,50,25);
		r17.addActionListener(this);
		r17.setFont(new Font("times new roman",Font.PLAIN,16));
		r17.setBackground(Color.WHITE);
		r18=new JRadioButton("Address");
		r18.setBounds(870,150,80,25);
		r18.addActionListener(this);
		r18.setFont(new Font("times new roman",Font.PLAIN,16));
		r18.setBackground(Color.WHITE);		
		
		ButtonGroup bg3=new ButtonGroup();
		bg3.add(r13);
		bg3.add(r14);
		bg3.add(r15);
		bg3.add(r16);
		bg3.add(r17);
		bg3.add(r18);

		dtm2=new DefaultTableModel();
		tb3=new JTable(dtm2);
		JScrollPane jsp2=new JScrollPane(tb3);
		jsp2.setBounds(90,190,950,400);
		
		String head2[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
		String col2[]= {"eid","ename","job","mob","city","address"};
		String q2="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid;";
		DbOps db2=new DbOps();
		db2.fillJTable(dtm2,col2,head2,q2);
		
		j3.add(jsp2);
		j3.add(bt7);
		j3.add(bt8);
		j3.add(bt9);
		j3.add(bk4);
		j3.add(lk4);
		j3.add(bs3);
		j3.add(tf3);
		j3.add(r13);
		j3.add(r14);
		j3.add(r15);
		j3.add(r16);
		j3.add(r17);
		j3.add(r18);
		
		j4=new JPanel();
		j4.setLayout(null);
		j4.setBackground(Color.WHITE);
		j4.setBounds(180,50,1200,850);
		add(j4);		
		l6=new JLabel("Hello "+s+"!!");
		l6.setBounds(15,10,400,35);
		//l6.setForeground(new Color(0,0,204));
		l6.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j4.add(l6);
		
		ImageIcon im1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\admag.png");
		bt10=new JButton();
		bt10.setIcon(im1);
		bt10.setBounds(50,50,80,80);	
		bt10.setBorderPainted(false);
		bt10.addActionListener(this);
		ImageIcon im2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\delmag.png");
		bt11=new JButton();
		bt11.setIcon(im2);
		bt11.setBounds(150,50,80,80);
		bt11.setBorderPainted(false);
		bt11.addActionListener(this);
		ImageIcon im3=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\edm.png");
		bt12=new JButton();
		bt12.setIcon(im3);
		bt12.setBackground(Color.WHITE);
		bt12.setBounds(250,50,80,80);	
		bt12.setBorderPainted(false);
		bt12.addActionListener(this);
		ImageIcon i5=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\lang2.jpg");
		bk5=new JButton();
		bk5.setIcon(i5);
		bk5.setBackground(Color.WHITE);
		bk5.setBounds(360,45,100,80);	
		bk5.setBorderPainted(false);
		bk5.addActionListener(this);
		lk5=new JLabel("Language");
		lk5.setBounds(385,125,75,15);
		lk5.setForeground(Color.BLACK);
		lk5.setFont(new Font("times new roman",Font.PLAIN,14));
		bs4=new JButton("Search");
		bs4.addActionListener(this);
		bs4.setBounds(100,145,90,30);
		bs4.setFont(new Font("times new roman",Font.PLAIN,16));
		tf4=new JTextField();
		tf4.setBounds(200,150,180,25);
		tf4.setFont(new Font("times new roman",Font.PLAIN,16));
		
		r19=new JRadioButton("Serial no");
		r19.setBounds(390,150,100,25);
		r19.addActionListener(this);
		r19.setFont(new Font("times new roman",Font.PLAIN,16));
		r19.setBackground(Color.WHITE);
		r20=new JRadioButton("Magazine Name");
		r20.setBounds(500,150,150,25);
		r20.addActionListener(this);
		r20.setFont(new Font("times new roman",Font.PLAIN,16));
		r20.setBackground(Color.WHITE);
		r21=new JRadioButton("Publication");
		r21.setBounds(650,150,100,25);
		r21.addActionListener(this);
		r21.setFont(new Font("times new roman",Font.PLAIN,16));
		r21.setBackground(Color.WHITE);
		r22=new JRadioButton("language");
		r22.setBounds(770,150,100,25);
		r22.addActionListener(this);
		r22.setFont(new Font("times new roman",Font.PLAIN,16));
		r22.setBackground(Color.WHITE);
		
		ButtonGroup bg4=new ButtonGroup();
		bg4.add(r19);
		bg4.add(r20);
		bg4.add(r21);
		bg4.add(r22);

		dtm3=new DefaultTableModel();
		tb4=new JTable(dtm3);
		JScrollPane jsp4=new JScrollPane(tb4);
		jsp4.setBounds(90,190,950,400);
		
		String head4[]= {"Serial no","Magazine Name","Publication","Laguage"};
		String col4[]= {"bid","bname","pub","lan"};
		String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' ;";
		DbOps db4=new DbOps();
		db4.fillJTable(dtm3,col4,head4,q4);
		
		j4.add(jsp4);
		j4.add(bt10);
		j4.add(bt11);
		j4.add(bt12);
		j4.add(bk5);
		j4.add(lk5);
		j4.add(bs4);
		j4.add(tf4);
		j4.add(r19);
		j4.add(r20);
		j4.add(r21);
		j4.add(r22);
		
		j5=new JPanel();
		j5.setLayout(null);
		j5.setBackground(Color.WHITE);
		j5.setBounds(180,50,1200,850);
		add(j5);
		l7=new JLabel("Hello "+s+"!!");
		l7.setBounds(15,10,400,35);
		//l7.setForeground(new Color(0,0,204));
		l7.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j5.add(l7);
		
		ImageIcon ic1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\addnews.jpg");
		bt13=new JButton();
		bt13.setIcon(ic1);
		bt13.setBounds(50,50,80,80);	
		bt13.setBorderPainted(false);
		bt13.addActionListener(this);
		ImageIcon ic2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\newspaper_delete.png");
		bt14=new JButton();
		bt14.setIcon(ic2);
		bt14.setBounds(160,50,80,80);
		bt14.setBorderPainted(false);
		bt14.addActionListener(this);
		ImageIcon ic3=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\newspaper_edit.png");
		bt15=new JButton();
		bt15.setIcon(ic3);
		bt15.setBackground(Color.WHITE);
		bt15.setBounds(260,50,80,80);	
		bt15.setBorderPainted(false);
		bt15.addActionListener(this);
		bk6=new JButton();
		ImageIcon i6=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\lang3.png");
		bk6.setIcon(i6);
		bk6.setBackground(Color.WHITE);
		bk6.setBounds(370,50,80,80);	
		bk6.setBorderPainted(false);
		bk6.addActionListener(this);
		lk5=new JLabel("Language");
		lk5.setBounds(385,130,75,15);
		lk5.setForeground(new Color(0,153,153));
		lk5.setFont(new Font("times new roman",Font.PLAIN,14));
		bs5=new JButton("Search");
		bs5.addActionListener(this);
		bs5.setBounds(100,145,90,30);
		bs5.setFont(new Font("times new roman",Font.PLAIN,16));
		tf5=new JTextField();
		tf5.setBounds(200,150,180,25);
		tf5.setFont(new Font("times new roman",Font.PLAIN,16));
		
		r23=new JRadioButton("Serial no");
		r23.setBounds(390,150,100,25);
		r23.addActionListener(this);
		r23.setFont(new Font("times new roman",Font.PLAIN,16));
		r23.setBackground(Color.WHITE);
		r24=new JRadioButton("Newspaper Name");
		r24.setBounds(500,150,150,25);
		r24.addActionListener(this);
		r24.setFont(new Font("times new roman",Font.PLAIN,16));
		r24.setBackground(Color.WHITE);
		r25=new JRadioButton("Publication");
		r25.setBounds(650,150,100,25);
		r25.addActionListener(this);
		r25.setFont(new Font("times new roman",Font.PLAIN,16));
		r25.setBackground(Color.WHITE);
		r26=new JRadioButton("language");
		r26.setBounds(770,150,100,25);
		r26.addActionListener(this);
		r26.setFont(new Font("times new roman",Font.PLAIN,16));
		r26.setBackground(Color.WHITE);
		r27=new JRadioButton("Date");
		r27.setBounds(880,150,100,25);
		r27.addActionListener(this);
		r27.setFont(new Font("times new roman",Font.PLAIN,16));
		r27.setBackground(Color.WHITE);
		
		ButtonGroup bg5=new ButtonGroup();
		bg5.add(r23);
		bg5.add(r24);
		bg5.add(r25);
		bg5.add(r26);
		bg5.add(r27);
		
		dtm4=new DefaultTableModel();
		tb5=new JTable(dtm4);
		JScrollPane jsp5=new JScrollPane(tb5);
		jsp5.setBounds(90,190,950,400);
		
		String head5[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
		String col5[]= {"bid","bname","pub","lan","date"};
		String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' ;";
		DbOps db5=new DbOps();
		db5.fillJTable(dtm4,col5,head5,q5);
		
		j5.add(jsp5);
		j5.add(bt13);
		j5.add(bt14);
		j5.add(bt15);
		j5.add(bk6);
		j5.add(lk5);
		j5.add(bs5);
		j5.add(tf5);
		j5.add(r23);
		j5.add(r24);
		j5.add(r25);
		j5.add(r26);
		j5.add(r27);
		
		j6=new JPanel();
		j6.setLayout(null);
		j6.setBackground(Color.WHITE);
		j6.setBounds(180,50,1200,850);
		add(j6);
		l8=new JLabel("Hello "+s+"!!");
		l8.setBounds(15,10,400,35);
		//l8.setForeground(new Color(0,0,204));
		l8.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j6.add(l8);
		
		ImageIcon ip1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\is_bk.png");
		bp1=new JButton(ip1);
		bp1.addActionListener(this);
		bp1.setBounds(50,50,90,90);
	 	bp1.setBorderPainted(false);
		j6.add(bp1);
	
		bst1=new JButton("Search");
		bst1.addActionListener(this);
		bst1.setBounds(50,145,90,30);
		bst1.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk1=new JTextField();
		tfk1.setBounds(160,150,180,25);
		tfk1.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt1=new JRadioButton("Student Id");
		rt1.setBounds(350,150,90,25);
		rt1.addActionListener(this);
		rt1.setFont(new Font("times new roman",Font.PLAIN,16));
		rt1.setBackground(Color.WHITE);
		rt2=new JRadioButton("Student Name");
		rt2.setBounds(450,150,120,25);
		rt2.addActionListener(this);
		rt2.setFont(new Font("times new roman",Font.PLAIN,16));
		rt2.setBackground(Color.WHITE);
		rt3=new JRadioButton("Item Name");
		rt3.setBounds(570,150,100,25);
		rt3.addActionListener(this);
		rt3.setFont(new Font("times new roman",Font.PLAIN,16));
		rt3.setBackground(Color.WHITE);
		rt4=new JRadioButton("Course");
		rt4.setBounds(675,150,70,25);
		rt4.addActionListener(this);
		rt4.setFont(new Font("times new roman",Font.PLAIN,16));
		rt4.setBackground(Color.WHITE);
		rt5=new JRadioButton("Issued Date");
		rt5.setBounds(750,150,100,25);
		rt5.addActionListener(this);
		rt5.setFont(new Font("times new roman",Font.PLAIN,16));
		rt5.setBackground(Color.WHITE);
		rt6=new JRadioButton("TimeLimit");
		rt6.setBounds(855,150,100,25);
		rt6.addActionListener(this);
		rt6.setFont(new Font("times new roman",Font.PLAIN,16));
		rt6.setBackground(Color.WHITE);		
		
		ButtonGroup bgt=new ButtonGroup();
		bgt.add(rt1);
		bgt.add(rt2);
		bgt.add(rt3);
		bgt.add(rt4);
		bgt.add(rt5);
		bgt.add(rt6);		
		
		bkt1=new JButton("Issued");
		bkt1.addActionListener(this);
		bkt1.setBackground(new Color(51,255,51));
		bkt1.setBounds(900,45,150,30);
		bkt1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));
		bkt1.setBorderPainted(false);
		
		dtm5=new DefaultTableModel();
		tb6=new JTable(dtm5);
		JScrollPane jsp6=new JScrollPane(tb6);
		jsp6.setBounds(50,190,995,400);
		
		String head6[]= {"Student Id","Student Name","Item Name","Course","Issued Date","TimeLimit"};
		String col6[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
		String query6="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid";
		DbOps db6=new DbOps();
		db6.fillJTable(dtm5, col6, head6, query6);
		
		j6.add(jsp6);
		j6.add(bst1);
		j6.add(tfk1);
		j6.add(rt1);
		j6.add(rt2);
		j6.add(rt3);
		j6.add(rt4);
		j6.add(rt5);
		j6.add(rt6);
		j6.add(bkt1);
		
		j7=new JPanel();
		j7.setLayout(null);
		j7.setBackground(Color.WHITE);
		j7.setBounds(180,50,1200,850);
		add(j7);
		l9=new JLabel("Hello "+s+"!!");
		l9.setBounds(15,10,400,35);
		//l9.setForeground(new Color(0,0,204));
		l9.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j7.add(l9);
		
		ImageIcon ip2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\rt_bk.png");
		bp2=new JButton(ip2);
		bp2.addActionListener(this);
		bp2.setBounds(50,45,85,96);
		bp2.setBorderPainted(false);
		j7.add(bp2);
		
		bkt2=new JButton("Return");
		bkt2.addActionListener(this);
		bkt2.setBackground(new Color(51,255,51));
		bkt2.setBounds(900,45,150,30);
		bkt2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));
		bkt2.setBorderPainted(false);
		
		bst2=new JButton("Search");
		bst2.addActionListener(this);
		bst2.setBounds(50,145,90,30);
		bst2.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk2=new JTextField();
		tfk2.setBounds(160,150,180,25);
		tfk2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt7=new JRadioButton("Student Id");
		rt7.setBounds(350,150,90,25);
		rt7.addActionListener(this);
		rt7.setFont(new Font("times new roman",Font.PLAIN,16));
		rt7.setBackground(Color.WHITE);
		rt8=new JRadioButton("Student Name");
		rt8.setBounds(450,150,120,25);
		rt8.addActionListener(this);
		rt8.setFont(new Font("times new roman",Font.PLAIN,16));
		rt8.setBackground(Color.WHITE);
		rt9=new JRadioButton("Item Name");
		rt9.setBounds(570,150,100,25);
		rt9.addActionListener(this);
		rt9.setFont(new Font("times new roman",Font.PLAIN,16));
		rt9.setBackground(Color.WHITE);
		rt10=new JRadioButton("Course");
		rt10.setBounds(675,150,70,25);
		rt10.addActionListener(this);
		rt10.setFont(new Font("times new roman",Font.PLAIN,16));
		rt10.setBackground(Color.WHITE);
		rt11=new JRadioButton("Issued Date");
		rt11.setBounds(750,150,100,25);
		rt11.addActionListener(this);
		rt11.setFont(new Font("times new roman",Font.PLAIN,16));
		rt11.setBackground(Color.WHITE);
		rt12=new JRadioButton("TimeLimit");
		rt12.setBounds(855,150,100,25);
		rt12.addActionListener(this);
		rt12.setFont(new Font("times new roman",Font.PLAIN,16));
		rt12.setBackground(Color.WHITE);		
		rt13=new JRadioButton("Return Date");
		rt13.setBounds(955,150,100,25);
		rt13.addActionListener(this);
		rt13.setFont(new Font("times new roman",Font.PLAIN,16));
		rt13.setBackground(Color.WHITE);
		
		
		ButtonGroup bgt1=new ButtonGroup();
		bgt1.add(rt7);
		bgt1.add(rt8);
		bgt1.add(rt9);
		bgt1.add(rt10);
		bgt1.add(rt11);
		bgt1.add(rt12);
		bgt1.add(rt13);
		
		dtm6=new DefaultTableModel();
		tb7=new JTable(dtm6);
		JScrollPane jsp7=new JScrollPane(tb7);
		jsp7.setBounds(50,190,995,400);
		
		String head7[]= {"Student Id","Student Name","Item Name","Course","Issued Date","TimeLimit","Return Date"};
		String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
		String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid";
		DbOps db7=new DbOps();
		db7.fillJTable(dtm6, col7, head7, query7);
		
		j7.add(jsp7);
		j7.add(bst2);
		j7.add(tfk2);
		j7.add(rt7);
		j7.add(rt8);
		j7.add(rt9);
		j7.add(rt10);
		j7.add(rt11);
		j7.add(rt12);
		j7.add(rt13);
		j7.add(bkt2);
		
		j8=new JPanel();
		j8.setLayout(null);
		j8.setBackground(Color.WHITE);
		j8.setBounds(180,50,1200,850);
		add(j8);
				
		j1.setVisible(false);
		j2.setVisible(false);
		j3.setVisible(false);
		j4.setVisible(false);
		j5.setVisible(false);
		j6.setVisible(false);
		j7.setVisible(false);
		j8.setVisible(false);
		
		
		add(jp1);
		add(jp2);
		add(jp3);
		
		
		setSize(1700,700);
		setLayout(null);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			b1.setBackground(new Color(0,252,0));
			b9.setBackground(new Color(0,204,0));
			b2.setBackground(new Color(0,204,0));
			b3.setBackground(new Color(0,204,0));
			b4.setBackground(new Color(0,204,0));
			b5.setBackground(new Color(0,204,0));
			b6.setBackground(new Color(0,204,0));
			b7.setBackground(new Color(0,204,0));
			b8.setBackground(new Color(0,204,0));
			
			jp2.setVisible(true);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
			j7.setVisible(false);
			j8.setVisible(false);
		
		}
		if(ae.getSource()==b2)
		{
			b2.setBackground(new Color(0,252,0));
			b1.setBackground(new Color(0,204,0));
			b9.setBackground(new Color(0,204,0));
			b3.setBackground(new Color(0,204,0));
			b4.setBackground(new Color(0,204,0));
			b5.setBackground(new Color(0,204,0));
			b6.setBackground(new Color(0,204,0));
			b7.setBackground(new Color(0,204,0));
			b8.setBackground(new Color(0,204,0));
			
			jp2.setVisible(false);
			j1.setVisible(true);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
			j7.setVisible(false);
			j8.setVisible(false);
		
		}
		if(ae.getSource()==b3)
		{
			b3.setBackground(new Color(0,252,0));
			b1.setBackground(new Color(0,204,0));
			b2.setBackground(new Color(0,204,0));
			b9.setBackground(new Color(0,204,0));
			b4.setBackground(new Color(0,204,0));
			b5.setBackground(new Color(0,204,0));
			b6.setBackground(new Color(0,204,0));
			b7.setBackground(new Color(0,204,0));
			b8.setBackground(new Color(0,204,0));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(true);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
			j7.setVisible(false);
			j8.setVisible(false);
		
		}
		if(ae.getSource()==b4)
		{
			b4.setBackground(new Color(0,252,0));
			b1.setBackground(new Color(0,204,0));
			b2.setBackground(new Color(0,204,0));
			b3.setBackground(new Color(0,204,0));
			b9.setBackground(new Color(0,204,0));
			b5.setBackground(new Color(0,204,0));
			b6.setBackground(new Color(0,204,0));
			b7.setBackground(new Color(0,204,0));
			b8.setBackground(new Color(0,204,0));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(true);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
			j7.setVisible(false);
			j8.setVisible(false);
		
		}
		if(ae.getSource()==b5)
		{
			b5.setBackground(new Color(0,252,0));
			b1.setBackground(new Color(0,204,0));
			b2.setBackground(new Color(0,204,0));
			b3.setBackground(new Color(0,204,0));
			b4.setBackground(new Color(0,204,0));
			b9.setBackground(new Color(0,204,0));
			b6.setBackground(new Color(0,204,0));
			b7.setBackground(new Color(0,204,0));
			b8.setBackground(new Color(0,204,0));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(true);
			j5.setVisible(false);
			j6.setVisible(false);
			j7.setVisible(false);
			j8.setVisible(false);
		
		}
		if(ae.getSource()==b6)
		{
			b6.setBackground(new Color(0,252,0));
			b1.setBackground(new Color(0,204,0));
			b2.setBackground(new Color(0,204,0));
			b3.setBackground(new Color(0,204,0));
			b4.setBackground(new Color(0,204,0));
			b5.setBackground(new Color(0,204,0));
			b9.setBackground(new Color(0,204,0));
			b7.setBackground(new Color(0,204,0));
			b8.setBackground(new Color(0,204,0));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(true);
			j6.setVisible(false);
			j7.setVisible(false);
			j8.setVisible(false);
		
		}
		if(ae.getSource()==b7)
		{
			b7.setBackground(new Color(0,252,0));
			b1.setBackground(new Color(0,204,0));
			b2.setBackground(new Color(0,204,0));
			b3.setBackground(new Color(0,204,0));
			b4.setBackground(new Color(0,204,0));
			b5.setBackground(new Color(0,204,0));
			b6.setBackground(new Color(0,204,0));
			b9.setBackground(new Color(0,204,0));
			b8.setBackground(new Color(0,204,0));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(true);
			j7.setVisible(false);
			j8.setVisible(false);
		
		}
		if(ae.getSource()==b8)
		{
			b8.setBackground(new Color(0,252,0));
			b1.setBackground(new Color(0,204,0));
			b2.setBackground(new Color(0,204,0));
			b3.setBackground(new Color(0,204,0));
			b4.setBackground(new Color(0,204,0));
			b5.setBackground(new Color(0,204,0));
			b6.setBackground(new Color(0,204,0));
			b7.setBackground(new Color(0,204,0));
			b9.setBackground(new Color(0,204,0));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
			j7.setVisible(true);
			j8.setVisible(false);
		
		}
		if(ae.getSource()==b9)
		{
			b9.setBackground(new Color(0,252,0));
			b1.setBackground(new Color(0,204,0));
			b2.setBackground(new Color(0,204,0));
			b3.setBackground(new Color(0,204,0));
			b4.setBackground(new Color(0,204,0));
			b5.setBackground(new Color(0,204,0));
			b6.setBackground(new Color(0,204,0));
			b7.setBackground(new Color(0,204,0));
			b8.setBackground(new Color(0,204,0));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
			j7.setVisible(false);
			j8.setVisible(true);
		
		}
		
		/*if(ae.getSource()==b10)		//..LOGOUT SCREEN
			.setVisible(true);*/
		if(ae.getSource()==bs1)
		{
			if(r1.isSelected()==true)
			{	
				String q="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where bid like '%"+tf1.getText()+"%'";
				String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String col[]= {"bid","bname","pub","author","lan","sub"};
				DbOps db=new DbOps();
				db.fillJTable(dtm,col,head,q);		
			}
			if(r2.isSelected()==true)
			{	
				String q="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where bname like '%"+tf1.getText()+"%'";
				String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String col[]= {"bid","bname","pub","author","lan","sub"};
				DbOps db=new DbOps();
				db.fillJTable(dtm,col,head,q);		
			}
			if(r3.isSelected()==true)
			{	
				String q="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where pub like '%"+tf1.getText()+"%'";
				String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String col[]= {"bid","bname","pub","author","lan","sub"};
				DbOps db=new DbOps();
				db.fillJTable(dtm,col,head,q);		
			}
			if(r4.isSelected()==true)
			{	
				String q="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where author like '%"+tf1.getText()+"%'";
				String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String col[]= {"bid","bname","pub","author","lan","sub"};
				DbOps db=new DbOps();
				db.fillJTable(dtm,col,head,q);		
			}
			if(r5.isSelected()==true)
			{	
				String q="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where lan like '%"+tf1.getText()+"%'";
				String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String col[]= {"bid","bname","pub","author","lan","sub"};
				DbOps db=new DbOps();
				db.fillJTable(dtm,col,head,q);		
			}
			if(r6.isSelected()==true)
			{	
				String q="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where sub like '%"+tf1.getText()+"%'";
				String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String col[]= {"bid","bname","pub","author","lan","sub"};
 				DbOps db=new DbOps();
				db.fillJTable(dtm,col,head,q);		
			}
		}
		if(ae.getSource()==bs2)
		{
			if(r7.isSelected()==true)
			{	
				String head1[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String col1[]= {"stid","stname","course","mob","city","address"};
				String q1="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where stid like '%"+tf2.getText()+"%'";
				DbOps db1=new DbOps();
				db1.fillJTable(dtm1,col1,head1,q1);		
			}
			if(r8.isSelected()==true)
			{	
				String head1[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String col1[]= {"stid","stname","course","mob","city","address"};
				String q1="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where stname like '%"+tf2.getText()+"%'";
				DbOps db1=new DbOps();
				db1.fillJTable(dtm1,col1,head1,q1);		
			}
			if(r9.isSelected()==true)
			{	
				String head1[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String col1[]= {"stid","stname","course","mob","city","address"};
				String q1="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where course like '%"+tf2.getText()+"%'";
				DbOps db1=new DbOps();
				db1.fillJTable(dtm1,col1,head1,q1);
			}
			if(r10.isSelected()==true)
			{	
				String head1[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String col1[]= {"stid","stname","course","mob","city","address"};
				String q1="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where mob like '%"+tf2.getText()+"%'";
				DbOps db1=new DbOps();
				db1.fillJTable(dtm1,col1,head1,q1);	
			}
			if(r11.isSelected()==true)
			{	
				String head1[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String col1[]= {"stid","stname","course","mob","city","address"};
				String q1="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where city like '%"+tf2.getText()+"%'";
				DbOps db1=new DbOps();
				db1.fillJTable(dtm1,col1,head1,q1);	
			}
			if(r12.isSelected()==true)
			{	
				String head1[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String col1[]= {"stid","stname","course","mob","city","address"};
				String q1="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where address like '%"+tf2.getText()+"%'";
				DbOps db1=new DbOps();
				db1.fillJTable(dtm1,col1,head1,q1);	
			}
		}
		if(ae.getSource()==bs3)
		{
			if(r13.isSelected()==true)
			{	
				String head2[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String col2[]= {"eid","ename","job","mob","city","address"};
				String q2="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where eid like '%"+tf3.getText()+"%'";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2,col2,head2,q2);		
			}
			if(r14.isSelected()==true)
			{	
				String head2[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String col2[]= {"eid","ename","job","mob","city","address"};
				String q2="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where ename like '%"+tf3.getText()+"%'";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2,col2,head2,q2);
			}
			if(r15.isSelected()==true)
			{	
				String head2[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String col2[]= {"eid","ename","job","mob","city","address"};
				String q2="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where job like '%"+tf3.getText()+"%'";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2,col2,head2,q2);
			}
			if(r16.isSelected()==true)
			{	
				String head2[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String col2[]= {"eid","ename","job","mob","city","address"};
				String q2="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where mob like '%"+tf3.getText()+"%'";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2,col2,head2,q2);		
			}
			if(r17.isSelected()==true)
			{	
				String head2[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String col2[]= {"eid","ename","job","mob","city","address"};
				String q2="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where city like '%"+tf3.getText()+"%'";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2,col2,head2,q2);
			}
			if(r18.isSelected()==true)
			{	
				String head2[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String col2[]= {"eid","ename","job","mob","city","address"};
				String q2="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where address like '%"+tf3.getText()+"%'";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2,col2,head2,q2);		
			}
		}
		if(ae.getSource()==bs4)
		{
			if(r19.isSelected()==true)
			{	
				String head4[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String col4[]= {"bid","bname","pub","lan"};
				String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and bid like '%"+tf4.getText()+"%';";
				DbOps db4=new DbOps();
				db4.fillJTable(dtm3,col4,head4,q4);
			}
			if(r20.isSelected()==true)
			{	
				String head4[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String col4[]= {"bid","bname","pub","lan"};
				String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and bname like '%"+tf4.getText()+"%';";
				DbOps db4=new DbOps();
				db4.fillJTable(dtm3,col4,head4,q4);
			}
			if(r21.isSelected()==true)
			{	
				String head4[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String col4[]= {"bid","bname","pub","lan"};
				String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and pub like '%"+tf4.getText()+"%';";
				DbOps db4=new DbOps();
				db4.fillJTable(dtm3,col4,head4,q4);
			}
			if(r22.isSelected()==true)
			{	
				String head4[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String col4[]= {"bid","bname","pub","lan"};
				String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and lan like '%"+tf4.getText()+"%';";
				DbOps db4=new DbOps();
				db4.fillJTable(dtm3,col4,head4,q4);
			}
		}
		if(ae.getSource()==bs5)
		{
			if(r23.isSelected()==true)
			{	
				String head5[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
				String col5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and bid like '%"+tf5.getText()+"%';";
				DbOps db5=new DbOps();
				db5.fillJTable(dtm4,col5,head5,q5);
			}
			if(r24.isSelected()==true)
			{	
				String head5[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
				String col5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and bname like '%"+tf5.getText()+"%';";
				DbOps db5=new DbOps();
				db5.fillJTable(dtm4,col5,head5,q5);
			}
			if(r25.isSelected()==true)
			{	
				String head5[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
				String col5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and pub like '%"+tf5.getText()+"%';";
				DbOps db5=new DbOps();
				db5.fillJTable(dtm4,col5,head5,q5);
			}
			if(r26.isSelected()==true)
			{	
				String head5[]= {"Date","Newspaper Name","Publication","Laguage","Date"};
				String col5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and lan like '%"+tf5.getText()+"%';";
				DbOps db5=new DbOps();
				db5.fillJTable(dtm4,col5,head5,q5);	
			}
			if(r27.isSelected()==true)
			{	
				String head5[]= {"Date","Newspaper Name","Publication","Laguage","Date"};
				String col5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and date like '%"+tf5.getText()+"%';";
				DbOps db5=new DbOps();
				db5.fillJTable(dtm4,col5,head5,q5);	
			}
		}
		if(ae.getSource()==bst1)
		{
			if(c1%2!=0 || c1==0)
			{
				if(rt1.isSelected()==true)
				{	
					String head6[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
					String col6[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
					String query6="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where issued.stid like '%"+tfk1.getText()+"%';";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);
				}
				if(rt2.isSelected()==true)
				{	
					String head6[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
					String col6[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
					String query6="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where stname like '%"+tfk1.getText()+"%';";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);		
				}
				if(rt3.isSelected()==true)
				{	
					String head6[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
					String col6[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
					String query6="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where bname like '%"+tfk1.getText()+"%';";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);		
				}
				if(rt4.isSelected()==true)
				{	
					String head6[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
					String col6[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
					String query6="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where course like '%"+tfk1.getText()+"%';";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);		
		
				}
				if(rt5.isSelected()==true)
				{	
					String head6[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
					String col6[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
					String query6="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where isdate like '%"+tfk1.getText()+"%';";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);			
		
				}
				if(rt6.isSelected()==true)
				{	
					String head6[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
					String col6[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
					String query6="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where exp_retdate like '%"+tfk1.getText()+"%';";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);			
				}
			}
			else
			{
				if(rt1.isSelected()==true)
				{	
					String head6[]= {"Item Id","Item Name","Publisher","Author","Language","Type"};
					String col6[]= {"books.bid","bname","pub","author","lan","type"};
					String query6="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where books.bid like '%"+tfk1.getText()+"%' and issued.isdate is NULL order by author desc;";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);
				}
				if(rt2.isSelected()==true)
				{	
					String head6[]= {"Item Id","Item Name","Publisher","Author","Language","Type"};
					String col6[]= {"books.bid","bname","pub","author","lan","type"};
					String query6="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where bname like '%"+tfk1.getText()+"%' and issued.isdate is NULL order by author desc;";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);		
				}
				if(rt3.isSelected()==true)
				{	
					String head6[]= {"Item Id","Item Name","Publisher","Author","Language","Type"};
					String col6[]= {"books.bid","bname","pub","author","lan","type"};
					String query6="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where pub like '%"+tfk1.getText()+"%' and issued.isdate is NULL order by author desc;";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);		
				}
				if(rt4.isSelected()==true)
				{	
					String head6[]= {"Item Id","Item Name","Publisher","Author","Language","Type"};
					String col6[]= {"books.bid","bname","pub","author","lan","type"};
					String query6="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where author like '%"+tfk1.getText()+"%' and issued.isdate is NULL order by author desc;";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);		
		
				}
				if(rt5.isSelected()==true)
				{	
					String head6[]= {"Item Id","Item Name","Publisher","Author","Language","Type"};
					String col6[]= {"books.bid","bname","pub","author","lan","type"};
					String query6="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where lan like '%"+tfk1.getText()+"%' and issued.isdate is NULL order by author desc;";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);		
		
				}
				if(rt6.isSelected()==true)
				{	
					String head6[]= {"Item Id","Item Name","Publisher","Author","Language","Type"};
					String col6[]= {"books.bid","bname","pub","author","lan","type"};
					String query6="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where type like '%"+tfk1.getText()+"%' and issued.isdate is NULL order by author desc;";
					DbOps db6=new DbOps();
					db6.fillJTable(dtm5, col6, head6, query6);				
				}
			}
		}
		if(ae.getSource()==bst2)
		{
			if(c2%2!=0 || c2==0) 
			{
				if(rt7.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid like '%"+tfk2.getText()+"%';";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);	
				}
				if(rt8.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname like '%"+tfk2.getText()+"%';";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);	
				}
				if(rt9.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where bname like '%"+tfk2.getText()+"%';";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);	
				}
				if(rt10.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where course like '%"+tfk2.getText()+"%';";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);		
		
				}
				if(rt11.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where isdate like '%"+tfk2.getText()+"%'";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);			
		
				}
				if(rt12.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where exp_retdate like '%"+tfk2.getText()+"%'";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);				
				}
				if(rt13.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate like '%"+tfk2.getText()+"%'";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);	
				
				}
			}
			else
			{
				if(rt7.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid like '%"+tfk2.getText()+"%' and retdate is null;";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);	
				}
				if(rt8.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname like '%"+tfk2.getText()+"%' and retdate is null;";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);	
				}
				if(rt9.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where bname like '%"+tfk2.getText()+"%' and retdate is null;";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);	
		
				}
				if(rt10.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where course like '%"+tfk2.getText()+"%' and retdate is null;";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);		
		
				}
				if(rt11.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where isdate like '%"+tfk2.getText()+"%' and retdate is null;";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);			
		
				}
				if(rt12.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where exp_retdate like '%"+tfk2.getText()+"%' and retdate is null;";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);				
				}
				if(rt13.isSelected()==true)
				{	
					String head7[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
					String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
					String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate like '%"+tfk2.getText()+"%' and retdate is null;";
					DbOps db7=new DbOps();
					db7.fillJTable(dtm6, col7, head7, query7);	
				
				}
			}
		}
		if(ae.getSource()==bkt1)
		{
			c1++;
			if(c1%2!=0)
			{
				bkt1.setText("Issued");
				bkt1.setBackground(new Color(51,255,51));
				
				String head6[]= {"Student Id","Student Name","Item Name","Course","Issued Date","TimeLimit"};
				String col6[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
				String query6="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid";
				DbOps db6=new DbOps();
				db6.fillJTable(dtm5, col6, head6, query6);
				rt1.setText("Student Id");
				rt1.setBounds(350,150,90,25);
				rt2.setText("Student Name");
				rt2.setBounds(450,150,120,25);
				rt3.setText("Item Name");
				rt3.setBounds(570,150,100,25);
				rt4.setText("Course");
				rt4.setBounds(675,150,70,25);
				rt5.setText("Issued Date");
				rt5.setBounds(750,150,100,25);
				rt6.setText("TimeLimit");
				rt6.setBounds(855,150,100,25);	
				
			
			}
			else 
			{
				bkt1.setText("Not Issued");
			    bkt1.setBackground(new Color(255,0,0));
			    String head6[]= {"Item Id","Item Name","Publisher","Author","Language","Type"};
				String col6[]= {"books.bid","bname","pub","author","lan","type"};
				String query6="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where issued.isdate is NULL order by author desc;";
				DbOps db6=new DbOps();
				db6.fillJTable(dtm5, col6, head6, query6);	
				rt1.setText("Item ID");
				rt2.setText("Item Name");
				rt2.setBounds(460,150,120,25);
				rt3.setText("Publisher");
				rt3.setBounds(580,150,100,25);
				rt4.setText("Author");
				rt4.setBounds(690,150,80,25);
				rt5.setText("Language");
				rt5.setBounds(780,150,100,25);
				rt6.setText("Type");
				rt6.setBounds(890,150,60,25);
			}
		}
	
		if(ae.getSource()==bkt2)
		{ 
			c2++;
			if(c2%2!=0)
			{
				bkt2.setText("Return");
				bkt2.setBackground(new Color(51,255,51));
				String head7[]= {"Student Id","Student Name","Item Name","Course","Issued Date","TimeLimit","Return Date"};
				String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is not null;";
				DbOps db7=new DbOps();
				db7.fillJTable(dtm6, col7, head7, query7);
			}
			else 
			{
				bkt2.setText("Not Return");
			    bkt2.setBackground(new Color(255,0,0));
				
				String head7[]= {"Student Id","Student Name","Item Name","Course","Issued Date","TimeLimit","Return Date"};
				String col7[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query7="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null;";
				DbOps db7=new DbOps();
				db7.fillJTable(dtm6, col7, head7, query7);	
			}
		}
		int f=0;
		if(ae.getSource()==bp1)
		{
			new issued(f,"","","");
		}
		if(ae.getSource()==bp2)
		{
			new Return(f,"","");
		}
		if(ae.getSource()==bt1)
			new book("BOOK ","ISBN",1);
		if(ae.getSource()==bt2)
			new bookdelup("BOOK ","ISBN","Delete",1,0);
		if(ae.getSource()==bt3)
			new bookdelup("BOOK ","ISBN","Update",1,1);
		if(ae.getSource()==bk1)
			new Language();
		if(ae.getSource()==bk2)
			new Subject();
		
		if(ae.getSource()==bt4)
			new Student();
		if(ae.getSource()==bt5)
			new Studentdelup("Delete",0);
		if(ae.getSource()==bt6)
			new Studentdelup("Update",1);
		if(ae.getSource()==bk3)
			new Course();
		
		if(ae.getSource()==bt7)
			new Employee();
		if(ae.getSource()==bt8)
			new Employeedelup("Delete",0);
		if(ae.getSource()==bt9)
			new Employeedelup("Update",1);
		if(ae.getSource()==bk4)
			new Designation();
		
		if(ae.getSource()==bt10)
			new book("MAGAZINE ","SERIAL NO",2);
		if(ae.getSource()==bt11)
			new bookdelup("MAGAZINE ","SERIAL NO","Delete",2,0);
		if(ae.getSource()==bt12)
			new bookdelup("MAGAZINE ","SERIAL NO","Update",2,1);
		if(ae.getSource()==bk5)
			new Language();
		
		if(ae.getSource()==bt13)
			new book("NEWSPAPER ","SERIAL NO",3);
		if(ae.getSource()==bt14)
			new bookdelup("NEWSPAPER ","SERIAL NO","Delete",3,0);
		if(ae.getSource()==bt15)
			new bookdelup("NEWSPAPER ","SERIAL NO","Update",3,1);
		if(ae.getSource()==bk6)
			new Language();
		
	}
	/*
	public static void main(String [] ar)
	{
		new admin_dashboard();
	}*/
}

