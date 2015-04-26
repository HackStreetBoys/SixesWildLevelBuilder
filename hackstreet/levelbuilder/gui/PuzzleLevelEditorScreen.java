package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.config.PuzzleLevelConfig;



public class PuzzleLevelEditorScreen extends AbstractLevelEditorScreen {

	public PuzzleLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		
		if (application.model.getActiveLevel() == null)
		{
			application.model.setActiveLevel(new PuzzleLevelConfig());
		}
		
		application.model.setActiveLevel(application.model.getActiveLevel());
	}

}
