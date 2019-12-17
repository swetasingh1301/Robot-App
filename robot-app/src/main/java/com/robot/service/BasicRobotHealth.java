package com.robot.service;

import com.robot.model.Robot;

/*
 * @author: Sweta Singh
 */
public interface BasicRobotHealth {
	
	abstract boolean canCarry(int weight);
	abstract boolean powerCheck(Robot r, int charging);

}
