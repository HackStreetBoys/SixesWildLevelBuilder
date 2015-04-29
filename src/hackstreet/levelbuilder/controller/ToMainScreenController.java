package hackstreet.levelbuilder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;

public class ToMainScreenController implements ActionListener {
	LevelBuilderApplication application;
	
	public ToMainScreenController(LevelBuilderApplication application) {
		this.application = application;
	}
	
	public void actionPerformed(ActionEvent ae) {
		application.enterMainScreen();
	}
 }
