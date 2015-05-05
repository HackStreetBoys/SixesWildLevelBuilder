package hackstreet.levelbuilder.elements;

public class BucketSlot extends Slot{

	private boolean occupied;
	
	public BucketSlot(Location loc) {
		super(loc);
		this.occupied = false;
	}
	
	public boolean isOccupied(){
		return this.occupied;
	}
	
	public void setOccupied(){
		this.occupied = true;
	}

}
