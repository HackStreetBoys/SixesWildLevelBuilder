package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.config.AbstractLevelConfig;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 * @author ??
 */

public class ToggleCheckBoxRemove implements IMove {
	SWLevelBuilder model;
	JCheckBox removeCheck;
	
	public ToggleCheckBoxRemove(SWLevelBuilder model, JCheckBox check) {
		this.model = model;
		this.removeCheck = check;
		
	}
	
	@Override
	public boolean doMove() {
		AbstractLevelConfig config = model.getLevelConfig();
		if ( removeCheck.isSelected() == true)
			config.setNumRemove(1);
		else
			config.setNumRemove(0);
		return true;
	}
	
	@Override
	public boolean undoMove() {
		if ( removeCheck.isSelected() == true)
			removeCheck.setSelected(false);
		else
			removeCheck.setSelected(true);
	
		return false;
	}
}
