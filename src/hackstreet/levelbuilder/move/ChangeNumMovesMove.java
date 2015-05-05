package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.main.SWLevelBuilder;

import javax.swing.JTextField;

public class ChangeNumMovesMove extends AbstractLevelConfig implements IMove {
	SWLevelBuilder model;
	JTextField textField;
	int numMoves;
	
	public ChangeNumMovesMove(SWLevelBuilder model, JTextField textField, int numMoves) {
		this.model = model;
		this.textField = textField;
		this.numMoves = numMoves;
	}
	
	@Override
	public boolean doMove() {
		if(model.getLevelConfig().getType() == "Puzzle" || model.getLevelConfig().getType() == "Elimination" || model.getLevelConfig().getType() == "Release"){
			model.getLevelConfig().setNumMoves(numMoves);
			String moves = "" + numMoves ;
			textField.setText(moves);
			return true;
		}
		else if(model.getLevelConfig().getType() == "Lightning"){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
		return false;
	}
}
