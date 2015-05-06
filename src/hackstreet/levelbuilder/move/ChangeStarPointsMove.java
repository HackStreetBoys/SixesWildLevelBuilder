package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.config.AbstractLevelConfig;

import javax.swing.JTextField;

/**
 * Change number of points for 1,2,3 stars
 * @author Himanshu, Pat
 */
public class ChangeStarPointsMove implements IMove {
	SWLevelBuilder model;
	JTextField textField;
	int numStar;
	int numPoints;
	
	public ChangeStarPointsMove(SWLevelBuilder model, JTextField textField, int numStar) {
		this.model = model;
		this.textField = textField;
		this.numStar = numStar;
		this.numPoints = Integer.parseInt(this.textField.getText());
	}
	
	@Override
	public boolean doMove() {
		AbstractLevelConfig config = model.getLevelConfig();
		if(numStar == 1)
			config.setPointsStar1(numPoints);
		else if(numStar == 2)
			config.setPointsStar2(numPoints);
		else if(numStar == 3)
			config.setPointsStar3(numPoints);
		else
			return false;
		return true;
	}
	
	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
		return false;
	}
}
