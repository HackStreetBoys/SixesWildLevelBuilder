package hackstreet.levelbuilder.move;

import javax.swing.JSlider;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.main.SWLevelBuilder;

public class FrequencyChangeMove extends AbstractLevelConfig implements IMove {

	SWLevelBuilder model;
	int before;
	int after;
	JSlider slider;
	int number;
	double frequency;
	
	public FrequencyChangeMove(SWLevelBuilder model, JSlider slider, int before){
		this.model = model;	
		this.slider = slider;
		this.after = slider.getValue();
	}
	
	@Override
	public boolean doMove() {
		// TODO Auto-generated method stub
		//Once, slider stops moving, update the value
		frequency = after;
		return true;
	}

	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
		slider.setValue(before);
		return true;
	}

}
