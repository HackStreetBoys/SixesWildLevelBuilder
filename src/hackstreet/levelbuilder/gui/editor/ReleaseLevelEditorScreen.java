package hackstreet.levelbuilder.gui.editor;

import java.awt.Color;

import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.controller.ChangeNumMovesController;
import hackstreet.levelbuilder.controller.LevelTypeComboController;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.TextFieldUI;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ReleaseLevelEditorScreen extends AbstractLevelEditorScreen {

	private JTextField txtAllowedMoves;
	
	public ReleaseLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		this.initialize(application);
	}
	
	public ReleaseLevelEditorScreen(LevelBuilderApplication application, AbstractLevelEditorScreen editor){
		super(application,editor);
		this.initialize(application);
		this.levelList.setSelectedIndex(3);
		

	}

	private void initialize(LevelBuilderApplication application){
		if (application.model.getLevelConfig() == null || super.level == null){
			ReleaseLevelConfig config = new ReleaseLevelConfig(50);
			application.model.setLevelConfig(config);
			super.level = config;
		}
		
		txtAllowedMoves = new JTextField();
		txtAllowedMoves.setUI(new TextFieldUI("# Allowed moves",new Color(100,100,100)));
		txtAllowedMoves.setBounds(20, 82, 134, 28);
		txtAllowedMoves.setColumns(10);
		ReleaseLevelConfig lvlc = (ReleaseLevelConfig) application.model.getLevelConfig();
		txtAllowedMoves.setText(lvlc.getNumMoves()+"");
		txtAllowedMoves.addKeyListener(new ChangeNumMovesController(application));
		add(txtAllowedMoves);
		
		application.model.setLevelConfig(super.level);

		super.slider_6.setValue(0);
		super.slider_6.setEnabled(false);		
		levelList.addItemListener(new LevelTypeComboController(application));
	}
	
}
