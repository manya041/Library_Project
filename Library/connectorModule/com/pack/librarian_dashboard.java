package com.pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

import javax.swing.table.*;

public class librarian_dashboard extends JFrame implements ActionListener
{
	JPanel jp1,jp2,jp3,jk1,jk2,jk3,jk4,jk5,jk6,jk7,jk8,jk9,j1,j2,j3,j4,j5,j6,j7,j8,j9,p1,p2,p3,p4,p5,pk1,pk2,pk3,pk4;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,le1,le2,le3,le4,le5,lb1,lb2,lb3,lb4,lb5,lbk1,lbk2,lbk3,lbk4,lbkk1,lbkk2,lbkk3,lbkk4,lck,lck1,lck2,lck3,lck4,lck5,lck6,lck7,lc1,lc2,lc3,lc4,lc5,lek1,lek2,lek3,lek4;
	JTextField tf1,tf2,tfk1,tfk2,tfk3,tfk4,tfk5,tfc,tfc1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,bt1,bt2,bs,bs1,bk1,bk2,bs2,bs3,bs4,bs5,bsk1,bsk2,bsk3,bsk4,bsk5,bkc,bkc1;
	JScrollPane jsp1,jsp2,js1,js2,js3,js4,js5,js6;
	JTable tb1,tb2,t1,t2,t3,t4,t5,tb3;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,rt1,rt2,rt3,rt4,rt5,rt6,rt7,rt8,rt9,rt10,rt11,rt12,rt13,rt14,rt15,rt16,rt17,rt18,rt19,rt20,rt21,rt22,rt23,rt24,rt25,rt26,rt27;
	DefaultTableModel dtm1,dtm2,dt1,dt2,dt3,dt4,dt5,dt6,dt7;
	int c=0,c1=0;
	String sid,tamt;
	librarian_dashboard(String s,String id)
	{
		sid=id;
		jp1=new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp1.setBackground(new Color(100,149,237));
		jp1.setBounds(0,0,1700,50);
		l1=new JLabel("LIBRARIAN  DASHBOARD");
		l1.setBounds(80,0,350,50);
		l1.setFont(new Font("Times new roman",Font.BOLD,30));
		jp1.add(l1);
		
		jp2=new JPanel();
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp2.setBackground(Color.WHITE);
		jp2.setBounds(180,50,1200,850);
		jp2.setLayout(null);
		
		l2=new JLabel("Hello "+s+"!!");
		l2.setBounds(15,20,400,35);
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

		/*l2=new JLabel("HELLO  "+s+"!!");
		l2.setBounds(15,20,500,40);
		l2.setForeground(new Color(51,153,255));
		l2.setFont(new Font("Algerian",Font.BOLD,30));
		jp2.add(l2);*/
		
		jp3=new JPanel();
		jp3.setBounds(0,50,180,850);
		jp3.setBackground(new Color(102,178,255));
		jp3.setLayout(null);
		
		b1=new JButton("Dashboard");
		b1.setBounds(2,5,175,40);
		b1.addActionListener(this);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		b1.setBackground(new Color(30,144,255));
		b1.setForeground(Color.WHITE);
		b2=new JButton("Books");
		b2.setBounds(2,50,175,40);  
		b2.addActionListener(this);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		b2.setBackground(new Color(30,144,255));
		b2.setForeground(Color.WHITE);
		b3=new JButton("Students");
		b3.setBounds(2,95,175,40);
		b3.addActionListener(this);
		b3.setFont(new Font("times new roman",Font.PLAIN,16));
		b3.setBackground(new Color(30,144,255));
		b3.setForeground(Color.WHITE);
		b4=new JButton("Members");
		b4.setBounds(2,140,175,40);
		b4.addActionListener(this);
		b4.setFont(new Font("times new roman",Font.PLAIN,16));
		b4.setBackground(new Color(30,144,255));
		b4.setForeground(Color.WHITE);
		b5=new JButton("Magazines");
		b5.setBounds(2,185,175,40);
		b5.addActionListener(this);
		b5.setFont(new Font("times new roman",Font.PLAIN,16));
		b5.setBackground(new Color(30,144,255));
		b5.setForeground(Color.WHITE);
		b6=new JButton("Newspapers");
		b6.setBounds(2,230,175,40);
		b6.addActionListener(this);
		b6.setFont(new Font("times new roman",Font.PLAIN,16));
		b6.setBackground(new Color(30,144,255));
		b6.setForeground(Color.WHITE);
		b7=new JButton("Issued");
		b7.setBounds(2,275,175,40);
		b7.addActionListener(this);
		b7.setFont(new Font("times new roman",Font.PLAIN,16));
		b7.setBackground(new Color(30,144,255));
		b7.setForeground(Color.WHITE);
		b8=new JButton("Returned");
		b8.setBounds(2,320,175,40);
		b8.addActionListener(this);
		b8.setFont(new Font("times new roman",Font.PLAIN,16));
		b8.setBackground(new Color(30,144,255));
		b8.setForeground(Color.WHITE);
		b9=new JButton("penalty");
		b9.setBounds(2,365,175,40);
		b9.addActionListener(this);
		b9.setFont(new Font("times new roman",Font.PLAIN,16));
		b9.setBackground(new Color(30,144,255));
		b9.setForeground(Color.WHITE);
		b10=new JButton("LOGOUT");
		b10.setBounds(2,410,175,40);
		b10.addActionListener(this);
		b10.setFont(new Font("times new roman",Font.PLAIN,16));
		b10.setBackground(new Color(30,144,255));
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
		
		l3=new JLabel("Hello  "+s+"!!");
		l3.setBounds(15,20,500,40);
		l3.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j1.add(l3);
		
		bsk1=new JButton("Search");
		bsk1.addActionListener(this);
		bsk1.setBounds(100,105,90,30);
		bsk1.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk1=new JTextField();
		tfk1.setBounds(200,110,180,25);
		tfk1.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt1=new JRadioButton("ISBN");
		rt1.setBounds(390,110,70,25);
		rt1.addActionListener(this);
		rt1.setFont(new Font("times new roman",Font.PLAIN,16));
		rt1.setBackground(Color.WHITE);
		rt2=new JRadioButton("Book Name");
		rt2.setBounds(465,110,100,25);
		rt2.addActionListener(this);
		rt2.setFont(new Font("times new roman",Font.PLAIN,16));
		rt2.setBackground(Color.WHITE);
		rt3=new JRadioButton("Publication");
		rt3.setBounds(575,110,100,25);
		rt3.addActionListener(this);
		rt3.setFont(new Font("times new roman",Font.PLAIN,16));
		rt3.setBackground(Color.WHITE);
		rt4=new JRadioButton("Author");
		rt4.setBounds(680,110,70,25);
		rt4.addActionListener(this);
		rt4.setFont(new Font("times new roman",Font.PLAIN,16));
		rt4.setBackground(Color.WHITE);
		rt5=new JRadioButton("Languge");
		rt5.setBounds(760,110,80,25);
		rt5.addActionListener(this);
		rt5.setFont(new Font("times new roman",Font.PLAIN,16));
		rt5.setBackground(Color.WHITE);
		rt6=new JRadioButton("Subject");
		rt6.setBounds(850,110,80,25);
		rt6.addActionListener(this);
		rt6.setFont(new Font("times new roman",Font.PLAIN,16));
		rt6.setBackground(Color.WHITE);		
		
		ButtonGroup bgk=new ButtonGroup();
		bgk.add(rt1);
		bgk.add(rt2);
		bgk.add(rt3);
		bgk.add(rt4);
		bgk.add(rt5);
		bgk.add(rt6);

		dt1=new DefaultTableModel();
		t1=new JTable(dt1);
		JScrollPane js1=new JScrollPane(t1);
		js1.setBounds(90,150,970,400);
		
		String h1[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
		String c1[]= {"bid","bname","pub","author","lan","sub"};
		String q1="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where type='books';";
		DbOps dbk1=new DbOps();
		dbk1.fillJTable(dt1,c1,h1,q1);
		
		j1.add(js1);
		j1.add(rt1);
		j1.add(rt2);
		j1.add(rt3);
		j1.add(rt4);
		j1.add(rt5);
		j1.add(rt6);
		j1.add(bsk1);
		j1.add(tfk1);
		
		j2=new JPanel();
		j2.setLayout(null);
		j2.setBackground(Color.WHITE);
		j2.setBounds(180,50,1200,850);
		add(j2);
		l4=new JLabel("Hello  "+s+"!!");
		l4.setForeground(new Color(64,224,208));
		l4.setBounds(15,20,500,40);
		l4.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j2.add(l4);
		
		bsk2=new JButton("Search");
		bsk2.addActionListener(this);
		bsk2.setBounds(100,105,90,30);
		bsk2.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk2=new JTextField();
		tfk2.setBounds(200,110,180,25);
		tfk2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt7=new JRadioButton("SID");
		rt7.setBounds(390,110,50,25);
		rt7.addActionListener(this);
		rt7.setFont(new Font("times new roman",Font.PLAIN,16));
		rt7.setBackground(Color.WHITE);
		rt8=new JRadioButton("Student Name");
		rt8.setBounds(455,110,120,25);
		rt8.addActionListener(this);
		rt8.setFont(new Font("times new roman",Font.PLAIN,16));
		rt8.setBackground(Color.WHITE);
		rt9=new JRadioButton("Course");
		rt9.setBounds(585,110,80,25);
		rt9.addActionListener(this);
		rt9.setFont(new Font("times new roman",Font.PLAIN,16));
		rt9.setBackground(Color.WHITE);
		rt10=new JRadioButton("Phone no");
		rt10.setBounds(670,110,100,25);
		rt10.addActionListener(this);
		rt10.setFont(new Font("times new roman",Font.PLAIN,16));
		rt10.setBackground(Color.WHITE);
		rt11=new JRadioButton("City");
		rt11.setBounds(770,110,50,25);
		rt11.addActionListener(this);
		rt11.setFont(new Font("times new roman",Font.PLAIN,16));
		rt11.setBackground(Color.WHITE);
		rt12=new JRadioButton("Address");
		rt12.setBounds(835,110,80,25);
		rt12.addActionListener(this);
		rt12.setFont(new Font("times new roman",Font.PLAIN,16));
		rt12.setBackground(Color.WHITE);		
		
		ButtonGroup b2=new ButtonGroup();
		b2.add(rt7);
		b2.add(rt8);
		b2.add(rt9);
		b2.add(rt10);
		b2.add(rt11);
		b2.add(rt12);

		dt2=new DefaultTableModel();
		t2=new JTable(dt2);
		JScrollPane js2=new JScrollPane(t2);
		js2.setBounds(90,150,970,400);
		
		String h2[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
		String c2[]= {"stid","stname","course","mob","city","address"};
		String q2="select stid,stname,course,mob,city,address from student inner join course on course.cid=student.cid;";
		DbOps dbk2=new DbOps();
		dbk2.fillJTable(dt2,c2,h2,q2);
		
		j2.add(js2);
		j2.add(bsk2);
		j2.add(tfk2);
		j2.add(rt7);
		j2.add(rt8);
		j2.add(rt9);
		j2.add(rt10);
		j2.add(rt11);
		j2.add(rt12);

		j3=new JPanel();
		j3.setLayout(null);
		j3.setBackground(Color.WHITE);
		j3.setBounds(180,50,1200,850);
		add(j3);
		l5=new JLabel("Hello  "+s+"!!");
		l5.setBounds(15,20,500,40);
		l5.setForeground(new Color(72,209,204));
		l5.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j3.add(l5);
		
		bsk3=new JButton("Search");
		bsk3.addActionListener(this);
		bsk3.setBounds(100,105,90,30);
		bsk3.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk3=new JTextField();
		tfk3.setBounds(200,110,180,25);
		tfk3.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt13=new JRadioButton("EID");
		rt13.setBounds(390,110,50,25);
		rt13.addActionListener(this);
		rt13.setFont(new Font("times new roman",Font.PLAIN,16));
		rt13.setBackground(Color.WHITE);
		rt14=new JRadioButton("Employee Name");
		rt14.setBounds(455,110,130,25);
		rt14.addActionListener(this);
		rt14.setFont(new Font("times new roman",Font.PLAIN,16));
		rt14.setBackground(Color.WHITE);
		rt15=new JRadioButton("Designation");
		rt15.setBounds(595,110,100,25);
		rt15.addActionListener(this);
		rt15.setFont(new Font("times new roman",Font.PLAIN,16));
		rt15.setBackground(Color.WHITE);
		rt16=new JRadioButton("Phone no");
		rt16.setBounds(700,110,100,25);
		rt16.addActionListener(this);
		rt16.setFont(new Font("times new roman",Font.PLAIN,16));
		rt16.setBackground(Color.WHITE);
		rt17=new JRadioButton("City");
		rt17.setBounds(800,110,50,25);
		rt17.addActionListener(this);
		rt17.setFont(new Font("times new roman",Font.PLAIN,16));
		rt17.setBackground(Color.WHITE);
		rt18=new JRadioButton("Address");
		rt18.setBounds(870,110,80,25);
		rt18.addActionListener(this);
		rt18.setFont(new Font("times new roman",Font.PLAIN,16));
		rt18.setBackground(Color.WHITE);		
		
		ButtonGroup bg3=new ButtonGroup();
		bg3.add(rt13);
		bg3.add(rt14);
		bg3.add(rt15);
		bg3.add(rt16);
		bg3.add(rt17);
		bg3.add(rt18);

		dt3=new DefaultTableModel();
		t3=new JTable(dt3);
		JScrollPane js3=new JScrollPane(t3);
		js3.setBounds(90,150,970,400);
		
		String h3[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
		String c3[]= {"eid","ename","job","mob","city","address"};
		String q3="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid;";
		DbOps dbk3=new DbOps();
		dbk3.fillJTable(dt3,c3,h3,q3);
		
		j3.add(js3);
		j3.add(bsk3);
		j3.add(tfk3);
		j3.add(rt13);
		j3.add(rt14);
		j3.add(rt15);
		j3.add(rt16);
		j3.add(rt17);
		j3.add(rt18);

		j4=new JPanel();
		j4.setLayout(null);
		j4.setBackground(Color.WHITE);
		j4.setBounds(180,50,1200,850);
		add(j4);
		l6=new JLabel("Hello  "+s+"!!");
		l6.setBounds(15,20,500,40);
		l6.setForeground(new Color(65,105,225));
		l6.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j4.add(l6);
		
		bsk4=new JButton("Search");
		bsk4.addActionListener(this);
		bsk4.setBounds(100,105,90,30);
		bsk4.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk4=new JTextField();
		tfk4.setBounds(200,110,180,25);
		tfk4.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt19=new JRadioButton("Serial no");
		rt19.setBounds(390,110,100,25);
		rt19.addActionListener(this);
		rt19.setFont(new Font("times new roman",Font.PLAIN,16));
		rt19.setBackground(Color.WHITE);
		rt20=new JRadioButton("Magazine Name");
		rt20.setBounds(500,110,150,25);
		rt20.addActionListener(this);
		rt20.setFont(new Font("times new roman",Font.PLAIN,16));
		rt20.setBackground(Color.WHITE);
		rt21=new JRadioButton("Publication");
		rt21.setBounds(650,110,100,25);
		rt21.addActionListener(this);
		rt21.setFont(new Font("times new roman",Font.PLAIN,16));
		rt21.setBackground(Color.WHITE);
		rt22=new JRadioButton("language");
		rt22.setBounds(770,110,100,25);
		rt22.addActionListener(this);
		rt22.setFont(new Font("times new roman",Font.PLAIN,16));
		rt22.setBackground(Color.WHITE);
		
		ButtonGroup b4=new ButtonGroup();
		b4.add(rt19);
		b4.add(rt20);
		b4.add(rt21);
		b4.add(rt22);

		dt4=new DefaultTableModel();
		t4=new JTable(dt4);
		JScrollPane js4=new JScrollPane(t4);
		js4.setBounds(90,150,970,400);
		
		String h4[]= {"Serial no","Magazine Name","Publication","Laguage"};
		String c4[]= {"bid","bname","pub","lan"};
		String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' ;";
		DbOps d4=new DbOps();
		d4.fillJTable(dt4,c4,h4,q4);
		
		j4.add(js4);
		j4.add(bsk4);
		j4.add(tfk4);
		j4.add(rt19);
		j4.add(rt20);
		j4.add(rt21);
		j4.add(rt22);
		
		j5=new JPanel();
		j5.setLayout(null);
		j5.setBackground(Color.WHITE);
		j5.setBounds(180,50,1200,850);
		add(j5);
		l8=new JLabel("Hello  "+s+"!!");
		l8.setBounds(15,20,500,40);
		l8.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j5.add(l8);
		
		bsk5=new JButton("Search");
		bsk5.addActionListener(this);
		bsk5.setBounds(100,105,90,30);
		bsk5.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk5=new JTextField();
		tfk5.setBounds(200,110,180,25);
		tfk5.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt23=new JRadioButton("Serial no");
		rt23.setBounds(390,110,100,25);
		rt23.addActionListener(this);
		rt23.setFont(new Font("times new roman",Font.PLAIN,16));
		rt23.setBackground(Color.WHITE);
		rt24=new JRadioButton("Newspaper Name");
		rt24.setBounds(495,110,150,25);
		rt24.addActionListener(this);
		rt24.setFont(new Font("times new roman",Font.PLAIN,16));
		rt24.setBackground(Color.WHITE);
		rt25=new JRadioButton("Publication");
		rt25.setBounds(650,110,100,25);
		rt25.addActionListener(this);
		rt25.setFont(new Font("times new roman",Font.PLAIN,16));
		rt25.setBackground(Color.WHITE);
		rt26=new JRadioButton("language");
		rt26.setBounds(770,110,100,25);
		rt26.addActionListener(this);
		rt26.setFont(new Font("times new roman",Font.PLAIN,16));
		rt26.setBackground(Color.WHITE);
		rt27=new JRadioButton("Date");
		rt27.setBounds(880,110,100,25);
		rt27.addActionListener(this);
		rt27.setFont(new Font("times new roman",Font.PLAIN,16));
		rt27.setBackground(Color.WHITE);
		
		ButtonGroup b5=new ButtonGroup();
		b5.add(rt23);
		b5.add(rt24);
		b5.add(rt25);
		b5.add(rt26);
		b5.add(rt27);
		
		dt5=new DefaultTableModel();
		t5=new JTable(dt5);
		JScrollPane js5=new JScrollPane(t5);
		js5.setBounds(90,150,970,400);
		
		String h5[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
		String c5[]= {"bid","bname","pub","lan","date"};
		String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' ;";
		DbOps d5=new DbOps();
		d5.fillJTable(dt5,c5,h5,q5);
		
		j5.add(js5);
		j5.add(bsk5);
		j5.add(tfk5);
		j5.add(rt23);
		j5.add(rt24);
		j5.add(rt25);
		j5.add(rt26);
		j5.add(rt27);
		
		j6=new JPanel();
		j6.setLayout(null);
		j6.setBackground(Color.WHITE);
		j6.setBounds(180,50,1200,850);
		add(j6);
		l9=new JLabel("Hello  "+s+"!!");
		l9.setBounds(15,5,500,40);
		l9.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j6.add(l9);

		ImageIcon img=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\is_bk.png");
		bt1=new JButton(img);
		bt1.addActionListener(this);
		bt1.setBounds(50,45,90,90);
		bt1.setBorderPainted(false);
		j6.add(bt1);
	
		bs=new JButton("Search");
		bs.addActionListener(this);
		bs.setBounds(50,145,90,30);
		bs.setFont(new Font("times new roman",Font.PLAIN,16));
		tf1=new JTextField();
		tf1.setBounds(160,150,180,25);
		tf1.setFont(new Font("times new roman",Font.PLAIN,16));
		
		r1=new JRadioButton("Student Id");
		r1.setBounds(350,150,90,25);
		r1.addActionListener(this);
		r1.setFont(new Font("times new roman",Font.PLAIN,16));
		r1.setBackground(Color.WHITE);
		r2=new JRadioButton("Student Name");
		r2.setBounds(450,150,120,25);
		r2.addActionListener(this);
		r2.setFont(new Font("times new roman",Font.PLAIN,16));
		r2.setBackground(Color.WHITE);
		r3=new JRadioButton("Item Name");
		r3.setBounds(570,150,100,25);
		r3.addActionListener(this);
		r3.setFont(new Font("times new roman",Font.PLAIN,16));
		r3.setBackground(Color.WHITE);
		r4=new JRadioButton("Course");
		r4.setBounds(675,150,70,25);
		r4.addActionListener(this);
		r4.setFont(new Font("times new roman",Font.PLAIN,16));
		r4.setBackground(Color.WHITE);
		r5=new JRadioButton("Issued Date");
		r5.setBounds(750,150,100,25);
		r5.addActionListener(this);
		r5.setFont(new Font("times new roman",Font.PLAIN,16));
		r5.setBackground(Color.WHITE);
		r6=new JRadioButton("TimeLimit");
		r6.setBounds(855,150,100,25);
		r6.addActionListener(this);
		r6.setFont(new Font("times new roman",Font.PLAIN,16));
		r6.setBackground(Color.WHITE);		
		r7=new JRadioButton("Return Date");
		r7.setBounds(955,150,100,25);
		r7.addActionListener(this);
		r7.setFont(new Font("times new roman",Font.PLAIN,16));
		r7.setBackground(Color.WHITE);
		r8=new JRadioButton("Date");
		r8.setBounds(1160,150,100,25);
		r8.addActionListener(this);
		r8.setFont(new Font("times new roman",Font.PLAIN,16));
		r8.setBackground(Color.WHITE);
		r8.setVisible(false);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		bg.add(r6);
		bg.add(r7);
		bg.add(r8);
		
		
		bk1=new JButton("Issued");
		bk1.addActionListener(this);
		bk1.setBackground(new Color(51,255,51));
		bk1.setBounds(900,30,150,30);
		bk1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));
		bk1.setBorderPainted(false);
		
		dtm1=new DefaultTableModel();
		tb1=new JTable(dtm1);
		JScrollPane jsp1=new JScrollPane(tb1);
		jsp1.setBounds(50,190,995,400);
		
		String head[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
		String col[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
		String query="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid";
		DbOps db=new DbOps();
		db.fillJTable(dtm1, col, head, query);
		
		j6.add(jsp1);
		j6.add(bs);
		j6.add(tf1);
		j6.add(r1);
		j6.add(r2);
		j6.add(r3);
		j6.add(r4);
		j6.add(r5);
		j6.add(r6);
		j6.add(r7);
		j6.add(r8);
		j6.add(bk1);
		
		j7=new JPanel();
		j7.setLayout(null);
		j7.setBackground(Color.WHITE);
		j7.setBounds(180,50,1200,850);
		add(j7);
		l10=new JLabel("Hello  "+s+"!!");
		l10.setForeground(new Color(100,149,237));
		l10.setBounds(15,5,500,40);
		l10.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j7.add(l10);
		
		ImageIcon img2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\rt_bk.png");
		bt2=new JButton(img2);
		bt2.addActionListener(this);
		bt2.setBounds(50,45,85,96);
		bt2.setBorderPainted(false);
		j7.add(bt2);
		
		bk2=new JButton("Return");
		bk2.addActionListener(this);
		bk2.setBackground(new Color(51,255,51));
		bk2.setBounds(900,30,150,30);
		bk2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));
		bk2.setBorderPainted(false);
		
		bs1=new JButton("Search");
		bs1.addActionListener(this);
		bs1.setBounds(50,145,90,30);
		bs1.setFont(new Font("times new roman",Font.PLAIN,16));
		tf2=new JTextField();
		tf2.setBounds(160,150,180,25);
		tf2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		r9=new JRadioButton("Student Id");
		r9.setBounds(350,150,90,25);
		r9.addActionListener(this);
		r9.setFont(new Font("times new roman",Font.PLAIN,16));
		r9.setBackground(Color.WHITE);
		r10=new JRadioButton("Student Name");
		r10.setBounds(450,150,120,25);
		r10.addActionListener(this);
		r10.setFont(new Font("times new roman",Font.PLAIN,16));
		r10.setBackground(Color.WHITE);
		r11=new JRadioButton("Item Name");
		r11.setBounds(570,150,100,25);
		r11.addActionListener(this);
		r11.setFont(new Font("times new roman",Font.PLAIN,16));
		r11.setBackground(Color.WHITE);
		r12=new JRadioButton("Course");
		r12.setBounds(675,150,70,25);
		r12.addActionListener(this);
		r12.setFont(new Font("times new roman",Font.PLAIN,16));
		r12.setBackground(Color.WHITE);
		r13=new JRadioButton("Issued Date");
		r13.setBounds(750,150,100,25);
		r13.addActionListener(this);
		r13.setFont(new Font("times new roman",Font.PLAIN,16));
		r13.setBackground(Color.WHITE);
		r14=new JRadioButton("TimeLimit");
		r14.setBounds(855,150,100,25);
		r14.addActionListener(this);
		r14.setFont(new Font("times new roman",Font.PLAIN,16));
		r14.setBackground(Color.WHITE);		
		r15=new JRadioButton("Return Date");
		r15.setBounds(955,150,100,25);
		r15.addActionListener(this);
		r15.setFont(new Font("times new roman",Font.PLAIN,16));
		r15.setBackground(Color.WHITE);
		
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(r9);
		bg1.add(r10);
		bg1.add(r11);
		bg1.add(r12);
		bg1.add(r13);
		bg1.add(r14);
		bg1.add(r15);
		
		dtm2=new DefaultTableModel();
		tb1=new JTable(dtm2);
		JScrollPane jsp2=new JScrollPane(tb1);
		jsp2.setBounds(50,190,995,400);
		
		String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
		String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
		String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid";
		DbOps db2=new DbOps();
		db2.fillJTable(dtm2, col2, head2, query2);
		
		j7.add(jsp2);
		j7.add(bs1);
		j7.add(tf2);
		j7.add(r9);
		j7.add(r10);
		j7.add(r11);
		j7.add(r12);
		j7.add(r13);
		j7.add(r14);
		j7.add(r15);
		j7.add(bk2);
		
		j8=new JPanel();
		j8.setLayout(null);
		j8.setBackground(Color.WHITE);
		j8.setBounds(180,50,1200,850);
		add(j8);
		l11=new JLabel("Hello  "+s+"!!");
		l11.setBounds(15,20,500,40);
		l11.setForeground(new Color(32,178,170));
		l11.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j8.add(l11);
		lck=new JLabel("Student ID:");	
		lck.setBounds(70,95,100,20);
		lck.setFont(new Font("times new roman",Font.PLAIN,20));	
		tfc=new JTextField();		
		tfc.setBounds(165,95,120,25); 
		tfc.setFont(new Font("times new roman",Font.PLAIN,20));
		bkc=new JButton("search");
		bkc.setBorderPainted(false);
		bkc.setBackground(new Color(100,149,237));
		bkc.addActionListener(this);
		bkc.setBounds(300,90,90,30);
		bkc.setFont(new Font("times new roman",Font.PLAIN,20));
		
		dt6=new DefaultTableModel();
		tb3=new JTable(dt6);
		JScrollPane js6=new JScrollPane(tb3);
		js6.setBounds(50,140,520,250);
		
		String h6[]= {"stid","Item Id","Item Name","Overdue","Fine","paid amount","Date","Pay Status"};	
		String c6[]= {"stid","books.bid","bname","delay","fine","paid","challan.date","remarks"};
		String q6="select stid,books.bid,bname,delay,fine,paid,challan.date,remarks from challan inner join books on books.bid=challan.bid ;";
		DbOps d6=new DbOps();
		d6.fillJTable(dt6, c6, h6, q6);
		
		
		lck1=new JLabel("Total:");
		lck1.setBounds(290,410,50,20);
		lck1.setFont(new Font("times new roman",Font.PLAIN,20)); 
		tfc1=new JTextField();
		tfc1.setBounds(340,410,90,20);
		tfc1.setFont(new Font("times new roman",Font.PLAIN,20));
		bkc1=new JButton("PAY");
		bkc1.addActionListener(this);
		bkc1.setBorderPainted(false);
		bkc1.setBackground(new Color(100,149,237));
		bkc1.setBounds(445,405,90,30);
		bkc1.setFont(new Font("times new roman",Font.PLAIN,20));

		lck2=new JLabel("Penalty  Criteria:");	
		lck2.setBounds(625,120,230,30);
		lck2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,25));
		
		lck3=new JLabel("->Till 15 days:Rs 10 per day");
		lck3.setBounds(625,175,250,20);
		lck3.setFont(new Font("times new roman",Font.PLAIN,20));
		lck3.setBackground(new Color(169,169,169));
	    lck3.setOpaque(true);			//opaque used to covered background making it non-transparent
		lck4=new JLabel("->After 15 days:Rs 15 per day");
		lck4.setBounds(625,220,250,20);
		lck4.setFont(new Font("times new roman",Font.PLAIN,20));
		lck4.setBackground(new Color(169,169,169));
	    lck4.setOpaque(true);
		lck5=new JLabel("->After 1 month:Rs 20 per day");
		lck5.setBounds(625,265,250,20);
		lck5.setFont(new Font("times new roman",Font.PLAIN,20));
		lck5.setBackground(new Color(169,169,169));
	    lck5.setOpaque(true);
	    lck6=new JLabel("->Lost book fee:replacement cost + processing cost");
		lck6.setBounds(625,310,430,20);
		lck6.setFont(new Font("times new roman",Font.PLAIN,20));
		lck6.setBackground(new Color(169,169,169));
	    lck6.setOpaque(true);
	    lck7=new JLabel("->Damaged book fee:replacement/repair cost + processing cost");
		lck7.setBounds(625,355,520,20);
		lck7.setFont(new Font("times new roman",Font.PLAIN,20));
		lck7.setBackground(new Color(169,169,169));
	    lck7.setOpaque(true);
		
		
		j8.add(js6);
		j8.add(lck);
		j8.add(tfc);
		j8.add(bkc);
		j8.add(lck1);
		j8.add(tfc1);
		j8.add(bkc1);
		j8.add(lck2);
		j8.add(lck3);
		j8.add(lck4);
		j8.add(lck5);
		j8.add(lck6);
		j8.add(lck7);

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
			b1.setBackground(new Color(0,191,255));
			b9.setBackground(new Color(30,144,255));
			b2.setBackground(new Color(30,144,255));
			b3.setBackground(new Color(30,144,255));
			b4.setBackground(new Color(30,144,255));
			b5.setBackground(new Color(30,144,255));
			b6.setBackground(new Color(30,144,255));
			b7.setBackground(new Color(30,144,255));
			b8.setBackground(new Color(30,144,255));
			
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
			b2.setBackground(new Color(0,191,255));
			b1.setBackground(new Color(30,144,255));
			b9.setBackground(new Color(30,144,255));
			b3.setBackground(new Color(30,144,255));
			b4.setBackground(new Color(30,144,255));
			b5.setBackground(new Color(30,144,255));
			b6.setBackground(new Color(30,144,255));
			b7.setBackground(new Color(30,144,255));
			b8.setBackground(new Color(30,144,255));
			
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
			b3.setBackground(new Color(0,191,255));
			b1.setBackground(new Color(30,144,255));
			b2.setBackground(new Color(30,144,255));
			b9.setBackground(new Color(30,144,255));
			b4.setBackground(new Color(30,144,255));
			b5.setBackground(new Color(30,144,255));
			b6.setBackground(new Color(30,144,255));
			b7.setBackground(new Color(30,144,255));
			b8.setBackground(new Color(30,144,255));
			
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
			b4.setBackground(new Color(0,191,255));
			b1.setBackground(new Color(30,144,255));
			b2.setBackground(new Color(30,144,255));
			b3.setBackground(new Color(30,144,255));
			b9.setBackground(new Color(30,144,255));
			b5.setBackground(new Color(30,144,255));
			b6.setBackground(new Color(30,144,255));
			b7.setBackground(new Color(30,144,255));
			b8.setBackground(new Color(30,144,255));
			
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
			b5.setBackground(new Color(0,191,255));
			b1.setBackground(new Color(30,144,255));
			b2.setBackground(new Color(30,144,255));
			b3.setBackground(new Color(30,144,255));
			b4.setBackground(new Color(30,144,255));
			b9.setBackground(new Color(30,144,255));
			b6.setBackground(new Color(30,144,255));
			b7.setBackground(new Color(30,144,255));
			b8.setBackground(new Color(30,144,255));
			
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
			b6.setBackground(new Color(0,191,255));
			b1.setBackground(new Color(30,144,255));
			b2.setBackground(new Color(30,144,255));
			b3.setBackground(new Color(30,144,255));
			b4.setBackground(new Color(30,144,255));
			b5.setBackground(new Color(30,144,255));
			b9.setBackground(new Color(30,144,255));
			b7.setBackground(new Color(30,144,255));
			b8.setBackground(new Color(30,144,255));
			
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
			b7.setBackground(new Color(0,191,255));
			b1.setBackground(new Color(30,144,255));
			b2.setBackground(new Color(30,144,255));
			b3.setBackground(new Color(30,144,255));
			b4.setBackground(new Color(30,144,255));
			b5.setBackground(new Color(30,144,255));
			b6.setBackground(new Color(30,144,255));
			b9.setBackground(new Color(30,144,255));
			b8.setBackground(new Color(30,144,255));
			
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
			b8.setBackground(new Color(0,191,255));
			b1.setBackground(new Color(30,144,255));
			b2.setBackground(new Color(30,144,255));
			b3.setBackground(new Color(30,144,255));
			b4.setBackground(new Color(30,144,255));
			b5.setBackground(new Color(30,144,255));
			b6.setBackground(new Color(30,144,255));
			b7.setBackground(new Color(30,144,255));
			b9.setBackground(new Color(30,144,255));
			
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
			b9.setBackground(new Color(0,191,255));
			b1.setBackground(new Color(30,144,255));
			b2.setBackground(new Color(30,144,255));
			b3.setBackground(new Color(30,144,255));
			b4.setBackground(new Color(30,144,255));
			b5.setBackground(new Color(30,144,255));
			b6.setBackground(new Color(30,144,255));
			b7.setBackground(new Color(30,144,255));
			b8.setBackground(new Color(30,144,255));
			
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
		if(ae.getSource()==bs)
		{
			if(r1.isSelected()==true)
			{	
				String head[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
				String col[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
				String query="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where issued.stid like '%"+tf1.getText()+"%';";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);
			}
			if(r2.isSelected()==true)
			{	
				String head[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
				String col[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
				String query="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where stname like '%"+tf1.getText()+"%';";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);		
			}
			if(r3.isSelected()==true)
			{	
				String head[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
				String col[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
				String query="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where bname like '%"+tf1.getText()+"%';";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);		
			}
			if(r4.isSelected()==true)
			{	
				String head[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
				String col[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
				String query="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where course like '%"+tf1.getText()+"%';";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);		
	
			}
			if(r5.isSelected()==true)
			{	
				String head[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
				String col[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
				String query="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where isdate like '%"+tf1.getText()+"%';";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);			
	
			}
			if(r6.isSelected()==true)
			{	
				String head[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
				String col[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
				String query="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid  where exp_retdate like '%"+tf1.getText()+"%';";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);			
			}
			
			if(r1.isSelected()==true && r1.getText().equals("Book ID"))
			{	
				String head[]= {"Book Id","Item Name","Publisher","Author","Language","Type"};
				String col[]= {"books.bid","bname","pub","author","lan","type"};
				String query=" select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where issued.isdate is NULL and books.bid like '%"+tf1.getText()+"%' order by author desc ;";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);	
			}
			if(r2.isSelected()==true && r2.getText().equals("Item Name"))
			{	
				String head[]= {"Book Id","Item Name","Publisher","Author","Language","Type"};
				String col[]= {"books.bid","bname","pub","author","lan","type"};
				String query="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where issued.isdate is NULL and bname like '%"+tf1.getText()+"%' order by author desc;";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);			
			}
			if(r3.isSelected()==true && r3.getText().equals("Publisher"))
			{	
				String head[]= {"Book Id","Item Name","Publisher","Author","Language","Type"};
				String col[]= {"books.bid","bname","pub","author","lan","type"};
				String query="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where issued.isdate is NULL and pub like '%"+tf1.getText()+"%' order by author desc ;";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);		
			}
			if(r4.isSelected()==true && r4.getText().equals("Author"))
			{	
				String head[]= {"Book Id","Item Name","Publisher","Author","Language","Type"};
				String col[]= {"books.bid","bname","pub","author","lan","type"};
				String query="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where issued.isdate is NULL and author like '%"+tf1.getText()+"%' order by author desc ;";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);		
	
			}
			if(r5.isSelected()==true && r5.getText().equals("Language"))
			{	
				String head[]= {"Book Id","Item Name","Publisher","Author","Language","Type"};
				String col[]= {"books.bid","bname","pub","author","lan","type"};
				String query="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where issued.isdate is NULL and lan like '%"+tf1.getText()+"%' order by author desc ;";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);
	
			}
			if(r6.isSelected()==true && r6.getText().equals("Type"))
			{	
				String head[]= {"Book Id","Item Name","Publisher","Author","Language","Type"};
				String col[]= {"books.bid","bname","pub","author","lan","type"};
				String query="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where issued.isdate is NULL and type like '%"+tf1.getText()+"%' order by author desc ;";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);
				db.fillJTable(dtm1, col, head, query);			
			}
	
		}
		if(ae.getSource()==bsk1)
		{
			if(rt1.isSelected()==true)
			{	
				String q1="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where bid like '%"+tfk1.getText()+"%'";
				String h1[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String c1[]= {"bid","bname","pub","author","lan","sub"};
				DbOps d1=new DbOps();
				d1.fillJTable(dt1,c1,h1,q1);		
			}
			if(rt2.isSelected()==true)
			{	
				String q1="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where bname like '%"+tfk1.getText()+"%'";
				String h1[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String c1[]= {"bid","bname","pub","author","lan","sub"};
				DbOps d1=new DbOps();
				d1.fillJTable(dt1,c1,h1,q1);		
			}
			if(rt3.isSelected()==true)
			{	
				String q1="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where pub like '%"+tfk1.getText()+"%'";
				String h1[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String c1[]= {"bid","bname","pub","author","lan","sub"};
				DbOps d1=new DbOps();
				d1.fillJTable(dt1,c1,h1,q1);		
			}
			if(rt4.isSelected()==true)
			{	
				String q1="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where author like '%"+tfk1.getText()+"%'";
				String h1[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String c1[]= {"bid","bname","pub","author","lan","sub"};
				DbOps d1=new DbOps();
				d1.fillJTable(dt1,c1,h1,q1);		
			}
			if(rt5.isSelected()==true)
			{	
				String q1="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where lan like '%"+tfk1.getText()+"%'";
				String h1[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String c1[]= {"bid","bname","pub","author","lan","sub"};
				DbOps d1=new DbOps();
				d1.fillJTable(dt1,c1,h1,q1);		
			}
			if(rt6.isSelected()==true)
			{	
				String q1="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where sub like '%"+tfk1.getText()+"%'";
				String h1[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
				String c1[]= {"bid","bname","pub","author","lan","sub"};
 				DbOps d1=new DbOps();
				d1.fillJTable(dt1,c1,h1,q1);		
			}
		}
		if(ae.getSource()==bsk2)
		{
			if(rt7.isSelected()==true)
			{	
				String h2[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String c2[]= {"stid","stname","course","mob","city","address"};
				String q2="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where stid like '%"+tfk2.getText()+"%'";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);		
			}
			if(rt8.isSelected()==true)
			{	
				String h2[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String c2[]= {"stid","stname","course","mob","city","address"};
				String q2="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where stname like '%"+tfk2.getText()+"%'";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);		
			}
			if(rt9.isSelected()==true)
			{	
				String h2[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String c2[]= {"stid","stname","course","mob","city","address"};
				String q2="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where course like '%"+tfk2.getText()+"%'";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);
			}
			if(rt10.isSelected()==true)
			{	
				String h2[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String c2[]= {"stid","stname","course","mob","city","address"};
				String q2="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where mob like '%"+tfk2.getText()+"%'";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);	
			}
			if(rt11.isSelected()==true)
			{	
				String h2[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String c2[]= {"stid","stname","course","mob","city","address"};
				String q2="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where city like '%"+tfk2.getText()+"%'";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);	
			}
			if(rt12.isSelected()==true)
			{	
				String h2[]= {"Student ID","Student Name","Course","Phone no","City","Address"};
				String c2[]= {"stid","stname","course","mob","city","address"};
				String q2="select stid,stname,course,mob,city,address from student inner join Course on course.cid=student.cid where address like '%"+tfk2.getText()+"%'";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);	
			}
		}
		if(ae.getSource()==bsk3)
		{
			if(rt13.isSelected()==true)
			{	
				String head2[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String col2[]= {"eid","ename","job","mob","city","address"};
				String q2="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where eid like '%"+tfk3.getText()+"%'";
				DbOps d3=new DbOps();
				d3.fillJTable(dtm2,col2,head2,q2);		
			}
			if(rt14.isSelected()==true)
			{	
				String h3[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String c3[]= {"eid","ename","job","mob","city","address"};
				String q3="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where ename like '%"+tfk3.getText()+"%'";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);
			}
			if(rt15.isSelected()==true)
			{	
				String h3[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String c3[]= {"eid","ename","job","mob","city","address"};
				String q3="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where job like '%"+tfk3.getText()+"%'";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);
			}
			if(rt16.isSelected()==true)
			{	
				String h3[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String c3[]= {"eid","ename","job","mob","city","address"};
				String q3="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where mob like '%"+tfk3.getText()+"%'";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);		
			}
			if(rt17.isSelected()==true)
			{	
				String h3[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String c3[]= {"eid","ename","job","mob","city","address"};
				String q3="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where city like '%"+tfk3.getText()+"%'";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);
			}
			if(rt18.isSelected()==true)
			{	
				String h3[]= {"Employee ID","Employee Name","Designation","Phone no","City","Address"};
				String c3[]= {"eid","ename","job","mob","city","address"};
				String q3="select eid,ename,job,mob,city,address from employee inner join job on job.jid=employee.jid where address like '%"+tfk3.getText()+"%'";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);		
			}
		}
		if(ae.getSource()==bsk4)
		{
			if(rt19.isSelected()==true)
			{	
				String h4[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String c4[]= {"bid","bname","pub","lan"};
				String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and bid like '%"+tfk4.getText()+"%';";
				DbOps d4=new DbOps();
				d4.fillJTable(dt4,c4,h4,q4);
			}
			if(rt20.isSelected()==true)
			{	
				String h4[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String c4[]= {"bid","bname","pub","lan"};
				String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and bname like '%"+tfk4.getText()+"%';";
				DbOps d4=new DbOps();
				d4.fillJTable(dt4,c4,h4,q4);
			}
			if(rt21.isSelected()==true)
			{	
				String h4[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String c4[]= {"bid","bname","pub","lan"};
				String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and pub like '%"+tfk4.getText()+"%';";
				DbOps d4=new DbOps();
				d4.fillJTable(dt4,c4,h4,q4);
			}
			if(rt22.isSelected()==true)
			{	
				String h4[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String c4[]= {"bid","bname","pub","lan"};
				String q4="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and lan like '%"+tfk4.getText()+"%';";
				DbOps d4=new DbOps();
				d4.fillJTable(dt4,c4,h4,q4);
			}
		}
		if(ae.getSource()==bsk5)
		{
			if(rt23.isSelected()==true)
			{	
				String h5[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
				String c5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and bid like '%"+tfk5.getText()+"%';";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5,c5,h5,q5);
			}
			if(rt24.isSelected()==true)
			{	
				String h5[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
				String c5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and bname like '%"+tfk5.getText()+"%';";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5,c5,h5,q5);
			}
			if(rt25.isSelected()==true)
			{	
				String h5[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
				String c5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and pub like '%"+tfk5.getText()+"%';";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5,c5,h5,q5);
			}
			if(rt26.isSelected()==true)
			{	
				String h5[]= {"Date","Newspaper Name","Publication","Laguage","Date"};
				String c5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and lan like '%"+tfk5.getText()+"%';";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5,c5,h5,q5);	
			}
			if(rt27.isSelected()==true)
			{	
				String h5[]= {"Date","Newspaper Name","Publication","Laguage","Date"};
				String c5[]= {"bid","bname","pub","lan","date"};
				String q5="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and date like '%"+tfk5.getText()+"%';";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5,c5,h5,q5);	
			}
		}

		if(ae.getSource()==bs1)
		{
			if(r9.isSelected()==true)
			{	
				String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
				String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid like '%"+tf2.getText()+"%';";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2, col2, head2, query2);	
			}
			if(r10.isSelected()==true)
			{	
				String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
				String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname like '%"+tf2.getText()+"%';";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2, col2, head2, query2);	
			}
			if(r11.isSelected()==true)
			{	
				String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
				String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where bname like '%"+tf2.getText()+"%';";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2, col2, head2, query2);	
	
			}
			if(r12.isSelected()==true)
			{	
				String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
				String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where course like '%"+tf2.getText()+"%';";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2, col2, head2, query2);		
	
			}
			if(r13.isSelected()==true)
			{	
				String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
				String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where isdate like '%"+tf2.getText()+"%';";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2, col2, head2, query2);			
	
			}
			if(r14.isSelected()==true)
			{	
				String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
				String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where exp_retdate like '%"+tf2.getText()+"%';";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2, col2, head2, query2);				
			}
			if(r15.isSelected()==true)
			{	
				String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
				String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate like '%"+tf2.getText()+"%';";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2, col2, head2, query2);	
			
			}
			
		}
		if(ae.getSource()==bkc)
		{
			String h6[]= {"stid","Item Id","Item Name","Overdue","Fine","paid amount","Date","Pay Status"};	
			String c6[]= {"stid","books.bid","bname","delay","fine","paid","challan.date","remarks"};
			String q6="select stid,books.bid,bname,delay,fine,paid,challan.date,remarks from challan inner join books on books.bid=challan.bid where stid="+tfc.getText();
			
			DbOps d6=new DbOps();
			d6.fillJTable(dt6, c6, h6, q6);
			String ql="select sum(fine)-sum(paid) as tot from challan where stid="+tfc.getText()+" group by stid;";
			String cl[]= {"tot"};
			DbOps dbq=new DbOps();
			String st[]=dbq.getValuesFromDB(ql,cl);
			tamt=st[0];
			
			tfc1.setText(tamt);
			
		}
		if(ae.getSource()==bkc1)
			new pay(tfc.getText(),tamt);
		
		if(ae.getSource()==bk1)
		{
			c1++;
			if(c1%2!=0)
			{
				bk1.setText("Issued");
				bk1.setBackground(new Color(51,255,51));
				
				String head[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit"};
				String col[]= {"issued.stid","stname","bname","course","isdate","exp_retdate"};
				String query="select issued.stid,stname,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);
				r1.setText("Student Id");
				r1.setBounds(350,150,90,25);
				r2.setText("Student Name");
				r2.setBounds(450,150,120,25);
				r3.setText("Item Name");
				r3.setBounds(570,150,100,25);
				r4.setText("Course");
				r4.setBounds(675,150,70,25);
				r5.setText("Issued Date");
				r5.setBounds(750,150,100,25);
				r6.setText("TimeLimit");
				r6.setBounds(855,150,100,25);		
				r7.setText("Return Date");
				r7.setBounds(955,150,100,25);
				r7.setVisible(true);
			
			}
			else 
			{
				bk1.setText("Not Issued");
			    bk1.setBackground(new Color(255,0,0));
				
			    String head[]= {"Book Id","Item Name","Publisher","Author","Language","Type"};
				String col[]= {"books.bid","bname","pub","author","lan","type"};
				String query="select books.bid,bname,language.lan,pub,author,type from books left join issued on books.bid=issued.bid left join subject on subject.sid=books.sid left join language on language.lid=books.lid  where issued.isdate is NULL order by author desc;";
				DbOps db=new DbOps();
				db.fillJTable(dtm1, col, head, query);	
				r1.setText("Book ID");
				r2.setText("Item Name");
				r2.setBounds(460,150,120,25);
				r3.setText("Publisher");
				r3.setBounds(580,150,100,25);
				r4.setText("Author");
				r4.setBounds(690,150,80,25);
				r5.setText("Language");
				r5.setBounds(780,150,100,25);
				r6.setText("Type");
				r6.setBounds(890,150,60,25);
				r7.setVisible(false);
			}
		}
	
		if(ae.getSource()==bk2)
		{
			c++;
			if(c%2!=0)
			{
				bk2.setText("Return");
				bk2.setBackground(new Color(51,255,51));
				String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
				String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is not null;";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2, col2, head2, query2);
			}
			else 
			{
				bk2.setText("Not Return");
			    bk2.setBackground(new Color(255,0,0));
				
				String head2[]= {"Student Id","Student Name","Book Name","Course","Issued Date","TimeLimit","Return Date"};
				String col2[]= {"issued.stid","stname","bname","course","isdate","exp_retdate","retdate"};
				String query2="select issued.stid,stname,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null;";
				DbOps db2=new DbOps();
				db2.fillJTable(dtm2, col2, head2, query2);	
			}
		}
		int f=0;
		if(ae.getSource()==bt1)
		{
			new issued(f,"","","");
		}
		if(ae.getSource()==bt2)
		{
			new Return(f,"","");
		}
	}
	/*
	public static void main(String [] ar)
	{
		new librarian_dashboard();
	}*/
}

