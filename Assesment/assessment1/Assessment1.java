package core_assessment;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class core implements ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,msg;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	
	public core()
	{
		frame = new JFrame();
		frame.setLayout(new GridLayout(8,2));
		frame.setSize(500,350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Enter sid : ");
		l2 = new JLabel("Enter Fisrt Name : ");
		l3 = new JLabel("Enter Last Name : ");
		l4 = new JLabel("Enter Email : ");
		l5 = new JLabel("Enter Mobile : ");
		msg = new JLabel(" ");
		
		t1 = new JTextField(15);
		t2 = new JTextField(30);
		t3 = new JTextField(30);
		t4 = new JTextField(30);
		t5 = new JTextField(10);
		
		b1 = new JButton("Insert");
		b2 = new JButton("Update");
		b3 = new JButton("Delete");
		b4 = new JButton("Search");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		frame.add(l1);
		frame.add(t1);
		
		frame.add(l2);
		frame.add(t2);
		
		frame.add(l3);
		frame.add(t3);
		
		frame.add(l4);
		frame.add(t4);
		
		frame.add(l5);
		frame.add(t5);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.add(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)
		{
			try {
				int x;
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assessments","root","");
				System.out.println("Connection done");
				Statement stmt = cn.createStatement();
				String query = "insert into employee values("+t1.getText()+",'"+t2.getText()+"','"+ t3.getText()+ "','"+t4.getText()+"','"+t5.getText()+"')";
				x = stmt.executeUpdate(query);
				if(x > 0)
				{
					msg.setText("Record Inserted..");
				}
				else
				{
					msg.setText("Record not inserted..");
				}
				cn.close();
			} 
			catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == b2)
		{
			try {
				int x;
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assessments","root","");
				System.out.println("Connection done");
				Statement stmt = cn.createStatement();
				String query = "update employee set First name='"+ t2.getText()+"', Last Name='"+t3.getText()+"' , Email='"+ t4.getText()+"' , Mobile='"+t5.getText()+"' where sid="+t1.getText()+"";
				x = stmt.executeUpdate(query);
				if(x > 0)
				{
					msg.setText("Record Updated..");
				}
				else
				{
					msg.setText("Record not updated..");
				}
				cn.close();
			}
			catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == b3)
		{
			try {
				int x;
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assessments","root","");
				System.out.println("Connection done");
				Statement stmt = cn.createStatement();
				String query = "delete from employee where sid="+t1.getText()+"";
				x = stmt.executeUpdate(query);
				if(x > 0)
				{
					msg.setText("Record Deleted..");
				}
				else
				{
					msg.setText("Record not Deleted..");
				}
				cn.close();
			} 
			catch (Exception e1) {	
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == b4)
		{
			try {
				String a = t1.getText();
				if(a.isEmpty()) 
				{
					System.out.println("please enter the Id");
					msg.setText("please enter the Id");
					return;
				}
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assessments","root","");
				System.out.println("Connection done");
				Statement stmt = cn.createStatement();
				String query =  "select * from employee where Id = "+t1.getText()+"";
				ResultSet rs = stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println("sid is : " + rs.getInt(1));
					System.out.println("sid name : " + rs.getString(2));
					System.out.println("sid city : " + rs.getString(3));
					System.out.println("sid degree : " + rs.getString(4));
					System.out.println("sid Mobile : " + rs.getString(5));
				}
				cn.close();
			} 
			catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
public class Assessment1 {
	public static void main(String[] args) {
		new core();
	}
}
