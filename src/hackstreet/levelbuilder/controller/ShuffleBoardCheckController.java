package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.ShuffleBoardCheckMove;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

public class ShuffleBoardCheckController implements ActionListener {

	LevelBuilderApplication application;
	
	public ShuffleBoardCheckController(LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JCheckBox checkBox = (JCheckBox)(e.getSource());
		ShuffleBoardCheckMove move = new ShuffleBoardCheckMove(application.getModel(), checkBox);
		if(move.doMove()){
			application.getModel().logMove(move);     // Successful Move has been made and pushed to the stack
			}
		}
}
