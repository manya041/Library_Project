package com.pack;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;


public class pay  extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,le,ls1,ls2,ls3;
	JPanel p1;
	JTextField tf1,tf2;
	JButton b2,b1;
	JComboBox cb1;
	String sid,tamt;
	pay(String id,String tamt)
	{
		this.tamt=tamt;
		sid=id;
		getContentPane().setBackground(Color.WHITE);
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,500,60);
		p1.setBackground(new Color(51,153,255));
		l1=new JLabel("Fee | Panalty");
		l1.setBounds(5,10,200,40);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Arial Round MT BOLD",Font.BOLD,30));
		p1.add(l1);
		
		l2=new JLabel("Item ID");
		l2.setBounds(50,110,150,20);
		l2.setFont(new Font("Calibiri",Font.PLAIN,20));
		cb1=new JComboBox();
		cb1.setBounds(50,135,180,25);
		cb1.setFont(new Font("Calibiri",Font.PLAIN,15));
		String q="select books.bid,bname from challan inner join books on books.bid=challan.bid where stid="+sid;
		DbOps db=new DbOps();
		String col[]= {"bid","bname"};
		db.fillcomboSpcl(cb1,q,col);
		ls1=new JLabel("*compulsory to fill");
		ls1.setBounds(50,160,300,20);
		ls1.setForeground(Color.RED);
		ls1.setFont(new Font("Calibiri",Font.PLAIN,15));
		ls1.setVisible(false);
		
		l3=new JLabel("Transaction ID");
		l3.setBounds(50,190,150,20);
		l3.setFont(new Font("Calibiri",Font.PLAIN,20));
		tf1=new JTextField();
		tf1.setBounds(50,215,180,25);
		tf1.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		ls2=new JLabel("*compulsory to fill");
		ls2.setBounds(50,240,300,20);
		ls2.setForeground(Color.RED);
		ls2.setFont(new Font("Calibiri",Font.PLAIN,15));
		ls2.setVisible(false);
		
		l4=new JLabel("Paid Amount");
		l4.setBounds(50,270,150,20);
		l4.setFont(new Font("Calibiri",Font.PLAIN,20));
		tf2=new JTextField();
		tf2.setBounds(50,295,180,25);
		tf2.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		ls3=new JLabel("*compulsory to fill");
		ls3.setBounds(50,320,300,20);
		ls3.setForeground(Color.RED);
		ls3.setFont(new Font("Calibiri",Font.PLAIN,15));
		ls3.setVisible(false);
		
		ImageIcon img=new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\myProjecct\\connectorModule\\com\\images\\qr.png");
		le=new JLabel(img);
		le.setBounds(270,150,160,160);
		l5=new JLabel("Scan here");
		l5.setBounds(315,295,100,20);
		l5.setForeground(new Color(0,204,0));
		l5.setFont(new Font("Arial Rounded MT Bold ",Font.BOLD,15));
		b1=new JButton("Print");
		b1.setBounds(50,350,180,20);
		b1.setForeground(Color.WHITE);
		b1.setBackground(new Color(0,153,0));
		b1.setFont(new Font("Calibiri",Font.PLAIN,15));
		b1.addActionListener(this);
		b1.setBorderPainted(false);
		b2=new JButton("Done");
		b2.setBounds(100,400,80,25);
		b2.setBackground(new Color(102,178,255)); 
		b2.setFont(new Font("Calibiri",Font.PLAIN,20));
		b2.addActionListener(this);
		b2.setBorderPainted(false);
		
		
		add(p1);
		add(l2);
		add(cb1);
		add(l3);
		add(tf1);
		add(le);
		add(ls1);
		add(ls2);
		add(l4);
		add(l5);
		add(tf2);
		add(ls3);
		add(b1);
		add(b2);
		
		setSize(460,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==b1)
			new receipt(sid,tamt,tf2.getText());
		if(ae.getSource()==b2)
		{
			if(cb1.getSelectedIndex()==0)
				ls1.setVisible(true);
			else
				ls1.setVisible(false);
			
			if(tf1.getText().equals(""))
				ls2.setVisible(true);
			else
				ls2.setVisible(false);
			
			if(tf2.getText().equals(""))
				ls3.setVisible(true);
			else
				ls3.setVisible(false);
			
			LocalDate date=LocalDate.now();
			String status="";
			int bamt=Integer.parseInt(tamt)-Integer.parseInt(tf2.getText());
			if(bamt==0)
				status="Paid";
			else if(bamt>0 && bamt<Integer.parseInt(tamt))
				status="Partial";
				
			String str=(String)cb1.getSelectedItem();
			String s[]=str.split("-");
			
			String ql="select paid from challan where bid="+s[0]+";";	//bid
			String col[]= {"paid"};
			DbOps dbq=new DbOps();
			String st[]=dbq.getValuesFromDB(ql,col);
			String pt=st[0];
			String amt=String.valueOf(Integer.parseInt(pt)+Integer.parseInt(tf2.getText()));
			if(!(tf1.getText().equals(""))&&(cb1.getSelectedIndex()!=0)&&!(tf2.getText().equals("")))
			{
				String q="update challan set reference_id="+tf1.getText()+",paid="+amt+",remarks='"+status+"',date='"+date+"' where bid="+s[0];
				DbOps db1=new DbOps();
				db1.updateToDB(q);
			}
			
			try
			{
				Thread.sleep(1000);
			}catch(Exception e){}
			
			this.dispose();
		}
		
	}
	public static void main(String [] ar)
	{
		new pay("","");
	}

}
