package hackstreet.levelbuilder.config;

	
public class SavedLevelData {
	AbstractLevelConfig config;
	boolean isunlocked;
	int starsEarned;
	
	public  SavedLevelData(AbstractLevelConfig l, boolean unlocked, int starsearned)
	{
		this.isunlocked = unlocked;
		this.starsEarned = starsearned;
		config = l;
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
