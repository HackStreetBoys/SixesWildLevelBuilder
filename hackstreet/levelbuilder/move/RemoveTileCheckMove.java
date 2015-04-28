package hackstreet.levelbuilder.move;

import javax.swing.JCheckBox;

import hackstreet.levelbuilder.main.SWLevelBuilder;

public class RemoveTileCheckMove implements IMove{

	//Think about how to implement the stack here
	
	SWLevelBuilder model;
	JCheckBox checkBox;
//	boolean before;
//	boolean after;
// Didn't use before and after. They were over complicating things
	
	public RemoveTileCheckMove(SWLevelBuilder model, JCheckBox checkBox) {
		this.model = model;
		this.checkBox = checkBox;
	}
	
	@Override
	public boolean doMove() {
		if(checkBox.isEnabled()){
		checkBox.setEnabled(false);
//		checkBox.setActionCommand("disable");
// This is the alternate way of doing it
		return true;
		}
		
		else if(!(checkBox.isEnabled())){
			checkBox.setEnabled(true);
//			checkBox.setActionCommand("disable");
	// This is the alternate way of doing it
			return true;
		}
		
		else{
			return false;
		}
		
	}

	@Override
	public boolean undoMove() {
			if (checkBox.isEnabled()){
			checkBox.setEnabled(false);
//			checkBox.setActionCommand("disable");
	// This is the alternate way of doing it
			return true;
		}
			
		else if(!(checkBox.isEnabled())){
			checkBox.setEnabled(true);
	//		checkBox.setActionCommand("disable");
	// This is the alternate way of doing it
			return true;
		}
			
		else{
			return false;
		}
	}

}
