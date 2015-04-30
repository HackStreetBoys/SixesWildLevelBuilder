package hackstreet.levelbuilder.move;

/**
 * @author Himanshu
 */

import javax.swing.JCheckBox;

import hackstreet.levelbuilder.main.SWLevelBuilder;

public class RemoveTileCheckMove implements IMove{

	SWLevelBuilder model;
	JCheckBox checkBox;
	
	public RemoveTileCheckMove(SWLevelBuilder model, JCheckBox checkBox) {
		this.model = model;
		this.checkBox = checkBox;
	}
	
	@Override
	public boolean doMove() {
		if(checkBox.isEnabled()){
			model.getLevelConfig().setNumRemove(1);
			return true;
		}
		
		else if(!(checkBox.isEnabled())){
			model.getLevelConfig().setNumRemove(0);
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
			model.getLevelConfig().setNumRemove(0);
			return true;
		}
			
		else if(!(checkBox.isEnabled())){
			checkBox.setEnabled(true);
			model.getLevelConfig().setNumRemove(1);
			return true;
		}
			
		else{
			return false;
		}
	}
}
