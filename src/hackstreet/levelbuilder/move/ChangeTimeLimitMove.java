package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.config.LightningLevelConfig;

import javax.swing.JTextField;

/**
 * Change time limit in Lightning game type
 * @author Himanshu
 */

public class ChangeTimeLimitMove implements IMove{

	SWLevelBuilder model;
	JTextField textField;
	int seconds;
	
	public ChangeTimeLimitMove(SWLevelBuilder model, JTextField textField) {
		this.model = model;
		this.textField = textField;
		this.seconds = Integer.parseInt(this.textField.getText());
	}
	
	@Override
	public boolean doMove() {
		if(model.getLevelConfig().getType() == "Lightning"){
			LightningLevelConfig config = (LightningLevelConfig) model.getLevelConfig();
			config.setSeconds(seconds);
			return true;
		}
		else 
			return false;
	}

	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
