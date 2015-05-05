package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.main.SWLevelBuilder;

import javax.swing.JTextField;

public class ChangeNumMovesMove implements IMove {
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
		if(model.getLevelConfig().getType() == "Puzzle"){
			PuzzleLevelConfig config = (PuzzleLevelConfig) model.getLevelConfig();
			config.setNumMoves(numMoves);
			String moves = "" + numMoves ;
			textField.setText(moves);
			return true;
		}
		else if(model.getLevelConfig().getType() == "Elimination"){
			EliminationLevelConfig config = (EliminationLevelConfig) model.getLevelConfig();
			config.setNumMoves(numMoves);
			String moves = "" + numMoves ;
			textField.setText(moves);
			return true;
		}
		else if(model.getLevelConfig().getType() == "Release"){
			ReleaseLevelConfig config = (ReleaseLevelConfig) model.getLevelConfig();
			config.setNumMoves(numMoves);
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
