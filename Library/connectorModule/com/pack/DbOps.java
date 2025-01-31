//to send query into database

package com.pack;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class DbOps
{
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	
	void insertToDB(String query)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04");
			st=con.createStatement();
			st.executeUpdate(query);
			con.close();
			st.close();	
			System.out.println("insert");
		}catch(Exception e){System.out.println(e);}
	}
	
	void deleteToDB(String query)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04");
			st=con.createStatement();
			st.executeUpdate(query);
			con.close();
			st.close();
			System.out.println("delete");
		}catch(Exception e) {System.out.println(e);}
	}
	
	void updateToDB(String query)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04");
			st=con.createStatement();
			st.executeUpdate(query);
			con.close();
			st.close();
			System.out.println("update");
		}catch(Exception e) {System.out.println(e);}
	}
	int countRecords(String tbname)
	{
		int count=0;
		String query="select * from "+tbname+";";
	
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
			st=con.createStatement();
			rs=st.executeQuery(query);
			while(rs.next())
			{
				count++;
			}
		}catch(Exception e) {System.out.println(e);}
	
	
		return count;
		
	}
	void fillcombo(JComboBox jb,String tbnm,String id,String val)
	{
		//to take data from table and set it in comboBox
		int cap=countRecords(tbnm);
		String s1[]=new String[cap+2];		//increase length for (select ....,others)options
		String s2[]=new String[cap+2];
		
		String query="select * from "+tbnm+";";
		int i=0,k=0;
		
		s2[k++]="Select "+tbnm;
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
			st=con.createStatement();
			rs=st.executeQuery(query);
			while(rs.next())
			{
				 s2[k++]=rs.getString(id)+"-"+rs.getString(val);
			}
			s2[k++]="Others";
			
			for(int j=0;j<s2.length;j++)
				jb.addItem(s2[j]);
			
			con.close();
			st.close();
			rs=null;
			
		//	System.out.print("Connection Successfull ");
		}catch(Exception e){ System.out.println(e);}  
	}
	void fillcomboSpcl(JComboBox jb,String query,String[]col)
	{
		String s2[]=new String[col.length];
		
		int i=0,k=0;
		
		s2[k++]="Select ";
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
			st=con.createStatement();
			rs=st.executeQuery(query);
			while(rs.next())
			{
				 s2[k++]=rs.getString(col[i++])+"-"+rs.getString(col[i++]);
			}
			
			for(int j=0;j<s2.length;j++)
				jb.addItem(s2[j]);
			
			con.close();
			st.close();
			rs=null;
			
		//	System.out.print("Connection Successfull ");
		}catch(Exception e){ System.out.println(e);}  
	}

	void fillJTable(DefaultTableModel dtm,String col[],String head[],String q)		//take data from sql and give it to JTable
	{
		dtm.setNumRows(0);
		dtm.setColumnCount(0);
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
			st=con.createStatement();
			rs=st.executeQuery(q);
			
			for(int j=0;j<head.length;j++)
				dtm.addColumn(head[j]);
			
			while(rs.next())
			{
				String ob[]=new String[col.length];
				for(int i=0;i<col.length;i++)
					ob[i]=rs.getString(col[i]);
				
				dtm.addRow(ob);
			}
			
			con.close();
			st.close();
			rs=null;
			
		//	System.out.print("Connection Successfull ");
		}catch(Exception e){ System.out.println(e);}  

	}
	
	String[] getValueFromDTM(DefaultTableModel dtm, String val)	//to get value from jtable and pass it to frame where needed
	{
		String ob[]=new String[dtm.getColumnCount()];
		
		for (int i=0;i<dtm.getRowCount();i++)
		{
			if(dtm.getValueAt(i,0).toString().equals(val))		//j=0, so check 1st row as id store at 1st row 
			{
				for(int j=0;j<dtm.getColumnCount();j++)
					ob[j]=dtm.getValueAt(i,j).toString();
			}
		}
		return ob;
	}
	
	String[] getValuesFromDB(String query, String cols[])
	{
		String s1[]=new String[cols.length];	

		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
			st=con.createStatement();
			rs=st.executeQuery(query);
			while(rs.next())
			{
				for(int i=0;i<s1.length;i++)
				{
					 s1[i]=rs.getString(cols[i]);
					// System.out.println(s1[i]);
				}
			}
			
			con.close();
			st.close();
			rs=null;
			
			//System.out.print("Connection Successfull ");
		}catch(Exception e){ System.out.println(e+" Error Occured ");}
		
		return s1;
	}
	Boolean validateUser(String tbnm,String colnm,String val)
	{
		String q="select * from "+tbnm+" where "+colnm+"="+val;
		Boolean b=null;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
			st=con.createStatement();
			rs=st.executeQuery(q);
			
			if(rs.next())
				b=true;
			else
				b=false;
			
		    con.close();
			st.close();
			rs=null;
			
			//System.out.print("Connection Successfull ");
		}catch(Exception e){ System.out.println(e);}
		
		return b;
	}
	String getCount(String query)		//count of books,members (for dashboard)
	{
		String b="";
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","manya04"); 
			st=con.createStatement();
			rs=st.executeQuery(query);
			if(rs.next())
				b=rs.getString("count");
			
		    con.close();
			st.close();
			rs=null;
			
			//System.out.print("Connection Successfull ");
		}catch(Exception e){ System.out.println(e);}
		
		return b;
	}
}

