package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
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
		if (checkBox.isSelected()){
			application.model.getActiveLevel().setNumShuffle(1);
		}
		else{
			application.model.getActiveLevel().setNumShuffle(0);
		}			
	}
}
