package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class SwapTilesCheckController implements ActionListener {

	LevelBuilderApplication application;
	
	public SwapTilesCheckController(LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JCheckBox checkBox = (JCheckBox)(e.getSource());
		if (checkBox.isSelected()){
			application.model.getActiveLevel().setNumSwap(1);
		}
		else{
			application.model.getActiveLevel().setNumSwap(0);
		}			
	}
}
