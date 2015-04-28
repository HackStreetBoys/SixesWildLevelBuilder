package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.main.SWLevelBuilder;

import javax.swing.JCheckBox;

public class SwitchTilesCheckMove implements IMove{

	SWLevelBuilder model;
	JCheckBox checkBox;
	
	public SwitchTilesCheckMove(SWLevelBuilder model, JCheckBox checkBox) {
		this.model = model;
		this.checkBox = checkBox;
	}
	
	@Override
	public boolean doMove() {
		if(checkBox.isEnabled()) {
			this.model.getActiveLevel().setNumSwap(1);
			return true;
		}
		
		else if(checkBox.isEnabled()) {
			this.model.getActiveLevel().setNumSwap(1);
			return true;
		}
		
		else {
			return false;
		}
	}

	@Override
	public boolean undoMove() {
		if(checkBox.isEnabled()){
			checkBox.setEnabled(false);
			this.model.getActiveLevel().setNumSwap(0);
			return true;
		}
		
		else if (!(checkBox.isEnabled())){
			checkBox.setEnabled(true);
			this.model.getActiveLevel().setNumSwap(1);
			return true;
		}
		
		else {
			return false;
		}

	}

}
