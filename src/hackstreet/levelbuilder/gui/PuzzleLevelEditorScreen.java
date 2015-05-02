package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.config.PuzzleLevelConfig;



@SuppressWarnings("serial")
public class PuzzleLevelEditorScreen extends AbstractLevelEditorScreen {

	public PuzzleLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		
		if (application.model.getLevelConfig() == null)
		{
			application.model.setLevelConfig(new PuzzleLevelConfig());
		}
		
		application.model.setLevelConfig(application.model.getLevelConfig());
	}

}
