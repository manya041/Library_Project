package com.pack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Language_entry extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField tf1;
	JButton b1,b2;
	Language_entry()
	{
		getContentPane().setBackground(new Color(225,178,102));
		l1=new JLabel("LANGUAGE ENTRY");
		l1.setBounds(50,50,250,40);
		l1.setFont(new Font("times new roman",Font.BOLD,24));
		
		l2=new JLabel("LANGUAGE");
		l2.setBounds(50,150,90,20);
		l2.setFont(new Font("times new roman",Font.PLAIN,16));
		tf1=new JTextField("");
		tf1.setBounds(150,150,150,20);
		tf1.setFont(new Font("times new roman",Font.PLAIN,16));
		
		b1=new JButton("Submit");
		b1.addActionListener(this);
		b1.setBounds(80,230,80,30);
		b1.setFont(new Font("times new roman",Font.PLAIN,16));
		b2=new JButton("Cancel");
		b2.addActionListener(this);
		b2.setBounds(180,230,80,30);
		b2.setFont(new Font("times new roman",Font.PLAIN,16));
		
		add(l1);
		add(l2);
		add(tf1);
		add(b1);
		add(b2);
		
		setSize(350,350);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
	}
	public static void main(String [] ar)
	{
		new Language_entry();
	}
}

