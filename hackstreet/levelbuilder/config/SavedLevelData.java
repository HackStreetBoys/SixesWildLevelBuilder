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
	
}
