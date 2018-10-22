package com.example.demorest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
	
	List<Alien> aliens;
	
	/*static Connection con = null;
	
	 public static Connection getCon() throws Exception {
	        if (con == null) {
	            setCon();
	        }
	        return con;
	    }
	
	public static void setCon(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rest?autoReconnect=true&useSSL=false", "root", "password");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}*/
	
	Connection con = null;
	
	public AlienRepository(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rest?autoReconnect=true&useSSL=false", "root", "password");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public List<Alien> getAliens(){
		List<Alien> aliens = new ArrayList<>();
		String sql = "select * from alien";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				Alien a = new Alien();
				a.setAid(rs.getInt(1));
				a.setAname(rs.getString(2));
				a.setPoints(rs.getInt(3));
				
				aliens.add(a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return aliens;
	}
	
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
		String sql = "select * from alien where id ="+ aid;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next())
			{
				
				a.setAid(rs.getInt(1));
				a.setAname(rs.getString(2));
				a.setPoints(rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return a;
	}

	public void createAlien(Alien a1) {
		
		String sql = "insert into alien values(?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, a1.getAid());
			st.setString(2, a1.getAname());
			st.setInt(3, a1.getPoints());
			st.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void updateAlien(Alien a1) {
		
		String sql = "update alien set name=?, points=? where id=?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, a1.getAname());
			st.setInt(2, a1.getPoints());
			st.setInt(3, a1.getAid());
			st.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public Alien deleteAlien(int aid) {
		Alien a = new Alien();
		String sql = "delete from alien where id ="+ aid;
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.executeUpdate();			
		} catch (Exception e) {
			System.out.println(e);
		}
		return a;
	}
	
	

}
