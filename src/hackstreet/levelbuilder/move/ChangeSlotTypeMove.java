package hackstreet.levelbuilder.move;

/**
 * @author Himanshu
 */

import javax.swing.JButton;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.Location;
import hackstreet.levelbuilder.main.SWLevelBuilder;

public class ChangeSlotTypeMove extends AbstractLevelConfig implements IMove {

	SWLevelBuilder model;
	JButton button;
	Location location;
	
	public ChangeSlotTypeMove(SWLevelBuilder model, JButton button) {
		this.model = model;
		this.location = new Location(button.getLocation().x, button.getLocation().y); 
	}
	
	@Override
	public boolean doMove() {
		if(button.isEnabled()){
			model.getActiveLevel().getNullLocations().add(location);
			button.setEnabled(false);
			return true;
		}
		else if(!(button.isEnabled())){
			model.getActiveLevel().getNullLocations().remove(location);
			button.setEnabled(true);
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
		return false;
	}

}
