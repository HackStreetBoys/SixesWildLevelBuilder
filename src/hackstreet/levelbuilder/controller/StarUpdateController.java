package hackstreet.levelbuilder.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.ChangeStarPointsMove;

import javax.swing.JTextField;

/**
 * Controller for updating star threshold.
 * 
 * @author Himanshu
 *
 */
public class StarUpdateController implements KeyListener{

	LevelBuilderApplication application;
	JTextField textField;
	int number;

	public StarUpdateController(LevelBuilderApplication application, JTextField textField, int number){
		this.application = application;
		this.textField = textField;
		this.number = number;
	}

	

	@Override
	public void keyReleased(KeyEvent e) {
		JTextField textField = (JTextField) (e.getSource());
		ChangeStarPointsMove move = new ChangeStarPointsMove(application.getModel(), textField, number);
		if(move.doMove()){
			application.getModel().logMove(move);     // Successful Move has been made and pushed to the stack
		}
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



}
