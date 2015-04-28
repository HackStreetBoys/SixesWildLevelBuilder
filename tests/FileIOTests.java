package tests;

import static org.junit.Assert.*;
import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.LightningLevelConfig;
import hackstreet.levelbuilder.config.Location;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.config.SavedLevelData;
import hackstreet.levelbuilder.main.SWLevelBuilder;
import hackstreet.levelbuilder.main.SplashScreen;

import org.junit.Test;

public class FileIOTests {

	@Test
	public void test() {
		
		SWLevelBuilder sw = new SWLevelBuilder();
		
		PuzzleLevelConfig plc = new PuzzleLevelConfig();
		PuzzleLevelConfig dup = new PuzzleLevelConfig( plc);
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
		
		sw.setActiveLevel(plc);
		sw.saveLevel();
		
		AbstractLevelConfig rlc = new ReleaseLevelConfig();
		AbstractLevelConfig rup = new ReleaseLevelConfig( plc);		
		AbstractLevelConfig llc = new LightningLevelConfig();
		AbstractLevelConfig lup = new LightningLevelConfig( plc);
		AbstractLevelConfig elc = new EliminationLevelConfig();
		AbstractLevelConfig eup = new EliminationLevelConfig( plc);
		
		Location l = new Location(1,2);
		
		SavedLevelData sld = new SavedLevelData(rlc,true,1);
		
	}
	

}
