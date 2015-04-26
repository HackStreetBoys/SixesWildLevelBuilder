package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

public class ToNewLevelController implements ActionListener {
	LevelBuilderApplication application;
	
	public ToNewLevelController(LevelBuilderApplication application){
		this.application = application;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		application.enterLevelEditorScreen();
	}
	
}
