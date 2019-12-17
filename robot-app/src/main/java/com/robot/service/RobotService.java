package com.robot.service;

/*
 * @author: Sweta Singh
 * This interface defines general robot like features which will be exposed to public 
 */
public interface RobotService {

	int walk(double distance);
	String carry(int weight);
	int walkAndCarry(double distance, int weight);
	void setCharging(int percentage);
	void displayPrice(int barcode);
	
}
