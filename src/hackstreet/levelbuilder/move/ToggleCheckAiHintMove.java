package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.config.AbstractLevelConfig;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 * @author ??
 */

public class ToggleCheckAiHintMove implements IMove {
	SWLevelBuilder model;
	JCheckBox aiCheck;
	
	public ToggleCheckAiHintMove(SWLevelBuilder model, JCheckBox check) {
		this.model = model;
		this.aiCheck = check;
		
	}
	
	@Override
	public boolean doMove() {
		AbstractLevelConfig config = model.getLevelConfig();
		if ( aiCheck.isSelected() == true)
			config.setNumHint(1);
		else
			config.setNumHint(0);
		return true;
	}
	
	@Override
	public boolean undoMove() {
		if ( aiCheck.isSelected() == true)
			aiCheck.setSelected(false);
		else
			aiCheck.setSelected(true);
	
		return false;
	}
}
