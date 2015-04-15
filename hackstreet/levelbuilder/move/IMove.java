package hackstreet.levelbuilder.move;

/**
 * Interface used for storing moves on the undo and redo stacks,
 * contains methods for doing and undoing moves.
 * @author Nicholas
 */
public interface IMove {

	/**
	 * Do a move - the opposite of IMove.undoMove()
	 */
	void doMove();
	
	/**
	 * Undo a move - the opposite of IMove.doMove()
	 */
	void undoMove();
}
