package com.pack;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.awt.Color;
public class student_dashboard extends JFrame implements ActionListener
{
	JPanel jp1,jp2,jp3,jk1,jk2,jk3,jk4,j1,j2,j3,j4,j5,j6,p1,p2,p3,p4,pk1,pk2,pk3,pk4;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,lc,lc1,lc2,lc3,lc4,lc5,lc6,lc7,le1,le2,le3,le4,lek1,lek2,lek3,lek4,lb1,lb2,lb3,lb4,lbk1,lbk2,lbk3,lbk4,lbkk1,lbkk2,lbkk3,lbkk4;
	JTextField tf1,tf2,tfk1,tfk2,tfk3,tfk4,tfk5,tfc,tfc1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,bt1,bt2,bsk1,bsk2,bsk3,bsk4,bsk5,bkc1,bkc2;
	JScrollPane jsp1,jsp2,js1,js2,js3,js4,js5,js6;
	JTable tb1,tb2,t1,t2,t3,t4,t5,t6,t7;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,rt1,rt2,rt3,rt4,rt5,rt6,rt7,rt8,rt9,rt10,rt11,rt12,rt13,rt14,rt15,rt16,rt17,rt18,rt19,rt20,rt21,rt22,rt23,rt24,rt25,rt26,rt30;
	DefaultTableModel dtm1,dtm2,dt1,dt2,dt3,dt4,dt5,dt6;
	String st="",sid,tamt,pamt;
	JScrollBar jsb;
	student_dashboard(String s,String id,int f)
	{
		st=s;
		sid=id;
		jp1=new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp1.setBackground(new Color(100,149,237));
		jp1.setBounds(0,0,1500,50);
		String tt="";
		if(f==0)
		tt="STUDENT  DASHBOARD";
		else
			tt="FACULTY  DASHBOARD";	
		l1=new JLabel(tt);
		l1.setBounds(80,0,350,50);
		l1.setFont(new Font("Times new roman",Font.BOLD,30));
		jp1.add(l1);

		jp2=new JPanel();
		jp2.setLayout(null);
		jp2.setBackground(Color.WHITE);
		jp2.setBounds(180,50,1200,850);
		p1=new JPanel(); 
		p1.setLayout(null);
		p1.setBackground(new Color(0,191,255));
		p1.setBounds(20,85,260,170);
		ImageIcon ig1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\cpb.png");
		le1=new JLabel(ig1);
		le1.setBounds(110,15,100,100);
		p1.add(le1);
		String qb1="select count(bname) as count from books where type='books';";
		DbOps dk1=new DbOps();
		String cb1=dk1.getCount(qb1);
		lc1=new JLabel(cb1);
		lc1.setBounds(20,70,60,60);
		lc1.setForeground(Color.WHITE);
		lc1.setFont(new Font("Calibri body",Font.PLAIN,60));
		p1.add(lc1);
		lb1=new JLabel("BOOKS");
		lb1.setBounds(20,130,200,20);
		lb1.setForeground(Color.WHITE);
		lb1.setFont(new Font("Calibri body",Font.PLAIN,20));
		p1.add(lb1);
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,204,0));
		p2.setBounds(305,85,260,170);
		ImageIcon ig2;
		if(f==0)
		ig2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\st1.png");
		else
			ig2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\pp.png");
		
		le2=new JLabel(ig2);
		le2.setBounds(125,10,120,120);
		p2.add(le2);
		lc2=new JLabel("You");
		lc2.setBounds(15,70,120,60);
		lc2.setForeground(Color.WHITE);
		lc2.setFont(new Font("Calibri body",Font.PLAIN,50));
		p2.add(lc2);
		lb2=new JLabel("RECORDS");
		lb2.setBounds(20,125,200,30);
		lb2.setForeground(Color.WHITE);
		lb2.setFont(new Font("Calibri body",Font.PLAIN,20));
		p2.add(lb2);
		p3=new JPanel();
		p3.setLayout(null);
		p3.setBackground(new Color(255,165,0));
		p3.setBounds(590,85,260,170);
		ImageIcon ig3=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\cpn.png");
		le3=new JLabel(ig3);
		le3.setBounds(110,15,100,100);
		p3.add(le3);
		String qb3="select count(bname) as count from books where type='newspaper';";
		DbOps dk3=new DbOps();
		String cb3=dk3.getCount(qb3);
		lc3=new JLabel(cb3);
		lc3.setBounds(20,70,60,60);
		lc3.setForeground(Color.WHITE);
		lc3.setFont(new Font("Calibri body",Font.PLAIN,60));
		p3.add(lc3);
		lb3=new JLabel("NEWSPAPERS");
		lb3.setBounds(20,130,200,20);
		lb3.setForeground(Color.WHITE);
		lb3.setFont(new Font("Calibri body",Font.PLAIN,20));
		p3.add(lb3);
		p4=new  JPanel();
		p4.setLayout(null);
		p4.setBackground(new Color(255,51,51));
		p4.setBounds(875,85,260,170);
		ImageIcon ig4=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\cpm.png");
		le4=new JLabel(ig4);
		le4.setBounds(110,15,100,100);
		p4.add(le4);
		String qb4="select count(bname) as count from books where type='Magazine';";
		DbOps dk4=new DbOps();
		String cb4=dk4.getCount(qb4);
		lc4=new JLabel(cb4);
		lc4.setBounds(20,70,60,60);
		lc4.setForeground(Color.WHITE);
		lc4.setFont(new Font("Calibri body",Font.PLAIN,60));
		p4.add(lc4);
		lb4=new JLabel("MAGAZINES");
		lb4.setBounds(20,130,200,20);
		lb4.setForeground(Color.WHITE);
		lb4.setFont(new Font("Calibri body",Font.PLAIN,20));
		p4.add(lb4);
		pk1=new JPanel();
		pk1.setLayout(null);
		pk1.setBackground(new Color(255,245,230));
		pk1.setBounds(20,295,260,60);
		ImageIcon i1=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\isb.png");
		lek1=new JLabel(i1);
		lek1.setBounds(0,0,60,60);
		lbk1=new JLabel("ISSUED");
		lbk1.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,15));
		lbk1.setBounds(65,5,60,20);
		pk1.add(lbk1);
		String qk1="select count(stid) as count from issued where stid="+id+" and isdate is not null;";
		DbOps db1=new DbOps();
		String ck1=db1.getCount(qk1);
		lbkk1=new JLabel(ck1);
		lbkk1.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,20));
		lbkk1.setBounds(65,30,60,20);
		pk1.add(lbkk1);
		pk1.add(lek1);
		
		pk2=new JPanel();
		pk2.setLayout(null);
		pk2.setBackground(new Color(255,245,230));
		pk2.setBounds(305,295,260,60);
		ImageIcon i2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\thup.png");
		lek2=new JLabel(i2);
		lek2.setBounds(0,0,60,60);
		pk2.add(lek2);
		lbk2=new JLabel("RETURNED");
		lbk2.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,15));
		lbk2.setBounds(65,5,90,20);
		pk2.add(lbk2);
		String qk2="select count(stid) as count from issued where stid="+id+" and retdate is not null;";
		DbOps db2=new DbOps();
		String ck2=db2.getCount(qk2);
		lbkk2=new JLabel(ck2);
		lbkk2.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,20));
		lbkk2.setBounds(65,30,90,20);
		pk2.add(lbkk2);
		
		pk3=new JPanel();
		pk3.setLayout(null);
		pk3.setBackground(new Color(255,245,230));
		pk3.setBounds(590,295,260,60);
		ImageIcon i3=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\thdn.png");
		lek3=new JLabel(i3);
		lek3.setBounds(0,0,60,60);
		pk3.add(lek3);
		lbk3=new JLabel("NOT  RETURNED");
		lbk3.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,15));
		lbk3.setBounds(65,5,130,20);
		pk3.add(lbk3);
		String qk3="select count(stid) as count from issued where stid="+id+" and retdate is null;";
		DbOps db3=new DbOps();
		String ck3=db3.getCount(qk3);
		lbkk3=new JLabel(ck3);
		lbkk3.setFont(new Font("Calibri Light (Headings)",Font.PLAIN,20));
		lbkk3.setBounds(65,30,120,20);
		pk3.add(lbkk3);
		pk4=new JPanel();
		pk4.setLayout(null);
		pk4.setBackground(new Color(255,245,230));
		pk4.setBounds(875,295,260,60);
		ImageIcon i4=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\clb.png");
		lek4=new JLabel(i4);
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
		jp2.add(pk1);
		jp2.add(pk2);
		jp2.add(pk3);
		jp2.add(pk4);
	
		l2=new JLabel("Hello "+s+"!!");
		l2.setBounds(15,20,400,40);
		l2.setForeground(new Color(0,0,204));
		l2.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		jp2.add(l2);
		
		jp3=new JPanel();
		jp3.setBounds(0,50,180,850);
		jp3.setBackground(new Color(0,102,204));
		jp3.setLayout(null);
		
		//0,0,153
		b1=new JButton("Dashboard");
		b1.setBounds(2,5,175,40);
		b1.addActionListener(this);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		b1.setBackground(new Color(0,0,153));
		b1.setForeground(Color.WHITE);
		b2=new JButton("Books");
		b2.setBounds(2,50,175,40);  
		b2.addActionListener(this);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		b2.setBackground(new Color(0,0,153));
		b2.setForeground(Color.WHITE);
		b3=new JButton("Magazines");
		b3.setBounds(2,95,175,40);
		b3.addActionListener(this);
		b3.setFont(new Font("times new roman",Font.PLAIN,16));
		b3.setBackground(new Color(0,0,153));
		b3.setForeground(Color.WHITE);
		b4=new JButton("Newspaper");
		b4.setBounds(2,140,175,40);
		b4.addActionListener(this);
		b4.setFont(new Font("times new roman",Font.PLAIN,16));
		b4.setBackground(new Color(0,0,153));
		b4.setForeground(Color.WHITE);
		b5=new JButton("Issued");
		b5.setBounds(2,185,175,40);
		b5.addActionListener(this);
		b5.setFont(new Font("times new roman",Font.PLAIN,16));
		b5.setBackground(new Color(0,0,153));
		b5.setForeground(Color.WHITE);
		b6=new JButton("Return");
		b6.setBounds(2,230,175,40);
		b6.addActionListener(this);
		b6.setFont(new Font("times new roman",Font.PLAIN,16));
		b6.setBackground(new Color(0,0,153));
		b6.setForeground(Color.WHITE);
		b7=new JButton("penalty");
		b7.setBounds(2,275,175,40);
		b7.addActionListener(this);
		b7.setFont(new Font("times new roman",Font.PLAIN,16));
		b7.setBackground(new Color(0,0,153));
		b7.setForeground(Color.WHITE);
		b8=new JButton("LOGOUT");
		b8.setBounds(2,320,175,40);
		b8.addActionListener(this);
		b8.setFont(new Font("times new roman",Font.PLAIN,16));
		b8.setBackground(new Color(0,0,153));
		b8.setForeground(Color.WHITE);
		
		jp3.add(b1);
		jp3.add(b2);
		jp3.add(b3);
		jp3.add(b4);
		jp3.add(b5);
		jp3.add(b6);
		jp3.add(b7);
		jp3.add(b8);
		
		j1=new JPanel();
		j1.setLayout(null);
		j1.setBackground(Color.WHITE);
		j1.setBounds(180,50,1200,850);
		add(j1);
		l3=new JLabel("Hello "+s+"!!");
		l3.setBounds(15,20,400,40);
		l3.setForeground(new Color(0,0,204));
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
		
		ButtonGroup b1=new ButtonGroup();
		b1.add(rt1);
		b1.add(rt2);
		b1.add(rt3);
		b1.add(rt4);
		b1.add(rt5);
		b1.add(rt6);

		dt1=new DefaultTableModel();
		t1=new JTable(dt1);
		JScrollPane js1=new JScrollPane(t1);
		js1.setBounds(90,150,900,400);
		
		String h1[]= {"ISBN","Book Name","Publication","Author","Language","Subject"};
		String c1[]= {"bid","bname","pub","author","lan","sub"};
		String q1="select bid,bname,pub,author,lan,sub from books inner join language on language.lid=books.lid  inner join subject on subject.sid=books.sid where type='books';";
		DbOps d1=new DbOps();
		d1.fillJTable(dt1,c1,h1,q1);
		
		j1.add(js1);
		j1.add(rt1);
		j1.add(rt2);
		j1.add(rt3);
		j1.add(rt4);
		j1.add(rt5);
		j1.add(rt6);
		j1.add(bsk1);
		j1.add(tfk1);
		//j1.add(jk1);
		
		j2=new JPanel();
		j2.setLayout(null);
		j2.setBackground(Color.WHITE);
		j2.setBounds(180,50,1200,850);
		add(j2);
		l4=new JLabel("Hello "+s+"!!");
		l4.setBounds(15,20,400,40);
		l4.setForeground(new Color(0,0,204));
		l4.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j2.add(l4);
		
		bsk2=new JButton("Search");
		bsk2.addActionListener(this);
		bsk2.setBounds(100,105,90,30);
		bsk2.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk2=new JTextField();
		tfk2.setBounds(200,110,180,25);
		tfk2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt7=new JRadioButton("Serial no");
		rt7.setBounds(390,110,100,25);
		rt7.addActionListener(this);
		rt7.setFont(new Font("times new roman",Font.PLAIN,16));
		rt7.setBackground(Color.WHITE);
		rt8=new JRadioButton("Magazine Name");
		rt8.setBounds(500,110,150,25);
		rt8.addActionListener(this);
		rt8.setFont(new Font("times new roman",Font.PLAIN,16));
		rt8.setBackground(Color.WHITE);
		rt9=new JRadioButton("Publication");
		rt9.setBounds(650,110,100,25);
		rt9.addActionListener(this);
		rt9.setFont(new Font("times new roman",Font.PLAIN,16));
		rt9.setBackground(Color.WHITE);
		rt10=new JRadioButton("language");
		rt10.setBounds(770,110,100,25);
		rt10.addActionListener(this);
		rt10.setFont(new Font("times new roman",Font.PLAIN,16));
		rt10.setBackground(Color.WHITE);
		
		ButtonGroup b2=new ButtonGroup();
		b2.add(rt7);
		b2.add(rt8);
		b2.add(rt9);
		b2.add(rt10);

		dt2=new DefaultTableModel();
		t2=new JTable(dt2);
		JScrollPane js2=new JScrollPane(t2);
		js2.setBounds(90,150,900,400);
		
		String h2[]= {"Serial no","Magazine Name","Publication","Laguage"};
		String c2[]= {"bid","bname","pub","lan"};
		String q2="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' ;";
		DbOps d2=new DbOps();
		d2.fillJTable(dt2,c2,h2,q2);
		
		j2.add(js2);
		j2.add(bsk2);
		j2.add(tfk2);
		j2.add(rt7);
		j2.add(rt8);
		j2.add(rt9);
		j2.add(rt10);

		j3=new JPanel();
		j3.setLayout(null);
		j3.setBackground(Color.WHITE);
		j3.setBounds(180,50,1200,850);
		add(j3);
		l5=new JLabel("Hello "+s+"!!");
		l5.setBounds(15,20,400,40);
		l5.setForeground(new Color(0,0,204));
		l5.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j3.add(l5);
		
		bsk3=new JButton("Search");
		bsk3.addActionListener(this);
		bsk3.setBounds(100,105,90,30);
		bsk3.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk3=new JTextField();
		tfk3.setBounds(200,110,180,25);
		tfk3.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt11=new JRadioButton("Serial no");
		rt11.setBounds(390,110,100,25);
		rt11.addActionListener(this);
		rt11.setFont(new Font("times new roman",Font.PLAIN,16));
		rt11.setBackground(Color.WHITE);
		rt12=new JRadioButton("Newspaper Name");
		rt12.setBounds(495,110,150,25);
		rt12.addActionListener(this);
		rt12.setFont(new Font("times new roman",Font.PLAIN,16));
		rt12.setBackground(Color.WHITE);
		rt13=new JRadioButton("Publication");
		rt13.setBounds(650,110,100,25);
		rt13.addActionListener(this);
		rt13.setFont(new Font("times new roman",Font.PLAIN,16));
		rt13.setBackground(Color.WHITE);
		rt14=new JRadioButton("language");
		rt14.setBounds(770,110,100,25);
		rt14.addActionListener(this);
		rt14.setFont(new Font("times new roman",Font.PLAIN,16));
		rt14.setBackground(Color.WHITE);
		rt15=new JRadioButton("Date");
		rt15.setBounds(880,110,100,25);
		rt15.addActionListener(this);
		rt15.setFont(new Font("times new roman",Font.PLAIN,16));
		rt15.setBackground(Color.WHITE);
		
		ButtonGroup bg3=new ButtonGroup();
		bg3.add(rt11);
		bg3.add(rt12);
		bg3.add(rt13);
		bg3.add(rt14);
		bg3.add(rt15);
		
		dt3=new DefaultTableModel();
		t3=new JTable(dt3);
		JScrollPane js3=new JScrollPane(t3);
		js3.setBounds(90,150,900,400);
		
		String h3[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
		String c3[]= {"bid","bname","pub","lan","date"};
		String q3="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' ;";
		DbOps d3=new DbOps();
		d3.fillJTable(dt3,c3,h3,q3);
		
		j3.add(js3);
		j3.add(bsk3);
		j3.add(tfk3);
		j3.add(rt11);
		j3.add(rt12);
		j3.add(rt13);
		j3.add(rt14);
		j3.add(rt15);
		
	
		j4=new JPanel();
		j4.setLayout(null);
		j4.setBackground(Color.WHITE);
		j4.setBounds(180,50,1200,850);
		add(j4);
		l6=new JLabel("Hello "+s+"!!");
		l6.setBounds(15,5,400,40);
		l6.setForeground(new Color(0,0,204));
		l6.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j4.add(l6);
		
		ImageIcon img=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\is_bk.png");
		bt1=new JButton(img);
		bt1.addActionListener(this);
		bt1.setBounds(50,50,90,90);
		bt1.setBorderPainted(false);
		j4.add(bt1);
		
		bsk4=new JButton("Search");
		bsk4.addActionListener(this);
		bsk4.setBounds(50,150,90,30);
		bsk4.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk4=new JTextField();
		tfk4.setBounds(160,150,180,25);
		tfk4.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt16=new JRadioButton("Item Id");
		rt16.setBounds(350,150,90,25);
		rt16.addActionListener(this);
		rt16.setFont(new Font("times new roman",Font.PLAIN,16));
		rt16.setBackground(Color.WHITE);
		rt17=new JRadioButton("Item Name");
		rt17.setBounds(450,150,120,25);
		rt17.addActionListener(this);
		rt17.setFont(new Font("times new roman",Font.PLAIN,16));
		rt17.setBackground(Color.WHITE);
		rt18=new JRadioButton("Course");
		rt18.setBounds(570,150,100,25);
		rt18.addActionListener(this);
		rt18.setFont(new Font("times new roman",Font.PLAIN,16));
		rt18.setBackground(Color.WHITE);
		rt19=new JRadioButton("Issued Date");
		rt19.setBounds(670,150,110,25);
		rt19.addActionListener(this);
		rt19.setFont(new Font("times new roman",Font.PLAIN,16));
		rt19.setBackground(Color.WHITE);
		rt20=new JRadioButton("TimeLimit");
		rt20.setBounds(790,150,100,25);
		rt20.addActionListener(this);
		rt20.setFont(new Font("times new roman",Font.PLAIN,16));
		rt20.setBackground(Color.WHITE);
		
		ButtonGroup bg4=new ButtonGroup();
		bg4.add(rt16);
		bg4.add(rt17);
		bg4.add(rt18);
		bg4.add(rt19);
		bg4.add(rt20);
		
				
		dt4=new DefaultTableModel();
		t4=new JTable(dt4);
		JScrollPane js4=new JScrollPane(t4);
		js4.setBounds(50,190,995,400);
		
		String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
		String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
		String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+s+"';";
		DbOps db4=new DbOps();
		db4.fillJTable(dt4, c4, h4, q4);
		
		j4.add(js4);
		j4.add(bsk4);
		j4.add(tfk4);
		j4.add(rt16);
		j4.add(rt17);
		j4.add(rt18);
		j4.add(rt19);
		j4.add(rt20);
		
		j5=new JPanel();
		j5.setLayout(null);
		j5.setBackground(Color.WHITE);
		j5.setBounds(180,50,1200,850);
		add(j5);

		l7=new JLabel("Hello "+s+"!!");
		l7.setBounds(15,5,400,40);
		l7.setForeground(new Color(0,0,204));
		l7.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j5.add(l7);
		
		ImageIcon img2=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\rt_bk.png");
		bt2=new JButton(img2);
		bt2.addActionListener(this);
		bt2.setBounds(50,45,85,96);
		bt2.setBorderPainted(false);
		j5.add(bt2);
		
		bsk5=new JButton("Search");
		bsk5.addActionListener(this);
		bsk5.setBounds(50,145,90,30);
		bsk5.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk5=new JTextField();
		tfk5.setBounds(160,150,180,25);
		tfk5.setFont(new Font("times new roman",Font.PLAIN,16));
		
		rt21=new JRadioButton("Item Id");
		rt21.setBounds(350,150,90,25);
		rt21.addActionListener(this);
		rt21.setFont(new Font("times new roman",Font.PLAIN,16));
		rt21.setBackground(Color.WHITE);
		rt22=new JRadioButton("Item Name");
		rt22.setBounds(450,150,120,25);
		rt22.addActionListener(this);
		rt22.setFont(new Font("times new roman",Font.PLAIN,16));
		rt22.setBackground(Color.WHITE);
		rt23=new JRadioButton("Course");
		rt23.setBounds(570,150,100,25);
		rt23.addActionListener(this);
		rt23.setFont(new Font("times new roman",Font.PLAIN,16));
		rt23.setBackground(Color.WHITE);
		rt24=new JRadioButton("Issued Date");
		rt24.setBounds(675,150,100,25);
		rt24.addActionListener(this);
		rt24.setFont(new Font("times new roman",Font.PLAIN,16));
		rt24.setBackground(Color.WHITE);
		rt25=new JRadioButton("TimeLimit");
		rt25.setBounds(780,150,100,25);
		rt25.addActionListener(this);
		rt25.setFont(new Font("times new roman",Font.PLAIN,16));
		rt25.setBackground(Color.WHITE);
		rt26=new JRadioButton("Return Date");
		rt26.setBounds(890,150,100,25);
		rt26.addActionListener(this);
		rt26.setFont(new Font("times new roman",Font.PLAIN,16));
		rt26.setBackground(Color.WHITE);		
		
		ButtonGroup bg5=new ButtonGroup();
		bg5.add(rt23);
		bg5.add(rt21);
		bg5.add(rt22);
		bg5.add(rt23);
		bg5.add(rt24);
		bg5.add(rt25);
		bg5.add(rt26);
		
		dt5=new DefaultTableModel();
		t5=new JTable(dt5);
		JScrollPane js5=new JScrollPane(t5);
		js5.setBounds(50,190,995,400);
		
		String h5[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit","Return Date"};
		String c5[]= {"books.bid","bname","course","isdate","exp_retdate","retdate"};
		String q5="select books.bid,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+s+"';";
		DbOps d5=new DbOps();
		d5.fillJTable(dt5, c5, h5, q5);
		
		j5.add(js5);
		j5.add(bsk5);
		j5.add(tfk5);
		j5.add(rt21);
		j5.add(rt22);
		j5.add(rt23);
		j5.add(rt24);
		j5.add(rt25);
		j5.add(rt26);
		
		j6=new JPanel();
		j6.setLayout(null);
		j6.setBackground(Color.WHITE);
		j6.setBounds(180,50,1200,850);
		add(j6);
		l8=new JLabel("Hello "+s+"!!");
		l8.setBounds(15,20,400,40);
		l8.setForeground(new Color(0,0,204));
		l8.setFont(new Font("Bookman Old Style",Font.BOLD,30));
		j6.add(l8);
		
		lc=new 	JLabel("Student ID:");	
		lc.setBounds(70,95,100,20);
		lc.setFont(new Font("times new roman",Font.PLAIN,20));	
		tfc=new JTextField(id);		
		tfc.setBounds(165,95,120,25); 
		tfc.setFont(new Font("times new roman",Font.PLAIN,20));
		
		dt6=new DefaultTableModel();
		t6=new JTable(dt6);
		JScrollPane js6=new JScrollPane(t6);
		js6.setBounds(50,140,480,250);
		
		String h6[]= {"Item Id","Item Name","Overdue","Fine","paid amount","Date","Pay Status"};		
		String c6[]= {"books.bid","bname","delay","fine","paid","challan.date","remarks"};
		String q6="select books.bid,bname,delay,fine,paid,challan.date,remarks from challan inner join books on books.bid=challan.bid where stid="+tfc.getText()+";";
		DbOps d6=new DbOps();
		d6.fillJTable(dt6, c6, h6, q6);
	
		String ql="select sum(fine)-sum(paid) as tot from challan where stid="+sid+" group by stid;";
		String col[]= {"tot"};
		DbOps dbq=new DbOps();
		String st[]=dbq.getValuesFromDB(ql,col);
		tamt=st[0];
		
		lc1=new JLabel("Total:");
		lc1.setBounds(290,410,50,20);
		lc1.setFont(new Font("times new roman",Font.PLAIN,20)); 
		tfc1=new JTextField(tamt);
		tfc1.setBounds(340,410,90,20);
		tfc1.setFont(new Font("times new roman",Font.PLAIN,20));
		bkc1=new JButton("PAY");
		bkc1.addActionListener(this);
		bkc1.setBorderPainted(false);
		bkc1.setBackground(new Color(100,149,237));
		bkc1.setBounds(445,405,90,30);
		bkc1.setFont(new Font("times new roman",Font.PLAIN,20));

		lc2=new JLabel("Penalty  Criteria:");	
		lc2.setBounds(605,120,230,30);
		lc2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,25));
		
		lc3=new JLabel("->Till 15 days:Rs 10 per day");
		lc3.setBounds(605,175,250,20);
		lc3.setFont(new Font("times new roman",Font.PLAIN,20));
		lc3.setBackground(new Color(169,169,169));
	    lc3.setOpaque(true);			//opaque used to covered background making it non-transparent
		lc4=new JLabel("->After 15 days:Rs 15 per day");
		lc4.setBounds(605,220,250,20);
		lc4.setFont(new Font("times new roman",Font.PLAIN,20));
		lc4.setBackground(new Color(169,169,169));
	    lc4.setOpaque(true);
		lc5=new JLabel("->After 1 month:Rs 20 per day");
		lc5.setBounds(605,265,250,20);
		lc5.setFont(new Font("times new roman",Font.PLAIN,20));
		lc5.setBackground(new Color(169,169,169));
	    lc5.setOpaque(true);
	    lc6=new JLabel("->Lost book fee:replacement cost + processing cost");
		lc6.setBounds(605,310,430,20);
		lc6.setFont(new Font("times new roman",Font.PLAIN,20));
		lc6.setBackground(new Color(169,169,169));
	    lc6.setOpaque(true);
	    lc7=new JLabel("->Damaged book fee:replacement/repair cost + processing cost");
		lc7.setBounds(605,355,520,20);
		lc7.setFont(new Font("times new roman",Font.PLAIN,20));
		lc7.setBackground(new Color(169,169,169));
	    lc7.setOpaque(true);
		
		
		j6.add(js6);
		j6.add(lc);
		j6.add(tfc);
		j6.add(lc1);
		j6.add(tfc1);
		j6.add(bkc1);
		j6.add(lc2);
		j6.add(lc3);
		j6.add(lc4);
		j6.add(lc5);
		j6.add(lc6);
		j6.add(lc7);
		
		j1.setVisible(false);
		j2.setVisible(false);
		j3.setVisible(false);
		j4.setVisible(false);
		j5.setVisible(false);
		j6.setVisible(false);
		
		add(jp1);
		add(jp2);
		add(jp3);
		
		setSize(1700,700);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			b1.setBackground(new Color(51,51,255));
			b2.setBackground(new Color(0,0,153));
			b3.setBackground(new Color(0,0,153));
			b4.setBackground(new Color(0,0,153));
			b5.setBackground(new Color(0,0,153));
			b6.setBackground(new Color(0,0,153));
			b7.setBackground(new Color(0,0,153));
			b8.setBackground(new Color(0,0,153));
			
			jp2.setVisible(true);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
		}
		if(ae.getSource()==b2)
		{
			b2.setBackground(new Color(51,51,255));
			b1.setBackground(new Color(0,0,153));
			b3.setBackground(new Color(0,0,153));
			b4.setBackground(new Color(0,0,153));
			b5.setBackground(new Color(0,0,153));
			b6.setBackground(new Color(0,0,153));
			b7.setBackground(new Color(0,0,153));
			b8.setBackground(new Color(0,0,153));
			
			jp2.setVisible(false);
			j1.setVisible(true);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
		}
		if(ae.getSource()==b3)
		{
			b3.setBackground(new Color(51,51,255));
			b1.setBackground(new Color(0,0,153));
			b2.setBackground(new Color(0,0,153));
			b4.setBackground(new Color(0,0,153));
			b5.setBackground(new Color(0,0,153));
			b6.setBackground(new Color(0,0,153));
			b7.setBackground(new Color(0,0,153));
			b8.setBackground(new Color(0,0,153));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(true);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
		}
		if(ae.getSource()==b4)
		{
			b4.setBackground(new Color(51,51,255));
			b1.setBackground(new Color(0,0,153));
			b2.setBackground(new Color(0,0,153));
			b3.setBackground(new Color(0,0,153));
			b5.setBackground(new Color(0,0,153));
			b6.setBackground(new Color(0,0,153));
			b7.setBackground(new Color(0,0,153));
			b8.setBackground(new Color(0,0,153));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(true);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(false);
		}
		if(ae.getSource()==b5)
		{
			b5.setBackground(new Color(51,51,255));
			b1.setBackground(new Color(0,0,153));
			b2.setBackground(new Color(0,0,153));
			b3.setBackground(new Color(0,0,153));
			b4.setBackground(new Color(0,0,153));
			b6.setBackground(new Color(0,0,153));
			b7.setBackground(new Color(0,0,153));
			b8.setBackground(new Color(0,0,153));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(true);
			j5.setVisible(false);
			j6.setVisible(false);
		}
		if(ae.getSource()==b6)
		{
			b6.setBackground(new Color(51,51,255));
			b1.setBackground(new Color(0,0,153));
			b2.setBackground(new Color(0,0,153));
			b3.setBackground(new Color(0,0,153));
			b4.setBackground(new Color(0,0,153));
			b5.setBackground(new Color(0,0,153));
			b7.setBackground(new Color(0,0,153));
			b8.setBackground(new Color(0,0,153));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(true);
			j6.setVisible(false);

		}
		if(ae.getSource()==b7)
		{
			b6.setBackground(new Color(0,0,153));
			b1.setBackground(new Color(0,0,153));
			b2.setBackground(new Color(0,0,153));
			b3.setBackground(new Color(0,0,153));
			b4.setBackground(new Color(0,0,153));
			b5.setBackground(new Color(0,0,153));
			b7.setBackground(new Color(51,51,255));
			b8.setBackground(new Color(0,0,153));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(true);
		}
		if(ae.getSource()==b8)
		{
			b6.setBackground(new Color(0,0,153));
			b1.setBackground(new Color(0,0,153));
			b2.setBackground(new Color(0,0,153));
			b3.setBackground(new Color(0,0,153));
			b4.setBackground(new Color(0,0,153));
			b5.setBackground(new Color(0,0,153));
			b8.setBackground(new Color(51,51,255));
			b7.setBackground(new Color(0,0,153));
			
			jp2.setVisible(false);
			j1.setVisible(false);
			j2.setVisible(false);
			j3.setVisible(false);
			j4.setVisible(false);
			j5.setVisible(false);
			j6.setVisible(true);
		}
		if(ae.getSource()==bkc1)
			new pay(sid,tamt);
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
				String h2[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String c2[]= {"bid","bname","pub","lan"};
				String q2="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and bid like '%"+tfk2.getText()+"%';";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);
			}
			if(rt8.isSelected()==true)
			{	
				String h2[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String c2[]= {"bid","bname","pub","lan"};
				String q2="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and bname like '%"+tfk2.getText()+"%';";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);
			}
			if(rt9.isSelected()==true)
			{	
				String h2[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String c2[]= {"bid","bname","pub","lan"};
				String q2="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and pub like '%"+tfk2.getText()+"%';";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);
			}
			if(rt10.isSelected()==true)
			{	
				String h2[]= {"Serial no","Magazine Name","Publication","Laguage"};
				String c2[]= {"bid","bname","pub","lan"};
				String q2="select bid,bname,pub,lan from books inner join language on language.lid=books.lid where type='Magazine' and lan like '%"+tfk2.getText()+"%';";
				DbOps d2=new DbOps();
				d2.fillJTable(dt2,c2,h2,q2);
			}
		}
		if(ae.getSource()==bsk3)
		{
			if(rt11.isSelected()==true)
			{	
				String h3[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
				String c3[]= {"bid","bname","pub","lan","date"};
				String q3="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and bid like '%"+tfk3.getText()+"%';";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);
			}
			if(rt12.isSelected()==true)
			{	
				String h3[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
				String c3[]= {"bid","bname","pub","lan","date"};
				String q3="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and bname like '%"+tfk3.getText()+"%';";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);
			}
			if(rt13.isSelected()==true)
			{	
				String h3[]= {"Serial no","Newspaper Name","Publication","Laguage","Date"};
				String c3[]= {"bid","bname","pub","lan","date"};
				String q3="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and pub like '%"+tfk3.getText()+"%';";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);
			}
			if(rt14.isSelected()==true)
			{	
				String h3[]= {"Date","Newspaper Name","Publication","Laguage","Date"};
				String c3[]= {"bid","bname","pub","lan","date"};
				String q3="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and lan like '%"+tfk3.getText()+"%';";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);	
			}
			if(rt15.isSelected()==true)
			{	
				String h3[]= {"Date","Newspaper Name","Publication","Laguage","Date"};
				String c3[]= {"bid","bname","pub","lan","date"};
				String q3="select bid,bname,pub,lan,date from books inner join language on language.lid=books.lid where type='Newspaper' and date like '%"+tfk3.getText()+"%';";
				DbOps d3=new DbOps();
				d3.fillJTable(dt3,c3,h3,q3);	
			}
		}

		if(ae.getSource()==bsk4)
		{
			if(rt16.isSelected()==true)
			{	
				String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
				String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
				String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and books.bid like'%"+tfk4.getText()+"%'";
				DbOps db4=new DbOps();
				db4.fillJTable(dt4, c4, h4, q4);
				
			}
			if(rt17.isSelected()==true)
			{	
				String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
				String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
				String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and bname like'%"+tfk4.getText()+"%'";
				DbOps db4=new DbOps();
				db4.fillJTable(dt4, c4, h4, q4);	
			}
			if(rt18.isSelected()==true)
			{	
				String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
				String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
				String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and course like'%"+tfk4.getText()+"%'";
				DbOps db4=new DbOps();
				db4.fillJTable(dt4, c4, h4, q4);	
			}
			if(rt19.isSelected()==true)
			{	
				String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
				String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
				String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and isdate like'%"+tfk4.getText()+"%'";
				DbOps db4=new DbOps();
				db4.fillJTable(dt4, c4, h4, q4);
			}
			if(rt20.isSelected()==true)
			{	
				String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
				String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
				String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and exp_retdate like'%"+tfk4.getText()+"%'";
				DbOps db4=new DbOps();
				db4.fillJTable(dt4, c4, h4, q4);	
			}
			
		}
		if(ae.getSource()==bsk5)
		{
			if(rt21.isSelected()==true)
			{	
				String h5[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit","Return Date"};
				String c5[]= {"books.bid","bname","course","isdate","exp_retdate","retdate"};
				String q5="select books.bid,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and books.bid like '%"+tfk5.getText()+"%'";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5, c5, h5, q5);
				
			}
			if(rt22.isSelected()==true)
			{	
				String h5[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit","Return Date"};
				String c5[]= {"books.bid","bname","course","isdate","exp_retdate","retdate"};
				String q5="select books.bid,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and bname like '%"+tfk5.getText()+"%'";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5, c5, h5, q5);
			}
			if(rt23.isSelected()==true)
			{	
				String h5[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit","Return Date"};
				String c5[]= {"books.bid","bname","course","isdate","exp_retdate","retdate"};
				String q5="select books.bid,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and course like '%"+tfk5.getText()+"%'";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5, c5, h5, q5);
			}
			if(rt24.isSelected()==true)
			{	
				String h5[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit","Return Date"};
				String c5[]= {"books.bid","bname","course","isdate","exp_retdate","retdate"};
				String q5="select books.bid,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and isdate like '%"+tfk5.getText()+"%'";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5, c5, h5, q5);
			}
			if(rt25.isSelected()==true)
			{	
				String h5[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit","Return Date"};
				String c5[]= {"books.bid","bname","course","isdate","exp_retdate","retdate"};
				String q5="select books.bid,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and exp_retdate like '%"+tfk5.getText()+"%'";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5, c5, h5, q5);	
			}
			if(rt26.isSelected()==true)
			{	
				String h5[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit","Return Date"};
				String c5[]= {"books.bid","bname","course","isdate","exp_retdate","retdate"};
				String q5="select books.bid,bname,course,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where stname='"+st+"' and retdate like '%"+tfk5.getText()+"%'";
				DbOps d5=new DbOps();
				d5.fillJTable(dt5, c5, h5, q5);	
			}
			
		}

		String query="select stname,course,course.cid from student left join course on course.cid=student.cid where stid="+sid;
		String cols[]= {"stname","course","course.cid"};
		DbOps db=new DbOps();
		String s1[]=db.getValuesFromDB(query,cols);	
		/*for(int k=0;k<s1.length;k++)
			System.out.println(s1[k]+",");*/
		
		String sp=s1[2]+"-"+s1[1];
		//System.out.println("flag:"+1+"name:"+s1[0]+"course"+sp);
		if(ae.getSource()==bt1)
		{
			System.out.println("flag:"+1+"name:"+s1[0]+"course"+sp);
			new issued(1,sid,st,sp);
		}
		if(ae.getSource()==bt2)
		{
			new Return(1,s1[0],sid);
		}
		

		/*if(ae.getSource()==b8)		//logout
		{
		}*/
		
	
	}
	/*public static void main(String [] ar)
	{
		new student_dashboard();
	}*/
}
