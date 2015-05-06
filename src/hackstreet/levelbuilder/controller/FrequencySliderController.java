package hackstreet.levelbuilder.controller;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.FrequencyChangeMove;

/**
 * Controller for changing the frequency of a slider.
 * 
 * @author Himanshu
 *
 */
public class FrequencySliderController implements ChangeListener {

	LevelBuilderApplication application;
	int number;
	
	public FrequencySliderController(LevelBuilderApplication application,int number){
		this.application = application;
		this.number = number;
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider slider = (JSlider) (e.getSource());
		FrequencyChangeMove move = new FrequencyChangeMove(application, slider);
		if(move.doMove()){
			application.getModel().logMove(move);
		}
	}
}
