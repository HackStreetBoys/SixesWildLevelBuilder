package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.move.FrequencyChangeMove;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ReleaseLevelEditorScreen extends AbstractLevelEditorScreen {

	private JTextField txtAllowedMoves;
	
	public ReleaseLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		
		if (application.model.getLevelConfig() == null)
		{
			application.model.setLevelConfig(new ReleaseLevelConfig(50));
		}

		txtAllowedMoves = new JTextField();
		txtAllowedMoves.setText("# Allowed moves");
		txtAllowedMoves.setBounds(20, 82, 134, 28);
		txtAllowedMoves.setColumns(10);
		add(txtAllowedMoves);
		
		//Disables the 6 slider. 
		super.slider_6.setEnabled(false);
		super.slider_6.setValue(0);
		
		application.model.setLevelConfig(application.model.getLevelConfig());
		
		FrequencyChangeMove move = new FrequencyChangeMove(application,super.slider_6,6);
		move.doMove();
		
	}

	
}
