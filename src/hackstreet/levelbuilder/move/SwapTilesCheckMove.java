package hackstreet.levelbuilder.move;

/**
 * @author Himanshu
 */

import hackstreet.levelbuilder.SWLevelBuilder;

import javax.swing.JCheckBox;

public class SwapTilesCheckMove implements IMove{

	SWLevelBuilder model;
	JCheckBox checkBox;
	
	public SwapTilesCheckMove(SWLevelBuilder model, JCheckBox checkBox) {
		this.model = model;
		this.checkBox = checkBox;
	}
	
	@Override
	public boolean doMove() {
		if(checkBox.isEnabled()){
			model.getLevelConfig().setNumSwap(1);
			return true;
		}
		
		else if(!(checkBox.isEnabled())){
			model.getLevelConfig().setNumSwap(0);
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
			model.getLevelConfig().setNumSwap(0);
			return true;
		}
			
		else if(!(checkBox.isEnabled())){
			checkBox.setEnabled(true);
			model.getLevelConfig().setNumSwap(1);
			return true;
		}
			
		else{
			return false;
		}
	}
}
