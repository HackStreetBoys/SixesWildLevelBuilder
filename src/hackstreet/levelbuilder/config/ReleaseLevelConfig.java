package hackstreet.levelbuilder.config;

import hackstreet.levelbuilder.elements.Location;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Pat
 * 
 */
public class ReleaseLevelConfig extends AbstractLevelConfig {
	
	private int numMoves;
	private List<Location> bucketLocations;
	private List<Location> sixLocations;
	
	public ReleaseLevelConfig(int numMoves){
		super("Release");
		this.Type = "Release";
		this.numMoves = numMoves;
		this.sixLocations = new ArrayList<Location>();
		this.bucketLocations = new ArrayList<Location>();
	}
	
	
	public ReleaseLevelConfig(int numMoves,AbstractLevelConfig config){
		super("Release",config);
		this.numMoves = numMoves;
		this.sixLocations = new ArrayList<Location>();
		this.bucketLocations = new ArrayList<Location>();
	}
	
	public List<Location> getSixLocations(){
		return this.sixLocations;
	}
	
	public List<Location> getBucketLocations(){
		return this.bucketLocations;
	}
	
	public void setNumMoves(int numMoves){
		this.numMoves = numMoves;
	}
	
	public int getNumMoves() {
		return numMoves;
	}
	
}
