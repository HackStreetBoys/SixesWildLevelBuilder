package hackstreet.levelbuilder.elements;

/**
 * A temporary placeholder for a Location's value and multiplier.
 * 
 * @author Pat
 *
 */
public class Tile {

	/** The value of the tile, {1-6}. */
	private int value;
	
	/** The value of the multiplier, {1-3}. */
	private int multiplier;
	
	/**
	 * Tile constructor.
	 * @param value The value of the tile, {1-6}.
	 * @param multiplier The value of the multiplier, {1-3}.
	 */
	public Tile(int value, int multiplier){
		this.value = value;
		this.multiplier = multiplier;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public int getMultiplier(){
		return this.multiplier;
	}
}
