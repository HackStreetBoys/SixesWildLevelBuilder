package hackstreet.levelbuilder.config;

public class LightningLevelConfig extends AbstractLevelConfig{

	private int seconds;
	
	public LightningLevelConfig(int numMoves){
		super("Lightning");
		this.seconds = numMoves;
		this.Type = "Lightning";
	}
	
	public LightningLevelConfig(int seconds, AbstractLevelConfig config){
		super("Lightning",config);
		this.seconds = seconds;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds){
		this.seconds = seconds;
	}
}
