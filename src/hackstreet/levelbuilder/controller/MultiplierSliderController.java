package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.MultiplierChangeMove;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Controller for changing the frequency of multipliers.
 * 
 * @author Himanshu
 *
 */
public class MultiplierSliderController implements ChangeListener {

	LevelBuilderApplication application;
	int number;
	
	public MultiplierSliderController(LevelBuilderApplication application,int number){
		this.application = application;
		this.number = number;
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider slider = (JSlider) (e.getSource());
		MultiplierChangeMove move = new MultiplierChangeMove(application, slider, number);
		if(move.doMove()){
			application.getModel().logMove(move);
		}
	}

}
