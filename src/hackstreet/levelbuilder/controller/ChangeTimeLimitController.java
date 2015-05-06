package hackstreet.levelbuilder.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.ChangeTimeLimitMove;

import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Controller for chaing the timer limit.
 * 
 * @author Himanshu, Pat
 *
 */
public class ChangeTimeLimitController implements KeyListener{
	LevelBuilderApplication application;

	public ChangeTimeLimitController(LevelBuilderApplication application){
		this.application = application;
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		JTextField textField = (JTextField) (e.getSource());
		ChangeTimeLimitMove move = new ChangeTimeLimitMove(application.getModel(), textField);
		if(move.doMove()){
			application.getModel().logMove(move);     // Successful Move has been made and pushed to the stack
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {}

}
