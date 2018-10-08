package com.builder;

public class Robot implements RobotPlan {

	private String head;
	private String arms;
	private String legs;
	
	
	public String getHead() {
		return head;
	}

	public String getArms() {
		return arms;
	}

	public String getLegs() {
		return legs;
	}

	@Override
	public void setRobotHead(String head) {
		// TODO Auto-generated method stub
		this.head = head;
		
	}

	@Override
	public void setRobotArms(String arms) {
		// TODO Auto-generated method stub
		this.arms = arms;
	}

	@Override
	public void setRobotLegs(String legs) {
		// TODO Auto-generated method stub
		this.legs = legs;
	}

}
