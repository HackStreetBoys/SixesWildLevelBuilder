package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.main.SWLevelBuilder;

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
			model.getActiveLevel().setNumSwap(1);
			return true;
		}
		
		else if(!(checkBox.isEnabled())){
			model.getActiveLevel().setNumSwap(0);
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
			model.getActiveLevel().setNumSwap(0);
			return true;
		}
			
		else if(!(checkBox.isEnabled())){
			checkBox.setEnabled(true);
			model.getActiveLevel().setNumSwap(1);
			return true;
		}
			
		else{
			return false;
		}
	}
}
