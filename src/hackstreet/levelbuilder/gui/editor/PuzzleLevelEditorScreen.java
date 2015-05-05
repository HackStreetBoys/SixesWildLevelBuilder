package hackstreet.levelbuilder.gui.editor;

import java.awt.Color;

import javax.swing.JTextField;

import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.controller.ChangeNumMovesController;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.TextFieldUI;

/**
 * 
 * @author Himanshu
 *
 */

@SuppressWarnings("serial")
public class PuzzleLevelEditorScreen extends AbstractLevelEditorScreen {

	private JTextField txtAllowedMoves;
	
	public PuzzleLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		this.initialize(application);
	}
	
	public PuzzleLevelEditorScreen(LevelBuilderApplication application, AbstractLevelEditorScreen editor){
		super(application,editor);
		this.initialize(application);
	}
	
	public void initialize(LevelBuilderApplication application) {
		
		if (application.model.getLevelConfig() == null)
		{
			application.model.setLevelConfig(new PuzzleLevelConfig(50));
		}

		txtAllowedMoves = new JTextField();
		txtAllowedMoves.setUI(new TextFieldUI("# Allowed moves",new Color(100,100,100)));
		txtAllowedMoves.setBounds(20, 82, 134, 28);
		txtAllowedMoves.setColumns(10);
		txtAllowedMoves.addKeyListener(new ChangeNumMovesController(application));
		add(txtAllowedMoves);
		
		application.model.setLevelConfig(application.model.getLevelConfig());
		super.slider_6.setEnabled(true);
	}

}
