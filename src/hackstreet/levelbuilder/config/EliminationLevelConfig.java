package hackstreet.levelbuilder.config;

/**
 * 
 * @author	Himanshu, Pat
 *
 */
public class EliminationLevelConfig extends AbstractLevelConfig {

	private int numMoves;
	
	public EliminationLevelConfig(int numMoves){
		super("Elimination");
		this.numMoves = numMoves;
	}
	
	public EliminationLevelConfig(int numMoves,AbstractLevelConfig config){
		super("Elimination",config);
		
		EliminationLevelConfig c = (EliminationLevelConfig) config;
		this.numMoves = c.getNumMoves();
	}
	
	public void setNumMoves(int numMoves){
		this.numMoves = numMoves;
	}
	
	public int getNumMoves() {
		return numMoves;
	}

}
