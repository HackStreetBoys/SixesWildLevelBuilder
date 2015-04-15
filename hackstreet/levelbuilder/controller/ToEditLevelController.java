package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

public class ToEditLevelController implements ActionListener {
	LevelBuilderApplication application;
	
	public ToEditLevelController(LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);
		application.enterLevelEditorScreen();
	}
	
}
