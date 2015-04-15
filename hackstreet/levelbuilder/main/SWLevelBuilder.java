package hackstreet.levelbuilder.main;

import java.util.Stack;
import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.move.IMove;

public class SWLevelBuilder {

	
	private AbstractLevelConfig activeLevel;
	private Stack<IMove> undoStack = new Stack<IMove>();
	private Stack<IMove> redoStack = new Stack<IMove>();
	
	/**
	 * Empty constructor
	 */
	public SWLevelBuilder(){
		// empty
	}
	
	/**
	 * 
	 */
	public void saveLevel(){
		
	}
	
	/**
	 * 
	 */
	public void /*AbstractLevelConfig*/ loadLevel(){
		
	}
	
	/**
	 * Places an IMove onto the undoStack, and clears the redoStack
	 * if it contains any IMoves.
	 * @param move to log
	 */
	public void logMove(IMove move){
		this.undoStack.push(move);
		this.redoStack.clear();
	}
	
	/**
	 * Undoes the IMove on top of the undoStack, and places it
	 * on top of the redoStack.
	 */
	public void undoMove(){
		
	}
	
	/**
	 * Does the IMove on top of the redoStack, and places it
	 * on top of the undoStack without clearing the redoStack.
	 */
	public void redoMove(){
		
	}

	public AbstractLevelConfig getActiveLevel() {
		return activeLevel;
	}

	public void setActiveLevel(AbstractLevelConfig activeLevel) {
		this.activeLevel = activeLevel;
	}
}
