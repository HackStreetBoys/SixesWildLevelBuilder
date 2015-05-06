package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.config.AbstractLevelConfig;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 * @author ??
 */

public class ToggleCheckResetBoardMove implements IMove {
	SWLevelBuilder model;
	JCheckBox resetCheck;
	
	public ToggleCheckResetBoardMove(SWLevelBuilder model, JCheckBox check) {
		this.model = model;
		this.resetCheck = check;
		
	}
	
	@Override
	public boolean doMove() {
		AbstractLevelConfig config = model.getLevelConfig();
		if ( resetCheck.isSelected() == true)
			config.setNumShuffle(1);
		else
			config.setNumShuffle(0);
		return true;
	}
	
	@Override
	public boolean undoMove() {
		if ( resetCheck.isSelected() == true)
			resetCheck.setSelected(false);
		else
			resetCheck.setSelected(true);
	
		return false;
	}
}
