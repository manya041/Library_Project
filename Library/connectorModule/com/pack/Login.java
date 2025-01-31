package com.pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends JFrame implements ActionListener,FocusListener
{
	JLabel l,ls,ls1,lf,lf1,le1,le2,l1,l2,l3,l4,cp;
	JTextField tf1,tf2;
	JRadioButton rb1,rb2,rb3,rb4;
	JButton b1,b2;
	JPanel jp1,jp2;
	JTabbedPane tp1;
	int f=0,f1=0;
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	Login()
	{
		jp1=new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp1.setBackground(Color.WHITE);
		jp1.setBounds(0,0,800,50);
		ImageIcon img=new ImageIcon("C:\\Users\\USER\\OneDrive\\Pictures\\Saved Pictures\\kk1.jpg");
		l=new JLabel(img);
		
		l1=new JLabel("LIBRARY MANAGEMENT");
		l1.setFont(new Font("times new roman",Font.BOLD,26));

		jp1.add(l);
		jp1.add(l1);
		
		ImageIcon im=new ImageIcon("C:\\Users\\USER\\OneDrive\\Pictures\\Saved Pictures\\0021.jpg");
		le1=new JLabel(im);
		le1.setBounds(0,0,450,450);
		
		jp2=new JPanel();
		jp2.setLayout(null);
		jp2.setBackground(new Color(0,0,153));
		jp2.setBounds(440,50,400,360);
		ImageIcon imc=new ImageIcon("C:\\Users\\USER\\Downloads\\pk-removebg-preview (1).png");
		
		le2=new JLabel(imc);
		le2.setBounds(50,20,50,50);
		jp2.add(le2);
		
		l2=new JLabel("LOGIN ");
		l2.setBounds(120,20,150,50);
		l2.setFont(new Font("times new roman",Font.BOLD,30));
		l2.setForeground(Color.WHITE);
		rb1=new JRadioButton("Student");
		rb1.setBounds(15,85,80,20);
		rb1.addActionListener(this);
		rb1.setBackground(new Color(0,0,153));
		rb1.setFont(new Font("times new roman",Font.PLAIN,16));
		rb1.setForeground(Color.WHITE);
		rb2=new JRadioButton("Admin");
		rb2.setBounds(95,85,70,20);
		rb2.addActionListener(this);
		rb2.setBackground(new Color(0,0,153));
		rb2.setFont(new Font("times new roman",Font.PLAIN,16));
		rb2.setForeground(Color.WHITE);
		rb3=new JRadioButton("Librarian");
		rb3.setBounds(170,85,80,20); 
		rb3.addActionListener(this);
		rb3.setBackground(new Color(0,0,153));
		rb3.setFont(new Font("times new roman",Font.PLAIN,16));
		rb3.setForeground(Color.WHITE);
		rb4=new JRadioButton("Faculty");
		rb4.setBounds(265,85,80,20); 
		rb4.addActionListener(this);
		rb4.setBackground(new Color(0,0,153));
		rb4.setFont(new Font("times new roman",Font.PLAIN,16));
		rb4.setForeground(Color.WHITE);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		
		l3=new JLabel("Login ID");
		l3.setBounds(50,140,70,20);
		l3.setFont(new Font("times new roman",Font.PLAIN,16));
		l3.setForeground(Color.WHITE);
		tf1=new JTextField("");
		tf1.setBounds(120,140,160,20);
		tf1.setFont(new Font("times new roman",Font.PLAIN,16));
		l4=new JLabel("Password");
		l4.setBounds(50,190,70,20);
		l4.setFont(new Font("times new roman",Font.PLAIN,16));
		l4.setForeground(Color.WHITE);
		tf2=new JTextField("");
		tf2.setBounds(120,190,160,20);
		tf2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf2.addFocusListener(this);
		
		ls=new JLabel("*The user name or password provided");
		ls.setBounds(50,210,250,20);
		ls.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,12));
		ls.setForeground(Color.RED);
		ls.setVisible(false);
		ls1=new JLabel("is wrong");
		ls1.setBounds(55,225,250,20);
		ls1.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,12));
		ls1.setForeground(Color.RED);
		ls1.setVisible(false);
		cp=new JLabel("Create   Password");
		cp.setBounds(125,215,250,20);
		cp.setFont(new Font("Georgia",Font.ITALIC,12));
		cp.setForeground(new Color(102,178,255));
		cp.setVisible(false);
		
		b1=new JButton("Login");
		b1.addActionListener(this);
		b1.setBounds(90,260,150,30);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		b1.setBackground(new Color(0,128,255));
		b1.setForeground(Color.WHITE);
		b2=new JButton("Cancel");
		b2.addActionListener(this);
		b2.setBounds(90,310,150,30);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		b2.setBackground(new Color(255,0,0));
		b2.setForeground(Color.WHITE);
		
		lf=new JLabel("*Mandatory to fill");
		lf.setBounds(120,160,250,20);
		lf.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,12));
		lf.setForeground(Color.RED);
		lf.setVisible(false);
		
		lf1=new JLabel("*Mandatory to fill");
		lf1.setBounds(120,210,250,20);
		lf1.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,12));
		lf1.setForeground(Color.RED);
		lf1.setVisible(false);
		
		jp2.add(l2);
		jp2.add(rb1);
		jp2.add(rb2);
		jp2.add(rb3);
		jp2.add(rb4);
		jp2.add(l3);
		jp2.add(tf1);
		jp2.add(l4);
		jp2.add(tf2);
		jp2.add(b1);
		jp2.add(b2);
		jp2.add(ls);
		jp2.add(ls1);
		jp2.add(cp);
		jp2.add(lf);
		jp2.add(lf1);
		
		add(jp1);
		add(jp2);
		add(le1);
		
		setSize(800,440);
		setLayout(null);
		setVisible(true);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if(tf1.getText().equals(""))
			{
				lf.setVisible(true);
				ls.setVisible(false);
				ls1.setVisible(false);
				
			}
			else
				lf.setVisible(false);
			
			if(tf2.getText().equals(""))
			{
				lf1.setVisible(true);
				ls.setVisible(false);
				ls1.setVisible(false);
			}
			else
				lf1.setVisible(false);
			
			if(rb1.isSelected())
			{
				String str="";
				String q1="select stname from login inner join student on student.stid=login.uid where pass='"+tf2.getText()+"'";				
				String q="Select stname from student where stid="+tf1.getText();
				
				if(f==1 &&  f1==0)
				{
					try{  
						Class.forName("com.mysql.cj.jdbc.Driver");  
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
						st=con.createStatement();
						rs=st.executeQuery(q);
						if(rs.next())
						{
							str=rs.getString("stname");
							new student_dashboard(str,tf1.getText(),0);
						}
						else
						{
							cp.setVisible(false);
							tf1.setText("");
							tf2.setText("");
							ls.setVisible(true);
							ls1.setVisible(true);
							lf.setVisible(false);
							lf1.setVisible(false);
						}
						
						con.close();
						st.close();
						rs=null;
						
						System.out.print(q);
					}catch(Exception e){ System.out.println(e);}
	
					String col[]= {"uid","pass","type"};
					String val[]= {tf1.getText(),tf2.getText(),rb1.getText()};
					String tb="login";
					query ob=new query();
					String query=ob.insertQuery(tb,col,val);
					DbOps db2=new DbOps();
					db2.insertToDB(query);
				
				}
				if(f1==1)
				{
					try{  
						Class.forName("com.mysql.cj.jdbc.Driver");  
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
						st=con.createStatement();
						rs=st.executeQuery(q1);
						if(rs.next())
						{
							str=rs.getString("stname");
							new student_dashboard(str,tf1.getText(),0);
						}
						else
						{
							cp.setVisible(false);
							tf1.setText("");
							tf2.setText("");
							ls.setVisible(true);
							ls1.setVisible(true);
							//lf.setVisible(false);
							//lf1.setVisible(false);
						}
				
						con.close();
						st.close();
						rs=null;
						
						System.out.print(q1);
					}catch(Exception e){ System.out.println(e);}							
						
				}
			}
			if(rb2.isSelected())
			{
				
				String q="Select ename from employee where eid="+tf1.getText();
				String q1="select ename from login inner join employee on employee.eid=login.uid where pass='"+tf2.getText()+"'";
				if(f==1 && f1==0)
				{
					try{  
						Class.forName("com.mysql.cj.jdbc.Driver");  
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
						st=con.createStatement();
						rs=st.executeQuery(q);
						if(rs.next())
						{
							String str2=rs.getString("ename");
							new admin_dashboard(str2,tf1.getText());
						}
						else
						{
							cp.setVisible(false);
							tf1.setText("");
							tf2.setText("");
							ls.setVisible(true);
							ls1.setVisible(true);
							//lf.setVisible(false);
							//lf1.setVisible(false);
						}
						
						con.close();
						st.close();
						rs=null;
					
						//System.out.print("Connection Successfull ");
					}catch(Exception e){ System.out.println(e);}

					String col[]= {"uid","pass","type"};
					String val[]= {tf1.getText(),tf2.getText(),rb2.getText()};
					String tb="login";
					query ob=new query();
					String query=ob.insertQuery(tb,col,val);
					DbOps db2=new DbOps();
					db2.insertToDB(query);
				
				}
				if(f1==1)
				{
					try{  
						Class.forName("com.mysql.cj.jdbc.Driver");  
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
						st=con.createStatement();
						rs=st.executeQuery(q1);
						if(rs.next())
						{
							String str2=rs.getString("ename");
							new admin_dashboard(str2,tf1.getText());
						}
						else
						{
							tf1.setText("");
							tf2.setText("");
							ls.setVisible(true);
							ls1.setVisible(true);

							//lf.setVisible(false);
							//lf1.setVisible(false);
						}
						
						con.close();
						st.close();
						rs=null;
						
						System.out.print(q1);
					}catch(Exception e){ System.out.println(e);}
					
				}
			}
			if(rb3.isSelected())
			{
				String str3="";
				String q="Select ename  from employee where eid="+tf1.getText();
				String q1="select ename from login inner join employee on employee.eid=login.uid where pass='"+tf2.getText()+"'";
				if(f==1 && f1==0)
				{
					try{  
						Class.forName("com.mysql.cj.jdbc.Driver");  
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
						st=con.createStatement();
						rs=st.executeQuery(q);
						if(rs.next())
						{
							str3=rs.getString("ename");
							new librarian_dashboard(str3,tf1.getText());
						}
						else
						{
							cp.setVisible(false);
							tf1.setText("");
							tf2.setText("");
							ls.setVisible(true);
							ls1.setVisible(true);
							//lf.setVisible(false);
							//lf1.setVisible(false);
						}
						
						con.close();
						st.close();
						rs=null;
						
						//System.out.print("Connection Successfull ");
					}catch(Exception e){ System.out.println(e);}
				
					String col[]= {"uid","pass","type"};
					String val[]= {tf1.getText(),tf2.getText(),rb3.getText()};
					String tb="login";
					query ob=new query();
					String query=ob.insertQuery(tb,col,val);
					DbOps db2=new DbOps();
					db2.insertToDB(query);
				
				}
				if(f1==1)
				{
					try{  
						Class.forName("com.mysql.cj.jdbc.Driver");  
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
						st=con.createStatement();
						rs=st.executeQuery(q1);
						if(rs.next())
						{	
							str3=rs.getString("ename");
							new librarian_dashboard(str3,tf1.getText());
						}
						else
						{
							tf1.setText("");
							tf2.setText("");
							ls.setVisible(true);
							ls1.setVisible(true);
							lf.setVisible(false);
							lf1.setVisible(false);
						}
						
						con.close();
						st.close();
						rs=null;
						
					System.out.print(q1);
					}catch(Exception e){ System.out.println(e);}
					
				}
			}

		}
		if(rb4.isSelected())
		{
			String str3="";
			String q="Select ename  from employee where eid="+tf1.getText();
			String q1="select ename from login inner join employee on employee.eid=login.uid where pass='"+tf2.getText()+"'";
			if(f==1 && f1==0)
			{
				try{  
					Class.forName("com.mysql.cj.jdbc.Driver");  
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
					st=con.createStatement();
					rs=st.executeQuery(q);
					if(rs.next())
					{
						str3=rs.getString("ename");
						new student_dashboard(str3,tf1.getText(),1);
					}
					else
					{
						cp.setVisible(false);
						tf1.setText("");
						tf2.setText("");
						ls.setVisible(true);
						ls1.setVisible(true);
						lf.setVisible(false);
						lf1.setVisible(false);
					}
					
					con.close();
					st.close();
					rs=null;
					
					//System.out.print("Connection Successfull ");
				}catch(Exception e){ System.out.println(e);}
			
				String col[]= {"uid","pass","type"};
				String val[]= {tf1.getText(),tf2.getText(),rb4.getText()};
				String tb="login";
				query ob=new query();
				String query=ob.insertQuery(tb,col,val);
				DbOps db2=new DbOps();
				db2.insertToDB(query);
			
			}
			if(f1==1)
			{
				try{  
					Class.forName("com.mysql.cj.jdbc.Driver");  
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
					st=con.createStatement();
					rs=st.executeQuery(q1);
					if(rs.next())
					{	
						str3=rs.getString("ename");
						new student_dashboard(str3,tf1.getText(),1);
					}
					else
					{
						tf1.setText("");
						tf2.setText("");
						ls.setVisible(true);
						ls1.setVisible(true);
						lf.setVisible(false);
						lf1.setVisible(false);
					}
					
					con.close();
					st.close();
					rs=null;
					
				System.out.print(q1);
				}catch(Exception e){ System.out.println(e);}
				
			}
		}
	
		if(ae.getSource()==b2)
		{
			tf1.setText("");
			tf2.setText("");
		}
	}
	public void focusGained(FocusEvent fe)
	{
		if(fe.getSource()==tf2)
		{
			String str=tf1.getText();
			if(rb1.isSelected())
			{
				String tnm="student";
				String cnm="stid";
				DbOps db=new DbOps();
				Boolean b=db.validateUser(tnm,cnm,str);
				
				String tb="login";
				String cn="uid";
				DbOps db1=new DbOps();
				Boolean b1=db1.validateUser(tb,cn,str);
				
				if(b==true)
				{
					cp.setVisible(true);
					f=1;
				}
				if(b1==true)
				{
					cp.setVisible(false);
					f1=1;
				}
				
			}
			if(rb2.isSelected())
			{
				String tnm="employee";
				String cnm="eid";
				DbOps db=new DbOps();
				Boolean b=db.validateUser(tnm,cnm,str);
				
				String tb="login";
				String cn="uid";
				DbOps db1=new DbOps();
				Boolean b1=db1.validateUser(tb,cn,str);
				
				if(b==true)
				{
					cp.setVisible(true);
					f=1;
				}
				if(b1==true)
				{
					cp.setVisible(false);
					f1=1;
				}
				
			 }
			if(rb3.isSelected())
			{
				String tnm="employee";
				String cnm="eid";
				DbOps db=new DbOps();
				Boolean b=db.validateUser(tnm,cnm,str);
				
				String tb="login";
				String cn="uid";
				DbOps db1=new DbOps();
				Boolean b1=db1.validateUser(tb,cn,str);
				
				if(b==true)
				{
					cp.setVisible(true);
					f=1;
				}
				if(b1==true)
				{
					cp.setVisible(false);
					f1=1;
				}
				
			 }
		 
			if(rb4.isSelected())
			{
				String tnm="employee";
				String cnm="eid";
				DbOps db=new DbOps();
				Boolean b=db.validateUser(tnm,cnm,str);
				
				String tb="login";
				String cn="uid";
				DbOps db1=new DbOps();
				Boolean b1=db1.validateUser(tb,cn,str);
				
				if(b==true)
				{
					cp.setVisible(true);
					f=1;
				}
				if(b1==true)
				{
					cp.setVisible(false);
					f1=1;
				}
			 }
		}
			
	}
	public void focusLost(FocusEvent fe)
	{}
	public static void main(String [] ar)
	{
		new Login();
	}
	
}
