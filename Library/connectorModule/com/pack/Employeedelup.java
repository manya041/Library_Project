package com.pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Employeedelup extends JFrame implements ActionListener,ItemListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JScrollPane js;
	JTextArea ta;
	JButton b1,b2,b3;
	JComboBox cb;
	String tt="",bt="";
	int flag;
	//String s1[]= {"Teacher","Librarian","Peon","OTHERS"};
	Employeedelup(String bt,int flag)
	{
		this.bt=bt;					//give value of bt passes from admin to bt of employeedelup
		this.flag=flag;
	
		tt=bt;
		getContentPane().setBackground(new Color(204,255,255));
		l1=new JLabel("EMPLOYEE REGISTRATION");
		l1.setBounds(80,30,350,30);
		l1.setFont(new Font("times new roman",Font.BOLD,24));
		
		l2=new JLabel("EMPLOYEE ID");
		l2.setBounds(80,120,120,20);
		l2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf1=new JTextField("");
		tf1.setBounds(240,120,130,20);
		tf1.setFont(new Font("times new roman",Font.PLAIN,16));
		b3=new JButton("Search");
		b3.setBounds(380,120,80,20);
		b3.setFont(new Font("times new roman",Font.PLAIN,16));
		b3.addActionListener(this);
		add(b3);
		l3=new JLabel("EMPLOYEE NAME");
		l3.setBounds(80,160,140,20);
		l3.setFont(new Font("times new roman",Font.PLAIN,16));
		tf2=new JTextField("");
		tf2.setBounds(240,160,150,20);
		tf2.setFont(new Font("times new roman",Font.PLAIN,16));
		l4=new JLabel("DESIGNATION");
		l4.setBounds(80,200,140,20);
		l4.setFont(new Font("times new roman",Font.PLAIN,16));
		tf3=new JTextField("");
		tf3.setBounds(240,200,150,20);
		tf3.setFont(new Font("times new roman",Font.PLAIN,16));
		tf3.setVisible(false);
		cb=new JComboBox();
		cb.setBounds(240,200,150,20);
		cb.setFont(new Font("times new roman",Font.PLAIN,16));
		cb.addItemListener(this);
		add(cb);
		
		l5=new JLabel("MOBILE NO");
		l5.setBounds(80,240,150,20);
		l5.setFont(new Font("times new roman",Font.PLAIN,16));
		tf4=new JTextField("");
		tf4.setBounds(240,240,150,20);
		tf4.setFont(new Font("times new roman",Font.PLAIN,16));
		l6=new JLabel("CITY");
		l6.setBounds(80,280,150,20);
		l6.setFont(new Font("times new roman",Font.PLAIN,16));
		tf5=new JTextField("");
		tf5.setBounds(240,280,150,20);
		tf5.setFont(new Font("times new roman",Font.PLAIN,16));
		l7=new JLabel("ADDRESS");
		l7.setBounds(80,320,150,20);
		l7.setFont(new Font("times new roman",Font.PLAIN,16));
		ta=new JTextArea("");
		ta.setBounds(240,320,150,70);
		ta.setFont(new Font("times new roman",Font.PLAIN,16));
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(240,320,150,70);
		add(js);
		
		b1=new JButton(tt);
		b1.addActionListener(this);
		b1.setBounds(120,420,80,30);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		b2=new JButton("Cancel");
		b2.addActionListener(this);
		b2.setBounds(240,420,80,30);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		if(flag==0)
		{
			tf2.setEnabled(false);
			tf3.setEnabled(false);
			tf4.setEnabled(false);
			tf5.setEnabled(false);
			cb.setEnabled(false);
			ta.setEnabled(false);
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
		add(tf5);
		add(l7);
		//add(ta);
		add(b1);
		add(b2);
		
		DbOps db=new DbOps();
		db.fillcombo(cb,"job","jid","job");
		
		
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
			
			query ob=new query();		//create query object			
			DbOps db=new DbOps();		//create dbOps object(database)

			
			if(tf3.isVisible()==true)			//check visibilty (true by default)
			{
				System.out.println("Subject Block Executed ");
				
				s1[0]="job";		//for inserting in job table
				s2[0]=tf3.getText();
				String tbn="job";
				
				String q=ob.insertQuery(tbn,s1,s2);		//retrun query statement
				System.out.println(q);
				db.insertToDB(q);		//connect eclipse and sql (take query and send it to database) 
				db=new DbOps();
				db.fillcombo(cb,"job","jid","job");
				cb.setVisible(true);
				tf3.setVisible(false);
			}   
			if(flag==0)
			{
				String tb="employee";
				String st="eid";	
				String st2= tf1.getText();
			
				String q=ob.deleteQuery(tb,st,st2);		//object already created at above
				db=new DbOps();
				db.deleteToDB(q);
				
			}
			
			if(flag==1 )
			{
				String tb="employee";
				String str1=cb.getSelectedItem().toString();		
				str1=str1.substring(0,str1.indexOf("-"));	//to get the jid from the selected option
				
				
				String s5[]= {"ename","jid","mob","city","address"};	
				String s6[]= {tf2.getText(),str1,tf4.getText(),tf5.getText(),ta.getText()};
			
				String st="eid";
				String st1=tf1.getText();
				String q=ob.updateQuery(tb,s5,s6,st,st1);		//object already created at above
				db=new DbOps();
				db.updateToDB(q);
			}
					
			dispose();
			new Employeedelup(bt,flag);
		}
		if(ae.getSource()==b2)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setVisible(false);
			tf5.setVisible(false);
			cb.setSelectedIndex(0);
				
		}
		if(ae.getSource()==b3)
		{
			tf2.setEnabled(true);
			tf4.setEnabled(true);
			cb.setEnabled(true);
			tf5.setEnabled(true);
			ta.setEnabled(true);
			
			String str=tf1.getText();
			String q="select ename,jid,mob,city,address from employee where eid="+str;
			String cols[]= {"ename","jid","mob","city","address"};
			DbOps db=new DbOps();
			System.out.println(q);
			String s[]=db.getValuesFromDB(q,cols);	
			for(int k=0;k<s.length;k++)
				System.out.println(s[k]+",");
			
			tf2.setText(s[0]);
			int a=Integer.parseInt(s[1]);
			cb.setSelectedIndex(a);
			tf4.setText(s[2]);
			tf5.setText(s[3]);
			ta.setText(s[4]);
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==cb)
		{
			if(cb.getSelectedItem().equals("Others"))
			{
				tf3.setVisible(true);
				cb.setVisible(false);
			}
		}
		
	}
	/*public static void main(String[] args)
	{
		new Employeedelup();
	}*/
}

