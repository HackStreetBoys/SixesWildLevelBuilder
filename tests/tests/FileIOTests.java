package tests;

import junit.framework.TestCase;
import hackstreet.levelbuilder.SWLevelBuilder;
import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.LightningLevelConfig;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.config.SavedLevelData;
import hackstreet.levelbuilder.elements.Location;

public class FileIOTests {
	
	public void test() {
		
		SWLevelBuilder sw = new SWLevelBuilder();
		
		PuzzleLevelConfig plc = new PuzzleLevelConfig(0);
		PuzzleLevelConfig dup = new PuzzleLevelConfig(0, plc);
		plc.getJSON();
		plc.getNumHint();
		plc.getNumRemove();
		plc.getNumShuffle();
		plc.getNumSwap();
		plc.getType();
		plc.setNumHint(1);
		plc.setNumRemove(1);
		plc.setNumShuffle(1);
		plc.setNumSwap(1);
		sw.loadLevel();
		
		//sw.setActiveLevel(plc);
		sw.saveLevel();
		
		AbstractLevelConfig rlc = new ReleaseLevelConfig(0);
		AbstractLevelConfig rup = new ReleaseLevelConfig(0, plc);		
		AbstractLevelConfig llc = new LightningLevelConfig(0);
		AbstractLevelConfig lup = new LightningLevelConfig(0, plc);
		AbstractLevelConfig elc = new EliminationLevelConfig(0);
		AbstractLevelConfig eup = new EliminationLevelConfig(0, plc);
		
		Location l = new Location(1,2);
		
		SavedLevelData sld = new SavedLevelData(rlc);
		
	}
	

}
