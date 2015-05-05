package hackstreet.levelbuilder.move;

/**
 * @author Himanshu
 */

import java.awt.Color;

import javax.swing.JButton;
import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.Location;
import hackstreet.levelbuilder.main.SWLevelBuilder;

public class ChangeSlotTypeMove extends AbstractLevelConfig implements IMove {

	SWLevelBuilder model;
	JButton button;
	Location location;
	
	public ChangeSlotTypeMove(SWLevelBuilder model, JButton button, Location location) {
		this.model = model;
		this.button = button;
		this.location = location;
	}
	
	@Override
	public boolean doMove() {
			
		if(model.getLevelConfig().getType() == "Release"){
			if(button.getBackground() == Color.LIGHT_GRAY){
				model.getLevelConfig().getNullLocations().add(location);
				button.setBackground(Color.black);
				return true;
			}
			else if(button.getBackground() == Color.black){
				model.getLevelConfig().getNullLocations().remove(location);
				model.getLevelConfig().getBucketLocations().add(location);
				button.setBackground(Color.green);
				return true;
			}
		
			else if(button.getBackground() == Color.green){
				model.getLevelConfig().getBucketLocations().remove(location);
				model.getLevelConfig().getSixLocations().add(location);
				button.setBackground(Color.pink);
				return true;
			}
			
			else if(button.getBackground() == Color.pink){
				model.getLevelConfig().getSixLocations().remove(location);
				model.getLevelConfig().getNullLocations().remove(location);
				button.setBackground(Color.LIGHT_GRAY);
				return true;
			}
			else{
				return false;
			}
		}
		else if (model.getLevelConfig().getType() == "Puzzle" || model.getLevelConfig().getType() == "Elimination" || model.getLevelConfig().getType() == "Lightning") {		
			if(button.getBackground() == Color.LIGHT_GRAY){
				model.getLevelConfig().getNullLocations().add(location);
				button.setBackground(Color.black);
				return true;
			}
			else if(button.getBackground() == Color.black){
				model.getLevelConfig().getNullLocations().remove(location);
				button.setBackground(Color.LIGHT_GRAY);
				return true;
			}
			else{
				return false;
			}
		}
		
		else {
			return false;
		}
	}

	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
		return false;
	}

}
