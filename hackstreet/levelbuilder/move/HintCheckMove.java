package hackstreet.levelbuilder.move;

import javax.swing.JCheckBox;

import hackstreet.levelbuilder.main.SWLevelBuilder;

public class HintCheckMove implements IMove{

	SWLevelBuilder model;
	boolean before;
	//boolean after;
	//Never used after
	JCheckBox checkBox;
	
	public HintCheckMove(SWLevelBuilder model, boolean before, JCheckBox checkBox) {
		this.model = model;
		this.before = before;
		this.checkBox = checkBox;
	}
	
	@Override
	public boolean doMove() {
		if(before == true){
			checkBox.setEnabled(false);
			return true;
		}
		else if(before == false){
			checkBox.setEnabled(true);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public boolean undoMove() {
		//Pretty much just disables the checkbox is previously enables, same code as doMove() for now. Will have to investigate further
		
		if(before == true){
			checkBox.setEnabled(false);
			return true;
		}
		else if(before == false){
			checkBox.setEnabled(true);
			return true;
		}
		else{
		return false;
		}
	}

}
