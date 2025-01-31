package com.pack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import javax.swing.table.*;
import java.time.LocalDate;

public class issued extends JFrame implements ActionListener,ItemListener,KeyListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,rt1,rt2;
	JComboBox cb1;
	JButton b1,b2,bs;
	JTable tb1,t1;			//tb1 for issued table and t1 for books table
	JScrollPane jsp,js1;
	DefaultTableModel dtm,dt1;
	String s[]= {"SELECT","Books","Magzine","Newspaper"};
	String ID;
	int f1;
	issued(int f,String id,String nm,String crs)
	{
		ID=id;
		f1=f;
		getContentPane().setBackground(new Color(153,204,255));		
		l1=new JLabel("ISSUED  FORM");
		l1.setBounds(250,30,250,30);
		l1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,28));
		l2=new JLabel("STUDENT ID");
		l2.setBounds(60,110,110,20);
		l2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf1=new JTextField("");
		tf1.setBounds(200,110,150,20);
		tf1.setFont(new Font("times new roman",Font.PLAIN,16));
		b1=new JButton("Search");
		b1.addActionListener(this);
		b1.setBounds(370,110,80,20);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		l3=new JLabel("STUDENT NAME");
		l3.setBounds(60,150,130,20);
		l3.setFont(new Font("times new roman",Font.PLAIN,16));
		tf2=new JTextField("");
		tf2.setBounds(200,150,150,20);
		tf2.setFont(new Font("times new roman",Font.PLAIN,16));
		l4=new JLabel("COURSE");
		l4.setBounds(395,150,80,20);
		l4.setFont(new Font("times new roman",Font.PLAIN,16));
		tf3=new JTextField("");
		tf3.setBounds(490,150,150,20);
		tf3.setFont(new Font("times new roman",Font.PLAIN,16));
		l5=new JLabel("BOOK ID");
		l5.setBounds(60,190,110,20);
		l5.setFont(new Font("times new roman",Font.PLAIN,16));
		tf4=new JTextField("");
		tf4.setBounds(200,190,150,20);
		tf4.setFont(new Font("times new roman",Font.PLAIN,16));
		tf4.addKeyListener(this);
		l6=new JLabel("TYPE");
		l6.setBounds(395,190,80,20);
		l6.setFont(new Font("times new roman",Font.PLAIN,16));
		/*cb1=new JComboBox(s);
		cb1.setBounds(490,190,150,20);
		cb1.setFont(new Font("times new roman",Font.PLAIN,16));
		cb1.addItemListener(this);*/
		tf=new JTextField("");
		tf.setBounds(490,190,150,20);
		tf.setFont(new Font("times new roman",Font.PLAIN,16));
		add(tf);
		l7=new JLabel("ISSUED DATE");
		l7.setBounds(60,230,110,20);
		l7.setFont(new Font("times new roman",Font.PLAIN,16));
		tf5=new JTextField("");
		tf5.setBounds(200,230,150,20);
		tf5.setFont(new Font("times new roman",Font.PLAIN,16));
		b2=new JButton("Issued");
		b2.addActionListener(this);
		b2.setBounds(390,230,80,30);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		bs=new JButton("Search");
		bs.addActionListener(this);
		bs.setBounds(30,280,80,30);
		bs.setFont(new Font("times new roman",Font.PLAIN,16));
		tf6=new JTextField();
		tf6.setBounds(120,285,150,25);
		tf6.setFont(new Font("times new roman",Font.PLAIN,16));
		
		r1=new JRadioButton("Item ID");
		r1.setBounds(280,285,80,25);
		r1.addActionListener(this);
		r1.setFont(new Font("times new roman",Font.PLAIN,16));
		r1.setBackground(new Color(153,204,255));
		r2=new JRadioButton("Item Name");
		r2.setBounds(365,285,100,25);
		r2.addActionListener(this);
		r2.setFont(new Font("times new roman",Font.PLAIN,16));
		r2.setBackground(new Color(153,204,255));
		r3=new JRadioButton("Publication");
		r3.setBounds(470,285,100,25);
		r3.addActionListener(this);
		r3.setFont(new Font("times new roman",Font.PLAIN,16));
		r3.setBackground(new Color(153,204,255));
		r4=new JRadioButton("Author");
		r4.setBounds(575,285,70,25);
		r4.addActionListener(this);
		r4.setFont(new Font("times new roman",Font.PLAIN,16));
		r4.setBackground(new Color(153,204,255));
		r5=new JRadioButton("Languge");
		r5.setBounds(655,285,80,25);
		r5.addActionListener(this);
		r5.setFont(new Font("times new roman",Font.PLAIN,16));
		r5.setBackground(new Color(153,204,255));
		r6=new JRadioButton("Subject");
		r6.setBounds(745,285,80,25);
		r6.addActionListener(this);
		r6.setFont(new Font("times new roman",Font.PLAIN,16));
		r6.setBackground(new Color(153,204,255));		
		r7=new JRadioButton("Date");
		r7.setBounds(835,285,60,25);
		r7.addActionListener(this);
		r7.setFont(new Font("times new roman",Font.PLAIN,16));
		r7.setBackground(new Color(153,204,255));		
		r8=new JRadioButton("Type");
		r8.setBounds(900,285,80,25);
		r8.addActionListener(this);
		r8.setFont(new Font("times new roman",Font.PLAIN,16));
		r8.setBackground(new Color(153,204,255));	
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		bg.add(r6);
		bg.add(r7);
		bg.add(r8);
		
		dt1=new DefaultTableModel();		//book table
		t1=new JTable(dt1);
		JScrollPane js1=new JScrollPane(t1);
		js1.setBounds(25,350,920,335);
		
		dtm=new DefaultTableModel();		//issued table
		tb1=new JTable(dtm);
		JScrollPane jsp=new JScrollPane(tb1);
		jsp.setBounds(560,350,400,335);
		jsp.setVisible(false);
		
		rt1=new JRadioButton("BOOK TABLE");
		rt1.setBounds(30,320,150,25);
		rt1.addActionListener(this);
		rt1.setFont(new Font("times new roman",Font.PLAIN,16));
		rt1.setBackground(new Color(153,204,255));		
		rt2=new JRadioButton("ISSUED TABLE");
		rt2.setBounds(560,320,150,25);
		rt2.addActionListener(this);
		rt2.setFont(new Font("times new roman",Font.PLAIN,16));
		rt2.setBackground(new Color(153,204,255));
		
		ButtonGroup btg=new ButtonGroup();
		btg.add(rt1);
		btg.add(rt2);
		
		if(f==1)
		{
			js1.setBounds(25,350,520,335);
			jsp.setVisible(true);
			
			String head[]= {"Item Id","Item Name","Type","Issued Date"};
			String col[]= {"books.bid","bname","type","isdate"};
			String q="select books.bid,bname,type,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid="+id+" and retdate is null and isdate is not null";
			DbOps db1=new DbOps();
			db1.fillJTable(dtm, col, head, q);
			
			String h1[]= {"Item Id","Item Name","Publication","Author","Language","Subject","Date","Type"};
			String c1[]= {"books.bid","bname","pub","author","lan","sub","date","type"};
			String q1="select books.bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid left join issued on issued.bid=books.bid ;";
			DbOps db2=new DbOps();
			db2.fillJTable(dt1,c1,h1,q1);
			
			r2.setBounds(365,285,100,23);
			r3.setText("Type");
			r3.setBounds(470,285,60,25);
			r4.setText("Issued Date");
			r4.setBounds(540,285,110,25);
			r5.setText("Publisher");
			r5.setBounds(650,285,100,25);
			r6.setText("Author");
			r6.setBounds(745,285,70,25);
			r7.setText("Subject");
			r7.setBounds(820,285,80,25);
			r8.setText("Language");
			r8.setBounds(900,285,90,25);
			
		}
		else 
		{
			rt1.setVisible(false);
			rt2.setVisible(false);
			String head[]={"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
			String col[]={"books.bid","bname","pub","author","lan","sub","date","type"};
			String q="select books.bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid;";
			DbOps db1=new DbOps();
			db1.fillJTable(dt1,col,head,q);
		}
		if(f==1)
		{
			tf1.setText(id);
			tf2.setText(nm);
			tf3.setText(crs);
			tf1.setFocusable(false);
			tf2.setFocusable(false);
			tf3.setFocusable(false);
			b1.setEnabled(false);
		}
		
		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(b1);
		add(tf2);
		add(l4);
		add(tf3);
		add(l5);
		add(tf4);
		add(l6);
		//add(cb1);
		add(l7);
		add(tf5);
		add(b2);
		add(jsp);
		add(js1);
		add(bs);
		add(tf6);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(r5);
		add(r6);
		add(r7);
		add(r8);
		add(rt1);
		add(rt2);
		
		setSize(1000,800);
		setLayout(null);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String str=tf1.getText();
			
			String q="select stname,course,course.cid from student left join course on course.cid=student.cid where student.stid="+str;
			String cols[]= {"stname","course","course.cid"};
			DbOps db=new DbOps();
			System.out.println(q);
			String s1[]=db.getValuesFromDB(q,cols);	
			for(int k=0;k<s1.length;k++)
				System.out.println(s1[k]+",");
			
			tf2.setText(s1[0]);
			String st=s1[2]+"-"+s1[1];
			tf3.setText(st);
			
		}
		if(ae.getSource()==b2)
		{
			String s=tf3.getText();
			s=s.substring(0,s.indexOf("-"));
					
			String q="insert into issued (stid,bid,isdate,exp_retdate,cid) values("+tf1.getText()+","+tf4.getText()+",'"+tf5.getText()+"',DATE_ADD('"+tf5.getText()+"',INTERVAL 15 DAY),"+s+");";
			DbOps db=new DbOps();
			db.insertToDB(q);
		}
		if(ae.getSource()==bs)
		{
			if(f1==1)
			{
				if(rt2.isSelected()==true)
				{
					if(r1.isSelected()==true)
					{	
						String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
						String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
						String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid='"+ID+"' and books.bid like'%"+tf6.getText()+"%' and retdate is null and isdate is not null";
						DbOps db4=new DbOps();
						db4.fillJTable(dtm, c4, h4, q4);	
					}
					if(r2.isSelected()==true)
					{	
						String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
						String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
						String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid='"+ID+"' and bname like'%"+tf6.getText()+"%' and retdate is null and isdate is not null";
						DbOps db4=new DbOps();
						db4.fillJTable(dtm, c4, h4, q4);	
					}
					if(r3.isSelected()==true)
					{	
						String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
						String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
						String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid='"+ID+"' and type like'%"+tf6.getText()+"%' and retdate is null and isdate is not null";
						DbOps db4=new DbOps();
						db4.fillJTable(dtm, c4, h4, q4);	
					}
					if(r4.isSelected()==true)
					{	
						String h4[]= {"Item Id","Item Name","Course","Issued Date","TimeLimit"};
						String c4[]= {"books.bid","bname","course","isdate","exp_retdate"};
						String q4="select books.bid,bname,course,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid='"+ID+"' and isdate like'%"+tf6.getText()+"%' and retdate is null and isdate is not null";
						DbOps db4=new DbOps();
						db4.fillJTable(dtm, c4, h4, q4);
					}
				}
				if(rt1.isSelected()==true)
				{
					if(r1.isSelected()==true)
					{	
						String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where bid like '%"+tf6.getText()+"%'";
						String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
						String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
						DbOps db=new DbOps();
						db.fillJTable(dt1,col,head,q);		
					}
					if(r2.isSelected()==true)
					{	
						String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where bname like '%"+tf6.getText()+"%'";
						String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
						String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
						DbOps db=new DbOps();
						db.fillJTable(dt1,col,head,q);		
					}
					if(r3.isSelected()==true)
					{	
						String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where type like '%"+tf6.getText()+"%'";
						String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
						String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
						DbOps db=new DbOps();
						db.fillJTable(dt1,col,head,q);		
					}
					if(r5.isSelected()==true)
					{	
						String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where pub like '%"+tf6.getText()+"%'";
						String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
						String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
						DbOps db=new DbOps();
						db.fillJTable(dt1,col,head,q);		
					}
					if(r6.isSelected()==true)
					{	
						String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where author like '%"+tf6.getText()+"%'";
						String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
						String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
						DbOps db=new DbOps();
						db.fillJTable(dt1,col,head,q);		
					}
					if(r7.isSelected()==true)
					{	
						String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where sub like '%"+tf6.getText()+"%'";
						String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
						String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
						DbOps db=new DbOps();
						db.fillJTable(dt1,col,head,q);		
					}
					if(r8.isSelected()==true)
					{	
						String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where lan like '%"+tf6.getText()+"%'";
						String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
						String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
						DbOps db=new DbOps();
						db.fillJTable(dt1,col,head,q);		
					}
				}
			}
			else	//for librarian and admin
			{
				if(r1.isSelected()==true)
				{	
					String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where bid like '%"+tf6.getText()+"%'";
					String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
					String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
					DbOps db=new DbOps();
					db.fillJTable(dt1,col,head,q);		
					System.out.println(q);
				}
				if(r2.isSelected()==true)
				{	
					String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where bname like '%"+tf6.getText()+"%'";
					String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
					String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
					DbOps db=new DbOps();
					db.fillJTable(dt1,col,head,q);
					System.out.println(q);
				}
				if(r3.isSelected()==true)
				{	
					String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where pub like '%"+tf6.getText()+"%'";
					String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
					String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
					DbOps db=new DbOps();
					db.fillJTable(dt1,col,head,q);		
				}
				if(r4.isSelected()==true)
				{	
					String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where author like '%"+tf6.getText()+"%'";
					String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
					String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
					DbOps db=new DbOps();
					db.fillJTable(dt1,col,head,q);		
				}
				if(r5.isSelected()==true)
				{	
					String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where lan like '%"+tf6.getText()+"%'";
					String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
					String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
					DbOps db=new DbOps();
					db.fillJTable(dt1,col,head,q);		
				}
				if(r6.isSelected()==true)
				{	
					String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where sub like '%"+tf6.getText()+"%'";
					String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
					String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
					DbOps db=new DbOps();
					db.fillJTable(dt1,col,head,q);		
				}
				if(r7.isSelected()==true)
				{	
					String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where date like '%"+tf6.getText()+"%'";
					String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
					String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
					DbOps db=new DbOps();
					db.fillJTable(dt1,col,head,q);		
				}
				if(r8.isSelected()==true)
				{	
					String q="select bid,bname,pub,author,lan,sub,date,type from books left join language on language.lid=books.lid  left join subject on subject.sid=books.sid where type like '%"+tf6.getText()+"%'";
					String head[]= {"ISBN","Book Name","Publication","Author","Language","Subject","Date","Type"};
					String col[]= {"bid","bname","pub","author","lan","sub","date","type"};
					DbOps db=new DbOps();
					db.fillJTable(dt1,col,head,q);		
				}
			}
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==cb1)
		{
			if(cb1.getSelectedItem().equals("Books"))
				l5.setText("BOOK ID");
			if(cb1.getSelectedItem().equals("Newspaper") || cb1.getSelectedItem().equals("Magzines"))
				l5.setText("SERIAL NO");
		}
	}
	public void keyReleased(KeyEvent ke)
	{
		if(ke.getSource()==tf4)
		{
			
				String q="select type from books where bid="+tf4.getText();
				String col[]= {"type"};
				DbOps db=new DbOps();
				//System.out.println(q);
				String s1[]=db.getValuesFromDB(q,col);
				System.out.println(q);
				
				LocalDate date=LocalDate.now();
				tf5.setText(date.toString());
				//cb1.setSelectedValue(s1[0]);
				
				System.out.println(s1[0]);
				tf.setText(s1[0]);
				
				
			
		}
	}
	public void keyPressed(KeyEvent ke)
	{}
	public void keyTyped(KeyEvent ke)
	{}
	/*public static void main(String [] ar)
	{
		new issued();
	}*/
}
