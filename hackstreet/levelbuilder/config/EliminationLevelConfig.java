package hackstreet.levelbuilder.config;

public class EliminationLevelConfig extends AbstractLevelConfig{

	int seconds;
	
	public EliminationLevelConfig(){
		super();
		this.Type = "Elimination"; // Needed for Serialization and FileIO

	}
	
	public EliminationLevelConfig(AbstractLevelConfig levelConfig){
		super(levelConfig);
		this.Type = "Elimination"; // Needed for Serialization and FileIO
	}
}
