package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.PassiveGameScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * On button press, go to Passive Game Screen.
 * @author Himanshu
 */
public class PreviewButtonController implements ActionListener{

	LevelBuilderApplication application;
		
	public PreviewButtonController(LevelBuilderApplication application){
			this.application = application;
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame frame = new JFrame("Level Preview");
		frame.setSize(540,540);
		frame.setLocation(100,100);
		frame.getContentPane().add(new PassiveGameScreen(this.application));
		frame.setVisible(true);
	}
}

