package hackstreet.levelbuilder.move;

import javax.swing.JCheckBox;

import hackstreet.levelbuilder.SWLevelBuilder;

/**
 * Shuffle board special move
 * @author Himanshu
 */

public class ShuffleBoardCheckMove implements IMove{

	SWLevelBuilder model;
	JCheckBox checkBox;
	
	public ShuffleBoardCheckMove(SWLevelBuilder model, JCheckBox checkBox){
		this.model = model;
		this.checkBox = checkBox;
	}
	
	@Override
	public boolean doMove() {
		if(checkBox.isEnabled()){
			model.getLevelConfig().setNumShuffle(1);
			return true;
		}
		
		else if(!(checkBox.isEnabled())){
			model.getLevelConfig().setNumShuffle(0);
			return true;
		}
		
		else{
			return false;
		}
		
	}

	@Override
	public boolean undoMove() {
			
		model.undoMove(this);
		
			if (checkBox.isEnabled()){
			checkBox.setEnabled(false);
			model.getLevelConfig().setNumShuffle(0);
			return true;
		}
			
		else if(!(checkBox.isEnabled())){
			checkBox.setEnabled(true);
			model.getLevelConfig().setNumShuffle(1);
			return true;
		}
			
		else{
			return false;
		}
	}
}
