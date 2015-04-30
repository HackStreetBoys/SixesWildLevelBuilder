package hackstreet.levelbuilder.move;

/**
 * @author Himanshu
 */

import javax.swing.JCheckBox;

import hackstreet.levelbuilder.main.SWLevelBuilder;

public class HintCheckMove implements IMove{

	SWLevelBuilder model;
	JCheckBox checkBox;
	
	public HintCheckMove(SWLevelBuilder model, JCheckBox checkBox) {
		this.model = model;
		
		this.checkBox = checkBox;
	}
	
	@Override
	public boolean doMove() {
		if(checkBox.isEnabled()){
			model.getLevelConfig().setNumHint(1);
			return true;
		}
		else if(checkBox.isEnabled()){
			model.getLevelConfig().setNumHint(0);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public boolean undoMove() {
		//Pretty much just disables the checkbox is previously enables, same code as doMove() for now. Will have to investigate further
		
		//!!Write logic for undoMove() in AbstractLevelConfig.java 
		model.undoMove(this);
		
		if(checkBox.isEnabled()){
			checkBox.setEnabled(false);
			model.getLevelConfig().setNumHint(0);
			return true;
		}
		else if(!(checkBox.isEnabled())){
			checkBox.setEnabled(true);
			model.getLevelConfig().setNumHint(1);
			return true;
		}
		else{
			return false;
		}
	}


}
