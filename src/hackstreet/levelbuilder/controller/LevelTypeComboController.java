package hackstreet.levelbuilder.controller;

import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.LightningLevelConfig;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.gui.EliminationLevelEditorScreen;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.LightningLevelEditorScreen;
import hackstreet.levelbuilder.gui.PuzzleLevelEditorScreen;
import hackstreet.levelbuilder.gui.ReleaseLevelEditorScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

/**
 * Takes in a String from the LevelEditor's JComboBox,
 * and uses it to change the kind of AbstractLevelConfig being used.
 * @author Nicholas
 */
public class LevelTypeComboController implements ActionListener{

	LevelBuilderApplication application;
	
	public LevelTypeComboController(LevelBuilderApplication application) {
		this.application = application;
	}
	
	/**
	 * Takes in a String from the LevelEditor's JComboBox,
	 * and uses it to change the kind of AbstractLevelConfig being used.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		@SuppressWarnings("unchecked")
		JComboBox<String> combo = (JComboBox<String>)e.getSource();
        application.changeLevelConfigType((String)combo.getSelectedItem());
        String type = (String)combo.getSelectedItem();
        if(type.equals("Elimination")){
        	application.model.setLevelConfig(new EliminationLevelConfig(50,application.model.getLevelConfig()));
        	application.setLevelEditorScreen(new EliminationLevelEditorScreen(application));
        }
        else if(type.equals("Release")){
        	application.model.setLevelConfig(new ReleaseLevelConfig(50,application.model.getLevelConfig()));
        	application.setLevelEditorScreen(new ReleaseLevelEditorScreen(application));
        }
        else if(type.equals("Lightning")){
        	application.model.setLevelConfig(new LightningLevelConfig(60,application.model.getLevelConfig()));
        	application.setLevelEditorScreen(new LightningLevelEditorScreen(application));
        }
        else if(type.equals("Puzzle")){
        	application.model.setLevelConfig(new PuzzleLevelConfig(50,application.model.getLevelConfig()));
        	application.setLevelEditorScreen(new PuzzleLevelEditorScreen(application));
        }
	}
}
