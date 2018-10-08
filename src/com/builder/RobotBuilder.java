package com.builder;

//defines the methods needed for creating parts for the robot
public interface RobotBuilder {
	public void builldRobotHead();
	public void buildRobotArms();
	public void buildRobotLegs();
	public Robot getRobot();
}
