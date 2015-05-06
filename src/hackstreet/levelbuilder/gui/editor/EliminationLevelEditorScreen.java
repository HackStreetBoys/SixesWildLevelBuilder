package hackstreet.levelbuilder.gui.editor;

import java.awt.Color;

import hackstreet.levelbuilder.config.EliminationLevelConfig;

import hackstreet.levelbuilder.controller.ChangeNumMovesController;
import hackstreet.levelbuilder.controller.LevelTypeComboController;
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
		this.levelList.setSelectedIndex(1);
		

		
		
		
	}
	
	public void initialize(LevelBuilderApplication application) {
		
		System.err.println(application.model.getLevelConfig().getJSON());
		if (application.model.getLevelConfig() == null)
		{
			application.model.setLevelConfig(new EliminationLevelConfig(50));
		}
		this.levelList.setSelectedItem("Elimination");
		
		txtAllowedMoves = new JTextField();
		txtAllowedMoves.setUI(new TextFieldUI("# Allowed moves",new Color(100,100,100)));
		txtAllowedMoves.setBounds(20, 82, 134, 28);
		txtAllowedMoves.setColumns(10);
		EliminationLevelConfig lvlc = (EliminationLevelConfig) application.model.getLevelConfig();
		txtAllowedMoves.setText(lvlc.getNumMoves()+"");
		txtAllowedMoves.addKeyListener(new ChangeNumMovesController(application));
		add(txtAllowedMoves);

	
		application.model.setLevelConfig(application.model.getLevelConfig());
		super.slider_6.setValue(0);
		super.slider_6.setEnabled(false);
		levelList.addItemListener(new LevelTypeComboController(application));
	}

}
