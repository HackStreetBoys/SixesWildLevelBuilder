package hackstreet.levelbuilder.move;

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
			model.getActiveLevel().setNumRemove(1);
			return true;
		}
		
		else if(!(checkBox.isEnabled())){
			model.getActiveLevel().setNumRemove(0);
			return true;
		}
		
		else{
			return false;
		}
		
	}

	@Override
	public boolean undoMove() {
			
		model.undoMove();
		
			if (checkBox.isEnabled()){
			checkBox.setEnabled(false);
			model.getActiveLevel().setNumRemove(0);
			return true;
		}
			
		else if(!(checkBox.isEnabled())){
			checkBox.setEnabled(true);
			model.getActiveLevel().setNumRemove(1);
			return true;
		}
			
		else{
			return false;
		}
	}
}
