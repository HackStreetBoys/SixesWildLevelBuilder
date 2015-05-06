package hackstreet.levelbuilder.elements;

/**
 * The bucket slot in which 6 land in release level mode.
 * 
 * @author Pat
 *
 */
public class BucketSlot extends Slot{

	/** Is a 6 already occupying the bucket*/
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
