package com.pack;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;

public class receipt extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,le,ls1,ls2,ls3,ls4,ls5,ls6,ls7,ls8,ls9,ls10,ls11;
	JTable tb1;
	
	receipt(String id,String tamt,String pamt)
	{
		getContentPane().setBackground(Color.WHITE);
		l1=new JLabel("FEE  RECEIPT");
		l1.setBounds(70,20,300,45);
		l1.setForeground(new Color(0,76,153));
		l1.setFont(new Font("Times New Roman",Font.BOLD,40)); 
		l2=new JLabel("DATE:");
		l2.setBounds(40,85,50,20);
		l2.setFont(new Font("Calibiri",Font.BOLD,15));
		LocalDate date=LocalDate.now();
		ls1=new JLabel(String.valueOf(date));
		ls1.setBounds(90,85,100,20);
		ls1.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		String query="select fid from challan";
		String cl[]= {"fid"};
		DbOps d=new DbOps();
		String rno[]=d.getValuesFromDB(query,cl);
		l3=new JLabel("RECEIPT NO.:");
		l3.setBounds(250,85,120,20);
		l3.setFont(new Font("Calibiri",Font.BOLD,15));
		ls2=new JLabel(rno[0]);
		ls2.setBounds(360,85,70,20);
		ls2.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		String q="select books.bid,bname,stname,course,address,mob,city from challan inner join books on challan.bid=books.bid inner join student on challan.stid=student.stid inner join course on course.cid=student.cid where challan.stid="+id;
		DbOps db=new DbOps();
		String col[]= {"books.bid","bname","stname","course","address","mob","city"};
		String st[]=db.getValuesFromDB(q,col);
		
		String bn=st[1]+"-"+st[0];
		String ad=st[4]+","+st[6];
		l4=new JLabel("NAME:");
		l4.setBounds(40,120,50,20);
		l4.setFont(new Font("Calibiri",Font.BOLD,15));
		ls3=new JLabel(st[2]);
		ls3.setBounds(95,120,150,20);
		ls3.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		l5=new JLabel("STUDENT ID:");
		l5.setBounds(40,155,100,20);
		l5.setFont(new Font("Calibiri",Font.BOLD,15));
		ls4=new JLabel(id);
		ls4.setBounds(145,155,150,20);
		ls4.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		l6=new JLabel("ADDRESS:");
		l6.setBounds(40,190,90,20);
		l6.setFont(new Font("Calibiri",Font.BOLD,15));
		ls5=new JLabel(ad);
		ls5.setBounds(125,190,300,20);
		ls5.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		l7=new JLabel("MOBILE NO.:");
		l7.setBounds(40,225,100,20);
		l7.setFont(new Font("Calibiri",Font.BOLD,15));
		ls6=new JLabel(st[5]);
		ls6.setBounds(145,225,100,20);
		ls6.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		l8=new JLabel("COURSE:");
		l8.setBounds(40,260,70,20);
		l8.setFont(new Font("Calibiri",Font.BOLD,15));
		ls7=new JLabel(st[3]);
		ls7.setBounds(115,260,150,20);
		ls7.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		l9=new JLabel("ITEM NAME:");
		l9.setBounds(40,295,100,20);
		l9.setFont(new Font("Calibiri",Font.BOLD,15));
		ls8=new JLabel(bn);
		ls8.setBounds(135,295,300,20);
		ls8.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		le=new JLabel("____________________________________________________________________________");
		le.setBounds(5,315,545,15);
		le.setFont(new Font("Arial Round MT BOLD",Font.BOLD,10)); 
		l10=new JLabel("TOTAL AMOUNT:");
		l10.setBounds(40,340,130,20);
		l10.setFont(new Font("Calibiri",Font.BOLD,15));
		ls9=new JLabel(tamt);
		ls9.setBounds(170,340,200,20);
		ls9.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		l11=new JLabel("PAID AMOUNT:");
		l11.setBounds(40,375,120,20);
		l11.setFont(new Font("Calibiri",Font.BOLD,15));
		ls10=new JLabel(pamt);
		ls10.setBounds(155,375,200,20);
		ls10.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		String bamt=String.valueOf(Integer.parseInt(tamt)-Integer.parseInt(pamt));
		l12=new JLabel("BALANCE AMOUNT:");
		l12.setBounds(40,410,150,20);
		l12.setFont(new Font("Calibiri",Font.BOLD,15));
		ls11=new JLabel(bamt);
		ls11.setBounds(190,410,200,20);
		ls11.setFont(new Font("Calibiri",Font.PLAIN,15));
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(le);
		add(ls1);
		add(ls2);
		add(ls3);
		add(ls4);
		add(ls5);
		add(ls6);
		add(ls7);
		add(ls8);
		add(ls9);
		add(ls10);
		add(ls11);
		
		setSize(480,480);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	public static void main(String [] ar)
	{
		new receipt("230125","15","5");
	}
}
