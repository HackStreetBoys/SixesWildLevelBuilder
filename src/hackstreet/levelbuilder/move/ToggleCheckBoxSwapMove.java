package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.config.AbstractLevelConfig;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class ToggleCheckBoxSwapMove implements IMove {
	SWLevelBuilder model;
	JCheckBox swapCheck;
	
	public ToggleCheckBoxSwapMove(SWLevelBuilder model, JCheckBox check) {
		this.model = model;
		this.swapCheck = check;
		
	}
	
	@Override
	public boolean doMove() {
		AbstractLevelConfig config = model.getLevelConfig();
		if ( swapCheck.isSelected() == true)
			config.setNumSwap(1);
		else
			config.setNumSwap(0);
		return true;
	}
	
	@Override
	public boolean undoMove() {
		if ( swapCheck.isSelected() == true)
			swapCheck.setSelected(false);
		else
			swapCheck.setSelected(true);
	
		return false;
	}
}
