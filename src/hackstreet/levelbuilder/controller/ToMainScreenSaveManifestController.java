package hackstreet.levelbuilder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;


/**
 * @author Ben
 */


public class ToMainScreenSaveManifestController implements ActionListener {
	LevelBuilderApplication application;
	
	public ToMainScreenSaveManifestController(LevelBuilderApplication application) {
		this.application = application;
	}
	
	public void actionPerformed(ActionEvent ae) {
		application.saveLevelData();
		application.enterMainScreen();
	}
 }
