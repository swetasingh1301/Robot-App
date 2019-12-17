package com.robot;

import com.robot.service.RobotService;
import com.robot.serviceImpl.PrototypeRobot;

public class RobotMain {
	public static void main(String[] args) {
		RobotService obj = new PrototypeRobot();
		obj.walk(3.5);
		obj.carry(12);
		obj.walkAndCarry(1,13);
		obj.setCharging(70);
		obj.walkAndCarry(3,2);
		obj.displayPrice(18);
	}
}
