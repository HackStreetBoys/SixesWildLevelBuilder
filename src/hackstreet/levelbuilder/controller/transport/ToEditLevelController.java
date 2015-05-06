package hackstreet.levelbuilder.controller.transport;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.LightningLevelConfig;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.controller.ChangeSlotTypeController;
import hackstreet.levelbuilder.elements.Location;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.editor.AbstractLevelEditorScreen;
import hackstreet.levelbuilder.gui.editor.EliminationLevelEditorScreen;
import hackstreet.levelbuilder.gui.editor.LightningLevelEditorScreen;
import hackstreet.levelbuilder.gui.editor.PuzzleLevelEditorScreen;
import hackstreet.levelbuilder.gui.editor.ReleaseLevelEditorScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToEditLevelController implements ActionListener {
	LevelBuilderApplication application;
	
	public ToEditLevelController(LevelBuilderApplication application){
		this.application = application;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		AbstractLevelConfig alc = application.model.loadLevel();
		application.model.setLevelConfig(alc);
//		application.enterLevelEditorScreen();
		 AbstractLevelEditorScreen editor = application.getLevelEditorScreen();
		 System.out.print(application.model.getLevelConfig().getJSON());
        if(alc.getType().equals("Elimination")){
        	
        	application.setLevelEditorScreen(new EliminationLevelEditorScreen(application,editor));
        	return;
        }
        else if(alc.getType().equals("Release")){
        	
        	application.setLevelEditorScreen(new ReleaseLevelEditorScreen(application,editor));
        	return;
        }
        else if(alc.getType().equals("Lightning")){
        	
        	application.setLevelEditorScreen(new LightningLevelEditorScreen(application,editor));
        	return;
        }
        else if(alc.getType().equals("Puzzle")){
        	
        	application.setLevelEditorScreen(new PuzzleLevelEditorScreen(application,editor));
        	return;
        }
       
   
        

	
	}

}