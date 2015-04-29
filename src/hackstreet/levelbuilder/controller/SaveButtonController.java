package hackstreet.levelbuilder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.main.SWLevelBuilder;

public class SaveButtonController implements ActionListener{
	
	//author Ben
	SWLevelBuilder model;
	enum lType { Lightning,Puzzle,Elimination};

	public SaveButtonController(SWLevelBuilder m){
		model = m;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		model.saveLevel();
		
		
		
//		switch(lType){
//		case lType.Elimination:
//			out = new EliminationLevelConfig();
//			break;
//		case lType.Lightning:
//			out = new LightningLevelConfig();
//		case lType.Puzzle:
//			out = new PuzzleLevelConfig();
//			break;
//		}
//			if (out.Type == Type.Elimination)
//		model.saveLevel();
	}

}
