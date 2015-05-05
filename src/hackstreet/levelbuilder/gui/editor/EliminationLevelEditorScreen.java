package hackstreet.levelbuilder.gui.editor;

import java.awt.Color;

import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.controller.ChangeNumMovesController;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.TextFieldUI;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EliminationLevelEditorScreen extends AbstractLevelEditorScreen {

	private JTextField txtAllowedMoves;
	
	public EliminationLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		this.initialize(application);
	}
	
	public EliminationLevelEditorScreen(LevelBuilderApplication application, AbstractLevelEditorScreen editor){
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
		super.slider_6.setValue(0);
		super.slider_6.setEnabled(false);
	}

}
