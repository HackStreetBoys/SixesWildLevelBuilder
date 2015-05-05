package hackstreet.levelbuilder.config;

import java.util.ArrayList;


public class ReleaseLevelConfig extends AbstractLevelConfig{

	int numMoves;
	ArrayList<Location> sixes;
	ArrayList<Location> sixGoals;
	
	public ReleaseLevelConfig(){
		super();
		this.Type = "Release";  // Needed for Serialization and FileIO
	}
	
	public ReleaseLevelConfig(ReleaseLevelConfig levelConfig){
		super(levelConfig);
		this.Type = "Release";  // Needed for Serialization and FileIO	
	}
	
}
