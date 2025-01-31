package com.pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class bookdelup extends JFrame implements ActionListener,ItemListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,le;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JButton b1,b2,b3;
	String title="";
	String tt="";
	String kk="";
	String bk="";
	JComboBox jb1,jb2;
	String bt="",st="";
	String typ="";
	int f,flag;
	
	bookdelup(String bt,String st,String typ,int f,int flag)
	{
		getContentPane().setBackground(new Color(255,229,204));
		this.bt=bt;					//give value of bt passes from admin to bt of bookdelup
		this.typ=typ;
		this.f=f;
		this.flag=flag;
		this.st=st;
		
		title=bt+" REGISTRATION";
		//title=title.toUpperCase();
		tt=bt+" NAME";
		//tt=tt.toUpperCase();
		kk=typ;
		bk=st;
		l1=new JLabel(title);  
		l1.setBounds(90,30,350,30);
		l1.setFont(new Font("times new roman",Font.BOLD,24));
		
		l2=new JLabel(bk);
		l2.setBounds(80,120,90,20);
		l2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf1=new JTextField();
		tf1.setBounds(250,120,130,20);
		tf1.setFont(new Font("times new roman",Font.PLAIN,16));
		b3=new JButton("Search");
		b3.setBounds(390,120,80,20);
		b3.setFont(new Font("times new roman",Font.PLAIN,16));
		b3.addActionListener(this);
		add(b3);
		l3=new JLabel(tt);
		l3.setBounds(80,160,200,20);
		l3.setFont(new Font("times new roman",Font.PLAIN,16));
		tf2=new JTextField("");
		tf2.setBounds(250,160,150,20);
		tf2.setFont(new Font("times new roman",Font.PLAIN,16));
		l4=new JLabel("PUBLICATION");
		l4.setBounds(80,200,150,20);
		l4.setFont(new Font("times new roman",Font.PLAIN,16));
		tf3=new JTextField();
		tf3.setBounds(250,200,150,20);
		tf3.setFont(new Font("times new roman",Font.PLAIN,16));
		
		l5=new JLabel("LANGUAGE");
		l5.setBounds(80,240,150,20);
		l5.setFont(new Font("times new roman",Font.PLAIN,16));
		jb2=new JComboBox();
		jb2.setBounds(250,240,150,20);
		jb2.setFont(new Font("times new roman",Font.PLAIN,16));
		jb2.addItemListener(this);
		tf4=new JTextField();
		tf4.setBounds(250,240,150,20);
		tf4.setFont(new Font("times new roman",Font.PLAIN,16));
		l6=new JLabel("SUBJECT");
		l6.setBounds(80,280,150,20);
		l6.setFont(new Font("times new roman",Font.PLAIN,16));
		jb1=new JComboBox();
		jb1.setBounds(250,280,150,20);
		jb1.setFont(new Font("times new roman",Font.PLAIN,16));
		jb1.addItemListener(this);
		tf5=new JTextField();
		tf5.setBounds(250,280,150,20);
		tf5.setFont(new Font("times new roman",Font.PLAIN,16));
		l7=new JLabel("AUTHOR NAME");
		l7.setBounds(80,320,140,20);
		l7.setFont(new Font("times new roman",Font.PLAIN,16));
		tf6=new JTextField("");
		tf6.setBounds(250,320,150,20);
		tf6.setFont(new Font("times new roman",Font.PLAIN,16));
		le=new JLabel("yyyy-mm-dd");
		le.setBounds(250,305,130,15);
		le.setFont(new Font("times new roman",Font.PLAIN,14));
		add(le);
		
		b1=new JButton(kk);
		b1.addActionListener(this);
		b1.setBounds(120,380,80,30);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		b2=new JButton("Cancel");
		b2.addActionListener(this);
		b2.setBounds(240,380,80,30);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		tf5.setVisible(false);
		tf4.setVisible(false);
		le.setVisible(false);
		if(f==2 ||f==3)
		{
			l6.setVisible(false);
			l7.setVisible(false);
			tf5.setVisible(false);
			tf6.setVisible(false);
			jb1.setVisible(false);
		}
		if(flag==0)
		{
			tf2.setEnabled(false);
			tf3.setEnabled(false);
			tf4.setEnabled(false);
			tf5.setEnabled(false);
			tf6.setEnabled(false);
			jb1.setEnabled(false);
			jb2.setEnabled(false);
		}
		if(f==3)
		{
			l8=new JLabel("DATE");
			l8.setBounds(80,280,150,20);
			l8.setFont(new Font("times new roman",Font.PLAIN,16));
			add(l8);
			tf5.setVisible(true);
			le.setVisible(true);
		}
		
		add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(tf2);
		add(l4);
		add(tf3);
		add(l5);
		add(tf4);
		add(l6);
		add(jb1);
		add(l7);
		add(jb2);
		add(b1);
		add(b2);
		add(tf5);
		add(tf6);
		
		DbOps db=new DbOps();
		db.fillcombo(jb1,"Subject","sid","sub");
		db.fillcombo(jb2,"Language","lid","lan");

		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int i=0,j=0;
		if(ae.getSource()==b1)
		{
			String s1[]=new String[1];
			String s2[]=new String[1];
			String s3[]=new String[1];
			String s4[]=new String[1];
			
			query ob=new query();		//create query object			
			DbOps db=new DbOps();		//create dbOps object(database)
			
			if(tf5.isVisible()==true && f==1)			//check visibilty (true by default)
			{
				System.out.println("Subject Block Executed ");
				
				s1[0]="sub";		//for inserting in subject table
				s2[0]=tf5.getText();
				String tbn="subject";
				
				String q=ob.insertQuery(tbn,s1,s2);		//retrun query statement
				System.out.println(q);
				db.insertToDB(q);		//connect eclipse and sql (take query and send it to database) 
				db=new DbOps();
				db.fillcombo(jb1,"Subject","sid","sub");
				jb1.setVisible(true);
				tf5.setVisible(false);
			}   
			
			if(tf4.isVisible()==true)
			{
				System.out.println("Lanuage Block Executed ");
				s3[0]="lan";
				s4[0]=tf4.getText();
				String tb="language";
				String q=ob.insertQuery(tb, s3, s4);		//object already created at above
				db.insertToDB(q);
				db=new DbOps();
				db.fillcombo(jb2,"Language","lid","lan");
				jb2.setVisible(true);
				tf4.setVisible(false);
			}
			
			if(flag==0)
			{
				String tb="books";
				String st="bid";	
				String st2= tf1.getText();
			
				String q=ob.deleteQuery(tb,st,st2);		//object already created at above
				db=new DbOps();
				db.deleteToDB(q);
				
			}
			
			if(flag==1 && f==1)
			{
				String tb="books";
				String str1=jb2.getSelectedItem().toString();		//jb2 language table
				str1=str1.substring(0,str1.indexOf("-"));	//to get the lid from the selected option
				
				String str2=jb1.getSelectedItem().toString();		//.toString():-convert to string
				str2=str2.substring(0,str2.indexOf("-"));	//to get the sid from the selected option
				
				String s5[]= {"bname","lid","sid","pub","author"};	
				String s6[]= {tf2.getText(),str1,str2,tf3.getText(),tf6.getText()};
			
				String st="bid";
				String st1=tf1.getText();
				String q=ob.updateQuery(tb,s5,s6,st,st1);		//object already created at above
				db=new DbOps();
				db.updateToDB(q);
			}
			if(flag==1 && f==2)
			{
				String tb="books";
				String str1=jb2.getSelectedItem().toString();		//jb2 language table
				str1=str1.substring(0,str1.indexOf("-"));	//to get the lid from the selected option
				
				String s5[]= {"bname","lid","pub"};	
				String s6[]= {tf2.getText(),str1,tf3.getText()};
			
				String st="bid";
				String st1=tf1.getText();
				String q=ob.updateQuery(tb,s5,s6,st,st1);		//object already created at above
				db=new DbOps();
				db.updateToDB(q);
			}
			if(flag==1 && f==3)
			{
				String tb="books";
				String str1=jb2.getSelectedItem().toString();		//jb2 language table
				str1=str1.substring(0,str1.indexOf("-"));	//to get the lid from the selected option
				
				String s5[]= {"bname","lid","pub","date"};	
				String dt=tf5.getText();
				String s6[]= {tf2.getText(),str1,tf3.getText(),dt};
			
				String st="bid";
				String st1=tf1.getText();
				String q=ob.updateQuery(tb,s5,s6,st,st1);		//object already created at above
				System.out.println(q);
				db=new DbOps();
				db.updateToDB(q);
			}
			
			dispose();
			new bookdelup(bt,st,typ,f,flag);
		}
		if(ae.getSource()==b2)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf6.setText("");
			jb1.setVisible(true);
			jb2.setVisible(true);
			tf4.setVisible(false);
			tf5.setVisible(false);
			jb1.setSelectedIndex(0);
			jb2.setSelectedIndex(0);
				
		}
		if(ae.getSource()==b3)
		{
			if(f==1)
			{
				tf2.setEnabled(true);
				tf3.setEnabled(true);
				jb1.setEnabled(true);
				jb2.setEnabled(true);
				tf6.setEnabled(true);
				
				String str=tf1.getText();
				String q="select bname,pub,author,sid,lid from books where bid="+str;
				String cols[]= {"bname","pub","author","sid","lid"};
				DbOps db=new DbOps();
				System.out.println(q);
				String s[]=db.getValuesFromDB(q,cols);	
				for(int k=0;k<s.length;k++)
					System.out.println(s[k]+",");
				
				tf2.setText(s[0]);
				tf3.setText(s[1]);
				tf6.setText(s[2]);
				int a=Integer.parseInt(s[3]);
				int b=Integer.parseInt(s[4]);
				jb1.setSelectedIndex(a);
				jb2.setSelectedIndex(b);
			}	
			if(f==2)
			{
				tf2.setEnabled(true);
				tf3.setEnabled(true);
				jb2.setEnabled(true);
				
				String str=tf1.getText();
				String q="select bname,pub,lid from books where bid="+str;
				String cols[]= {"bname","pub","lid"};
				DbOps db=new DbOps();
				System.out.println(q);
				String s[]=db.getValuesFromDB(q,cols);	
				for(int k=0;k<s.length;k++)
					System.out.println(s[k]+",");
				
				tf2.setText(s[0]);
				tf3.setText(s[1]);
				int a=Integer.parseInt(s[2]);
				jb2.setSelectedIndex(a);
			}
			if(f==3)
			{
				tf2.setEnabled(true);
				tf3.setEnabled(true);
				jb2.setEnabled(true);
				tf5.setVisible(true);
				
				String str=tf1.getText();
				String q="select bname,pub,lid,date from books where bid="+str;
				String cols[]= {"bname","pub","lid","date"};
				DbOps db=new DbOps();
				System.out.println(q);
				String s[]=db.getValuesFromDB(q,cols);	
				for(int k=0;k<s.length;k++)
					System.out.println(s[k]+",");
				
				tf2.setText(s[0]);
				tf3.setText(s[1]);
				int a=Integer.parseInt(s[2]);
				jb2.setSelectedIndex(a);
				tf5.setText(s[3]);
			}	
	
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==jb1)
		{
			if(jb1.getSelectedItem().equals("Others"))
			{
				tf5.setVisible(true);
				jb1.setVisible(false);
			}
		}
		if(ie.getSource()==jb2)
		{
			if(jb2.getSelectedItem().equals("Others"))
			{
				tf4.setVisible(true);
				jb2.setVisible(false);
			}
		}
	}
	/*
	public static void main(String[] args)
	{
		new bookdelup();
	}
	*/

}

