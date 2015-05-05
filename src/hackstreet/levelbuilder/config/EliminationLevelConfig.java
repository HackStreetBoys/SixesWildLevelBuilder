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
		this.numMoves = numMoves;
	}
	
	public void setNumMoves(int numMoves){
		this.numMoves = numMoves;
	}
	
	public int getNumMoves() {
		return numMoves;
	}

}
