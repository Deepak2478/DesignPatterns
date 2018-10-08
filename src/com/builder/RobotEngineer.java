package com.builder;

// A director/engineer class creates a Robot using the 
// builder interface
public class RobotEngineer {
	private RobotBuilder robotBuilder;
	
	//OldRobotBuilder specification is sent to the engineer
	
	public RobotEngineer(RobotBuilder robotBuilder)
	{
		this.robotBuilder = robotBuilder;
	}
	
	//Return the robot made from OldRobotBuilder spec
	
	public Robot getRobot()
	{
		return this.robotBuilder.getRobot();
	}
	
	public void makeRobot()
	{
		this.robotBuilder.builldRobotHead();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}
}
