package junit.samples;

public class Robot {

	private Direction direccion;
	private Sensor sensor;

	public Robot(Sensor sensor) {
		this.sensor = sensor;
	}

	public void setDirection(Direction direccion) {
		this.direccion = direccion;
	}

	public void move() {
		if (this.sensor.isInContact()) {
			this.direccion = this.direccion.getInverse();
		}
			
	}

	public Direction getDirection() {
		return this.direccion;
	}
}
