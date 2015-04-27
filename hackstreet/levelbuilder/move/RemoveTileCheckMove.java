package hackstreet.levelbuilder.move;

import javax.swing.JCheckBox;

import hackstreet.levelbuilder.main.SWLevelBuilder;

public class RemoveTileCheckMove implements IMove{

	//Think about how to implement the stack here
	
	SWLevelBuilder model;
	JCheckBox checkBox;
	boolean before;
	boolean after;
	
	public RemoveTileCheckMove(SWLevelBuilder model, JCheckBox checkBox) {
		this.model = model;
		this.checkBox = checkBox;
	}
	
	@Override
	public void doMove() {
		checkBox.setActionCommand("disable");
	}

	@Override
	public void undoMove() {
		checkBox.setActionCommand("enable");
	}

}
