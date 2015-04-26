package hackstreet.levelbuilder.config;

public class PuzzleLevelConfig extends AbstractLevelConfig{

	int numMoves;
	
	public PuzzleLevelConfig(){
		super();
		this.Type = "Puzzle";  // Needed for Serialization and FileIO
	}
	
	public PuzzleLevelConfig(AbstractLevelConfig levelConfig){
		super(levelConfig);
	}
}
