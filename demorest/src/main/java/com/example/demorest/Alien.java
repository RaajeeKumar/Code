package com.example.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {

	
	private String aname;
	private int points;
	private int aid;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}
