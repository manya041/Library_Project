package com.pack;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class Language extends JFrame implements ActionListener
{
	JTextField tf1,tf2;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	JRadioButton rb1,rb2;
	JTable tb1;
	JScrollPane jsp;
	DefaultTableModel dtm;
	Language()
	{
		getContentPane().setBackground(new Color(255,204,153));
		l1=new JLabel("LANGUAGE  EDIT");
		l1.setBounds(110,40,250,30);
		l1.setFont(new Font("times new roman",Font.BOLD,28));
		
		rb1=new JRadioButton("Update");
		rb1.setBounds(120,90,100,20);
		rb1.addActionListener(this);
		rb1.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,16));
		rb1.setBackground(new Color(255,204,153));
		rb2=new JRadioButton("Delete");
		rb2.setBounds(230,90,100,20);
		rb2.addActionListener(this);
		rb2.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,16));
		rb2.setBackground(new Color(255,204,153));
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		l2=new JLabel("LANGUAGE ID");
		l2.setBounds(50,140,140,20);
		l2.setFont(new Font("times new roman",Font.BOLD,16));
		tf1=new JTextField();
		tf1.setBounds(220,140,150,20);
		tf1.setFont(new Font("times new roman",Font.BOLD,16));
		b3=new JButton("Search");
		b3.addActionListener(this);
		b3.setBounds(380,140,80,20);
		b3.setFont(new Font("times new roman",Font.BOLD,16));
		
		l3=new JLabel("LANGUAGE NAME");
		l3.setBounds(50,180,180,20);
		l3.setFont(new Font("times new roman",Font.BOLD,16));
		tf2=new JTextField();
		tf2.setBounds(220,180,150,20);
		tf2.setFont(new Font("times new roman",Font.BOLD,16));
		
		dtm=new DefaultTableModel();
		tb1=new JTable(dtm);
		JScrollPane jsp=new JScrollPane(tb1);
		jsp.setBounds(60,220,350,190);
		
		b1=new JButton("SUBMIT");
		b1.setBounds(100,430,100,30);
		b1.addActionListener(this);
		b1.setFont(new Font("times new roman",Font.BOLD,16));
		b2=new JButton("CANCEL");
		b2.setBounds(240,430,100,30);
		b2.addActionListener(this);
		b2.setFont(new Font("times new roman",Font.BOLD,16));
		
		String tbn="Language";
		String head[]= {"lid","Language"};
		String col[]= {"lid","lan"};
		query ob=new query();
		String q=ob.selectQuery(tbn,col);
		DbOps db=new DbOps();
		db.fillJTable(dtm, col,head,q);
		
		add(l1);
		add(rb1);
		add(rb2);
		add(l2);
		add(l3);
		add(tf1);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		add(jsp);
		
		setSize(520,520);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==b1)
		{
			if(rb1.isSelected())
			{
				String pval=tf1.getText();
				String tb="Language";
				String p="lid";
				String val[]= {tf2.getText()};
				String col[]={"lan"};
				query  ob=new query();
				String q=ob.updateQuery(tb,col,val,p,pval);
				DbOps db=new DbOps();
				db.updateToDB(q);	
			}
			if(rb2.isSelected())
			{
				String pval=tf1.getText();
				String tb="Language";
				String p="lid";
				query  ob=new query();
				String q=ob.deleteQuery(tb,p,pval);
				DbOps db=new DbOps();
				db.updateToDB(q);	
			}
			
		}
		if(ae.getSource()==b3)
		{
			
			String str=tf1.getText();
			DbOps db=new DbOps();
			String s[]=db.getValueFromDTM(dtm,str);
			tf2.setText(s[1]);
			
		}
		if(ae.getSource()==b2)
		{
			tf1.setText("");
			tf2.setText("");
		}
	}
	public static void main(String [] ar)
	{
		new Language();
	}
}

