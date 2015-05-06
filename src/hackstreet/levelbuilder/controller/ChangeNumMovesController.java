package hackstreet.levelbuilder.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.ChangeNumMovesMove;

import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Controller for changing the number of moves.
 * 
 * @author Himanshu 
 *
 */
public class ChangeNumMovesController implements KeyListener {

	LevelBuilderApplication application;

	public ChangeNumMovesController(LevelBuilderApplication application){
		this.application = application;
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		JTextField textField = (JTextField) (e.getSource());
		ChangeNumMovesMove move = new ChangeNumMovesMove(application.getModel(), textField);
		if(move.doMove()){
			application.getModel().logMove(move);     // Successful Move has been made and pushed to the stack
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {}

}
