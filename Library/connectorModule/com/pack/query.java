//to create query 

package com.pack;
import java.sql.*;

public class query
{
	String insertQuery(String tbn,String col[],String val[])
	{
		String s="",f="",v="";
		
		int flag=0;
		for(int i=0;i<col.length||i<val.length;i++)
		{	
			int f1=0;
			f+=(flag==0)?col[i]:","+col[i];
			String str=val[i];
			for(int j=0;j<str.length();j++)
			{
				char ch=str.charAt(j);
				if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
						f1=1;
			
			}
			if(f1==0)
				v+=(flag==0)?val[i]:","+val[i];
			else
				v+=(flag==0)?"'"+val[i]+"'":",'"+val[i]+"'";
			
			flag++;
		}
		
		s="insert into "+tbn+"("+f+")values("+v+");";
		return s;
	}
	
	String updateQuery(String tbn,String col[],String val[],String p,String pval)
	{
		String s="";
		int flag=0,f1=0,fs=0;;
		s="update "+tbn+" set ";
		
		for(int i=0;i<col.length||i<val.length;i++,flag++)
		{	
			String str=val[i];
			for(int j=0;j<str.length();j++)
			{
				char ch=str.charAt(j);
				if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
						f1=1;
			
			}
			if(f1==0)
				s+=(flag==0)?col[i]+"="+val[i]:","+col[i]+"="+val[i];
			else
				s+=(flag==0)?col[i]+"='"+val[i]+"'":","+col[i]+"='"+val[i]+"'";
			flag++;
			
			
			String st=pval;
			for(int j=0;j<st.length();j++)
			{
				char ch=st.charAt(j);
				if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
						fs=1;
			}
		}
		if(fs==0)
		s+=" where "+p+"="+pval+";";
		else
			s+=" where "+p+"='"+pval+"';";
		return s;
	}
	
	String deleteQuery(String tbn,String p,String pval)
	{
		int fs=0;
		String st=pval;
		String s="";
		for(int j=0;j<st.length();j++)
		{
			char ch=st.charAt(j);
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
					fs=1;
		}
		if(fs==0)
		s="delete from "+tbn+" where "+p+"="+pval+";";
		else
		 s="delete from "+tbn+" where "+p+"='"+pval+"';";
		return s;
	}
	String selectQuery(String tbn,String col[])		//select data from database
	{
		String s="";
		int f=0;
		String v="";
		for(int i=0;i<col.length;i++)
		{
			v+=(f==0)?col[i]:","+col[i];
			f++;
		}
		s="select "+v+" from "+tbn+";";
		return s;
	}
	
}