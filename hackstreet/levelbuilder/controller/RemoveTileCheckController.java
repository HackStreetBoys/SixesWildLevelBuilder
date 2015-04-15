package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class RemoveTileCheckController implements ActionListener {

	LevelBuilderApplication application;
	
	public RemoveTileCheckController(LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JCheckBox checkBox = (JCheckBox)(e.getSource());
		if (checkBox.isSelected()){
			application.model.getActiveLevel().setNumRemove(1);
		}
		else{
			application.model.getActiveLevel().setNumRemove(0);
		}			
	}
}
