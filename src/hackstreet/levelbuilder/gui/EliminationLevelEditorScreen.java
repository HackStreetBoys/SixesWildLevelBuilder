package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.config.PuzzleLevelConfig;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EliminationLevelEditorScreen extends AbstractLevelEditorScreen {

	private JTextField txtAllowedMoves;
	
	public EliminationLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		
		if (application.model.getLevelConfig() == null)
		{
			application.model.setLevelConfig(new PuzzleLevelConfig(50));
		}
	
		txtAllowedMoves = new JTextField();
		txtAllowedMoves.setText("# Allowed moves");
		txtAllowedMoves.setBounds(20, 82, 134, 28);
		add(txtAllowedMoves);
		txtAllowedMoves.setColumns(10);

	
		application.model.setLevelConfig(application.model.getLevelConfig());
	}

}
