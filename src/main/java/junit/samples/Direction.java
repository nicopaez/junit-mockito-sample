package junit.samples;

public class Direction {


	private static Direction north;
	private static Direction south;
	private static Direction east;
	private static Direction west;
	
	static {
		north = new Direction();
		south = new Direction();
		east = new Direction();
		west = new Direction();
		
		north.setInverse(south);
		south.setInverse(north);
		east.setInverse(west);
		west.setInverse(east);
	}

	private Direction inverse;
	
	private Direction() {}
	
	private void setInverse(Direction inverse) {
		this.inverse = inverse;
	}

	public static Direction north() {
		return north;
	}

	public Direction getInverse() {
		return this.inverse;
	}

}
