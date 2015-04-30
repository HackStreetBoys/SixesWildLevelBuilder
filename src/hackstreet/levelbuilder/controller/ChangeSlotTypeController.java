package hackstreet.levelbuilder.controller;

/**
 * @author Himanshu
 */

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.ChangeSlotTypeMove;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ChangeSlotTypeController implements ActionListener {

	LevelBuilderApplication application;
	
	public ChangeSlotTypeController(LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) (e.getSource());
		ChangeSlotTypeMove move = new ChangeSlotTypeMove(application.getModel(), button);
		if(move.doMove()){
			application.getModel().logMove(move);     // Successful Move has been made and pushed to the stack
		}
	}	
}
