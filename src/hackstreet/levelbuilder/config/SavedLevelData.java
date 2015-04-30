package hackstreet.levelbuilder.config;

import java.io.File;

	
public class SavedLevelData {
	File fileConfig;
	boolean isunlocked;
	int starsEarned;
	
	public  SavedLevelData(File l, boolean unlocked, int starsearned)
	{
		this.isunlocked = unlocked;
		this.starsEarned = starsearned;
		fileConfig = l;
	}
	
	public boolean setStars(int s)
	{
		if ( s > 3 || s < 0)
			return false;
		
		starsEarned = s;
		return true;
		
	}
	
	public boolean setUnlocked(boolean b)
	{
		this.isunlocked = b;
		return true;
	}
	
}
