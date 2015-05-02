package hackstreet.levelbuilder.controller;

/**
 * @author Himanshu
 */

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.FrequencyChangeMove;

public class SliderController implements ChangeListener {

	LevelBuilderApplication application;
	int number;
	
	public SliderController(LevelBuilderApplication application,int number){
		this.application = application;
		this.number = number;
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider slider = (JSlider) (e.getSource());
		FrequencyChangeMove move = new FrequencyChangeMove(application, slider, number);
		if(move.doMove()){
			application.getModel().logMove(move);
		}
	}
}
