package hackstreet.levelbuilder.config;

public class LightningLevelConfig extends AbstractLevelConfig{

	int seconds;

	public LightningLevelConfig(){
		super();
		this.Type = "Lightning";
	}
	
	public LightningLevelConfig(AbstractLevelConfig levelConfig){
		super(levelConfig);
		this.Type = "Lightning";
	}
	
}
