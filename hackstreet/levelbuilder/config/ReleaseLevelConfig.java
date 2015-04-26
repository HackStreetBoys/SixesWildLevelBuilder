package hackstreet.levelbuilder.config;

import java.util.ArrayList;


public class ReleaseLevelConfig extends AbstractLevelConfig{

	int numMoves;
	ArrayList<Location> sixes;
	ArrayList<Location> sixGoals;
	
	
	public ReleaseLevelConfig(){
		super();
		this.Type = "Elimination";  // Needed for Serialization and FileIO
	}
	
	public ReleaseLevelConfig(AbstractLevelConfig levelConfig){
		super(levelConfig);
		this.Type = "Elimination";  // Needed for Serialization and FileIO
	}
}
