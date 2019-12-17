package com.robot;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.robot.service.RobotService;
import com.robot.serviceImpl.PrototypeRobot;

/*
 * @author: Sweta Singh
 * Test Class
 */
@SuppressWarnings("deprecation")
public class RobotTest {
	private RobotService robo;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void roboWalkTest() {
		robo = new PrototypeRobot();
		robo.walk(3.5);
		Assert.assertEquals(30, robo.walk(3.5));
	
	}
	
	@Test
	public void roboWalkAndCarryTest() {
		robo = new PrototypeRobot();
		Assert.assertEquals(54, robo.walkAndCarry(2,3));
	
	}
	@Test
	public void roboCarryTest() {
		robo = new PrototypeRobot();
		Assert.assertEquals("overweight", robo.carry(12));
	
	}
}

