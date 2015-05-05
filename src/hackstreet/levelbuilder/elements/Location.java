package hackstreet.levelbuilder.elements;

/**
 * @author Himanshu
 */

import java.util.ArrayList;

public class Location {
	
	/** The x-coordinate of the tile, {0-8}. */
	int x;
	
	/** The y-coordinate of the tile, {0-8}. */
	int y;
	
	public Location(int x, int y){
		//Flip flop x and y to be uniform with row/column notation in SixesWild Game
		this.x = y;
		this.y = x;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	@Override
	public int hashCode(){
		return 13 * x + y;
	}
	
	public Location pullNearbyLocation(int xDiff, int yDiff){
		return new Location(this.x+xDiff,this.y+yDiff);
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Location){
			Location other = (Location)o;
			return other.x==this.x && other.y==this.y;
		}
		return false;
	}
		
	/**
	 * Returns a list of all the adjacent Location spots,
	 * without any checking for InertSlot, EliminationSlot, or
	 * already visited locations.
	 * 
	 * @return List of adjacent locations
	 */
	public ArrayList<Location> getRawAdjacentLocations() {	
		ArrayList<Location> adjacentLocs = new ArrayList<Location>();
		Location aboveLoc = new Location(this.x,this.y-1);
		if(aboveLoc.
				isValid())
			adjacentLocs.add(aboveLoc);
		
		Location rightLoc = new Location(this.x+1,this.y);
		if(rightLoc.isValid())
			adjacentLocs.add(rightLoc);
		
		Location belowLoc = new Location(this.x,this.y+1);
		if(belowLoc.isValid())
			adjacentLocs.add(belowLoc);
		
		Location leftLoc = new Location(this.x-1,this.y);
		if(leftLoc.isValid())
			adjacentLocs.add(leftLoc);
		
		return adjacentLocs;
	}
	
	public boolean isValid(){
		return this.x>=0 && this.x<=8 && this.y>=0 && this.y<=8;
	}
	
	@Override
	public String toString(){
		return "(" + x + "," + y + ")";
	}
}
