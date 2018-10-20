package com.adapters;

public class school {

	public static void main(String[] args) {
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I am bit tired to write assignment");

	}

}
