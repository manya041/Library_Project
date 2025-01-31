package com.pack;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.*;

public class Return extends JFrame implements ActionListener,KeyListener
{
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2,tf3,tfk;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;
	JButton b1,b2,bs;
	JTable tb1,t1;
	JScrollPane jsp,js1;
	DefaultTableModel dtm,dt1;
	String id="";
	int f;
	Return(int f,String nm,String id)
	{
		this.id=id;
		this.f=f;
		getContentPane().setBackground(new Color(204,204,255));	
		l1=new JLabel("RETURN  FORM");
		l1.setBounds(170,40,250,30);
		l1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,28));
		l2=new JLabel("STUDENT ID");
		l2.setBounds(90,100,110,20);
		l2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf1=new JTextField();
		tf1.setBounds(220,100,150,20);
		tf1.setFont(new Font("times new roman",Font.PLAIN,16));
		b1=new JButton("Search");
		b1.addActionListener(this);
		b1.setBounds(390,100,80,20);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		
		l3=new JLabel("ITEM ID");
		l3.setBounds(90,140,110,20);
		l3.setFont(new Font("times new roman",Font.PLAIN,16));
		tf2=new JTextField();
		tf2.setBounds(220,140,150,20);
		tf2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf2.addKeyListener(this);
		
		l4=new JLabel("RETURN DATE");
		l4.setBounds(90,180,110,20);
		l4.setFont(new Font("times new roman",Font.PLAIN,16));
		tf3=new JTextField();
		tf3.setBounds(220,180,150,20);
		tf3.setFont(new Font("times new roman",Font.PLAIN,16));
		b2=new JButton("RETURN");
		b2.addActionListener(this);
		b2.setBounds(390,180,100,25);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		bs=new JButton("Search");
		bs.addActionListener(this);
		bs.setBounds(30,220,80,30);
		bs.setFont(new Font("times new roman",Font.PLAIN,16));
		tfk=new JTextField();
		tfk.setBounds(120,225,150,25);
		tfk.setFont(new Font("times new roman",Font.PLAIN,16));
		
		r1=new JRadioButton("Item ID");
		r1.setBounds(280,225,80,25);
		r1.addActionListener(this);
		r1.setFont(new Font("times new roman",Font.PLAIN,16));
		r1.setBackground(new Color(204,204,255));
		r2=new JRadioButton("Item Name");
		r2.setBounds(365,225,100,25);
		r2.addActionListener(this);
		r2.setFont(new Font("times new roman",Font.PLAIN,16));
		r2.setBackground(new Color(204,204,255));
		r3=new JRadioButton("Student ID");
		r3.setBounds(470,225,100,25);
		r3.addActionListener(this);
		r3.setFont(new Font("times new roman",Font.PLAIN,16));
		r3.setBackground(new Color(204,204,255));
		r4=new JRadioButton("Student Name");
		r4.setBounds(575,225,120,25);
		r4.addActionListener(this);
		r4.setFont(new Font("times new roman",Font.PLAIN,16));
		r4.setBackground(new Color(204,204,255));
		r5=new JRadioButton("Timelimit");
		r5.setBounds(695,225,80,25);
		r5.addActionListener(this);
		r5.setFont(new Font("times new roman",Font.PLAIN,16));
		r5.setBackground(new Color(204,204,255));
		r6=new JRadioButton("Issue Date");
		r6.setBounds(785,225,100,25);
		r6.addActionListener(this);
		r6.setFont(new Font("times new roman",Font.PLAIN,16));
		r6.setBackground(new Color(204,204,255));		
		r7=new JRadioButton("Return Date");
		r7.setBounds(890,225,100,25);
		r7.addActionListener(this);
		r7.setFont(new Font("times new roman",Font.PLAIN,16));
		r7.setBackground(new Color(204,204,255));			
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		bg.add(r5);
		bg.add(r6);
		bg.add(r7);
		
		
		dtm=new DefaultTableModel();
		tb1=new JTable(dtm);
		JScrollPane jsp=new JScrollPane(tb1);
		jsp.setBounds(30,265,950,390);			
		
		if(f==1)
		{
			tf1.setText(id);
			b1.setEnabled(false);
			tf1.setFocusable(false); //prevent to get focused
			//OR
			//tf1.setEditable(false); //prevent editing
			
			String head[]= {"Item Id","Item Name","Issued Date","Return Date","Type"};
			String col[]= {"books.bid","bname","isdate","retdate","type"};
			String q="select books.bid,bname,isdate,retdate,type from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid="+id+" and retdate is null and isdate is not null";
			DbOps db1=new DbOps();
			db1.fillJTable(dtm,col,head,q);
			r3.setText("Issue Date");	
			r4.setText("Return Date");
			r5.setText("Type");
			r6.setVisible(false);
			r7.setVisible(false);
		}
		else
		{
			String head[]= {"StID","Student Name","Item ID","Item Name","Issue Date","Time Limit","Return Date"};
			String col[]= {"stid","stname","books.bid","bname","isdate","exp_retdate","retdate"};
			String q="select issued.stid,stname,books.bid,bname,isdate,exp_retdate,course,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null and isdate is not null ;";
			DbOps db1=new DbOps();
			db1.fillJTable(dtm,col,head,q);
		}
		
		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(tf2);
		add(l4);
		add(tf3);
		add(b1);
		add(b2);
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(r5);
		add(r6);
		add(r7);
		//add(r8);
		add(jsp);
		add(bs);
		add(tfk);
		
		setSize(1030,850);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String head[]= {"StID","Student Name","Item ID","Item Name","Issue Date","Time Limit","Return Date"};
			String col[]= {"stid","stname","books.bid","bname","isdate","exp_retdate","retdate"};
			String q="select issued.stid,stname,books.bid,bname,isdate,exp_retdate,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid="+tf1.getText()+";";
			DbOps db=new DbOps();
			db.fillJTable(dtm,col,head,q);		
		}
		if(ae.getSource()==b2)
		{ 
			String q="Update issued set retdate='"+tf3.getText()+"' where bid="+tf2.getText()+";";
			DbOps db=new DbOps();
			db.insertToDB(q);

			//to calculate penalty
			long diff=0,cost;
			String s1[]=new String[1];
			String[] s2={"exp_retdate"};
			String q1="select exp_retdate from issued where bid="+tf2.getText()+";";
			DbOps d1=new DbOps();
			s1=d1.getValuesFromDB(q1,s2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            try {
                LocalDate date1 = LocalDate.parse(s1[0], formatter);
                LocalDate date2 = LocalDate.parse(tf3.getText(), formatter);

                diff= ChronoUnit.DAYS.between(date1, date2);
                //resultLabel.setText("Difference: " + Math.abs(daysBetween) + " days");
            } catch (DateTimeParseException ex) {}
                //resultLabel.setText("Invalid date format. Use yyyy-MM-dd.");
            if(diff<=15)
            	cost=diff*10;
            else if(diff>15 && diff<=30)
            	cost=(diff-15)*15+(15*10);
            else
            	cost=(diff-30)*20+(15*10)+(15*15);
            
            String query="insert into challan(stid,bid,delay,fine,paid,remarks)values("+tf1.getText()+","+tf2.getText()+","+diff+","+cost+","+"0"+",'Unpaid');";
            DbOps db1=new DbOps();
			db1.insertToDB(query);


		}
		if(ae.getSource()==bs)
		{
			if(f==1)
			{
				if(r1.isSelected()==true)
				{	
					String h4[]= {"Item Id","Item Name","Issued Date","TimeLimit"};
					String c4[]= {"books.bid","bname","isdate","exp_retdate"};
					String q4="select books.bid,bname,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid='"+id+"' and books.bid like'%"+tfk.getText()+"%' and retdate is null and isdate is not null";
					DbOps db4=new DbOps();
					db4.fillJTable(dtm, c4, h4, q4);	
				}
				if(r2.isSelected()==true)
				{	
					String h4[]= {"Item Id","Item Name","Issued Date","TimeLimit"};
					String c4[]= {"books.bid","bname","isdate","exp_retdate"};
					String q4="select books.bid,bname,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid='"+id+"' and bname like'%"+tfk.getText()+"%' and retdate is null and isdate is not null";
					DbOps db4=new DbOps();
					db4.fillJTable(dtm, c4, h4, q4);	
				}
				if(r3.isSelected()==true)
				{	
					String h4[]= {"Item Id","Item Name","Issued Date","TimeLimit"};
					String c4[]= {"books.bid","bname","isdate","exp_retdate"};
					String q4="select books.bid,bname,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid='"+id+"' and isdate like'%"+tfk.getText()+"%' and retdate is null and isdate is not null";
					DbOps db4=new DbOps();
					db4.fillJTable(dtm, c4, h4, q4);	
				}
				if(r4.isSelected()==true)
				{	
					String h4[]= {"Item Id","Item Name","Issued Date","TimeLimit"};
					String c4[]= {"books.bid","bname","isdate","exp_retdate"};
					String q4="select books.bid,bname,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid='"+id+"' and retdate like'%"+tfk.getText()+"%' and retdate is null and isdate is not null";
					DbOps db4=new DbOps();
					db4.fillJTable(dtm, c4, h4, q4);
				}
				if(r5.isSelected()==true)
				{	
					
					String h4[]= {"Item Id","Item Name","Issued Date","TimeLimit"};
					String c4[]= {"books.bid","bname","isdate","exp_retdate"};
					String q4="select books.bid,bname,isdate,exp_retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where issued.stid='"+id+"' and type like'%"+tfk.getText()+"%' and retdate is null and isdate is not null";
					DbOps db4=new DbOps();
					db4.fillJTable(dtm, c4, h4, q4);
				}
			}
			else
			{
				if(r1.isSelected()==true)
				{	
					String head[]= {"StID","Student Name","Item ID","Item Name","Issue Date","Time Limit","Return Date"};
					String col[]= {"stid","stname","books.bid","bname","isdate","exp_retdate","retdate"};
					String q="select issued.stid,stname,books.bid,bname,isdate,exp_retdate,course,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null and isdate is not null and books.bid like'%"+tfk.getText()+"%';";
					DbOps db1=new DbOps();
					db1.fillJTable(dtm,col,head,q);
	
				}
				if(r2.isSelected()==true)
				{	
					String head[]= {"StID","Student Name","Item ID","Item Name","Issue Date","Time Limit","Return Date"};
					String col[]= {"stid","stname","books.bid","bname","isdate","exp_retdate","retdate"};
					String q="select issued.stid,stname,books.bid,bname,isdate,exp_retdate,course,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null and isdate is not null and bname like'%"+tfk.getText()+"%';";
					DbOps db1=new DbOps();
					db1.fillJTable(dtm,col,head,q);	
				}
				if(r3.isSelected()==true)
				{	
					String head[]= {"StID","Student Name","Item ID","Item Name","Issue Date","Time Limit","Return Date"};
					String col[]= {"stid","stname","books.bid","bname","isdate","exp_retdate","retdate"};
					String q="select issued.stid,stname,books.bid,bname,isdate,exp_retdate,course,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null and isdate is not null and issued.stid like'%"+tfk.getText()+"%';";
					DbOps db1=new DbOps();
					db1.fillJTable(dtm,col,head,q);	
				}
				if(r4.isSelected()==true)
				{	
					String head[]= {"StID","Student Name","Item ID","Item Name","Issue Date","Time Limit","Return Date"};
					String col[]= {"stid","stname","books.bid","bname","isdate","exp_retdate","retdate"};
					String q="select issued.stid,stname,books.bid,bname,isdate,exp_retdate,course,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null and isdate is not null and stname like'%"+tfk.getText()+"%';";
					DbOps db1=new DbOps();
					db1.fillJTable(dtm,col,head,q);
				}
				if(r5.isSelected()==true)
				{	
					
					String head[]= {"StID","Student Name","Item ID","Item Name","Issue Date","Time Limit","Return Date"};
					String col[]= {"stid","stname","books.bid","bname","isdate","exp_retdate","retdate"};
					String q="select issued.stid,stname,books.bid,bname,isdate,exp_retdate,course,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null and isdate is not null and exp_retdate like'%"+tfk.getText()+"%';";
					DbOps db1=new DbOps();
					db1.fillJTable(dtm,col,head,q);
				}
				if(r6.isSelected()==true)
				{	
					String head[]= {"StID","Student Name","Item ID","Item Name","Issue Date","Time Limit","Return Date"};
					String col[]= {"stid","stname","books.bid","bname","isdate","exp_retdate","retdate"};
					String q="select issued.stid,stname,books.bid,bname,isdate,exp_retdate,course,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null and isdate is not null and isdate like'%"+tfk.getText()+"%';";
					DbOps db1=new DbOps();
					db1.fillJTable(dtm,col,head,q);
				}
				if(r7.isSelected()==true)
				{	
					String head[]= {"StID","Student Name","Item ID","Item Name","Issue Date","Time Limit","Return Date"};
					String col[]= {"stid","stname","books.bid","bname","isdate","exp_retdate","retdate"};
					String q="select issued.stid,stname,books.bid,bname,isdate,exp_retdate,course,retdate from issued inner join books on books.bid=issued.bid  inner join student on student.stid=issued.stid inner join course on course.cid=issued.cid where retdate is null and isdate is not null and retdate like'%"+tfk.getText()+"%';";
					DbOps db1=new DbOps();
					db1.fillJTable(dtm,col,head,q);
				}
				
			}
		}
	}
	public void keyReleased(KeyEvent ke)
	{
		if(ke.getSource()==tf2)
		{
			LocalDate date=LocalDate.now();
			tf3.setText(date.toString());
		}
	}
	public void keyPressed(KeyEvent ke)
	{	}
	public void keyTyped(KeyEvent ke)
	{}
	/*public static void main(String [] ar)
	{
		new Return();
	}*/
}
