package com.robot.serviceImpl;

import java.util.Random;

import com.robot.model.Robot;
import com.robot.service.RobotService;


/*
 * @author: Sweta Singh
 * This class does all actual implementation. It is our target class. 
 * 
 */
public class PrototypeRobot implements RobotService {
	private Robot r;
	private RobotHealth rh;
	static int availbleCharging;
	
	public PrototypeRobot() {
		this.r = new Robot();
		this.rh = new RobotHealth();
	}
	
	public void setCharging(int percentage){
		int currentCharging = r.getChargingStatus();
		if(currentCharging + percentage > 100)
			r.setChargingStatus(100);
		else{
			r.setChargingStatus(currentCharging+percentage);
		}
	}
	
	
	
	public int walk(double km){
		   availbleCharging = r.getChargingStatus();
		   int requiredCharging = (int)(km*1000/50);
		   if(rh.powerCheck(r, requiredCharging)){
			   System.out.println("Walked "+km+"km | Charging Used "+ requiredCharging +"% | Remaining  "+ r.getChargingStatus() +"%");
			   System.out.println("Robot HeadLight Color "+ r.getHeadLightColor());
			   System.out.println("************************************************");
			   return r.getChargingStatus();
		   }
		   return r.getChargingStatus();
	}

	public String carry(int weight) {
	
			if(rh.canCarry(weight)){
				int requiredCharging = 2*weight;
				availbleCharging = r.getChargingStatus();
				if(rh.powerCheck(r, requiredCharging)){
					System.out.println("Carried "+ weight+"kg | Charging Used "+ requiredCharging +"% | Remaining  "+ r.getChargingStatus() +"%");
					System.out.println("Robot HeadLight Color "+ r.getHeadLightColor());
					System.out.println("************************************************");
					return "Carried "+ weight+"kg | Charging Used "+ requiredCharging +"% | Remaining  "+ r.getChargingStatus() +"%";
				}
			}
		
			return "overweight";
	}
	
	public int walkAndCarry(double dist, int weight) {
		if(rh.canCarry(weight)){
			int requiredCharging = (int)(dist*1000/50) + 2*weight ;
			availbleCharging = r.getChargingStatus();
			if(rh.powerCheck(r, requiredCharging)){
				System.out.println("Walked "+ dist + "km and Carried "+ weight+"kg | Charging Used "+ requiredCharging +"% | Remaining  "+ r.getChargingStatus() +"%");
				System.out.println("Robot HeadLight Color "+ r.getHeadLightColor());
				System.out.println("************************************************");
				return r.getChargingStatus();
			}
		}
		return r.getChargingStatus();
	}
	
	public void displayPrice(int barCode){
		if(barCode % 2 == 0){
			System.out.println("Price is "+ new Random().nextInt(100));
		}else{
			System.out.println("Scan Failure");
		}
	}
	

}
