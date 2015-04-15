package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToLevelManagerController implements ActionListener{
	LevelBuilderApplication application;
	
	public ToLevelManagerController (LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		application.enterMainScreen();
	}
	
}
