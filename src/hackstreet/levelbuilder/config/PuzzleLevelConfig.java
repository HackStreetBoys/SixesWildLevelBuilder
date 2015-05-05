package hackstreet.levelbuilder.config;

/**
 * 
 * @author Pat, Himanshu
 *
 */
public class PuzzleLevelConfig extends AbstractLevelConfig {
	
	private int numMoves;
	
	public PuzzleLevelConfig(int numMoves){
		super("Puzzle");
		this.Type = "Puzzle";
		this.numMoves = numMoves;
	}
	
	public PuzzleLevelConfig(int numMoves,AbstractLevelConfig config){
		super("Puzzle",config);
		this.numMoves = numMoves;
	}
	
	public void setNumMoves(int numMoves){
		this.numMoves = numMoves;
	}
	
	public int getNumMoves() {
		return numMoves;
	}
}
