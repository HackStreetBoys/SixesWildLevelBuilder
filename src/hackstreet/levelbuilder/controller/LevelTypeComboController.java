package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.LightningLevelConfig;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.editor.AbstractLevelEditorScreen;
import hackstreet.levelbuilder.gui.editor.EliminationLevelEditorScreen;
import hackstreet.levelbuilder.gui.editor.LightningLevelEditorScreen;
import hackstreet.levelbuilder.gui.editor.PuzzleLevelEditorScreen;
import hackstreet.levelbuilder.gui.editor.ReleaseLevelEditorScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

/**
 * Takes in a String from the LevelEditor's JComboBox,
 * and uses it to change the kind of AbstractLevelConfig being used.
 * @author Nicholas
 */
public class LevelTypeComboController implements ItemListener{

	LevelBuilderApplication application;
	
	public LevelTypeComboController(LevelBuilderApplication application) {
		this.application = application;
	}
	
	/**
	 * Takes in a String from the LevelEditor's JComboBox,
	 * and uses it to change the kind of AbstractLevelConfig being used.
	 */
	
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		JComboBox<String> combo = (JComboBox<String>)arg0.getSource();
        application.changeLevelConfigType((String)combo.getSelectedItem());
        AbstractLevelEditorScreen editor = application.getLevelEditorScreen();
        String type = (String)combo.getSelectedItem();
        if(type.equals("Elimination")){
        	application.model.setLevelConfig(new EliminationLevelConfig(50));
        	application.setLevelEditorScreen(new EliminationLevelEditorScreen(application));
        	return;
        }
        else if(type.equals("Release")){
        	application.model.setLevelConfig(new ReleaseLevelConfig(50));
        	application.setLevelEditorScreen(new ReleaseLevelEditorScreen(application));
        	return;
        }
        else if(type.equals("Lightning")){
        	application.model.setLevelConfig(new LightningLevelConfig(60));
        	application.setLevelEditorScreen(new LightningLevelEditorScreen(application));
        	return;
        }
        else if(type.equals("Puzzle")){
        	application.model.setLevelConfig(new PuzzleLevelConfig(50));
        	application.setLevelEditorScreen(new PuzzleLevelEditorScreen(application));
        	return;
        }
        
		
	}
}
