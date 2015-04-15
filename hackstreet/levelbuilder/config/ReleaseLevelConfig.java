package hackstreet.levelbuilder.config;

import java.util.ArrayList;

public class ReleaseLevelConfig extends AbstractLevelConfig{

	int numMoves;
	ArrayList<Location> sixes;
	ArrayList<Location> sixGoals;
	
	public ReleaseLevelConfig(){
		super();
	}
	
	public ReleaseLevelConfig(AbstractLevelConfig levelConfig){
		super(levelConfig);
	}
}
