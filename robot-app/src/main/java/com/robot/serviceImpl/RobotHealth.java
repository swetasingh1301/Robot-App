package com.robot.serviceImpl;

import com.robot.model.Robot;
import com.robot.model.Robot.Color;
import com.robot.service.BasicRobotHealth;

/*
 * @author: Sweta Singh
 * This class checks the robot health in term of power and weight capcity. 
 * Also as it extends the BasicRObotHealth class, we can extend it in future.
 */
public class RobotHealth implements BasicRobotHealth {
	
	public boolean canCarry(int weight){
		if(weight > 10){
			System.out.println("Overweight");
			System.out.println("************************************************");
			return false;
		}
		return true;
	}
	
	
	public boolean powerCheck(Robot r, int requiredCharging){
		int availbleCharging = r.getChargingStatus();
		if(availbleCharging < requiredCharging){
			System.out.println("Insufficient Charging For Task");
			System.out.println("************************************************");
			return false;
		}else{
			int remaining = availbleCharging - requiredCharging;
			r.setChargingStatus(remaining);
			if(remaining < 15){
				r.setHeadLightColor(Color.RED);
				System.out.println("*********************************************");
			}
			return true;
		}
		
		
	}

}
