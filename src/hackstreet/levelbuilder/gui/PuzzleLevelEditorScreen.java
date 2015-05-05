package hackstreet.levelbuilder.gui;

import javax.swing.JTextField;

import hackstreet.levelbuilder.config.PuzzleLevelConfig;

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
