package hackstreet.levelbuilder.move;

/**
 * @author Himanshu, Ben
 */

import java.awt.Color;

import javax.swing.JButton;

import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.elements.Location;

public class ChangeSlotTypeMove implements IMove {

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
			ReleaseLevelConfig config = (ReleaseLevelConfig)model.getLevelConfig();
			if(button.getBackground() == Color.LIGHT_GRAY){
				config.getNullLocations().add(location);
				button.setBackground(Color.black);
				return true;
			}
			else if(button.getBackground() == Color.black){
				config.getNullLocations().remove(location);
				config.getBucketLocations().add(location);
				button.setBackground(Color.green);
				return true;
			}
		
			else if(button.getBackground() == Color.green){
				config.getBucketLocations().remove(location);
				config.getSixLocations().add(location);
				button.setBackground(Color.pink);
				return true;
			}
			else if(button.getBackground() == Color.pink){
				config.getSixLocations().remove(location);
				config.getNullLocations().remove(location);
				button.setBackground(Color.LIGHT_GRAY);
				return true;
			}
			else{
				return false;
			}
		}
		else {		
			if(button.getBackground() == Color.LIGHT_GRAY){
				System.err.println("Event Fired");
				
				
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
		
		
	}

	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
		return false;
	}

}
