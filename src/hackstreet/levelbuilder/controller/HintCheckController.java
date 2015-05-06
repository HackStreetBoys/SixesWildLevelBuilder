package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.HintCheckMove;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

/**
 * Controller for turning hint on and off.
 * 
 * @author Himanshu
 */
public class HintCheckController implements ActionListener {

	LevelBuilderApplication application;
	
	public HintCheckController(LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JCheckBox checkBox = (JCheckBox)(e.getSource());
		HintCheckMove move = new HintCheckMove(application.getModel(), checkBox);
		if(move.doMove()){
			application.getModel().logMove(move);
		}
	}
}
