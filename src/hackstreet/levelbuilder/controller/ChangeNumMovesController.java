package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.move.ChangeNumMovesMove;

import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ChangeNumMovesController implements ChangeListener {

	LevelBuilderApplication application;
	int numMoves;
	
	public ChangeNumMovesController(LevelBuilderApplication application, int numMoves){
		this.application = application;
		this.numMoves = numMoves;
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JTextField textField = (JTextField) (e.getSource());
		ChangeNumMovesMove move = new ChangeNumMovesMove(application.getModel(), textField, numMoves);
		if(move.doMove()){
			application.getModel().logMove(move);     // Successful Move has been made and pushed to the stack
		}
	}

}
