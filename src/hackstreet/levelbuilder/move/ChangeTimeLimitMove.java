package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.config.LightningLevelConfig;
import hackstreet.levelbuilder.main.SWLevelBuilder;

import javax.swing.JTextField;

public class ChangeTimeLimitMove implements IMove{

	SWLevelBuilder model;
	JTextField textField;
	int seconds;
	
	public ChangeTimeLimitMove(SWLevelBuilder model, JTextField textField, int seconds) {
		this.model = model;
		this.textField = textField;
		this.seconds = seconds;
	}
	
	@Override
	public boolean doMove() {
		if(model.getLevelConfig().getType() == "Lightning"){
			LightningLevelConfig config = (LightningLevelConfig) model.getLevelConfig();
			config.setSeconds(seconds);
			String sec = "" + seconds ;
			textField.setText(sec);
			return true;
		}
		else if(model.getLevelConfig().getType() == "Release" || model.getLevelConfig().getType() == "Elimination" || model.getLevelConfig().getType() == "Puzzle")
			return true;
		else
			return false;
	}

	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
