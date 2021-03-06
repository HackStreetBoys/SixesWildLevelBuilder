package hackstreet.levelbuilder.controller;


import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.RemoveTileCheckMove;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

/**
 * Controller for setting remove tile special move on and off.
 * 
 * @author Himanshu
 *
 */
public class RemoveTileCheckController implements ActionListener {

	LevelBuilderApplication application;
	
	public RemoveTileCheckController(LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JCheckBox checkBox = (JCheckBox)(e.getSource());
		RemoveTileCheckMove move = new RemoveTileCheckMove(application.getModel(), checkBox);
		if(move.doMove()){
			application.getModel().logMove(move);     // Successful Move has been made and pushed to the stack
			}
		}
}
