package junit.samples;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class RobotTest {

	@Test
	public void moveShouldChangeDirectionWhenSensorIsInContact() {		
		Sensor sensor = Mockito.mock(Sensor.class);
		Mockito.when(sensor.isInContact()).thenReturn(true);
		Direction north = Direction.north();
		Robot robot =  new Robot(sensor);
		robot.setDirection(north);
		
		robot.move();
		
		Assert.assertNotEquals(north, robot.getDirection());
	}

	@Test
	public void moveShouldNotChangeDirectionWhenSensorIsNotInContact() {
		Sensor sensor = Mockito.mock(Sensor.class);
		Mockito.when(sensor.isInContact()).thenReturn(false);
		Direction north = Direction.north();
		Robot robot =  new Robot(sensor);
		robot.setDirection(north);
		
		robot.move();
		
		Assert.assertEquals(north, robot.getDirection());
	}
}
