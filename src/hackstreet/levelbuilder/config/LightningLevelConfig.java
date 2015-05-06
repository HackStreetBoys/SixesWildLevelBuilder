package hackstreet.levelbuilder.config;

/**
 * Configuration class for the lightning level type.
 * 
 * @author Tim 
 *
 */
public class LightningLevelConfig extends AbstractLevelConfig{

	private int seconds;
	
	public LightningLevelConfig(int numMoves){
		super("Lightning");
		this.seconds = numMoves;
		this.Type = "Lightning";
	}
	
	public LightningLevelConfig(int seconds, AbstractLevelConfig config){
		
		super("Lightning",config);
		LightningLevelConfig c = (LightningLevelConfig) config;
		this.seconds = c.getSeconds();
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds){
		this.seconds = seconds;
	}
}
