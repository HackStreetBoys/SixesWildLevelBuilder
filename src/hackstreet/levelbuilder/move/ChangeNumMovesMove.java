package hackstreet.levelbuilder.move;

import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;

import javax.swing.JTextField;

public class ChangeNumMovesMove implements IMove {
	SWLevelBuilder model;
	JTextField textField;
	int numMoves;
	
	public ChangeNumMovesMove(SWLevelBuilder model, JTextField textField) {
		this.model = model;
		this.textField = textField;
		this.numMoves = Integer.parseInt(this.textField.getText());
	}
	
	@Override
	public boolean doMove() {
		if(model.getLevelConfig().getType() == "Puzzle"){
			PuzzleLevelConfig config = (PuzzleLevelConfig) model.getLevelConfig();
			config.setNumMoves(numMoves);
			return true;
		}
		else if(model.getLevelConfig().getType() == "Elimination"){
			EliminationLevelConfig config = (EliminationLevelConfig) model.getLevelConfig();
			config.setNumMoves(numMoves);
			return true;
		}
		else if(model.getLevelConfig().getType() == "Release"){
			ReleaseLevelConfig config = (ReleaseLevelConfig) model.getLevelConfig();
			config.setNumMoves(numMoves);
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
