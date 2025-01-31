package com.pack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Student extends JFrame implements ActionListener,ItemListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JScrollPane js;
	JTextArea ta;
	JButton b1,b2;
	JComboBox cb1;
	//String str[]= {"B.Tech","B.C.A","Bsc","OTHERS"};
	Student()
	{
		getContentPane().setBackground(new Color(255,255,153));
		l1=new JLabel("STUDENT REGISTRATION");
		l1.setBounds(90,30,300,30);
		l1.setFont(new Font("times new roman",Font.BOLD,24));
		
		l2=new JLabel("STUDENT ID");
		l2.setBounds(80,120,90,20);
		l2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf1=new JTextField("");
		tf1.setBounds(240,120,150,20);
		tf1.setFont(new Font("times new roman",Font.PLAIN,16));
		l3=new JLabel("STUDENT NAME");
		l3.setBounds(80,160,120,20);
		l3.setFont(new Font("times new roman",Font.PLAIN,16));
		tf2=new JTextField("");
		tf2.setBounds(240,160,150,20);
		tf2.setFont(new Font("times new roman",Font.PLAIN,16));
		l4=new JLabel("COURSE");
		l4.setBounds(80,200,140,20);
		l4.setFont(new Font("times new roman",Font.PLAIN,16));
		tf3=new JTextField("");
		tf3.setBounds(240,200,150,20);
		tf3.setFont(new Font("times new roman",Font.PLAIN,16));
		tf3.setVisible(false);
		cb1=new JComboBox();
		cb1.setBounds(240,200,150,20);
		cb1.setFont(new Font("times new roman",Font.PLAIN,16));
		cb1.addItemListener(this);
		add(cb1);
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
		ta.setFont(new Font("times new roman",Font.PLAIN,16));
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(240,320,150,70);
		add(js);
		
		b1=new JButton("Submit");
		b1.addActionListener(this);
		b1.setBounds(120,420,80,30);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		b2=new JButton("Cancel");
		b2.addActionListener(this);
		b2.setBounds(240,420,80,30);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		
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
		db.fillcombo(cb1,"course","cid","course");
		
		
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
				
				s1[0]="Course";		//for inserting in course table
				s2[0]=tf3.getText();
				String tbn="course";
				
				String q=ob.insertQuery(tbn,s1,s2);		//retrun query statement
				System.out.println(q);
				db.insertToDB(q);		//connect eclipse and sql (take query and send it to database) 
				db=new DbOps();
				db.fillcombo(cb1,"course","cid","course");
				cb1.setVisible(true);
				tf3.setVisible(false);
			}   
			String str1;
			
			str1=cb1.getSelectedItem().toString();		//.toString():-convert to string
			str1=str1.substring(0,str1.indexOf("-"));	//to get the cid from the selected option
			
			//System.out.println(str1);
			String tb="student";
			String s5[]= {"stid","stname","cid","mob","city","address"};	
			String s6[]= {tf1.getText(),tf2.getText(),str1,tf4.getText(),tf5.getText(),ta.getText()};
		
			String q=ob.insertQuery(tb,s5,s6);		//object already created at above
			System.out.println(q);
			db=new DbOps();
			db.insertToDB(q);
		
			dispose();
			new Student();
		}
		if(ae.getSource()==b2)
		{
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setVisible(false);
			tf5.setVisible(false);
			cb1.setSelectedIndex(0);
				
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==cb1)
		{
			if(cb1.getSelectedItem().equals("Others"))
			{
				tf3.setVisible(true);
				cb1.setVisible(false);
			}
		}
	}
	/*public static void main(String[] args)
	{
		new Student();
	}*/

}
