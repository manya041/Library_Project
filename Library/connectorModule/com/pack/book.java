package com.pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class book extends JFrame implements ActionListener,ItemListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,le;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JButton b1,b2;
	String title="";
	String tt="";
	String kk="";
	JComboBox jb1,jb2;
	String st1="",st2="",st3="",st4="",st5="",st6="",bt="",typ="";
	int cflag=0,a,b,f=0;
	
	book(String bt,String typ,int f)
	{
		this.bt=bt;					//give value of bt passes from admin to bt of books
		this.typ=typ;
		this.f=f;
		
		getContentPane().setBackground(new Color(255,229,204));
		title=bt+" REGISTRATION";
		//title=title.toUpperCase();
		tt=bt+" NAME";
		//tt=tt.toUpperCase();
		kk=typ;
		l1=new JLabel(title);
		l1.setBounds(90,30,350,30);
		l1.setFont(new Font("times new roman",Font.BOLD,24));
		
		l2=new JLabel(kk);
		l2.setBounds(80,120,90,20);
		l2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf1=new JTextField();
		tf1.setBounds(250,120,150,20);
		tf1.setFont(new Font("times new roman",Font.PLAIN,12));
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
		
		b1=new JButton("Submit");
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
			
			if(tf5.isVisible()==true && f==1)			//check visibilty (isVisible():-true by default)
			{
				System.out.println("Subject Block Executed ");
				
				s1[0]="sub";		//for inserting in subject table
				s2[0]=tf5.getText();
				String tbn="subject";
				
				String q=ob.insertQuery(tbn,s1,s2);		//return query statement
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
			if(f==1)
			{
				String str1,str2;
				str1=jb2.getSelectedItem().toString();		//jb2 language table
				str1=str1.substring(0,str1.indexOf("-"));	//to get the sid from the selected option
				
				str2=jb1.getSelectedItem().toString();		//.toString():-convert to string
				str2=str2.substring(0,str2.indexOf("-"));	//to get the sid from the selected option
				
				System.out.println(str1+" "+str2);
				String tb="books";
				String s5[]= {"bid","bname","lid","sid","author","type"};	
				String s6[]= {tf1.getText(),tf2.getText(),str1,str2,tf3.getText(),"books"};
			
				String q=ob.insertQuery(tb,s5,s6);		//object already created at above
				db=new DbOps();
				db.insertToDB(q);
			}			
			if(f==2)
			{
				String str1;
				str1=jb2.getSelectedItem().toString();		//jb2 language table
				str1=str1.substring(0,str1.indexOf("-"));	//to get the lid from the selected option
				
				
				String tb="books";
				String s5[]= {"bid","bname","lid","pub","type"};	
				String s6[]= {tf1.getText(),tf2.getText(),str1,tf3.getText(),"Magzine"};
			
				String q=ob.insertQuery(tb,s5,s6);		//object already created at above
				db=new DbOps();
				db.insertToDB(q);
			}			
			if(f==3)
			{
				String str1;
				str1=jb2.getSelectedItem().toString();		//jb2 language table
				str1=str1.substring(0,str1.indexOf("-"));	//to get the lid from the selected option
				
				String tb="books";
				String s5[]= {"bid","bname","lid","pub","Date","type"};	
				String dt="'"+tf5.getText()+"'";
				String s6[]= {tf1.getText(),tf2.getText(),str1,tf3.getText(),dt,"Newspaper"};
			
				String q=ob.insertQuery(tb,s5,s6);		//object already created at above
				System.out.println(q);
				db=new DbOps();
				db.insertToDB(q);
			}			
			
			dispose();
			new book(bt,typ,f);
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
			//cflag=1;
		}
		if(ie.getSource()==jb2 )
		{
			if(jb2.getSelectedItem().equals("Others"))
			{
				tf4.setVisible(true);
				jb2.setVisible(false);
			}
			//cflag=1;
		}
	}
	/*
	public static void main(String[] args)
	{
		new book();
	}
	*/
}
