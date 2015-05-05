package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.ChangeTimeLimitMove;

import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ChangeTimeLimitController implements ChangeListener{
	LevelBuilderApplication application;
	int seconds;
	
	public ChangeTimeLimitController(LevelBuilderApplication application, int seconds){
		this.application = application;
		this.seconds = seconds;
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JTextField textField = (JTextField) (e.getSource());
		ChangeTimeLimitMove move = new ChangeTimeLimitMove(application.getModel(), textField, seconds);
		if(move.doMove()){
			application.getModel().logMove(move);     // Successful Move has been made and pushed to the stack
		}
	}

}
