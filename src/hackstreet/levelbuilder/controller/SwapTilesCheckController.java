package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.SwapTilesCheckMove;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;


/**
 * Controller for swap tiles special move on/off.
 * 
 * @author Himanshu, Pat
 *
 */
public class SwapTilesCheckController implements ActionListener {

	LevelBuilderApplication application;
	
	public SwapTilesCheckController(LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JCheckBox checkBox = (JCheckBox)(e.getSource());
		SwapTilesCheckMove move = new SwapTilesCheckMove(application.getModel(), checkBox);
		if(move.doMove()){
			application.getModel().logMove(move);     // Successful Move has been made and pushed to the stack
			}
		}
}
